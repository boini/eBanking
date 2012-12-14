$('document').ready(function() {
    $('.calendar-select input').prop('disabled', true);
    $('.ui-datepicker-trigger').css('visibility', 'hidden');

    $('input[type="radio"]').on('change', function() {
        var checked = $('#customRadio').prop('checked');
        if (checked) {
            $('.calendar-select input').prop('disabled', false);
            $('.ui-datepicker-trigger').css('visibility', 'visible');
        } else {
            $('.calendar-select input').prop('disabled', true).val('');
            $('.ui-datepicker-trigger').css('visibility', 'hidden');
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
            var tDate = toDate;
            var fDate = fromDate;
            fromDate = new Date($('#fromDate').val());
            toDate = new Date($('#toDate').val());
            fromDate.setHours(fDate.getHours());
            fromDate.setMinutes(fDate.getMinutes());
            fromDate.setSeconds(fDate.getSeconds());
            toDate.setHours(tDate.getHours());
            toDate.setMinutes(tDate.getMinutes());
            toDate.setSeconds(tDate.getSeconds());
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
                                '<th>Статус</th>' +
                                '<th>Дата обработки</th>' +
                                '<th>Дата транзакции</th>' +
                                '<th>Карта</th>' +
                                '<th>Описание операции</th>' +
                                '<th>Валюта</th>' +
                                '<th>Сумма</th>' +
                            '</tr>' +
                        '</thead>' +
                        '<tbody>';
                    $.each(operations, function(index, operation) {
                        onlineInfoTable += '<tr>';
                        onlineInfoTable += '<td>' + operation.operationStatus.operationStatus + '</td>';
                        onlineInfoTable += '<td>' + operation.processingDate + '</td>';
                        onlineInfoTable += '<td>' + operation.transactionDate + '</td>';
                        onlineInfoTable += '<td>' + operation.card.cardNumber + '</td>';
                        onlineInfoTable += '<td>' + operation.operationType.operationType + '</td>';
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
