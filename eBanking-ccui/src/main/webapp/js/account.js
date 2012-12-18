$(function() {
    $('.newCardRow').hide();

    var tables = $('.table');
    $.each(tables, function(table, index) {
        var rows = $(this).find('tr');
        if (rows.length == 2) {
            $(this).hide();
            $(this).parents('.cardAccount').append('<h6>No cards</h6>');
        }
    })

    $('.add-card-btn').on('click', function() {
        var rows = $(this).parents('.cardAccount').find('.table').find('tr');
        if (rows.length == 2) {
            $(this).parents('.cardAccount').find('.table').show();
        }
        $(this).hide().parents('.cardAccount').find('.table').find('.newCardRow').show();
    })

    $('.cancel-btn').on('click', function() {
        $(this).parents('.cardAccount')
               .find('.table')
                    .find('.newCardRow').hide().end()
               .siblings('.add-card-btn').show();
        var rows = $(this).parents('.cardAccount').find('.table').find('tr');
        if (rows.length == 2) {
            $(this).parents('.cardAccount').find('.table').hide();
        }
    })

    $('.rm-btn-card').on('click', function() {
        var id = $(this).parent().siblings('.cardId').val();
        $.ajax({
            url: '/removeCard.action',
            type: 'post',
            data: {
                id: id,
                type: 'card'
            },
            success: function(data) {
                if (data.success) {
                    alert("Card successfully has been deleted!")
                    window.location.replace("/viewAccount.action");
                }
            }
        })
    })

    $('.rm-card-account-btn').on('click', function() {
        var id = $(this).parents('.cardAccount').find('.cardAccountId').val();
        $.ajax({
            url: '/removeCard.action',
            type: 'post',
            data: {
                id: id,
                type: 'cardAccount'
            },
            success: function(data) {
                if (data.success) {
                    alert("Card account successfully has been deleted!")
                    window.location.replace("/viewAccount.action");
                }
            }
        })
    })

    $('.add-card-btn-sbmt').on('click', function() {
        var newCardRow = $(this).parents('.newCardRow');

        var cardNumber =  $(newCardRow).find('.newCardNumber').val();
        var cvv =  $(newCardRow).find('.newCardCVV').val();
        var cardType =  $(newCardRow).find('.newCardType').val();
        var creditLimit =  $(newCardRow).find('.newCardCredit').val();
        var expDate =  $(newCardRow).find('.newCardExpDate').val();

        var cardAccountId = $(newCardRow).parents('.cardAccount').find('.cardAccountId').val();

        $.ajax({
            url: '/addCard.action',
            type: 'post',
            data: {
                cardNumber: cardNumber,
                cvv: cvv,
                cardType: cardType,
                creditLimit: creditLimit,
                expDate: expDate,
                cardAccountId: cardAccountId
            },
            success: function(data) {
                if (data.success) {
                    alert("Card successfully has been added!")
                    window.location.replace("/viewAccount.action");
                }
            }
        })
    })
})