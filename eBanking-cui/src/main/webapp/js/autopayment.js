$(function(){
    $('#autoPaymentSubmit').on('click', function() {
        var radios = $('input[type="radio"]');
        var period = '';
        $.each(radios, function(index, radio) {
            if ($(radio).prop('checked')) {
                period += $(radio).attr('value');
            }
        })

        $.ajax({
            url: '/saveAutoPayment.action',
            type: 'post',
            data: {
                period: period
            },
            success: function(data) {
                alert("Auto payment has been successfully saved!")
                window.location.replace("/autoPaymentList.action");
            }
        })
    })

    $('.ap-rm').on('click', function() {
        var id = $(this).next().val();

        $.ajax({
            url: '/deleteAutoPayment.action',
            type: 'post',
            data: {
                id: id
            },
            success: function(data) {
                alert("Auto payment has been successfully deleted!")
                window.location.replace("/autoPaymentList.action");
            }
        })
    })
})
