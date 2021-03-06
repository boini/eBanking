<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
    <div id="greeting">
        <h5>
            <s:property value="#session['clientInfoForm'].fullName"/>
        </h5>
        Pay the rent
    </div>

    <div>
            <table class="table table-bordered paid">
                <tr>
                    <td>Date</td>
                    <td>
                        <s:property value="%{#session.rentPaymentForm.date}"/>
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
                        <s:property value="%{#session.rentPaymentForm.providerName}"/>
                    </td>
                </tr>
                <tr>
                    <td>Pay from card</td>
                    <td>
                        <s:property value="%{#session.rentPaymentForm.activeCard.cardNumber}"/>
                    </td>
                </tr>
                <tr>
                    <td>Sum</td>
                    <td>
                        <s:property value="%{#session.rentPaymentForm.amount}"/>
                        (<s:property value="%{#session.rentPaymentForm.activeCard.cardAccount.currency.currencyCode}"/>)
                    </td>
                </tr>
                <tr>
                    <td>Personal client number</td>
                    <td>
                        <s:property value="%{#session.rentPaymentForm.number}"/>
                    </td>
                </tr>
            </table>
        <input id="printbutton" type="button" onclick="print();" value="print check"/>
    </div>
</div>