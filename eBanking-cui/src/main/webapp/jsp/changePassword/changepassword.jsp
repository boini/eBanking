<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
    <div id="greeting">
        <h5>
            <s:property value="#session['clientInfoForm'].fullName"/>
        </h5>
        Change your login
    </div>

    <div id="changePassword">
        <s:password key="currentPassword" placeholder="password" label="Current password" id="currentPassword"/>
        <br/>
        <s:password key="newPassword" placeholder="new password" label="New password" id="newPassword"/>
        <br/>
        <s:password key="confirmPassword" placeholder="confirm password" label="Confirm password" id="confirmPassword"/>
        <button type="button" id="changePasswordSubmit" data-loading-text="Loading..." class="btn btn-primary">Change</button>
        <div id="changePasswordMessage"></div>
    </div>

</div>