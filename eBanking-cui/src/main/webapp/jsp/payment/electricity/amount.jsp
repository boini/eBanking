<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">
    $(document).ready(function(){
        $("#electricityNumberForm").validate({
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
    <s:form action="/electricityPaymentReview" method="POST" id="electricityNumberForm">
        <td colspan="2">
            <h5>Наименование услуги:
                <s:property value="%{#session.electricityPaymentForm.providerName}"/>
            </h5>
        </td>
        <s:textfield label="Оплатить со счета:"
                     value="%{#session.electricityPaymentForm.activeCard.cardNumber}"
                     disabled="true"/>
        <s:textfield label="Cумма (%{#session.electricityPaymentForm.activeCard.cardAccount.currency.currencyCode}):"
                     key="amount"/>
        <td colspan="2">
            <h5>Дополнительные реквизиты</h5>
        </td>
        <s:textfield name="electricityNumber"
                     label="Номер абонента"
                     value="%{#session['electricityPaymentForm'].number}"
                     disabled="true"/>
        <td>
            <s:submit value="Продолжить"/>
        </td>
    </s:form>
</div>
</div>