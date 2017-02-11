package com.coolweather.android.gson;

/**
 * Created by blue on 2017/2/9.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
