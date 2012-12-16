<%@ taglib prefix="s" uri="/struts-tags" %>

<div>
    <div id="greeting">
        <h5>
            <s:property value="#session['clientInfoForm'].fullName"/>
        </h5>
        Добро пожаловать в систему "eBanking"
    </div>

    <div id="changeLogin">
        <s:textfield key="oldLogin" placeholder="login" label="Current login" id="currentLogin"/>
        <s:password key="password" placeholder="password" label="Password" id="password"/>
        <s:textfield key="newLogin" placeholder="newlogin" label="New login" id="newLogin"/>
        <button type="button" id="changeLoginSubmit" data-loading-text="Loading..." class="btn btn-primary">Change</button>
        <div id="changeLoginMessage"></div>
    </div>

</div>