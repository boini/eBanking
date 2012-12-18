$(function() {
    $('.newCardRow').hide();

    $('.add-card-btn').on('click', function() {
        $(this).hide().prev().find('.newCardRow').show();
    })

    $('.cancel-btn').on('click', function() {
        $(this).parents('.newCardRow').hide()
               .parents('table')
               .next().show();
    })

    $('.add-card-btn-sbmt').on('click', function() {
        var newCardRow = $(this).parents('.newCardRow');

        var cardNumber =  $(newCardRow).find('.newCardNumber').val();
        var cvv =  $(newCardRow).find('.newCardCVV').val();
        var cardType =  $(newCardRow).find('.newCardType').val();
        var creditLimit =  $(newCardRow).find('.newCardCredit').val();
        var expDate =  $(newCardRow).find('.newCardExpDate').val();

        var cardAccountId = $(newCardRow).parents('.cardAccount').find('.cardAccountId').val();

        console.log(cardAccountId);

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