<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
    <div id="greeting">
        <h5>
            Hello, <s:property value="#session['clientAccount'].login"/>
        </h5>
        Corporations activities
    </div>

    <div id="corporations">
        <h6>Corporation:</h6>

        <ul>
            <s:iterator value="#session['corporationForm'].corporations" var="corporation" status="index">
                <li>
                    <a href="#" class="corp-info">
                        <s:property value="#corporation.description"/>
                    </a>
                    <input type="hidden" value='<s:property value="#corporation.corporationId"/>'/>
                </li>
            </s:iterator>
        </ul>
    </div>
    <div id="details">
        <div id="detailsInfo">

        </div>
        <div id="history">
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
                <span>The parameters of the bank account statement</span><br/>
                <input type="radio" id="weekRadio" name="bankStatement" checked="checked" value="week"/>For the last week <br/>
                <input type="radio" id="monthRadio" name="bankStatement" value="month"/>For the last month<br/>
                <input type="radio" id="customRadio" name="bankStatement" value="custom"/>For the period<br/>
                <div class="calendar-select">
                    From: <input type="text" id="fromDate" />
                    To:   <input type="text" id="toDate" />
                </div>
            </div>
            <button type="button" class="btn btn-primary" id="corporationInfoSubmit" data-loading-text="Loading...">Get info</button>
            <div id="onlineInfoTable"></div>
        </div>
    </div>
</div>