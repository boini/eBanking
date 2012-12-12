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
            <table class="table table-bordered paid">
                <tr>
                    <td>Дата</td>
                    <td>
                        <s:property value="%{#session.electricityPaymentForm.date}"/>
                    </td>
                </tr>
                <tr>
                    <td>Банк клиента</td>
                    <td>eBanking</td>
                </tr>
                <tr>
                    <td>Клиент</td>
                    <td>
                        <s:property value="#session['clientInfoForm'].fullName"/>
                    </td>
                </tr>
                <tr>
                    <td>Оплачиваемая услуга</td>
                    <td>
                        <s:property value="%{#session.electricityPaymentForm.providerName}"/>
                    </td>
                </tr>
                <tr>
                    <td>Оплатить с карты</td>
                    <td>
                        <s:property value="%{#session.electricityPaymentForm.activeCard.cardNumber}"/>
                    </td>
                </tr>
                <tr>
                    <td>Cумма</td>
                    <td>
                        <s:property value="%{#session.electricityPaymentForm.amount}"/>
                        (<s:property value="%{#session.electricityPaymentForm.activeCard.cardAccount.currency.currencyCode}"/>)
                    </td>
                </tr>
                <tr>
                    <td>Номер абонента</td>
                    <td>
                        <s:property value="%{#session.electricityPaymentForm.number}"/>
                    </td>
                </tr>
            </table>
    </div>
</div>