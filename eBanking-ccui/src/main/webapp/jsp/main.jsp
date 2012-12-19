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
        <body>
            <ul>
                <li>
                    <h6><font size="3" color="gray">View clients</font></h6>
                    <p>
                        For view info about all user registered in system choose "View clients".
                    </p>
                    <p>
                        In this section you also can add clients and edit info about exist clients, add cards or remove cards associated with client.
                    </p>
                </li>
                <li>
                    <h6><font size="3" color="gray">View corporations</font></h6>
                    <p>
                        In this section you can see info about all corporations registered in system, can get info about all activities in system
                    </p>
                    <p>
                        <ul>
                            <li>For the last week</li>
                            <li>For the last month</li>
                            <li>For the period</li>
                        </ul>
                    </p>
                </li>
                <li>
                    <h6><font size="3" color="gray">Change rates</font></h6>
                    <p>
                        If you want to change rates - no problem. Just use this section.
                    </p>
                </li>
                <li>
                    <h6><font size="3" color="gray">App logs</font></h6>
                    <p>
                        In this section you can see full info about all client actions
                    </p>
                </li>
            </ul>
        </body>
    </div>
</div>