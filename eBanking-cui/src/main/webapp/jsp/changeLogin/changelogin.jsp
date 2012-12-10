<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: charley
  Date: 10.12.12
  Time: 23:39
  To change this template use File | Settings | File Templates.
--%>
<div>
    <div id="greeting">
        <h5>
            <s:property value="#session['clientInfoForm'].fullName"/>
        </h5>
        Добро пожаловать в систему "eBanking"
    </div>

    <div>

        <s:form action="/changeLoginSubmit.action" method="post">
            <h3>Смена пароля</h3>
            <s:textfield name="oldLogin" placeholder="Old login" />
            <s:textfield name="newLogin" placeholder="New login" />
            <s:submit value="Изменить" />
        </s:form>

    </div>

</div>