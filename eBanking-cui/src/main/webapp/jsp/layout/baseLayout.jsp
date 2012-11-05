<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>
        <tiles:insert name="title"/>
    </title>
    <tiles:useAttribute id="styles" name="styles" classname="java.util.List" />
    <c:forEach items="${styles}" var="style">
        <link rel="stylesheet" href="${style}" />
    </c:forEach>
</head>
<body>
    <tiles:insert name="header"/>

    <div class="container-fluid">
        <div class="row-fluid">
            <div class="span2">
                <tiles:insert name="menu"/>
            </div>
            <div class="span10">
                <tiles:insert name="body"/>
            </div>
        </div>
    </div>

    <tiles:insert name="footer"/>

    <tiles:useAttribute id="scripts" name="scripts" classname="java.util.List" />
    <c:forEach items="${scripts}" var="script">
        <script type="text/javascript" src="<c:out value='${script}'/>"></script>
    </c:forEach>
</body>
</html>