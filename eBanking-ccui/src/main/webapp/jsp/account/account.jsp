<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">
    $(document).ready(function(){
        jQuery.validator.addMethod("cardnumber", function(value, element){
                    return /^\d{16}$/.test(value);
                },
                "enter 16 digits of card number");
        $("#accountForward").validate({
            rules: {
                cardAccountNumber: {
                    required: true,
                    digits: true,
                    cardnumber: true
                }
            }
        });
    });
</script>
<div>
    <div id="greeting">
        <h5>
            Hello, <s:property value="#session['clientAccount'].login"/>
        </h5>
        Client info
    </div>

    <div>
        <input type="hidden" value="<s:property value='#session.cardAccountsForm.clientId'/>" id="clientId"/>
        <s:if test="#session.accountForm.account == null">
            <h6>There is no account for this client</h6>
            <a class="btn btn-mini btn-success create-account-btn" href="#"><i class="icon-user"></i> Create account</a>
            <script type="text/javascript">
                $(document).ready(function(){
                    $("#createAccountForm").validate({
                        rules: {
                            login: {
                                required: true
                            },
                            password: {
                                required: true
                            }
                        }
                    });
                });
            </script>
            <s:form id="createAccountForm">
                <s:textfield label="Login" id="accountLogin" name="login"/>
                <s:textfield label="Password" id="accountPassword" name="password"/>
                <td>
                    <a class="btn btn-mini btn-success sumbit-account-btn" href="#"><i class="icon-plus"></i> Create</a>
                    <a class="btn btn-mini btn-danger cancel-account-btn" href="#"><i class="icon-remove"></i> Cancel</a>
                </td>
            </s:form>
            <div id="message"></div>
        </s:if>
        <s:if test="#session.accountForm.account != null">
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

            <s:if test="#session.cardAccountsForm.cardAccounts.size > 0">
                <a class="btn btn-mini btn-inverse refresh-account-btn" href="#"><i class="icon-refresh icon-white"></i> Refresh</a>

                <s:iterator value="#session['cardAccountsForm'].cardAccounts" var="cardAccount" status="index">
                    <div class="cardAccount">
                        <input type="hidden" class="cardAccountId" value="<s:property value='#cardAccount.cardAccountId'/>"/>
                        <h6>Card Account #<s:property value="#index.index + 1"/></h6>
                        <a href="#" class="btn btn-mini btn-danger rm-card-account-btn" style="float: right;"><i class="icon-remove"></i> Remove</a>
                        Currency : <s:property value="#cardAccount.currency.currencyCode"/>
                        <br/>
                        Balance  : <s:property value="#cardAccount.balance"/> (<s:property value="#cardAccount.currency.currencyCode"/>)
                        </br>
                        Number   : <s:property value="#cardAccount.number"/>
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
                                        <a class="btn btn-mini btn-warning charge-btn-card" href="#"><i class="icon-circle-arrow-down"></i> Charge</a>
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
                                    <a class="btn btn-mini btn-success add-card-btn-sbmt" href="#"><i class="icon-plus"></i> Submit</a>
                                </td>
                                <td>
                                    <a class="btn btn-mini btn-danger cancel-btn" href="#"><i class="icon-remove"></i> Cancel</a>
                                </td>
                            </tr>

                        </tbody>
                        </table>

                        <div id="addCardMessage"></div>

                        <div class="charge">
                            <h6>Charge amount:</h6>
                            <input type="hidden" value="" class="chargeCardId"/>
                            <table>
                                <tr>
                                    <td>
                                        <input type="text" id="chargeAmount" style="float:left"/>
                                        <input type="text" disabled="disabled" id="currencyCharge">
                                        TO
                                        <input type="text" disabled="disabled" id="cardNumberCharge">
                                    </td>
                                </tr>
                                <tr>
                                    <td><div class="errors" style="float:left; height: 22px;"></div></td>
                                </tr>
                            </table>
                            <a class="btn btn-mini btn-warning charge-submit-btn-card" href="#"><i class="icon-circle-arrow-down"></i> Charge</a>
                            <a class="btn btn-mini btn-danger charge-cancel-btn-card" href="#"><i class="icon-remove"></i> Cancel</a>
                        </div>

                        <br/>
                        <div class="errors"></div>
                        <a class="btn btn-mini btn-success add-card-btn" href="#"><i class="icon-plus"></i> Add card</a>
                    </div>
                </s:iterator>

            </s:if>
            <s:if test="#session.cardAccountsForm.cardAccounts.size == 0">
                <h6>There is no card account for this account</h6>
            </s:if>
            <a class="btn btn-mini btn-success add-card-account-btn" href="#"><i class="icon-plus"></i> Add card account</a>

            <div id="addCardAccountForm">
                <s:form >
                    <h6>Add card account</h6>
                    <s:textfield label="Card account number" id="cardAccountNumber" name="cardAccountNumber"/>
                    <s:select label="Currency" list="#{'USD':'USD', 'BYR':'BYR'}" value="USD" id="cardAccountCurrency"/>
                    <td>
                        <a class="btn btn-mini btn-success sumbit-card-account-btn" href="#"><i class="icon-plus"></i> Create</a>
                        <a class="btn btn-mini btn-danger cancel-card-account-btn" href="#"><i class="icon-remove"></i> Cancel</a>
                    </td>
                </s:form>
                <div id="cardAccountMessage"></div>
            </div>
        </s:if>
    </div>
</div>