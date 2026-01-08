package com.example.petshop;

import java.util.Date;
import android.util.Log;

public class Sad extends Mood {
    private static final Date defaultDate = new Date();
    private static final String TAG = "Sad";
    public Sad() {
        super("Sad", defaultDate);
        Log.d(TAG, "Mood initialized with values: " + getMood() + " and " + getDate());
    }
    public Sad(Date date) {
        super("Sad", date);
        Log.d(TAG, "Mood initialized with values: " + getMood() + " and " + getDate());
    }

}
