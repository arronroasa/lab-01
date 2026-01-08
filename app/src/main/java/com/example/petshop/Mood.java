package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    private String mood;
    private Date date;

    public Mood(String mood) {
        this.mood = mood;
    }
    public Mood(String mood, Date date) {
        this.mood = mood;
        this.date = date;
    }

    public String getMood() {return mood;}

    public void setMood(String mood) {this.mood = mood;}

    public Date getDate() {return date;}

    public void setDate(Date date) {this.date = date;}
}
