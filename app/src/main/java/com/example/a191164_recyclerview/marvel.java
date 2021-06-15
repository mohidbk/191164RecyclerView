package com.example.a191164_recyclerview;

public class marvel {
    String str;
    int year, rating;

    public marvel() {
    }

    public marvel(String str, int year, int rating) {
        this.str = str;
        this.year = year;
        this.rating = rating;
    }

    public String getStr() {
        return str;
    }

    public int getYear() {
        return year;
    }

    public int getRating() {
        return rating;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
