$(function() {
    $('.corp-info').on('click', function() {
        var corporationId = $(this).next().val();

        $('#details').html('').css('background', '#2c2c2c');

        $.ajax({
            url: '/corporationView.action',
            type: 'post',
            data: {
                corporationId: corporationId
            },
            success: function(data) {

                $('#details').append('<h6>Corporation name: ' + data.corporation.description + '</h6>');
                var bankAccounts = data.bankAccounts;
                var bankAccountsTable = '<table class="table table-condensed table-bordered">' +
                                        '<caption>Bank accounts</caption>' +
                                        '<thead><tr><th>#</th><th>Currency</th><th>Amount</th></tr></thead><tbody>';
                $.each(bankAccounts, function(index, bankAccount) {
                    bankAccountsTable += '<tr>' +
                                            '<td>' + (index + 1) + '</td>' +
                                            '<td>' + bankAccount.currency.currencyCode + '</td>' +
                                            '<td>' + bankAccount.amount + '</td>' +
                                         '</tr>';
                })
                bankAccountsTable += '</tbody></table>';
                $('#details').append(bankAccountsTable);

            }
        })
    })
})