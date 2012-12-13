<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">
    $(document).ready(function(){
        $("#internetNumberForm").validate({
            rules: {
                amount: {
                    required: true,
                    maxlength: 10,
                    digits: true
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
        Добро пожаловать в систему "eBanking"
    </div>

    <div>
    <s:form action="/internetPaymentReview" method="POST" id="internetNumberForm">
        <td colspan="2">
            <h5>Наименование услуги:
                <s:property value="%{#session.communicationsPaymentForm.providerName}"/>
            </h5>
        </td>
        <s:textfield label="Оплатить со счета:"
                     value="%{#session.communicationsPaymentForm.activeCard.cardNumber}"
                     disabled="true"/>
        <s:textfield label="Cумма (%{#session.communicationsPaymentForm.activeCard.cardAccount.currency.currencyCode}):"
                     key="amount"/>
        <td colspan="2">
            <h5>Дополнительные реквизиты</h5>
        </td>
        <s:textfield name="accountNumber"
                     label="Номер счета"
                     value="%{#session['communicationsPaymentForm'].number}"
                     disabled="true"/>
        <td>
            <s:submit value="Продолжить"/>
        </td>
    </s:form>
</div>
</div>