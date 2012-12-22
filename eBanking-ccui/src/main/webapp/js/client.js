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

    $('#search').hide();

    $('.btn-search').on('click', function() {
        $(this).hide();
        $('#search').show();
    })

    $('.btn-search-cancel').on('click', function() {
        $('#fn-search').val('');
        $('#ln-search').val('');
        $('.btn-search').show();
        $('#search').hide();
        $('.searchError').remove();
    })

    $('.btn-search-submit').on('click', function() {
        $('.searchError').remove();
        var fn = $('#fn-search').val();
        var ln = $('#ln-search').val();

        $.ajax({
            url: '/search.action',
            type: 'post',
            data: {
                fn: fn,
                ln: ln
            },
            success: function(data) {
                if (data.success) {
                    window.location.replace("/clientsForward.action");
                } else {
                    $('#search').append(
                        '<div class="alert alert-error searchError">' +
                            '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
                            '<h4>Exception!</h4>' +
                            data.exception +
                            '</div>');
                }
            }
        })
    })
})
