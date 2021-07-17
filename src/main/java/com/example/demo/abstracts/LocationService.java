package com.example.demo.abstracts;

import com.example.demo.models.LocationModel;

public interface LocationService {
    LocationModel getCity(String ip);
}
