package com.example.demo.dummydata;

import com.example.demo.util.RandomNumberGenerator;

public class UserId {
    public static long generateUserId() {
        return (long) RandomNumberGenerator.getRandomBetweenRange(1, 50);
    }

}
