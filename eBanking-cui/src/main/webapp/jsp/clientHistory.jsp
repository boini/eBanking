<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<div>
    <div id="greeting">
        <h5>
            <s:property value="#session['clientInfoForm'].fullName"/>
        </h5>
        Добро пожаловать в систему "eBanking"
    </div>

    <div>

        <table class="table table-condensed table-hover">
            <caption></caption>
            <thead>
            <tr>
                <th>Дата</th>
                <th>Название</th>
                <th>Сумма</th>
                <th>Состоние</th>
                <th>Ключ</th>
            </tr>
            </thead>
            <tbody>
            <s:iterator value="#session['clientOperationHistoryForm'].operations" var="operation">
                <tr>
                    <td>
                        <s:date name="#operation.processingDate.time" format="dd-MM-yyyy HH:mm:ss" />
                        <%--<s:property value="#operation.processingDate.time"/>--%>
                    </td>
                    <td>
                        <s:property value="#operation.operationType.description"/>
                    </td>
                    <td>
                        <s:property value="#operation.transactionAmount"/>
                    </td>
                    <td>
                        <s:property value="#operation.operationStatus.description"/>
                    </td>
                    <td>
                        <s:property value="#operation.operationKey"/>
                    </td>
                </tr>
            </s:iterator>
            </tbody>
        </table>
    </div>
</div>