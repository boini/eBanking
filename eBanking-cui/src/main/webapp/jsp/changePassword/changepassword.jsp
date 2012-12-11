<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
    <div id="greeting">
        <h5>
            <s:property value="#session['clientInfoForm'].fullName"/>
        </h5>
        Добро пожаловать в систему "eBanking"
    </div>

    <div>

        <s:form action="/changePasswordSubmit" method="post" id="changePasswordForm">
            <h3>Смена пароля</h3>
            <s:password name="oldPassword" placeholder="Old password" />
            <s:password name="newPassword" placeholder="New password" />
            <s:password name="confirmPassword" placeholder="Confirm password" />
            <s:submit value="Изменить" />
        </s:form>

    </div>

</div>