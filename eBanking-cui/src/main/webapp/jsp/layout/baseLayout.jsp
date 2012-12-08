<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title><tiles:insertAttribute name="title"/></title>

    <tiles:useAttribute id="styles" name="styles" classname="java.util.List" />
    <c:forEach items="${styles}" var="style">
        <link rel="stylesheet" href="${style}" />
    </c:forEach>

    <sj:head jqueryui="true" jquerytheme="redmond" />
</head>
<body>
    <tiles:insertAttribute name="header"/>

    <div class="container-fluid wrapper">
        <div class="row-fluid">
            <div class="span2">
                <tiles:insertAttribute name="menu"/>
            </div>
            <div class="span5">
                <tiles:insertAttribute name="body"/>
            </div>
            <div class="span5">
                <tiles:insertAttribute name="info"/>
            </div>
        </div>
    </div>

    <tiles:insertAttribute name="footer"/>

    <tiles:useAttribute id="scripts" name="scripts" classname="java.util.List" />
    <c:forEach items="${scripts}" var="script">
        <script type="text/javascript" src="<c:out value='${script}'/>"></script>
    </c:forEach>
</body>
</html>