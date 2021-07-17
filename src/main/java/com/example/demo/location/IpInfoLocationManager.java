package com.example.demo.location;

import com.example.demo.abstracts.LocationService;
import com.example.demo.constants.LocationConstants;
import com.example.demo.jsonmanager.GsonManager;
import com.example.demo.models.LocationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Qualifier("ipinfo")
public class IpInfoLocationManager implements LocationService {

    RestTemplate restTemplate = new RestTemplate();

    @Override
    public LocationModel getCity(String ip) {
        var result = restTemplate.getForEntity("http://ipinfo.io/"+ip+"?token="+ LocationConstants.ACCESS_KEY, LocationModel.class);
        return result.getBody();
    }
}
