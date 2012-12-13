<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<script type="text/javascript">
    $(document).ready(function(){
        $("#transfer").validate({
            rules: {
                amount: {
                    required: true,
                    minlength: 9,
                    maxlength: 9,
                    digits: true
                }
            }
        });
    });
</script>
<div>
    <div id="greeting">
        <h5>
            <s:property value="#session['clientInfoForm'].fullName"/>
        </h5>
        Добро пожаловать в систему "eBanking"
    </div>

    <table class="table table-bordered table-condensed" id="cards">
        <caption>Ваши карты (остаток по состоянию на 07.11.2012 17:25:51) </caption>
        <thead>
        <tr>
            <th>Название валюты</th>
            <th>Код</th>
            <th>Курс покупки</th>
            <th>Курс продажи</th>
        </tr>
        </thead>
        <tbody>
        <s:iterator value="#session['ratesForm'].rates" var="rate">
            <tr>
                <td>
                    <s:property value="#rate.currency.currencyDescription"/>
                </td>
                <td>
                    <s:property value="#rate.currency.currencyCode"/>
                </td>
                <td>
                    <s:property value="#rate.purchase"/>
                </td>
                <td>
                    <s:property value="#rate.sale"/>
                </td>
            </tr>
        </s:iterator>
        </tbody>
    </table>

    <s:form action="/transferReview" method="post" id="transfer">
        <s:select list="#session['clientCardsForm'].cards"
                  label="C карты"
                  headerValue="-выберите счёт-"
                  listKey="cardId"
                  key="fromCardId"
                  listValue="%{cardNumber + ' [' + cardType.cardTypeName + ' ' + cardAccount.balance + ' ' + cardAccount.currency.currencyCode + ']'}"/>

        <s:select list="#session['clientCardsForm'].cards"
                  label="На карту"
                  headerValue="-выберите счёт-"
                  listKey="cardId"
                  key="toCardId"
                  listValue="%{cardNumber + ' [' + cardType.cardTypeName + ' ' + cardAccount.balance + ' ' + cardAccount.currency.currencyCode + ']'}"/>

        <s:textfield key="amount"
                     label="Сумма"/>
        <s:submit value="Продолжить" cssClass="btn btn-primary"/>
    </s:form>

</div>