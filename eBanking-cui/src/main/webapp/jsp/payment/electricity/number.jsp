<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">
    $(document).ready(function(){
        $("#electricityNumberForm").validate({
            errorLabelContainer: $("#container"),
            rules: {
                number: {
                    required: true,
                    digits: true,
                    minlength: 9,
                    maxlength: 9
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
        <s:form action="/electricityPaymentAmount" method="POST" id="electricityNumberForm">
            <td colspan="2">
                <h5>Service name:
                    <s:property value="%{#session.electricityPaymentForm.providerName}"/>
                </h5>
            </td>
            <s:select list="#session['electricityPaymentForm'].cards"
                      label="Pay from the bank account"
                      headerValue="-choose the bank account-"
                      listKey="cardId"
                      key="cardId"
                      listValue="%{cardNumber + ' [' + cardType.cardTypeName + ' ' + cardAccount.balance + ' ' + cardAccount.currency.currencyCode + ']'}">

            </s:select>
            <td colspan="2">
                <h5>Additional details</h5>
                <h6>Electricity. One payment - no more than 10 000 000 bel.r.</h6>
            </td>
            <s:textfield key="number"
                         label="Electricity account number"/>
            <td colspan="2" height="22px">
                <div id="container">
                </div>
            </td>
            <td>
                <s:submit value="Continue" cssClass="btn btn-primary"/>
            </td>
        </s:form>
    </div>
</div>