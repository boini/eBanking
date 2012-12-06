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
        <s:form action="/mobilePaymentSubmit" method="POST" id="mobileNumberForm">
            <table class="table table-striped">
                <caption>Подтверждение реквизитов. Если все реквизиты заполнены правильно нажмите "Отправить в банк" или вернитесь к редактированию документа.</caption>
                <tr>
                    <td>Дата</td>
                    <td>
                        <s:property value="%{#session.mobilePaymentForm.date}"/>
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
                        <s:property value="%{#session.mobilePaymentForm.providerName}"/>
                    </td>
                </tr>
                <tr>
                    <td>Оплатить с карты</td>
                    <td>
                        <s:property value="%{#session.mobilePaymentForm.activeCard.cardNumber}"/>
                    </td>
                </tr>
                <tr>
                    <td>Cумма</td>
                    <td>
                        <s:property value="%{#session.mobilePaymentForm.amount}"/>
                        (<s:property value="%{#session.mobilePaymentForm.activeCard.cardAccount.currency.currencyCode}"/>)
                    </td>
                </tr>
                <tr>
                    <td>Номер телефона</td>
                    <td>
                        <s:property value="%{#session.mobilePaymentForm.number}"/>
                    </td>
                </tr>
            </table>
            <td>
                <s:submit value="Продолжить"/>
            </td>
        </s:form>
    </div>
</div>