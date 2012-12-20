$(function() {
    $('.rm-client-btn').on('click', function() {
        var clientId = $(this).parents('tr').find('.clientIdValue').val();
        $.ajax({
            url: '/removeClient.action',
            type: 'post',
            data: {
                id: clientId,
                type: 'client'
            },
            success: function(data) {
                if (data.success) {
                    alert("Client has been successfully deleted!")
                    window.location.replace("/clients.action");
                }
            }
        })
    })
})
