$('document').ready(function() {
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

        var week = $('#weekRadio').prop('checked');

        var toDate = new Date();
        var fromDate = new Date();

        if (week) {
            fromDate.setDate(toDate.getDate() - 7);
        } else {
            fromDate.setMonth(toDate.getMonth() - 1);
        }

        var fromDateFormatted = $.format.date(fromDate, 'dd-MM-yy HH:mm:ss');
        var toDateFormatted = $.format.date(toDate, 'dd-MM-yy HH:mm:ss');

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
                $('#cardOperations').remove();
                if (operations.length > 0) {
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
                    $('#onlineInfoTable').append(onlineInfoTable);
                }
            }
        })
    })
})
