<%@ taglib prefix="s" uri="/struts-tags" %>

<div>
    <div id="greeting">
        <h5>
            <s:property value="#session['clientInfoForm'].fullName"/>
        </h5>
        Change your password
    </div>

    <div>
        <s:if test="#session.autoPaymentForm.autoPayments.length > 0">
        
        <table class="table table-bordered table-condensed">
            <caption></caption>
            <thead>
                <tr>
                    <th>Service</th>
                    <th>Operation key</th>
                    <th>Card</th>
                    <th>Amount</th>
                    <th>Next payment</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
            <s:iterator value="#session.autoPaymentForm.autoPayments" var="autoPayment">
                <tr>
                    <td>
                        <s:property value="#autoPayment.operation.contractorAccount.corporation.corporationName"/>
                    </td>
                    <td>
                        <s:property value="#autoPayment.operation.operationKey"/>
                    </td>
                    <td>
                        <s:property value="#autoPayment.operation.card.cardNumber"/>
                    </td>
                    <td>
                        <s:property value="#autoPayment.operation.transactionAmount"/>
                        (<s:property value="#autoPayment.operation.card.cardAccount.currency.currencyCode"/>)
                    </td>
                    <td>
                        <s:date name="#autoPayment.nextDate" format="MM/dd/yyyy HH:mm:ss"/>
                    </td>
                    <th>
                        <s:url action="autoPaymentConfig" var="autoPaymentConfigUrl">
                            <s:param name="operationId">
                                <s:property value="#autoPayment.operation.operationId"/>
                            </s:param>
                        </s:url>
                        <s:a href="%{autoPaymentConfigUrl}" cssClass="btn btn-mini btn-primary"><i class="icon-cog"></i> Configure</s:a>
                    </th>
                    <th>
                        <a href="#" class="btn btn-mini btn-danger ap-rm"><i class="icon-remove"></i> Delete</a>
                        <input type="hidden" value='<s:property value="#autoPayment.autoPaymentId"/>'/>
                    </th>
                </tr>

            </s:iterator>
            </tbody>
        </table>

        </s:if>
        <s:else>
            <h6>No autopayments configured.</h6>
            To add autopayment go to "Archive of operations".
        </s:else>
    </div>

</div>