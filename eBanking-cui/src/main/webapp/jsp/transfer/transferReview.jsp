<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
    <div id="greeting">
        <h5>
            <s:property value="#session['clientInfoForm'].fullName"/>
        </h5>
        Welcome to the "eBanking"
    </div>

    <div>
        <s:form action="/transferSubmit" method="POST" id="mobileNumberForm">
            <table class="table table-striped">
                <caption>Confirmation details. If all of the details are filled in correctly, click "Submit" or go back to the document.</caption>
                <tr>
                    <td>Date</td>
                    <td>
                        <s:property value="%{#session.transferForm.date}"/>
                    </td>
                </tr>
                <tr>
                    <td>Client bank</td>
                    <td>eBanking</td>
                </tr>
                <tr>
                    <td>Client</td>
                    <td>
                        <s:property value="#session['clientInfoForm'].fullName"/>
                    </td>
                </tr>
                <tr>
                    <td>Paid service</td>
                    <td>
                        Money transfer
                    </td>
                </tr>
                <tr>
                    <td>From card</td>
                    <td>
                        <s:property value="%{#session.transferForm.fromCard.cardNumber}"/>
                    </td>
                </tr>
                <tr>
                    <td>To card</td>
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
                Attention! After pressing the "Submit" You will make a payment. Refund to your account won't be possible!
            </h5>
            <td>
                <s:submit value="Submit"/>
            </td>
        </s:form>
    </div>
</div>