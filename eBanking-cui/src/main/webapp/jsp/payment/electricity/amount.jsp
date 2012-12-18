<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">
    $(document).ready(function(){
        $("#electricityNumberForm").validate({
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
        Pay for the electricity
    </div>

    <div>
    <s:form action="/electricityPaymentReview" method="POST" id="electricityNumberForm">
        <td colspan="2">
            <h5>Service name:
                <s:property value="%{#session.electricityPaymentForm.providerName}"/>
            </h5>
        </td>
        <s:textfield label="Pay from the bank account:"
                     value="%{#session.electricityPaymentForm.activeCard.cardNumber}"
                     disabled="true"/>
        <s:textfield label="Sum (%{#session.electricityPaymentForm.activeCard.cardAccount.currency.currencyCode}):"
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
        <s:textfield name="electricityNumber"
                     label="Client number"
                     value="%{#session['electricityPaymentForm'].number}"
                     disabled="true"/>
        <td>
            <s:submit value="Continue"/>
        </td>
    </s:form>
</div>
</div>