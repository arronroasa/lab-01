package com.example.petshop;

import android.util.Log;

import java.util.Date;

public class Happy extends Mood {
    private static final Date defaultDate = new Date();
    private static final String TAG = "Happy";
    public Happy() {
        super("Happy", defaultDate);
        Log.d(TAG, "Mood initialized with values: " + getMood() + " and " + getDate());
    }
    public Happy(Date date) {
        super("Happy", date);
        Log.d(TAG, "Mood initialized with values: " + getMood() + "and " + getDate());
    }

}
