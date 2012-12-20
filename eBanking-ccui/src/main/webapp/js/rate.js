$(function() {
    $('.purchaseText').hide();
    $('.saleText').hide();
    $('.save-rate-btn').hide();
    $('.cancel-rate-btn').hide();

    $('.edit-rate-btn').on('click', function() {
        $(this).hide().parents('tr')
            .find('.purchaseText').show().end()
            .find('.saleText').show().end()
            .find('.purchase').hide().end()
            .find('.sale').hide().end()
            .find('.save-rate-btn').show().end()
            .find('.cancel-rate-btn').show();
    })

    $('.cancel-rate-btn').on('click', function() {
        $(this).parents('tr').find('.purchaseText').val(
            $(this).parents('tr').find('.purchase').html().replace(/ /g,'')
        );
        $(this).parents('tr').find('.saleText').val(
            $(this).parents('tr').find('.sale').html().replace(/ /g,'')
        );
        $(this).parents('tr')
            .find('.purchaseText').hide().end()
            .find('.saleText').hide().end()
            .find('.purchase').show().end()
            .find('.sale').show().end()
            .find('.save-rate-btn').hide().end()
            .find('.cancel-rate-btn').hide().end()
            .find('.edit-rate-btn').show();
    })

    $('.save-rate-btn').on('click', function() {
        var errorContainer = $(".errors").empty();

        var rateId = $(this).parents('tr').find('.rateId').val();
        var sale = $(this).parents('tr').find('.saleText').val();
        var purchase = $(this).parents('tr').find('.purchaseText').val();
        //validation block
        {
            var hasErrors = false;

            if(isNaN(parseFloat(sale)) || (parseFloat(sale)<0)){
                errorContainer.append($("<div/>").addClass("error").text("wrong sale rate"));
                hasErrors = true;
            }
            if(isNaN(parseFloat(purchase)) || (parseFloat(purchase)<0)){
                errorContainer.append($("<div/>").addClass("error").text("wrong purchase rate"));
                hasErrors = true;
            }
            if(hasErrors) return;
        }

        $.ajax({
            url: '/saveRate.action',
            type: 'post',
            data: {
                rateId: rateId,
                sale: sale,
                purchase: purchase
            },
            success: function(data) {
                var success = data.success;
                if (success) {
                    alert("Rate has been successfully updated!")
                    window.location.replace("/rate.action");
                }
            }
        })
    })
})
