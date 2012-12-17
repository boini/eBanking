/**
 * ExRatesSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.service.client.impl.currency.nbrb;

public interface ExRatesSoap_PortType extends java.rmi.Remote {

    /**
     * <span style="color:red">Устаревший метод. Будет поддерживаться
     * до конца 2011 года</span>
     */
    public CurrenciesRefDailyResponseCurrenciesRefDailyResult currenciesRefDaily() throws java.rmi.RemoteException;

    /**
     * <span style="color:red">Устаревший метод. Будет поддерживаться
     * до конца 2011 года</span>
     */
    public CurrenciesRefMonthlyResponseCurrenciesRefMonthlyResult currenciesRefMonthly() throws java.rmi.RemoteException;

    /**
     * Начальная дата установления Национальным банком Республики
     * Беларусь официального курса белорусского рубля по отношению к иностранным
     * валютам
     */
    public java.util.Calendar startDate(int periodicity) throws java.rmi.RemoteException;

    /**
     * Последняя дата установления Национальным банком Республики
     * Беларусь официального курса белорусского рубля по отношению к иностранным
     * валютам на ежедневной основе
     */
    public java.util.Calendar lastDailyExRatesDate() throws java.rmi.RemoteException;

    /**
     * Последняя дата установления Национальным банком Республики
     * Беларусь официального курса белорусского рубля по отношению к иностранным
     * валютам на ежемесячной основе
     */
    public java.util.Calendar lastMonthlyExRatesDate() throws java.rmi.RemoteException;

    /**
     * Официальный курс белорусского рубля по отношению к иностранным
     * валютам, устанавливаемый Национальным банком Республики Беларусь ежедневно,
     * а также до 17.02.1997 г.
     */
    public ExRatesDailyResponseExRatesDailyResult exRatesDaily(java.util.Calendar onDate) throws java.rmi.RemoteException;

    /**
     * Официальный курс белорусского рубля по отношению к иностранным
     * валютам, устанавливаемый Национальным банком Республики Беларусь ежемесячно
     */
    public ExRatesMonthlyResponseExRatesMonthlyResult exRatesMonthly(java.util.Calendar onDate) throws java.rmi.RemoteException;

    /**
     * Динамика официального курса белорусского рубля по отношению
     * к заданной иностранной валюте, устанавливаемого Национальным банком
     * Республики Беларусь (не более чем за 365 дней)
     */
    public ExRatesDynResponseExRatesDynResult exRatesDyn(int curId, java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Полный перечень иностранных валют, к которым официальный курс
     * белорусского рубля устанавливается Национальным банком Республики
     * Беларусь
     */
    public CurrenciesRefResponseCurrenciesRefResult currenciesRef(int periodicity) throws java.rmi.RemoteException;

    /**
     * Последняя дата установления Национальным банком Республики
     * Беларусь цен на драгоценные металлы в виде банковских слитков
     */
    public java.util.Calendar metalsLastDate() throws java.rmi.RemoteException;

    /**
     * Перечень драгоценных металлов, на которые Национальным банком
     * Республики Беларусь устанавливаются учетные цены
     */
    public MetalsRefResponseMetalsRefResult metalsRef() throws java.rmi.RemoteException;

    /**
     * Динамика учетных цен на драгоценные металлы в виде банковских
     * слитков, устанавливаемые Национальным банком Республики Беларусь (не
     * более, чем за 31 день)
     */
    public MetalsPricesResponseMetalsPricesResult metalsPrices(int metalId, java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Цены покупки и продажи Национальным банком Республики Беларусь
     * драгоценных металлов в виде мерных слитков
     */
    public IngotsPricesResponseIngotsPricesResult ingotsPrices(java.util.Calendar onDate) throws java.rmi.RemoteException;

    /**
     * Последняя дата установления Национальным банком Республики
     * Беларусь цен покупки и продажи драгоценных металлов в виде мерных
     * слитков
     */
    public java.util.Calendar ingotsLastDate() throws java.rmi.RemoteException;

    /**
     * Курс белорусского рубля по отношению к основным иностранным
     * валютам по итогам дополнительной торговой сессии ОАО "Белорусская
     * валютно-фондовая биржа"
     */
    public StockAddRatesResponseStockAddRatesResult stockAddRates(java.util.Calendar onDate) throws java.rmi.RemoteException;

    /**
     * Последняя дата установления курса белорусского рубля по отношению
     * к основным иностранным валютам по итогам дополнительной торговой сессии
     * ОАО "Белорусская валютно-фондовая биржа"
     */
    public java.util.Calendar stockAddRatesLastDate() throws java.rmi.RemoteException;

    /**
     * Ставка рефинансирования Национального банка на дату
     */
    public RefRateOnDateResponseRefRateOnDateResult refRateOnDate(java.util.Calendar onDate) throws java.rmi.RemoteException;

    /**
     * Динамика ставки рефинансирования Национального банка
     */
    public RefRateDynResponseRefRateDynResult refRateDyn() throws java.rmi.RemoteException;
}
