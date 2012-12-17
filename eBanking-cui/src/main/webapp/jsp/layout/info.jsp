<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div id="info-header">
    <h5>Additional info</h5>
</div>

<div id="quick-payment">
    <h5>Quick payment services</h5>
    <ul>
        <li>
            <s:url action="mobilePayment" var="velcomPaymentUrl">
                <s:param name="provider">velcom</s:param>
            </s:url>
            <s:a href="%{velcomPaymentUrl}">
                <img src="../../img/velcom.png"/>
            </s:a>
        </li>
        <li>
            <s:url action="mobilePayment" var="mtsPaymentUrl">
                <s:param name="provider">mts</s:param>
            </s:url>
            <s:a href="%{mtsPaymentUrl}">
                <img src="../../img/mts.png"/>
            </s:a>
        </li>
        <li>
            <s:url action="mobilePayment" var="lifePaymentUrl">
                <s:param name="provider">life</s:param>
            </s:url>
            <s:a href="%{lifePaymentUrl}">
                <img src="../../img/life.png"/>
            </s:a>
        </li>
        <li>
            <s:url action="internetPayment" var="soloPaymentUrl">
                <s:param name="provider">solo</s:param>
            </s:url>
            <s:a href="%{soloPaymentUrl}">
                <img src="../../img/solo.png"/>
            </s:a>
        </li>
        <li>
            <s:url action="internetPayment" var="shapkiDamavikPaymentUrl">
                <s:param name="provider">shparki_damavik</s:param>
            </s:url>
            <s:a href="%{shapkiDamavikPaymentUrl}">
                <img src="../../img/shparki_damavik.png"/>
            </s:a>
        </li>
    </ul>
    <ul>
        <li>
            <s:url action="internetPayment" var="byFlyPaymentUrl">
                <s:param name="provider">byfly</s:param>
            </s:url>
            <s:a href="%{byFlyPaymentUrl}">
                <img src="../../img/byfly.png" />
            </s:a>
        </li>
        <li>
            <s:url action="internetPayment" var="cosmosTVPaymentUrl">
                <s:param name="provider">cosmos_tv</s:param>
            </s:url>
            <s:a href="%{cosmosTVPaymentUrl}">
                <img src="../../img/cosmostv.jpg" />
            </s:a>
        </li>
        <li>
            <s:url action="phonePayment" var="beltelPhonePaymentUrl">
                <s:param name="provider">beltelecom_phone</s:param>
            </s:url>
            <s:a href="%{beltelPhonePaymentUrl}">
                <img src="../../img/phone.png" />
            </s:a>
        </li>
        <li>
            <s:url action="rentPayment" var="rentPaymentUrl">
                <s:param name="provider">rent</s:param>
            </s:url>
            <s:a href="%{rentPaymentUrl}">
                <img src="../../img/rent.jpg" />
            </s:a>
        </li>
        <li>
            <s:url action="electricityPayment" var="electricityPaymentUrl">
                <s:param name="provider">electricity</s:param>
            </s:url>
            <s:a href="%{electricityPaymentUrl}">
                <img src="../../img/electricity.jpg" />
            </s:a>
        </li>
    </ul>
</div>