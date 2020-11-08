package com.tts.weatherapp.models;

import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

// @Entity
public class Response {

    // @Id
    // @Column(name="responseid")
    // private Long responseid;
    
    private Map<String, String> coord;
    private List<Map<String, String>> weather;
    private String base;
    public Map<String, String> main;
    private Map<String, String> wind;
    private String dt;
    private Map<String, String> sys;
    private String id;
    public String name;
    private String String;
    private Map<String, String> clouds;
    private String zipCode;

    public Response() {
    }

    public Map<String, String> getClouds() {
        return clouds;
    }

    public void setClouds(Map<String, String> clouds) {
        this.clouds = clouds;
    }

    public Map<String, String> getCoord() {
        return coord;
    }

    public void setCoord(Map<String, String> coord) {
        this.coord = coord;
    }

    public List<Map<String, String>> getWeather() {
        return weather;
    }

    public void setWeather(List<Map<String, String>> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Map<String, String> getMain() {
        return main;
    }

    public void setMain(Map<String, String> main) {
        this.main = main;
    }

    public Map<String, String> getWind() {
        return wind;
    }

    public void setWind(Map<String, String> wind) {
        this.wind = wind;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public Map<String, String> getSys() {
        return sys;
    }

    public void setSys(Map<String, String> sys) {
        this.sys = sys;
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

    public String getString() {
        return String;
    }

    public void setString(String string) {
        String = string;
    }


    @Override
    public String toString() {
        return "Response [String=" + String + ", base=" + base + ", coord=" + coord + ", dt=" + dt + ", id=" + id
                + ", main=" + main + ", name=" + name + ", sys=" + sys + ", weather=" + weather + ", wind=" + wind
                + "]";
    }

    public Response(Map<java.lang.String, java.lang.String> coord,
            List<Map<java.lang.String, java.lang.String>> weather, java.lang.String base,
            Map<java.lang.String, java.lang.String> main, Map<java.lang.String, java.lang.String> wind,
            java.lang.String dt, Map<java.lang.String, java.lang.String> sys, java.lang.String id,
            java.lang.String name, java.lang.String string, Map<java.lang.String, java.lang.String> clouds) {
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.wind = wind;
        this.dt = dt;
        this.sys = sys;
        this.id = id;
        this.name = name;
        String = string;
        this.clouds = clouds;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    
    
    
}
