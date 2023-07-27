package com.nysdas.travelx.springApplication.entity;

public class Address {
    private String street;
    private String market;
    private String country_code;
    private String country;

    public Address() {}

    public Address(String street, String market, String country_code, String country) {
        this.street = street;
        this.market = market;
        this.country_code = country_code;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
