<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<div>
    <div id="greeting">
        <h5>
            <s:property value="#session['clientInfoForm'].fullName"/>
        </h5>
        Welcome to the "eBanking"
    </div>

    <div>

        <div>
            <span>The parameters of the statement</span><br/>
            <input type="radio" id="weekRadio" name="bankStatement" checked="checked"/>For the last week <br/>
            <input type="radio" id="monthRadio" name="bankStatement"/>For the last month
        </div>

        <table class="table table-condensed table-hover" id="cards">
            <caption>Your cards (balance as at 07.11.2012 17:25:51) </caption>
            <thead>
            <tr>
                <th></th>
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
                        <s:checkbox name="%{#card.cardId}" theme="simple"/>
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

        <button type="button" class="btn btn-primary" id="onlineInfoSubmit" data-loading-text="Loading...">Получить</button>

        <div id="onlineInfoTable">

        </div>
    </div>
</div>