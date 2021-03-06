<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<div>
    <div id="greeting">
        <h5>
            <s:property value="#session['clientInfoForm'].fullName"/>
        </h5>
        Online info
    </div>

    <div>

        <script type="text/javascript">
            $(function() {
                $( "#fromDate, #toDate" ).datepicker({
                    showOn: "button",
                    buttonImage: "../../img/calendar.gif",
                    buttonImageOnly: true,
                    changeMonth: true,
                    changeYear: true,
                    beforeShow: customRange
                });
            });
        </script>

        <div>
            <span>The parameters of the bank statement</span><br/>
            <input type="radio" id="weekRadio" name="bankStatement" checked="checked" value="week"/>For the last week <br/>
            <input type="radio" id="monthRadio" name="bankStatement" value="month"/>For the last month<br/>
            <input type="radio" id="customRadio" name="bankStatement" value="custom"/>For the period<br/>
                <div class="calendar-select">
                    From: <input type="text" id="fromDate" />
                    To:   <input type="text" id="toDate" />
                </div>
        </div>

        <table class="table table-condensed table-hover" id="cards">
            <caption>Your cards (balance as at
                <s:date name="#session['clientCardsForm'].date" format="MM/dd/yyyy HH:mm:ss"/>
                ) </caption>
            <thead>
            <tr>
                <th></th>
                <th>Card number</th>
                <th>Balance</th>
                <th>Credit limit</th>
                <th>Currency</th>
                <th>Card type</th>
            </tr>
            </thead>
            <tbody>
            <s:iterator value="#session['clientCardsForm'].cards" var="card">
                <tr>
                    <td>
                        <s:checkbox name="%{#card.cardId}" theme="simple"/>
                    </td>
                    <td>
                        <s:property value="#card.cardNumber"/>
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
                        <s:if test="%{#card.cardType.cardTypeName=='VISA'}">
                            <img src="../img/visa.png"/>
                        </s:if>
                        <s:if test="%{#card.cardType.cardTypeName=='MC'}">
                            <img src="../img/mc.png"/>
                        </s:if>
                    </td>
                </tr>
            </s:iterator>
            </tbody>
        </table>

        <button type="button" class="btn btn-primary" id="onlineInfoSubmit" data-loading-text="Loading...">Get info</button>

        <div id="onlineInfoTable">

        </div>
    </div>
</div>