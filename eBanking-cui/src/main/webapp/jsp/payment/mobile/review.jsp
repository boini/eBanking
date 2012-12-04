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
                    <td>04.12.2012</td>
                </tr>
                <tr>
                    <td>Банк клиента</td>
                    <td>eBanking</td>
                </tr>
                <tr>
                    <td>Клиент</td>
                    <td>Холодок Антон Александрович</td>
                </tr>
                <tr>
                    <td>Оплачиваемая услуга</td>
                    <td>Velcom</td>
                </tr>
                <tr>
                    <td>Оплатить с карты</td>
                    <td>1231231231231231</td>
                </tr>
                <tr>
                    <td>Cумма</td>
                    <td>15000 (BYR)</td>
                </tr>
                <tr>
                    <td>Номер телефона</td>
                    <td>291258458</td>
                </tr>
            </table>
            <td>
                <s:submit value="Продолжить"/>
            </td>
        </s:form>
    </div>
</div>