package com.example.weatherforecast;

public class Weather {
    private int mImageResourceId;
    private String mDefaultTemperature;
    private  String mAverageTemperature;

    public Weather(int mImageResourceId, String mDefaultTemperature, String mAverageTemperature) {
        this.mImageResourceId = mImageResourceId;
        this.mDefaultTemperature = mDefaultTemperature;
        this.mAverageTemperature = mAverageTemperature;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }

    public String getmDefaultTemperature() {
        return mDefaultTemperature;
    }

    public void setmDefaultTemperature(String mDefaultTemperature) {
        this.mDefaultTemperature = mDefaultTemperature;
    }

    public String getmAverageTemperature() {
        return mAverageTemperature;
    }

    public void setmAverageTemperature(String mAverageTemperature) {
        this.mAverageTemperature = mAverageTemperature;
    }
}
