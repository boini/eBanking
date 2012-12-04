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
        <s:form action="/mobilePaymentReview" method="POST" id="mobileNumberForm">
            <td colspan="2">
                <h5>Наименование услуги: Velcom</h5>
            </td>
            <s:textfield label="Оплатить со счета:"
                         value="%{#session.mobilePaymentForm.activeCard.cardNumber}"
                         disabled="true"/>
            <s:textfield label="Cумма (%{#session.mobilePaymentForm.activeCard.cardAccount.currency.currencyCode}):"
                         key="amount"/>
            <td colspan="2">
                <h5>Дополнительные реквизиты</h5>
            </td>
            <s:textfield name="mobileNumber"
                         label="Номер телефона"
                         value="%{#session['mobilePaymentForm'].number}"
                         disabled="true"/>
            <td>
                <s:submit value="Продолжить"/>
            </td>
        </s:form>
    </div>
</div>