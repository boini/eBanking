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
        <s:form action="/phonePaymentAmount" method="POST" id="mobileNumberForm">
            <td colspan="2">
                <h5>Наименование услуги:
                    <s:property value="%{#session.phonePaymentForm.providerName}"/>
                </h5>
            </td>
            <s:select list="#session['phonePaymentForm'].cards"
                      label="Оплатить со счёта"
                      headerValue="-выберите счёт-"
                      listKey="cardId"
                      key="cardId"
                      listValue="%{cardNumber + ' [' + cardType.cardTypeName + ' ' + cardAccount.balance + ' ' + cardAccount.currency.currencyCode + ']'}">

            </s:select>
            <td colspan="2">
                <h5>Дополнительные реквизиты</h5>
                <h6>Телефон.</h6>
                <h6>Необходимо ввести:</h6>
                <h6>г.Минск - номер телефона</h6>
                <h6>область - две последние цифры кода региона + номер телефона</h6>
                <h6>Услуга доступна с 7-00 до 23-00</h6>
            </td>
            <s:textfield key="number"
                         label="Номер телефона"
                         placeholder="+375xxххххххх"/>
            <s:textfield key="credential"
                         label="ФИО"
                         placeholder="Иванов Иван Иванович"/>
            <td>
                <s:submit value="Продолжить"/>
            </td>
        </s:form>
    </div>
</div>