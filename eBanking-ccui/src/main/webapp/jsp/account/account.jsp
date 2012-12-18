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
        <hr/>
        <s:iterator value="#session['cardAccountsForm'].cardAccounts" var="cardAccount" status="index">
            <div class="cardAccount">
                <input type="hidden" class="cardAccountId" value="<s:property value='#cardAccount.cardAccountId'/>"/>
                <h6>Card Account #<s:property value="#index.index + 1"/></h6>
                <a href="#" class="btn btn-mini btn-danger" style="float: right;"><i class="icon-remove"></i> Remove</a>
                Currency : <s:property value="#cardAccount.currency.currencyCode"/>
                <br/>
                Balance  : <s:property value="#cardAccount.balance"/> (<s:property value="#cardAccount.currency.currencyCode"/>)
                <table class="table table-condensed table-bordered" id="cardAccountCards">
                    <caption>Your cards (balance as at
                        <s:date format="MM/dd/yyyy HH:mm:ss" name="#session['cardAccountsForm'].date"/>
                        ) </caption>
                    <thead>
                    <tr>
                        <th>#</th>
                        <th>Card number</th>
                        <th>CVV</th>
                        <th>Balance</th>
                        <th>Credit limit</th>
                        <th>Currency</th>
                        <th>Card type</th>
                        <th>Expiration date</th>
                        <th width="70"></th>
                    </tr>
                    </thead>
                    <tbody>
                    <s:iterator value="#cardAccount.cards" var="card" status="cardStatus">

                        <tr>
                            <td>
                                <s:property value="#cardStatus.index + 1"/>
                            </td>
                            <td>
                                <s:property value="#card.cardNumber"/>
                            </td>
                            <td>
                                <s:property value="#card.cvv"/>
                            </td>
                            <td>
                                <s:property value="#card.cardAccount.balance"/>
                            </td>
                            <td>
                                <s:property value="#card.creditLimit"/>
                            </td>
                            <td>
                                <s:property value="#card.cardAccount.currency.currencyCode"/>
                            </td>
                            <td>
                                <s:property value="%{#card.cardType.cardTypeName}"/>
                            </td>
                            <td>
                                <s:date name="#card.expirationDate" format="MM/dd/yyyy"/>
                            </td>
                            <td>
                                <s:url action="viewAccount" var="viewAccountUrl">
                                    <s:param name="id">
                                        <s:property value="#client.clientId"/>
                                    </s:param>
                                </s:url>
                                <s:a cssClass="btn btn-mini btn-danger" href="%{viewAccountUrl}"><i class="icon-remove"></i> Remove</s:a>
                            </td>
                        </tr>
                    </s:iterator>

                    <tr class="newCardRow">
                        <td></td>
                        <td>
                            <input type="text" class="newCardNumber" />
                        </td>
                        <td>
                            <input type="text" class="newCardCVV" />
                        </td>
                        <td>
                            <input type="text" class="newCardBalance" disabled="disabled" value='<s:property value="#cardAccount.balance"/>' />
                        </td>
                        <td>
                            <input type="text" class="newCardCredit" />
                        </td>
                        <td>
                            <input type="text" class="newCardCurrency" disabled="disabled" value='<s:property value="#cardAccount.currency.currencyCode"/>' />
                        </td>
                        <td>
                            <select class="newCardType">
                                <option value="VISA">VISA</option>
                                <option value="MC">MASTERCARD</option>
                            </select>
                        </td>
                        <td>
                            <script type="text/javascript">
                                $(function() {
                                    $( ".newCardExpDate" ).datepicker({
                                        showOn: "button",
                                        buttonImage: "../../img/calendar.gif",
                                        buttonImageOnly: true,
                                        changeMonth: true,
                                        changeYear: true,
                                        minDate: new Date()
                                    });
                                });
                            </script>

                            <input type="text" class="newCardExpDate" />
                        </td>
                        <td>
                            <a class="btn btn-mini btn-success add-card-btn-sbmt" href="#"><i class="icon-plus"></i></a>
                            <a class="btn btn-mini btn-danger cancel-btn" href="#"><i class="icon-remove"></i></a>
                        </td>
                    </tr>

                </tbody>
                </table>

                <a class="btn btn-mini btn-success add-card-btn" href="#"><i class="icon-plus"></i> Add card</a>
            </div>
            <hr/>
        </s:iterator>
    </div>
</div>