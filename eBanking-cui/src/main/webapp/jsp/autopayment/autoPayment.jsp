<%@ taglib prefix="s" uri="/struts-tags" %>

<div>
    <div id="greeting">
        <h5>
            <s:property value="#session['clientInfoForm'].fullName"/>
        </h5>
        Change your password
    </div>

    <div>
        <h6>Operation info</h6>
        <table class="table table-bordered table-condensed">
            <tr>
                <td>Client bank</td>
                <td>eBanking</td>
            </tr>
            <tr>
                <td>Client</td>
                <td>
                    <s:property value="#session['clientInfoForm'].fullName"/>
                </td>
            </tr>
            <tr>
                <td>Operation key</td>
                <td>
                    <s:property value="%{#session.autoPaymentForm.operation.operationType.description}"/>
                </td>
            </tr>
            <tr>
                <td>Paid service</td>
                <td>
                    <s:property value="%{#session.autoPaymentForm.operation.contractorAccount.corporation.corporationName}"/>
                </td>
            </tr>
            <tr>
                <td>Operation key</td>
                <td>
                    <s:property value="%{#session.autoPaymentForm.operation.operationKey}"/>
                </td>
            </tr>
            <tr>
                <td>Pay with card</td>
                <td>
                    <s:property value="%{#session.autoPaymentForm.operation.card.cardNumber}"/>
                </td>
            </tr>
            <tr>
                <td>Sum</td>
                <td>
                    <s:property value="%{#session.autoPaymentForm.operation.transactionAmount}"/>
                    (<s:property value="%{#session.autoPaymentForm.operation.card.cardAccount.currency.currencyCode}"/>)
                </td>
            </tr>
        </table>

        <hr/>

        <s:if test="#session.autoPaymentForm.autoPayment == null">
            <h6>No autopayment configured!</h6>
        </s:if>
        <s:else>
            <h6>Autopayment:</h6>
            <table class="table table-bordered table-condensed">
                <tr>
                    <td>Next payment date</td>
                    <td>
                        <s:date name="#session.autoPaymentForm.autoPayment.nextDate" format="MM/dd/yyyy HH:mm:ss"/>
                    </td>
                </tr>
            </table>
        </s:else>

        <hr/>

        <h6>Auto payment parameters</h6>
        <label class="label">Process auto payment</label><br/>
            <input type="radio" id="weekRadio" name="autoPaymentPeriod" value="W"/> Once a week<br/>
            <input type="radio" id="decadeRadio" name="autoPaymentPeriod" value="D"/>Once a decade<br/>
            <input type="radio" id="monthRadio" name="autoPaymentPeriod" value="M"/>Once a month<br/>
            <br/>
            <button type="button" class="btn btn-primary" id="autoPaymentSubmit" data-loading-text="Loading..."> Save</button>
    </div>

</div>