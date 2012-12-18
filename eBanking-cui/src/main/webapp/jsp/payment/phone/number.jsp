<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">
    $(document).ready(function(){
        $("#mobileNumberForm").validate({
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
        Pay for the landline phone
    </div>

    <div>
        <s:form action="/phonePaymentAmount" method="POST" id="mobileNumberForm">
            <td colspan="2">
                <h5>Service name:
                    <s:property value="%{#session.phonePaymentForm.providerName}"/>
                </h5>
            </td>
            <s:select list="#session['phonePaymentForm'].cards"
                      label="Pay from the bank account"
                      headerValue="-choose the bank account-"
                      listKey="cardId"
                      key="cardId"
                      listValue="%{cardNumber + ' [' + cardType.cardTypeName + ' ' + cardAccount.balance + ' ' + cardAccount.currency.currencyCode + ']'}">

            </s:select>
            <td colspan="2">
                <h5>Additional details</h5>
                <h6>Phone number.</h6>
                <h6>Need to enter:</h6>
                <h6>Minsk - phone number</h6>
                <h6>oblast - last two digits of the code number + phone number</h6>
                <h6>Service work from 7-00 to 23-00</h6>
            </td>
            <s:textfield key="number"
                         label="Phone number"
                         placeholder="xxххххххх"/>
            <td colspan="2" height="22px">
                <div id="container">
                </div>
            </td>
            <s:textfield key="credential"
                         label="Full name"
                         placeholder="Ivanov Ivan Ivanovich"/>
            <td>
                <s:submit value="Continue"/>
            </td>
        </s:form>
    </div>
</div>