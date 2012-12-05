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

        <div>
            <span>Параметры формирования выписки</span><br/>
            <input type="radio" name="bankStatement" checked="checked"/>За последнюю неделю <br/>
            <input type="radio" name="bankStatement"/>За последний месяц
        </div>

        <table class="table table-condensed table-hover">
            <caption>Ваши карты (остаток по состоянию на 07.11.2012 17:25:51) </caption>
            <thead>
            <tr>
                <th></th>
                <th>Номер карты</th>
                <th>Остаток</th>
                <th>Лимит кредита</th>
                <th>Валюта</th>
                <th>Тип карты</th>
            </tr>
            </thead>
            <tbody>
            <s:iterator value="#session['clientCardsForm'].cards" var="card">
                <tr>
                    <td>
                        <input type="checkbox"/>
                    </td>
                    <td>
                        <s:property value="#card.cardNumber"/>
                    </td>
                    <td>
                        <s:property value="#card.cardAccount.balance"/>
                    </td>
                    <td>
                        <s:property value="#card.creditLimit"/>
                    </td>
                    <td>
                        <s:property value="#card.cardAccount.currency.currencyCode"/>
                    </td>
                    <td>
                        <img src="http://placehold.it/64x32"/>
                    </td>
                </tr>
            </s:iterator>
            </tbody>
        </table>
    </div>
</div>