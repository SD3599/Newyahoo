package com.hellokoding.auth.model;


import java.util.Date;

/**
 * Data class to record forecast information for a single day.
 */
public class Forecast {

    private Date date;
    private String day;
    private int low = Integer.MAX_VALUE;
    private int high = Integer.MIN_VALUE;
    private int code = WeatherConditionCodes.NOT_AVAILABLE.code;

    public Date getDate() {
        return date;
    }

    public String getDay() {
        return day;
    }

    public int getLow() {
        return low;
    }

    public int getHigh() {
        return high;
    }

    public int getCode() {
        return code;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public void setCode(WeatherConditionCodes code) {
        this.code = code.code;
    }

    public void setConditions(int code) {
        this.code = code;
    }
}
