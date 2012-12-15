$('document').ready(function() {
    $('.calendar-select input').prop('disabled', true);
    $('.ui-datepicker-trigger').css('visibility', 'hidden');

    $('#fromDate').on('change', function() {
        var correct = isDate($(this).val());
        if (!correct) {
            $('#fromDate').css('background-color', '#FFD0D4');
        } else {
            $('#fromDate').css('background-color', '#fff');
        }
    })

    $('#toDate').on('change', function() {
        var correct = isDate($(this).val());
        if (!correct) {
            $('#toDate').css('background-color', '#FFD0D4');
        } else {
            $('#toDate').css('background-color', '#fff');
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

    $('#cardAccountInfoSubmit').on('click', function() {
        var checkboxes = $('input[type="checkbox"]');
        var cardAccounts = '';
        $.each(checkboxes, function(index, checkbox) {
            if ($(checkbox).prop('checked')) {
                if (cardAccounts.length > 0) {
                    cardAccounts += ',';
                }
                cardAccounts += $(checkbox).attr('name');
            }
        })

        if (cardAccounts.length == 0) {
            alert('No card accounts were selected!');
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
                $('#fromDate').css('background-color', '#FFD0D4');
                isCorrect = false;
            }
            if (!isDate($('#toDate').val())) {
                $('#toDate').css('background-color', '#FFD0D4');
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

        $('#cardAccountHistory').remove();
        $('#cardAccountInfoTable').html('');
        $('#cardAccountInfoSubmit').button('loading');

        $.ajax({
            url: '/cardAccountHistory.action',
            type: 'post',
            data: {
                'idList': cardAccounts,
                'fromDate': fromDateFormatted,
                'toDate': toDateFormatted
            },
            success: function(data) {
                var operations = data.operations;
                if (operations != null && operations.length > 0) {
                    var cardAccountInfoTable = '<table class="table table-striped table-bordered" id="cardAccountHistory">';
                        cardAccountInfoTable += '<caption></caption>';
                        cardAccountInfoTable += '<thead>' +
                            '<tr>' +
                                '<th>Дата обработки</th>' +
                                '<th>Дата транзакции</th>' +
                                '<th>Карта</th>' +
                                '<th>Описание операции</th>' +
                                '<th>Валюта</th>' +
                                '<th>Сумма</th>' +
                                '<th>Остаток</th>' +
                            '</tr>' +
                        '</thead>' +
                        '<tbody>';
                    $.each(operations, function(index, operation) {
                        cardAccountInfoTable += '<tr>';
                        cardAccountInfoTable += '<td>' + operation.processingDate + '</td>';
                        cardAccountInfoTable += '<td>' + operation.transactionDate + '</td>';
                        cardAccountInfoTable += '<td>' + operation.card.cardNumber + '</td>';
                        cardAccountInfoTable += '<td>' + operation.operationType.operationType + '</td>';
                        cardAccountInfoTable += '<td>' + operation.card.cardAccount.currency.currencyCode + '</td>';
                        cardAccountInfoTable += '<td>' + operation.transactionAmount + '</td>';
                        cardAccountInfoTable += '<td>' + operation.cardAccountAmount + '</td>';
                    })
                    cardAccountInfoTable += '</tbody></table>';
                    $('#cardAccountInfoSubmit').button('reset');
                    $('#cardAccountInfoTable').append(cardAccountInfoTable);
                } else {
                    $('#cardAccountInfoSubmit').button('reset');
                    $('#cardAccountInfoTable').append(
                        '<h6>No card activities from ' + fromDateFormatted + ' to ' + toDateFormatted + '</h6>')
                }
            }
        })
    })
})
