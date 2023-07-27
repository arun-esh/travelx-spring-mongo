package com.nysdas.travelx.springApplication.entity;

public class Images {
    private String picture_url;

    public Images () {}

    public Images(String picture_url) {
        this.picture_url = picture_url;
    }

    public String getPicture_url() {
        return picture_url;
    }

    public void setPicture_url(String picture_url) {
        this.picture_url = picture_url;
    }
}
