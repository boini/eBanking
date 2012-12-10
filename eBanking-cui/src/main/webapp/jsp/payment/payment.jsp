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
                            <s:param name="provider">velcom</s:param>
                        </s:url>
                        <s:a href="%{velcomPaymentUrl}">Velcom</s:a>
                    </li>
                    <li>
                        <s:url action="mobilePayment" var="mtsPaymentUrl">
                            <s:param name="provider">mts</s:param>
                        </s:url>
                        <s:a href="%{mtsPaymentUrl}">MTS</s:a>
                    </li>
                    <li>
                        <s:url action="mobilePayment" var="lifePaymentUrl">
                            <s:param name="provider">life</s:param>
                        </s:url>
                        <s:a href="%{lifePaymentUrl}">life:)</s:a>
                    </li>
                </ul>
            </li>
            <li>
                Интернет
                <ul>
                    <li>
                        <s:url action="internetPayment" var="soloPaymentUrl">
                            <s:param name="provider">solo</s:param>
                        </s:url>
                        <s:a href="%{soloPaymentUrl}">Соло</s:a>
                    </li>
                    <li>
                        <s:url action="internetPayment" var="shapkiDamavikPaymentUrl">
                            <s:param name="provider">shparki_damavik</s:param>
                        </s:url>
                        <s:a href="%{shapkiDamavikPaymentUrl}">Шпаркi-Дамавік</s:a>
                    </li>
                    <li>
                        <s:url action="internetPayment" var="byFlyPaymentUrl">
                            <s:param name="provider">by_fly</s:param>
                        </s:url>
                        <s:a href="%{byFlyPaymentUrl}">ByFly</s:a>
                    </li>
                    <li>
                        <s:url action="internetPayment" var="cosmosTVPaymentUrl">
                            <s:param name="provider">cosmos_tv</s:param>
                        </s:url>
                        <s:a href="%{cosmosTVPaymentUrl}">Космос ТВ</s:a>
                    </li>
                </ul>
            </li>
            <li>
                Белтелеком
                <ul>
                    <li>
                        <s:url action="phonePayment" var="beltelPhonePaymentUrl">
                            <s:param name="provider">beltelecom_phone</s:param>
                        </s:url>
                        <s:a href="%{beltelPhonePaymentUrl}">Оплата за телефон</s:a>
                    </li>
                </ul>
            </li>
            <li>
                Квартира
                <ul>
                    <li>
                        <s:url action="rentPayment" var="rentPaymentUrl">
                            <s:param name="provider">rent</s:param>
                        </s:url>
                        <s:a href="%{rentPaymentUrl}">Квартплата</s:a>
                    </li>
                    <li>
                        <s:url action="electricityPayment" var="electricityPaymentUrl">
                            <s:param name="provider">electricity</s:param>
                        </s:url>
                        <s:a href="%{electricityPaymentUrl}">Электроэнергия (Минск)</s:a>
                    </li>
                </ul>
            </li>
        </ul>
    </div>
</div>