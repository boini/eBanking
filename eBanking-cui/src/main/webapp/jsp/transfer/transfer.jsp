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
        Welcome to the "eBanking"
    </div>

    <table class="table table-bordered table-condensed" id="cards">
        <caption>Your cards (balance as at 07.11.2012 17:25:51) </caption>
        <thead>
        <tr>
            <th>Currency name</th>
            <th>Code</th>
            <th>Purchasing rate</th>
            <th>Selling rate</th>
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
                  label="From card"
                  headerValue="-select bill-"
                  listKey="cardId"
                  key="fromCardId"
                  listValue="%{cardNumber + ' [' + cardType.cardTypeName + ' ' + cardAccount.balance + ' ' + cardAccount.currency.currencyCode + ']'}"/>

        <s:select list="#session['clientCardsForm'].cards"
                  label="To card"
                  headerValue="-select bill-"
                  listKey="cardId"
                  key="toCardId"
                  listValue="%{cardNumber + ' [' + cardType.cardTypeName + ' ' + cardAccount.balance + ' ' + cardAccount.currency.currencyCode + ']'}"/>

        <s:textfield key="amount"
                     label="Sum"/>
        <s:submit value="Continue" cssClass="btn btn-primary"/>
    </s:form>

</div>