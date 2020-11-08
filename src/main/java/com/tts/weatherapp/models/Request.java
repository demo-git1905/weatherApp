package com.tts.weatherapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Request {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="requestid")
    private Long requestid;
    
    public String zipCode;

    public Request(){}

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Request [zipCode=" + zipCode + "]";
    }

    
}
