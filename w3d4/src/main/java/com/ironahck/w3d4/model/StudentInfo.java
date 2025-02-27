package com.ironahck.w3d4.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class StudentInfo {
    private String street;
    private Integer hoursNumber;
    private String telephone;
    private String name;

    public StudentInfo(String street, Integer hoursNumber, String telephone) {
        street = street;
        this.hoursNumber = hoursNumber;
        this.telephone = telephone;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        street = street;
    }

    public Integer getHoursNumber() {
        return hoursNumber;
    }

    public void setHoursNumber(Integer hoursNumber) {
        this.hoursNumber = hoursNumber;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
