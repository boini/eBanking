$(function() {
    $('.newCardRow').hide();
    $('.charge').hide();

    $('.charge-btn-card').on('click', function() {
        var cardNumber = $(this).parents('tr').find('td').eq(1).html().trim();
        var currency = $(this).parents('tr').find('td').eq(5).html().trim();

        $(this).parents('.cardAccount').find('.charge').show()
            .find('#cardNumberCharge').val(cardNumber).end()
            .find('#currencyCharge').val(currency);
        $(this).parents('.cardAccount').find('.charge').find('.chargeCardId').val(
            $(this).parents('tr').find('.cardId').val()
        );
    })

    $('.charge-cancel-btn-card').on('click', function() {
        $(this).parents('.charge').hide();
    })

    $('.charge-submit-btn-card').on('click', function() {
        var errorContainer = $(this).parents('.charge').find(".errors").empty();

        var amount = $(this).parents('.charge').find('#chargeAmount').val();
        var cardId = $(this).parents('.charge').find('.chargeCardId').val();

        //validation block
        {
            var hasErrors = false;

            if(isNaN(parseFloat(amount)) || (parseFloat(amount)<=0)){
                errorContainer.append($("<div/>").addClass("error").text("wrong amount"));
                hasErrors = true;
            }
            if(hasErrors) return;
        }

        $.ajax({
            url: '/chargeCard.action',
            type: 'post',
            data: {
                amount: amount,
                cardId: cardId
            },
            success: function(data) {
                var success = data.success;
                if (success) {
                    alert("Charge request was sent to processing!")
                    window.location.replace("/viewAccount.action");
                }
            }
        })
    })

    $('#createAccountForm').hide();
    $('#addCardAccountForm').hide();

    $('.create-account-btn').on('click', function() {
        $('#createAccountForm').show();
        $(this).hide();
    })

    $('.cancel-account-btn').on('click', function() {
        $('#createAccountForm').hide();
        $('.create-account-btn').show();
    })

    $('.add-card-account-btn').on('click', function() {
        $('#addCardAccountForm').show();
        $(this).hide();
    })

    $('.cancel-card-account-btn').on('click', function() {
        $('#addCardAccountForm').hide();
        $('.add-card-account-btn').show();
    })

    $('.sumbit-card-account-btn').on('click', function() {
        var number = $('#cardAccountNumber').val();
        var currency = $('#cardAccountCurrency').val();
        var clientId = $('#clientId').val();
        $("label.error").remove();
        if(isNaN(parseInt(number)) || number.length != 16){
            $('#cardAccountNumber').after('<label for="cardAccountNumber" generated="true" class="error" style="">Enter 16 digits of the card account number</label>');
            return;
        }

        $.ajax({
            url: '/createCardAccount.action',
            type: 'post',
            data: {
                clientId: clientId,
                currency: currency,
                number: number
            },
            success: function(data) {
                var success = data.success;
                if (success) {
                    alert("Card account successfully has been added!")
                    window.location.replace("/viewAccount.action");
                } else {
                    $('#cardAccountMessage').append(
                        '<div class="alert alert-error">' +
                            '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
                            '<h4>Exception!</h4>' +
                            data.exception +
                            '</div>');
                }
            }
        })
    })

    $('.sumbit-account-btn').on('click', function() {
        var login = $('#accountLogin').val();
        var password = $('#accountPassword').val();
        var clientId = $('#clientId').val();

        //validation
        var hasErrors = false;
        $("label.error").remove();
        if(login.length==0){
            $('#accountLogin').after($('<label class="error" for="accountLogin" generated="true">This field is required.</label>'));
            hasErrors = true;
        }
        if(password.length==0){
            $('#accountPassword').after($('<label class="error" for="accountLogin" generated="true">This field is required.</label>'));
            hasErrors = true;
        }
        if(hasErrors)
            return;
        $('#message').html('');

        $.ajax({
            url: '/createAccount.action',
            type: 'post',
            data: {
                clientId: clientId,
                login: login,
                password: password
            },
            success: function(data) {
                var success = data.success;
                if (success) {
                    alert("Account successfully has been added!")
                    window.location.replace("/viewAccount.action");
                } else {
                    $('#message').append(
                        '<div class="alert alert-error">' +
                            '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
                            '<h4>Exception!</h4>' +
                            data.exception +
                            '</div>');
                }
            }
        })
    })

    var tables = $('.table');
    $.each(tables, function(table, index) {
        if ($(this).hasClass('info') == false) {
            var rows = $(this).find('tr');
            if (rows.length == 2) {
                $(this).hide();
                $(this).parents('.cardAccount').append('<h6>No cards</h6>');
            }
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
        $(this).parents(".cardAccount").find(".errors").empty();
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
        var errorContainer = $(this).parents(".cardAccount").find(".errors").empty();
        var cardNumber =  $(newCardRow).find('.newCardNumber').val();
        var cvv =  $(newCardRow).find('.newCardCVV').val();
        var cardType =  $(newCardRow).find('.newCardType').val();
        var creditLimit =  $(newCardRow).find('.newCardCredit').val();
        var expDate =  $(newCardRow).find('.newCardExpDate').val();

        var cardAccountId = $(newCardRow).parents('.cardAccount').find('.cardAccountId').val();

        //validation block
        {
            var hasErrors = false;
            if(!/^\d{16}$/.test(cardNumber)){
                errorContainer.append($("<div/>").addClass("error").text("wrong card number(must contain 16 digits)"));
                hasErrors = true;
            }
            if(!/^\d{3}$/.test(cvv)){
                errorContainer.append($("<div/>").addClass("error").text("wrong cvv"));
                hasErrors = true;
            }
            if(!isDate(expDate) || Date.parse(expDate)<Date.now()){
                errorContainer.append($("<div/>").addClass("error").text("wrong expiration date"));
                hasErrors = true;
            }
            if(isNaN(parseFloat(creditLimit)) || (parseFloat(creditLimit)<0)){
                errorContainer.append($("<div/>").addClass("error").text("wrong credit limit"));
                hasErrors = true;
            }
            if(hasErrors) return;
        }

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
                    alert("Card successfully has been added!");
                    var scrollTop = $(window).scrollTop();
                    window.location.replace("/viewAccount.action");
                    $(window).scrollTop(scrollTop);
                } else {
                    $(newCardRow).parents('.cardAccount').find('#addCardMessage').append(
                        '<div class="alert alert-error">' +
                            '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
                            '<h4>Exception!</h4>' +
                            data.exception +
                            '</div>');
                }
            }
        })
    });

    $('.refresh-account-btn').on('click', function() {
        window.location.replace("/viewAccount.action");
    })
});
