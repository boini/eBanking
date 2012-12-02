<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
    <div id="greeting">
        <h5>
            <s:property value="#session['clientInfoForm'].fullName"/>
        </h5>
        Добро пожаловать в систему "eBanking"
    </div>

    <div>
        <h5>Услуги в системе "Расчет" (ЕРИП)</h5>
        <ul>
            <li>
                Мобильная связь
                <ul>
                    <li>Velcom</li>
                    <li>MTC</li>
                    <li>life:)</li>
                </ul>
            </li>
        </ul>
    </div>
</div>