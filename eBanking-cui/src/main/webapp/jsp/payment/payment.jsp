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
                    <li>
                        <s:url action="mobilePayment" var="velcomPaymentUrl">
                            <s:param name="mobileProvider">velcom</s:param>
                        </s:url>
                        <s:a href="%{velcomPaymentUrl}">Velcom</s:a>
                    </li>
                    <li>
                        <s:url action="mobilePayment" var="mtsPaymentUrl">
                            <s:param name="mobileProvider">mts</s:param>
                        </s:url>
                        <s:a href="%{mtsPaymentUrl}">MTS</s:a>
                    </li>
                    <li>
                        <s:url action="mobilePayment" var="lifePaymentUrl">
                            <s:param name="mobileProvider">life</s:param>
                        </s:url>
                        <s:a href="%{lifePaymentUrl}">life:)</s:a>
                    </li>
                </ul>
            </li>
        </ul>
    </div>
</div>