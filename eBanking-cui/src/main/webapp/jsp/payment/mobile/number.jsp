<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">
    $(document).ready(function(){
        jQuery.validator.addMethod("mobileBY", function(value, element){
                return /^((44)|(33)|(29)|(25))\d{3,}$/.test(value);
            },
            "Wrong phone number, please check");
        $("#mobileNumberForm").validate({
            errorLabelContainer: $("#container"),
            rules: {
                number: {
                    required: true,
                    digits: true,
                    minlength: 5,
                    maxlength: 9,
                    mobileBY: true
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
    <div>
        <s:form action="/mobilePaymentAmount" method="POST" id="mobileNumberForm">
            <td colspan="2">
                <h5>Service name:
                    <s:property value="%{#session.communicationsPaymentForm.providerName}"/>
                </h5>
            </td>
            <s:select list="#session['communicationsPaymentForm'].cards"
                      label="Pay from the bank account"
                      headerValue="-choose the bank account-"
                      listKey="cardId"
                      key="cardId"
                      listValue="%{cardNumber + ' [' + cardType.cardTypeName + ' ' + cardAccount.balance + ' ' + cardAccount.currency.currencyCode + ']'}">

            </s:select>
            <td colspan="2">
                <h5>Additional details</h5>
                <h6>Enter 9 digits from your phone number in next format: 29ххххххх, 44ххххххх,
                    25ххххххх, 33ххххххх</h6>
            </td>
            <s:textfield key="number"
                         label="Phone number"
                         placeholder="yyххххххх"/>
            <td colspan="2" height="22px">
                <div id="container">
                </div>
            </td>
            <td>
                <s:submit value="Continue"/>
            </td>
        </s:form>
    </div>
</div>