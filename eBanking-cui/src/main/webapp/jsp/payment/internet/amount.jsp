<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">
    $(document).ready(function(){
        $("#internetNumberForm").validate({
            errorLabelContainer: $("#container"),
            rules: {
                amount: {
                    required: true,
                    number: true
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
        Pay for the internet
    </div>

    <div>
    <s:form action="/internetPaymentReview" method="POST" id="internetNumberForm">
        <td colspan="2">
            <h5>Service name:
                <s:property value="%{#session.communicationsPaymentForm.providerName}"/>
            </h5>
        </td>
        <s:textfield label="Pay from the bank account:"
                     value="%{#session.communicationsPaymentForm.activeCard.cardNumber}"
                     disabled="true"/>
        <s:textfield label="Sum (%{#session.communicationsPaymentForm.activeCard.cardAccount.currency.currencyCode}):"
                     key="amount"/>
        <tr>
            <td colspan="2" height="22px">
                <div id="container">
                </div>
            </td>
        </tr>
        <td colspan="2">
            <h5>Additional details</h5>
        </td>
        <s:textfield name="accountNumber"
                     label="Bank account number"
                     value="%{#session['communicationsPaymentForm'].number}"
                     disabled="true"/>
        <td>
            <s:submit value="Continue"/>
        </td>
    </s:form>
</div>
</div>