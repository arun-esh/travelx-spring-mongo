package com.nysdas.travelx.springApplication.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("products")
public class Product {
    @Id
    private String id;
    private String name;
    private String summary;
    private String description;
    private String neighborhood_overview;
    private String notes;
    private String transit;
    private String access;
    private String house_rules;
    private String property_type;
    private String room_type;
    private String bed_type;
    private String cancellation_policy;
    private String accommodates;
    private String bedrooms;
    private Images images;
    private Address address;

    private double price;

    // default constructor
    public Product(){}

    public Product(String name, String summary, String description,
                   String neighborhood_overview, String notes,
                   String transit, String access,
                   String house_rules, String property_type, String room_type,
                   String bed_type, String cancellation_policy, String accommodates,
                   String bedrooms, Images images, Address address, double price
    ) {
        this.name = name;
        this.summary = summary;
        this.description = description;
        this.neighborhood_overview = neighborhood_overview;
        this.notes = notes;
        this.transit = transit;
        this.access = access;
        this.house_rules = house_rules;
        this.property_type = property_type;
        this.room_type = room_type;
        this.bed_type = bed_type;
        this.cancellation_policy = cancellation_policy;
        this.accommodates = accommodates;
        this.bedrooms = bedrooms;
        this.images = images;
        this.address = address;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNeighborhood_overview() {
        return neighborhood_overview;
    }

    public void setNeighborhood_overview(String neighborhood_overview) {
        this.neighborhood_overview = neighborhood_overview;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getTransit() {
        return transit;
    }

    public void setTransit(String transit) {
        this.transit = transit;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getHouse_rules() {
        return house_rules;
    }

    public void setHouse_rules(String house_rules) {
        this.house_rules = house_rules;
    }

    public String getProperty_type() {
        return property_type;
    }

    public void setProperty_type(String property_type) {
        this.property_type = property_type;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public String getBed_type() {
        return bed_type;
    }

    public void setBed_type(String bed_type) {
        this.bed_type = bed_type;
    }

    public String getCancellation_policy() {
        return cancellation_policy;
    }

    public void setCancellation_policy(String cancellation_policy) {
        this.cancellation_policy = cancellation_policy;
    }

    public String getAccommodates() {
        return accommodates;
    }

    public void setAccommodates(String accommodates) {
        this.accommodates = accommodates;
    }

    public String getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(String bedrooms) {
        this.bedrooms = bedrooms;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

