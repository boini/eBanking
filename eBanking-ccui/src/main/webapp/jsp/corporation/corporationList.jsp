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

    <div id="corporations">
        <h6>Corporation:</h6>

        <ul>
            <s:iterator value="#session['corporationForm'].corporations" var="corporation" status="index">
                <li>
                    <a href="#" class="corp-info">
                        <s:property value="#corporation.description"/>
                    </a>
                    <input type="hidden" value='<s:property value="#corporation.corporationId"/>'/>
                </li>
            </s:iterator>
        </ul>
    </div>
    <div id="details">
    </div>
</div>