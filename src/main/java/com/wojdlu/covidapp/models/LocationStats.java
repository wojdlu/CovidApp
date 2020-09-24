package com.wojdlu.covidapp.models;

public class LocationStats {
    private String state;
    private String country;
    private int latestLocalCases;
    private int diffBetweenYesterdayAndToday;

    public void setDiffBetweenYesterdayAndToday(int diffBetweenYesterdayAndToday) {
        this.diffBetweenYesterdayAndToday = diffBetweenYesterdayAndToday;
    }

    public int getDiffBetweenYesterdayAndToday() {
        return diffBetweenYesterdayAndToday;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestLocalCases() {
        return latestLocalCases;
    }

    public void setLatestLocalCases(int latestLocalCases) {
        this.latestLocalCases = latestLocalCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestLocalCases=" + latestLocalCases +
                '}';
    }
}
