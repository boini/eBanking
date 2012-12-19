<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
    <div id="greeting">
        <h5>
            Hello, <s:property value="#session['clientAccount'].login"/>
        </h5>
        Welcome to the "eBanking | Call Center"
    </div>

    <div>
        <table class="table table-bordered table-condensed" id="rates">
            <caption>Your cards (balance as at 07.11.2012 17:25:51) </caption>
            <thead>
            <tr>
                <th>Currency name</th>
                <th>Code</th>
                <th>Purchasing rate</th>
                <th>Selling rate</th>
                <th width="50"></th>
            </tr>
            </thead>
            <tbody>
            <s:iterator value="#session['ratesForm'].rates" var="rate">
                <tr>
                    <input type="hidden" value='<s:property value="#rate.rateId"/>' class="rateId"/>
                    <td>
                        <s:property value="#rate.currency.currencyDescription"/>
                    </td>
                    <td>
                        <s:property value="#rate.currency.currencyCode"/>
                    </td>
                    <td>
                        <span class="purchase">
                            <s:property value="#rate.purchase"/>
                        </span>
                        <input type="text" class="purchaseText" value='<s:property value="#rate.purchase"/>'/>
                    </td>
                    <td>
                        <span class="sale">
                            <s:property value="#rate.sale"/>
                        </span>
                        <input type="text" class="saleText" value='<s:property value="#rate.sale"/>'/>
                    </td>
                    <td>
                        <a class="btn btn-mini btn-primary edit-rate-btn" href="#"><i class="icon-pencil"></i> Edit</a>
                        <a class="btn btn-mini btn-success save-rate-btn" href="#"><i class="icon-ok"></i></a>
                        <a class="btn btn-mini btn-danger cancel-rate-btn" href="#"><i class="icon-remove"></i></a>
                    </td>
                </tr>
            </s:iterator>
            </tbody>
        </table>

        <table class="table table-condensed table-bordered" id="nbrb">
            <caption>Exchange rates on card transactions (as
                <s:property value="#session['nbrbCurrencyRatesForm'].date"/>
                )</caption>
            <thead>
            <tr>
                <th>Currency name</th>
                <th>Code</th>
                <th>Rate</th>
            </tr>
            </thead>
            <tbody>
            <s:iterator value="#session['nbrbCurrencyRatesForm'].rates.dailyExRatesOnDate" var="rate">
                <tr>
                    <td>
                        <s:property value="#rate.curQuotName"/>
                    </td>
                    <td>
                        <s:property value="#rate.curAbbreviation"/>
                    </td>
                    <td>
                        <s:property value="#rate.curOfficialRate"/>
                    </td>
                </tr>
            </s:iterator>
            </tbody>
        </table>
    </div>
</div>