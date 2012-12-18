<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
    <div id="greeting">
        <h5>
            Hello, <s:property value="#session['clientAccount'].login"/>
        </h5>
        Welcome to the "eBanking | Call Center"
    </div>

    <div>
        <h6>Corporation:</h6>

        <ul>
            <s:iterator value="#session['corporationForm'].corporations" var="corporation" status="index">
                <li>
                    <s:url action="corporationView" var="corporationViewUrl">
                        <s:param name="corporationId">
                            <s:property value="#corporation.corporationId"/>
                        </s:param>
                    </s:url>
                    <s:a href="%{corporationViewUrl}">
                        <s:property value="#corporation.description"/>
                    </s:a>
                </li>
            </s:iterator>
        </ul>
    </div>
</div>