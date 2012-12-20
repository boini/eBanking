<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
    <div id="greeting">
        <h5>
            <s:property value="#session['clientInfoForm'].fullName"/>
        </h5>
        Main page
    </div>

    <div>
        <table class="table table-condensed table-hover" id="cards">
            <caption>Your cards (balance as at
                <s:date name="#session['clientCardsForm'].date" format="MM/dd/yyyy HH:mm:ss"/>
                ) </caption>
            <thead>
                <tr>
                    <th>Card number</th>
                    <th>Balance</th>
                    <th>Credit limit</th>
                    <th>Currency</th>
                    <th>Card type</th>
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
                            <s:if test="%{#card.cardType.cardTypeName=='VISA'}">
                                <img src="../img/visa.png"/>
                            </s:if>
                            <s:if test="%{#card.cardType.cardTypeName=='MC'}">
                                <img src="../img/mc.png"/>
                            </s:if>
                        </td>
                    </tr>
                </s:iterator>
            </tbody>
        </table>
        <table class="table table-condensed table-hover">
            <caption>Exchange rates on card transactions (as
                <s:date name="#session['nbrbCurrencyRatesForm'].date" format="MM/dd/yyyy HH:mm:ss"/>
                )</caption>
            <thead>
            <tr>
                <th>Currency name</th>
                <th>Code</th>
                <th>Rate</th>
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