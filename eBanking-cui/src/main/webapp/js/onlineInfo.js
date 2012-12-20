$('document').ready(function() {
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

    $('#onlineInfoSubmit').on('click', function() {
        var checkboxes = $('input[type="checkbox"]');
        var cards = '';
        $.each(checkboxes, function(index, checkbox) {
            if ($(checkbox).prop('checked')) {
                if (cards.length > 0) {
                    cards += ',';
                }
                cards += $(checkbox).attr('name');
            }
        })

        if (cards.length == 0) {
            alert('No cards were selected!');
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
        $('#onlineInfoSubmit').button('loading');

        $.ajax({
            url: '/cardOperationHistory.action',
            type: 'post',
            data: {
                'idList': cards,
                'fromDate': fromDateFormatted,
                'toDate': toDateFormatted
            },
            success: function(data) {
                var operations = data.operations;
                if (operations != null && operations.length > 0) {
                    var onlineInfoTable = '<table class="table table-striped table-bordered" id="cardOperations">';
                        onlineInfoTable += '<caption></caption>';
                        onlineInfoTable += '<thead>' +
                            '<tr>' +
                                '<th>Status</th>' +
                                '<th>Processing date</th>' +
                                '<th>Transaction date</th>' +
                                '<th>Card</th>' +
                                '<th>Operation details</th>' +
                                '<th>Currency</th>' +
                                '<th>Sum</th>' +
                            '</tr>' +
                        '</thead>' +
                        '<tbody>';
                    $.each(operations, function(index, operation) {
                        onlineInfoTable += '<tr>';
                        onlineInfoTable += '<td>' + operation.operationStatus.description + '</td>';
                        onlineInfoTable += '<td>' + $.format.date(operation.processingDate, 'MM/dd/yyyy HH:mm:ss') + '</td>';
                        onlineInfoTable += '<td>';
                        if (operation.transactionDate) {
                            onlineInfoTable += $.format.date(operation.transactionDate, 'MM/dd/yyyy HH:mm:ss') + '</td>';
                        } else {
                            onlineInfoTable += '-' + '</td>';
                        }
                        onlineInfoTable += '<td>' + operation.card.cardNumber + '</td>';
                        onlineInfoTable += '<td>' + operation.operationType.description + '</td>';
                        onlineInfoTable += '<td>' + operation.card.cardAccount.currency.currencyCode + '</td>';
                        onlineInfoTable += '<td>' + operation.transactionAmount + '</td>';
                    })
                    onlineInfoTable += '</tbody></table>';
                    $('#onlineInfoSubmit').button('reset');
                    $('#onlineInfoTable').append(onlineInfoTable);
                } else {
                    $('#onlineInfoSubmit').button('reset');
                    $('#onlineInfoTable').append(
                        '<h6>No card activities from ' + fromDateFormatted + ' to ' + toDateFormatted + '</h6>')
                }
            }
        })
    })
})
