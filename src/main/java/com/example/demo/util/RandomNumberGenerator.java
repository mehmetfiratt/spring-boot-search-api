package com.example.demo.util;

import java.util.Random;

public class RandomNumberGenerator {
    static Random random = new Random();

    public static long getRandomPositiveNumber() {
        return random.nextInt(Integer.SIZE - 1) + 1234567890;

    }

    public static int getRandomNumber(int size) {
        return random.nextInt(size);

    }

    public static double getRandomBetweenRange(int min, int max) {
        return (Math.random() * ((max - min) + 1)) + min;

    }
}
