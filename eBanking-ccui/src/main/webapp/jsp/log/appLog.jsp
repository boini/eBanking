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
        <table class="table table-condensed table-bordered">
            <caption>App logs</caption>
            <thead>
            <tr>
                <th>#</th>
                <th>Log date</th>
                <th>Log action</th>
                <th>Log message</th>
            </tr>
            </thead>
            <tbody>
            <s:iterator value="#session['logForm'].logs" var="log" status="index">
                <tr>
                    <td>
                        <s:property value="#index.index + 1"/>
                    </td>
                    <td>
                        <s:date name="#log.date" format="MM/dd/yyyy HH:mm:ss"/>
                    </td>
                    <td>
                        <s:property value="#log.action"/>
                    </td>
                    <td>
                        <s:property value="#log.message"/>
                    </td>
                </tr>
            </s:iterator>
            </tbody>
        </table>
    </div>
</div>