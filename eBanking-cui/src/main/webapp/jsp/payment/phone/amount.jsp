<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">
    $(document).ready(function(){
        $("#mobileNumberForm").validate({
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
    <s:form action="/phonePaymentReview" method="POST" id="mobileNumberForm">
        <td colspan="2">
            <h5>Наименование услуги:
                <s:property value="%{#session.phonePaymentForm.providerName}"/>
            </h5>
        </td>
        <s:textfield label="Оплатить со счета:"
                     value="%{#session.phonePaymentForm.activeCard.cardNumber}"
                     disabled="true"/>
        <s:textfield label="Cумма (%{#session.phonePaymentForm.activeCard.cardAccount.currency.currencyCode}):"
                     key="amount"/>
        <td colspan="2">
            <h5>Дополнительные реквизиты</h5>
        </td>
        <s:textfield name="number"
                     label="Номер телефона"
                     value="%{#session['phonePaymentForm'].number}"
                     disabled="true"/>
        <s:textfield name="credential"
                     label="ФИО"
                     value="%{#session['phonePaymentForm'].credential}"
                     disabled="true"/>
        <td>
            <s:submit value="Продолжить"/>
        </td>
    </s:form>
</div>
</div>