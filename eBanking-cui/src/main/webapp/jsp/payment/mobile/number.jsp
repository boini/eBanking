<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
    <div id="greeting">
        <h5>
            <s:property value="#session['clientInfoForm'].fullName"/>
        </h5>
        Добро пожаловать в систему "eBanking"
    </div>

    <div>
        <s:form action="/mobilePaymentAmount" method="POST" id="mobileNumberForm">
            <td colspan="2">
                <h5>Наименование услуги:
                    <s:property value="%{#session.mobilePaymentForm.providerName}"/>
                </h5>
            </td>
            <s:select list="#session['mobilePaymentForm'].cards"
                      label="Оплатить со счёта"
                      headerValue="-выберите счёт-"
                      listKey="cardId"
                      key="cardId"
                      listValue="%{cardNumber + ' [' + cardType.cardTypeName + ' ' + cardAccount.balance + ' ' + cardAccount.currency.currencyCode + ']'}">

            </s:select>
            <td colspan="2">
                <h5>Дополнительные реквизиты</h5>
            </td>
            <s:textfield key="number"
                         label="Номер телефона"
                         placeholder="29ххххххх"/>
            <td>
                <s:submit value="Продолжить"/>
            </td>
        </s:form>
    </div>
</div>