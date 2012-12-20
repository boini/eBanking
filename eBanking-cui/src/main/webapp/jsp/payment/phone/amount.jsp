<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">

    $(document).ready(function(){
        jQuery.validator.addMethod("greaterThan", function(value, element, params){
                    return (value>params[0]);
                },
                "enter amount greater than {0}");

        $("#mobileNumberForm").validate({
            errorLabelContainer: $("#container"),
            rules: {
                amount: {
                    required: true,
                    number: true,
                    greaterThan: [0]
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
        Pay for the landline phone
    </div>

    <div>
    <s:form action="/phonePaymentReview" method="POST" id="mobileNumberForm">
        <td colspan="2">
            <h5>Service name:
                <s:property value="%{#session.phonePaymentForm.providerName}"/>
            </h5>
        </td>
        <s:textfield label="Pay from the bank account:"
                     value="%{#session.phonePaymentForm.activeCard.cardNumber}"
                     disabled="true"/>
        <s:textfield label="Sum (%{#session.phonePaymentForm.activeCard.cardAccount.currency.currencyCode}):"
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
        <s:textfield name="number"
                     label="Mobile number"
                     value="%{#session['phonePaymentForm'].number}"
                     disabled="true"/>
        <s:textfield name="credential"
                     label="Full name"
                     value="%{#session['phonePaymentForm'].credential}"
                     disabled="true"/>
        <td>
            <s:submit value="Continue" cssClass="btn btn-primary"/>
        </td>
    </s:form>
</div>
</div>