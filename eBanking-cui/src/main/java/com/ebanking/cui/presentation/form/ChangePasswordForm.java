package com.ebanking.cui.presentation.form;

/**
 * Created with IntelliJ IDEA.
 * User: charley
 * Date: 09.12.12
 * Time: 20:37
 * To change this template use File | Settings | File Templates.
 */
public class ChangePasswordForm {

    private String oldPassword;
    private String newPassword;
    private String confirmPassword;

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getOldPassword() {
        return this.oldPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getNewPassword() {
        return this.newPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getConfirmPassword() {
        return this.confirmPassword;
    }
}
