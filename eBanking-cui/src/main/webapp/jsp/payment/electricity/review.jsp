<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
    <div id="greeting">
        <h5>
            <s:property value="#session['clientInfoForm'].fullName"/>
        </h5>
        Pay for the electricity
    </div>

    <div>
        <s:form action="/electricityPaymentSubmit" method="POST" id="electricityNumberForm">
            <table class="table table-striped">
                <caption>Confirmation details. If all of the details are filled in correctly, click "Submit" or go back to the document.</caption>
                <tr>
                    <td>Date</td>
                    <td>
                        <s:property value="%{#session.electricityPaymentForm.date}"/>
                    </td>
                </tr>
                <tr>
                    <td>Bank</td>
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
                        <s:property value="%{#session.electricityPaymentForm.providerName}"/>
                    </td>
                </tr>
                <tr>
                    <td>Pay with card</td>
                    <td>
                        <s:property value="%{#session.electricityPaymentForm.activeCard.cardNumber}"/>
                    </td>
                </tr>
                <tr>
                    <td>Sum</td>
                    <td>
                        <s:property value="%{#session.electricityPaymentForm.amount}"/>
                        (<s:property value="%{#session.electricityPaymentForm.activeCard.cardAccount.currency.currencyCode}"/>)
                    </td>
                </tr>
                <tr>
                    <td>Client number</td>
                    <td>
                        <s:property value="%{#session.electricityPaymentForm.number}"/>
                    </td>
                </tr>
            </table>
            <h5>
                Attention! After pressing the "Submit" You will make a payment. Refund to your account won't be possible!
            </h5>
            <td>
                <s:submit value="Send to the bank"/>
            </td>
        </s:form>
    </div>
</div>