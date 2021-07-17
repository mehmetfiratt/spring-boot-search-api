package com.example.demo.util;

import java.sql.Timestamp;

public class RandomTimestampGenerator {
    public static Timestamp getRandomTimestamp() {
        long offset = Timestamp.valueOf("2020-07-03 02:00:00").getTime();
        long end = Timestamp.valueOf("2020-12-03 23:59:00").getTime();
        long diff = end - offset + 1;
        return new Timestamp(offset + (long) (Math.random() * diff));
    }
}
