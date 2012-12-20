$(function() {
    $('#history').hide();
    $('.calendar-select input').prop('disabled', true);
    $('.ui-datepicker-trigger').css('visibility', 'hidden');

    $('#fromDate').on('change', function() {
        var correct = isDate($(this).val());
        if (!correct) {
            $('#fromDate').css('background-color', 'FFD0D4');
        } else {
            $('#fromDate').css('background-color', 'fff');
        }
    })

    $('#toDate').on('change', function() {
        var correct = isDate($(this).val());
        if (!correct) {
            $('#toDate').css('background-color', 'FFD0D4');
        } else {
            $('#toDate').css('background-color', 'fff');
        }
    })

    $('input[type="radio"]').on('change', function() {
        var checked = $('#customRadio').prop('checked');
        if (checked) {
            $('.calendar-select input').prop('disabled', false);
            $('.ui-datepicker-trigger').css('visibility', 'visible');
            $('#fromDate, #toDate').css('background-color', '#FFF');
        } else {
            $('.calendar-select input').prop('disabled', true).val('');
            $('.ui-datepicker-trigger').css('visibility', 'hidden');
            $('#fromDate, #toDate').css('background-color', '#EEE');
        }
    })

    $('.corp-info').on('click', function() {
        $('#cardOperations').remove();
        $('#onlineInfoTable').html('');
        var corporationId = $(this).next().val();

        $('#detailsInfo').html('');
        $('#details').css('background', '#2c2c2c');

        $.ajax({
            url: '/corporationView.action',
            type: 'post',
            data: {
                corporationId: corporationId
            },
            success: function(data) {

                $('#detailsInfo').append('<h6>Corporation name: ' + data.corporation.description + '</h6>');
                var bankAccounts = data.bankAccounts;
                var bankAccountsTable = '<table class="table table-condensed table-bordered">' +
                                        '<caption>Bank accounts</caption>' +
                                        '<thead><tr><th></th><th>#</th><th>Currency</th><th>Amount</th><th>Number</th></tr></thead><tbody>';
                $.each(bankAccounts, function(index, bankAccount) {
                    bankAccountsTable += '<tr>' +
                                            '<td><input type="checkbox" name="' + bankAccount.bankAccountId + '"></td>' +
                                            '<td>' + (index + 1) + '</td>' +
                                            '<td>' + bankAccount.currency.currencyCode + '</td>' +
                                            '<td>' + bankAccount.amount + '</td>' +
                                            '<td>' + bankAccount.number + '</td>' +
                                         '</tr>';
                })
                bankAccountsTable += '</tbody></table>';
                $('#detailsInfo').append(bankAccountsTable);
                $('#history').show();
            }
        })
    })

    $('#corporationInfoSubmit').on('click', function() {
        var checkboxes = $('input[type="checkbox"]');
        var bankAccounts = '';
        $.each(checkboxes, function(index, checkbox) {
            if ($(checkbox).prop('checked')) {
                if (bankAccounts.length > 0) {
                    bankAccounts += ',';
                }
                bankAccounts += $(checkbox).attr('name');
            }
        })

        if (bankAccounts.length == 0) {
            alert('No bank accounts were selected!');
            return false;
        }

        var toDate = new Date();
        var fromDate = new Date();

        var period = $('input[type="radio"]:checked').val();
        if (period == 'week') {
            fromDate.setDate(toDate.getDate() - 7);
        }
        if (period == 'month') {
            fromDate.setMonth(toDate.getMonth() - 1);
        }
        if (period == 'custom') {
            var isCorrect = true;
            if (!isDate($('#fromDate').val())) {
                $('#fromDate').css('background-color', 'FFD0D4');
                isCorrect = false;
            }
            if (!isDate($('#toDate').val())) {
                $('#toDate').css('background-color', 'FFD0D4');
                isCorrect = false;
            }
            if (!isCorrect) {
                return false;
            }

            var tDate = toDate;
            var fDate = fromDate;
            fromDate = new Date($('#fromDate').val());
            toDate = new Date($('#toDate').val());
            fromDate.setHours(0);
            fromDate.setMinutes(0);
            fromDate.setSeconds(0);
            toDate.setHours(23);
            toDate.setMinutes(59);
            toDate.setSeconds(59);
        }

        var fromDateFormatted = $.format.date(fromDate, 'dd-MM-yy HH:mm:ss');
        var toDateFormatted = $.format.date(toDate, 'dd-MM-yy HH:mm:ss');

        $('#cardOperations').remove();
        $('#onlineInfoTable').html('');
        $('#corporationInfoSubmit').button('loading');

        $.ajax({
            url: '/bankAccountHistory.action',
            type: 'post',
            data: {
                'idList': bankAccounts,
                'fromDate': fromDateFormatted,
                'toDate': toDateFormatted
            },
            success: function(data) {
                console.log(data);
                var operations = data.operations;
                if (operations != null && operations.length > 0) {
                    var onlineInfoTable = '<table class="table table-condensed table-bordered" id="cardOperations">';
                    onlineInfoTable += '<caption></caption>';
                    onlineInfoTable += '<thead>' +
                        '<tr>' +
                        '<th>Bank account</th>' +
                        '<th>Status</th>' +
                        '<th>Processing date</th>' +
                        '<th>Transaction date</th>' +
                        '<th>Card</th>' +
                        '<th>Operation details</th>' +
                        '<th>Operation key</th>' +
                        '<th>Currency</th>' +
                        '<th>Sum</th>' +
                        '</tr>' +
                        '</thead>' +
                        '<tbody>';
                    $.each(operations, function(index, operation) {
                        onlineInfoTable += '<tr>';
                        onlineInfoTable += '<td>' + operation.contractorAccount.number + '</td>';
                        onlineInfoTable += '<td>' + operation.operationStatus.description + '</td>';
                        onlineInfoTable += '<td>' + operation.processingDate + '</td>';
                        onlineInfoTable += '<td>';
                        if (operation.transactionDate) {
                            onlineInfoTable += operation.transactionDate + '</td>';
                        } else {
                            onlineInfoTable += '-' + '</td>';
                        }
                        onlineInfoTable += '<td>' + operation.card.cardNumber + '</td>';
                        onlineInfoTable += '<td>' + operation.operationType.description + '</td>';
                        onlineInfoTable += '<td>' + operation.operationKey + '</td>';
                        onlineInfoTable += '<td>' + operation.card.cardAccount.currency.currencyCode + '</td>';
                        onlineInfoTable += '<td>' + operation.transactionAmount + '</td>';
                    })
                    onlineInfoTable += '</tbody></table>';
                    $('#corporationInfoSubmit').button('reset');
                    $('#onlineInfoTable').append(onlineInfoTable);
                } else {
                    $('#corporationInfoSubmit').button('reset');
                    $('#onlineInfoTable').append(
                        '<h6>No bank account activities from ' + fromDateFormatted + ' to ' + toDateFormatted + '</h6>')
                }
            }
        })
    })
})