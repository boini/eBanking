<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">
    $(document).ready(function(){
        $("#internetNumberForm").validate({
            rules: {
                number: {
                    required: true,
                    minlength: 9,
                    maxlength: 9,
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
        <s:form action="/internetPaymentAmount" method="POST" id="internetNumberForm">
            <td colspan="2">
                <h5>Наименование услуги:
                    <s:property value="%{#session.communicationsPaymentForm.providerName}"/>
                </h5>
            </td>
            <s:select list="#session['communicationsPaymentForm'].cards"
                      label="Оплатить со счёта"
                      headerValue="-выберите счёт-"
                      listKey="cardId"
                      key="cardId"
                      listValue="%{cardNumber + ' [' + cardType.cardTypeName + ' ' + cardAccount.balance + ' ' + cardAccount.currency.currencyCode + ']'}">

            </s:select>
            <td colspan="2">
                <h5>Дополнительные реквизиты</h5>
                <h6>Введите номер договора</h6>
            </td>
            <s:textfield key="number"
                         label="Номер договора"/>
            <td>
                <s:submit value="Продолжить"/>
            </td>
        </s:form>
    </div>
</div>