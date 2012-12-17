$(document).ready(function() {
    $('#changePasswordSubmit').on('click', function() {
        var currentPassword = $('#currentPassword').val();
        var newPassword = $('#newPassword').val();
        var confirmPassword = $('#confirmPassword').val();
        if(newPassword !== confirmPassword){
            $('#changePasswordMessage').append(
                '<div class="alert alert-error">' +
                    '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
                    "Passwords not equal!!!" +
                    '</div>');
            $('#newPassword, #confirmPassword').one("keypress", function(){
                $(".close").trigger("click");
            });
            return;
        }

        $('#changePasswordMessage').html('');
        $('#changePasswordSubmit').button('loading');
        $.ajax({
            url: '/changePasswordSubmit.action',
            type: 'post',
            data: {
                currentPassword: currentPassword,
                newPassword: newPassword,
                confirmPassword: confirmPassword,
                call: true
            }, success : function(data) {
                $('#changePasswordSubmit').button('reset');
                var success = data.success;
                if (success) {
                    $('#changePasswordMessage').append(
                        '<div class="alert alert-success">' +
                            '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
                                '<h4>Success!</h4>' +
                                    'Your password has been changed.' +
                        '</div>');
                } else {
                    $('#changePasswordMessage').append(
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
