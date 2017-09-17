package com.example.android.quakereport;

/**
 * Created by Marcel Laptop on 08.09.2017.
 */

public class Earthquake {

    private double mMagnitude;

    private String mLocation;

    private Long mTimeInMilliseconds;

    private String mURL;

    /*
    Constructs a new Link {@Link Earthquake} object
    @param magnitude is the magnitude (size) of the earthquake
    @param location ist the city location of th Earthquake
    @param date ist the datae the earthquake happened
    */

    public Earthquake(double magnitude, String location, Long mTimeInMilliseconds) {
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
    }

    public Earthquake(double magnitude, String location, Long mTimeInMilliseconds, String mURL) {
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
        this.mURL = mURL;
    }

    /*
    Methods to get the values, since the global vars are private
     */
    public double getmMagnitude() {
        return mMagnitude;
    }

    public void setmMagnitude(double mMagnitude) {
        this.mMagnitude = mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public Long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public void setmTimeInMilliseconds(Long mTimeInMilliseconds) {
        this.mTimeInMilliseconds = mTimeInMilliseconds;
    }

    public String getmURL() {
        return mURL;
    }

    public void setmURL(String mURL) {
        this.mURL = mURL;
    }
}

