<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">
    $(document).ready(function(){
        $("#rentNumberForm").validate({
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
        <s:form action="/rentPaymentAmount" method="POST" id="rentNumberForm">
            <td colspan="2">
                <h5>Наименование услуги:
                    <s:property value="%{#session.rentPaymentForm.providerName}"/>
                </h5>
            </td>
            <s:select list="#session['rentPaymentForm'].cards"
                      label="Оплатить со счёта"
                      headerValue="-выберите счёт-"
                      listKey="cardId"
                      key="cardId"
                      listValue="%{cardNumber + ' [' + cardType.cardTypeName + ' ' + cardAccount.balance + ' ' + cardAccount.currency.currencyCode + ']'}">

            </s:select>
            <td colspan="2">
                <h5>Дополнительные реквизиты</h5>
                <h6>Кв.плата, вода, другие ком.услуги на р/c ГП "Центр информационных технологий Мингорисполкома"</h6>
            </td>
            <s:textfield key="number"
                         label="Лицевой счет"/>
            <td>
                <s:submit value="Продолжить"/>
            </td>
        </s:form>
    </div>
</div>