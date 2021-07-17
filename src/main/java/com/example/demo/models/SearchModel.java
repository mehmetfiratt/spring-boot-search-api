package com.example.demo.models;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class SearchModel {
    private String term;
    private long userId;
    private Timestamp timestamp;
    private String city;
    private String deviceType;

}
