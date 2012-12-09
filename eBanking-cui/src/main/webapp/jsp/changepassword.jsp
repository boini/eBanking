<%--
  Created by IntelliJ IDEA.
  User: charley
  Date: 09.12.12
  Time: 13:09
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

        <s:form method="post">
            <h3>Change password</h3>
            <s:password name="j_oldpassword" placeholder="Old password" />
            <s:password name="j_newpassword" placeholder="New password" />
            <s:password name="j_confirmpassword" placeholder="Confirm password" />
            <s:submit label="Change" />
        </s:form>

    </div>

</div>