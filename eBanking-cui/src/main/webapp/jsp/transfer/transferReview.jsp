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
        <s:form action="/transferSubmit" method="POST" id="mobileNumberForm">
            <table class="table table-striped">
                <caption>Подтверждение реквизитов. Если все реквизиты заполнены правильно нажмите "Отправить в банк" или вернитесь к редактированию документа.</caption>
                <tr>
                    <td>Дата</td>
                    <td>
                        <s:property value="%{#session.transferForm.date}"/>
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
                        Перевод средств
                    </td>
                </tr>
                <tr>
                    <td>С карты</td>
                    <td>
                        <s:property value="%{#session.transferForm.fromCard.cardNumber}"/>
                    </td>
                </tr>
                <tr>
                    <td>На карты</td>
                    <td>
                        <s:property value="%{#session.transferForm.toCard.cardNumber}"/>
                    </td>
                </tr>
                <tr>
                    <td>Cумма</td>
                    <td>
                        <s:property value="%{#session.transferForm.amount}"/>
                        (<s:property value="%{#session.transferForm.fromCard.cardAccount.currency.currencyCode}"/>) =
                        <s:property value="%{#session.transferForm.equivalentAmount}"/>
                        (<s:property value="%{#session.transferForm.toCard.cardAccount.currency.currencyCode}"/>)
                    </td>
                </tr>
            </table>
            <h5>
                Внимание! После нажания на кнопку "Отправить в банк" Вы совершите
                платеж. Возврат средств на Ваш счет будет невозможен!
            </h5>
            <td>
                <s:submit value="Отправить в банк"/>
            </td>
        </s:form>
    </div>
</div>