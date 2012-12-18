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

        <table class="table table-condensed table-bordered info">
            <caption>Client</caption>
            <thead>
            <tr>
                <th>Firstname</th>
                <th>Middlename</th>
                <th>Lastname</th>
                <th>Date of birth</th>
                <th>Personal code</th>
                <th>Secret word</th>
                <th>Mobile number</th>
                <th>Phone number</th>
                <th>Email</th>
                <th>Login</th>
                <th>Role</th>
            </tr>
            </thead>
            <tbody>
                <tr>
                    <td>
                        <s:property value="#session.accountForm.account.client.firstname"/>
                    </td>
                    <td>
                        <s:property value="#session.accountForm.account.client.middlename"/>
                    </td>
                    <td>
                        <s:property value="#session.accountForm.account.client.lastname"/>
                    </td>
                    <td>
                        <s:date name="#session.accountForm.account.client.dateOfBirth" format="dd-MM-yyyy" />
                    </td>
                    <td>
                        <s:property value="#session.accountForm.account.client.personalCode"/>
                    </td>
                    <td>
                        <s:property value="#session.accountForm.account.client.secretWord"/>
                    </td>

                    <td>
                        <s:property value="#session.accountForm.account.client.mobileNumber"/>
                    </td>
                    <td>
                        <s:property value="#session.accountForm.account.client.phoneNumber"/>
                    </td>
                    <td>
                        <s:property value="#session.accountForm.account.client.email"/>
                    </td>
                    <td>
                        <s:property value="#session.accountForm.account.login"/>
                    </td>
                    <td>
                        <s:property value="#session.accountForm.account.role.roleName"/>
                    </td>
                </tr>
            </tbody>
        </table>

        <hr/>
        <s:iterator value="#session['cardAccountsForm'].cardAccounts" var="cardAccount" status="index">
            <div class="cardAccount">
                <input type="hidden" class="cardAccountId" value="<s:property value='#cardAccount.cardAccountId'/>"/>
                <h6>Card Account #<s:property value="#index.index + 1"/></h6>
                <a href="#" class="btn btn-mini btn-danger rm-card-account-btn" style="float: right;"><i class="icon-remove"></i> Remove</a>
                Currency : <s:property value="#cardAccount.currency.currencyCode"/>
                <br/>
                Balance  : <s:property value="#cardAccount.balance"/> (<s:property value="#cardAccount.currency.currencyCode"/>)
                <table class="table table-condensed table-bordered" id="cardAccountCards">
                    <caption>Card account cards (balance as at
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
                            <input type="hidden" class="cardId" value="<s:property value='#card.cardId'/>"/>
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
                                <a class="btn btn-mini btn-danger rm-btn-card" href="#"><i class="icon-remove"></i> Remove</a>
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
                <br/>
                <a class="btn btn-mini btn-success add-card-btn" href="#"><i class="icon-plus"></i> Add card</a>
            </div>
            <hr/>
        </s:iterator>
    </div>
</div>