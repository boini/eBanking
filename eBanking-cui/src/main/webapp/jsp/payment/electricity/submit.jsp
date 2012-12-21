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

            <table class="table table-bordered paid">
                <tr>
                    <td>Date</td>
                    <td>
                        <s:property value="%{#session.electricityPaymentForm.date}"/>
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
                    <td>Abonent number</td>
                    <td>
                        <s:property value="%{#session.electricityPaymentForm.number}"/>
                    </td>
                </tr>
            </table>
            <input id="printbutton" type="button" onclick="print();" value="print check"/>
    </div>
</div>