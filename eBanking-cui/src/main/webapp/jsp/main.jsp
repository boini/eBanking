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
        <table class="table table-condensed table-hover">
            <caption>Ваши карты (остаток по состоянию на
                <s:property value="#session['clientCardsForm'].date"/>
                ) </caption>
            <thead>
                <tr>
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
        <table class="table table-condensed table-hover">
            <caption>Курсы валют по операциям с картами (по состоянию на
                <s:property value="#session['nbrbCurrencyRatesForm'].date"/>
                )</caption>
            <thead>
            <tr>
                <th>Наименование валюты</th>
                <th>Код</th>
                <th>Курс</th>
            </tr>
            </thead>
            <tbody>
            <s:iterator value="#session['nbrbCurrencyRatesForm'].rates.dailyExRatesOnDate" var="rate">
                <tr>
                    <td>
                        <s:property value="#rate.curQuotName"/>
                    </td>
                    <td>
                        <s:property value="#rate.curAbbreviation"/>
                    </td>
                    <td>
                        <s:property value="#rate.curOfficialRate"/>
                    </td>
                </tr>
            </s:iterator>
            </tbody>
        </table>
    </div>
</div>