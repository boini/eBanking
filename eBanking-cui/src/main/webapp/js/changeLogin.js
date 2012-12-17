$(document).ready(function() {
    $('#changeLoginSubmit').on('click', function() {
        var currentLogin = $('#currentLogin').val();
        var password = $('#password').val();
        var newLogin = $('#newLogin').val();

        $('#changeLoginMessage').html('');
        $('#changeLoginSubmit').button('loading');
        $.ajax({
            url: '/changeLoginSubmit.action',
            type: 'post',
            data: {
                currentLogin: currentLogin,
                password: password,
                newLogin: newLogin,
                call: true
            }, success : function(data) {
                $('#changeLoginSubmit').button('reset');
                var success = data.success;
                if (success) {
                    $('#changeLoginMessage').append(
                        '<div class="alert alert-success">' +
                            '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
                                '<h4>Success!</h4>' +
                                    'Your login has been changed.' +
                        '</div>');
                } else {
                    $('#changeLoginMessage').append(
                        '<div class="alert alert-error">' +
                            '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
                            '<h4>Exception!</h4>' +
                            data.exception +
                        '</div>');
                }
            }
        })
    })
})
