<%--
  Created by IntelliJ IDEA.
  User: charley
  Date: 09.12.12
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
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

        <h3>Пароль успешно изменен</h3>

    </div>

</div>