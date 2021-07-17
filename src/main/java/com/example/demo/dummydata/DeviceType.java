package com.example.demo.dummydata;

import com.example.demo.util.RandomNumberGenerator;

public class DeviceType {

    public static String getRandomDeviceType(){
        int randomNumber = RandomNumberGenerator.getRandomNumber(DeviceTypes.values().length);
        return String.valueOf(DeviceTypes.values()[randomNumber]).toLowerCase();
    }
}
