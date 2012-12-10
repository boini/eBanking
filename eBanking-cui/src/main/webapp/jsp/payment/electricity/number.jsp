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
        <s:form action="/electricityPaymentAmount" method="POST" id="electricityNumberForm">
            <td colspan="2">
                <h5>Наименование услуги:
                    <s:property value="%{#session.electricityPaymentForm.providerName}"/>
                </h5>
            </td>
            <s:select list="#session['electricityPaymentForm'].cards"
                      label="Оплатить со счёта"
                      headerValue="-выберите счёт-"
                      listKey="cardId"
                      key="cardId"
                      listValue="%{cardNumber + ' [' + cardType.cardTypeName + ' ' + cardAccount.balance + ' ' + cardAccount.currency.currencyCode + ']'}">

            </s:select>
            <td colspan="2">
                <h5>Дополнительные реквизиты</h5>
                <h6>Электроэнергия. Один платеж - не более 10 000 000 бел. руб.</h6>
            </td>
            <s:textfield key="number"
                         label="Номер абонента"/>
            <td>
                <s:submit value="Продолжить"/>
            </td>
        </s:form>
    </div>
</div>