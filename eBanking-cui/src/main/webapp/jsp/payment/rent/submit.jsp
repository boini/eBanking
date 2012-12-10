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
        <s:form action="/rentPaymentSubmit" method="POST" id="rentNumberForm">
            <table class="table table-striped">
                <tr>
                    <td>Дата</td>
                    <td>
                        <s:property value="%{#session.rentPaymentForm.date}"/>
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
                        <s:property value="%{#session.rentPaymentForm.providerName}"/>
                    </td>
                </tr>
                <tr>
                    <td>Оплатить с карты</td>
                    <td>
                        <s:property value="%{#session.rentPaymentForm.activeCard.cardNumber}"/>
                    </td>
                </tr>
                <tr>
                    <td>Cумма</td>
                    <td>
                        <s:property value="%{#session.rentPaymentForm.amount}"/>
                        (<s:property value="%{#session.rentPaymentForm.activeCard.cardAccount.currency.currencyCode}"/>)
                    </td>
                </tr>
                <tr>
                    <td>Номер лицевого счета</td>
                    <td>
                        <s:property value="%{#session.rentPaymentForm.number}"/>
                    </td>
                </tr>
            </table>
            <td>
                <s:submit value="Готово"/>
            </td>
        </s:form>
    </div>
</div>