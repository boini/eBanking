<%--
  Created by IntelliJ IDEA.
  User: antonkholodok
  Date: 10/24/12
  Time: 4:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>
        <tiles:insertAttribute name="title" ignore="true" />
    </title>
    <tiles:useAttribute id="styles" name="styles" classname="java.util.List" />
    <c:forEach items="${styles}" var="style">
        <link rel="stylesheet" href="${style}" />
    </c:forEach>
</head>
<body>
<div class="wrapper">
    <tiles:insertAttribute name="header"/>
    <div class="body">
        <tiles:insertAttribute name="menu"/>
        <tiles:insertAttribute name="body"/>
    </div>
    <tiles:insertAttribute name="footer"/>
</div>
<tiles:useAttribute id="scripts" name="scripts" classname="java.util.List" />
<c:forEach items="${scripts}" var="script">
    <script type="text/javascript" src="<c:out value='${script}'/>"></script>
</c:forEach>
</body>
</html>