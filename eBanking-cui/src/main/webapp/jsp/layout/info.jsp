<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div id="info-header">
    <h5>Дополнительная информация</h5>
</div>

<div id="quick-payment">
    <h5>Быстрая оплата услуг</h5>
    <ul>
        <li>
            <s:url action="mobilePayment" var="velcomPaymentUrl">
                <s:param name="mobileProvider">velcom</s:param>
            </s:url>
            <s:a href="%{velcomPaymentUrl}">
                <img src="../../img/velcom.png"/>
            </s:a>
        </li>
        <li>
            <s:url action="mobilePayment" var="mtsPaymentUrl">
                <s:param name="mobileProvider">mts</s:param>
            </s:url>
            <s:a href="%{mtsPaymentUrl}">
                <img src="../../img/mts.png"/>
            </s:a>
        </li>
        <li>
            <s:url action="mobilePayment" var="lifePaymentUrl">
                <s:param name="mobileProvider">life</s:param>
            </s:url>
            <s:a href="%{lifePaymentUrl}">
                <img src="../../img/life.png"/>
            </s:a>
        </li>
    </ul>
</div>