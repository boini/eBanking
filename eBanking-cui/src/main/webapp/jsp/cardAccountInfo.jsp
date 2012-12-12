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
        Добро пожаловать в систему "eBanking"
    </div>

    <div>

        <div>
            <span>Параметры формирования выписки</span><br/>
            <input type="radio" id="weekRadio" name="bankStatement" checked="checked"/>За последнюю неделю <br/>
            <input type="radio" id="monthRadio" name="bankStatement"/>За последний месяц
        </div>

        <table class="table table-condensed table-hover" id="cards">
            <thead>
            <tr>
                <th></th>
                <th>Номер карты</th>
                <th>Валюта</th>
                <th>Тип карты</th>
            </tr>
            </thead>
            <tbody>
            <s:iterator value="#session['clientCardsForm'].cards" var="card">
                <tr>
                    <td>
                        <s:checkbox name="%{#card.cardAccountID}" theme="simple"/>
                    </td>
                    <td>
                        <s:property value="#card.cardNumber"/>
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

        <button class="btn btn-primary" id="cardAccountInfoSubmit">Получить</button>

        <div id="cardAccountInfoTable">

        </div>
    </div>
</div>