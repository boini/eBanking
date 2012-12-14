$('document').ready(function() {
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
