package com.ebanking.ws.model.address;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 10/25/12
 * Time: 2:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class Address {
    private long addressId;
    private City city;
    private String region;
    private String houseNumber;
    private String flatNumber;

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }
}
