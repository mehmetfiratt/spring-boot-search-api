package com.example.demo.managers;

import com.example.demo.abstracts.JsonService;
import com.example.demo.abstracts.SearchService;
import com.example.demo.dummydata.Cities;
import com.example.demo.dummydata.DeviceType;
import com.example.demo.dummydata.UserId;
import com.example.demo.models.SearchModel;
import com.example.demo.util.RandomTimestampGenerator;
import com.example.demo.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class SearchManager implements SearchService {

    private final JsonService<SearchModel> jsonService;
    private final WebUtils webUtils;

    // private UserAgent userAgent;


    @Autowired
    public SearchManager(@Qualifier("GsonService") JsonService<SearchModel> jsonService, WebUtils webUtils) {
        this.jsonService = jsonService;
        this.webUtils = webUtils;
    }

    public String search(String searchTerm) {

        /*userAgent = new UserAgent(webUtils.getUserAgent());
         String os = userAgent.getOperatingSystem().getName();
         String deviceType = userAgent.getOperatingSystem().getDeviceType().getName();
        */
        return jsonService.toJson(buildSearchModel(searchTerm));
    }


    private SearchModel buildSearchModel(String searchTerm) {
        SearchModel searchModel = new SearchModel();
        searchModel.setTerm(searchTerm);
        searchModel.setTimestamp(RandomTimestampGenerator.getRandomTimestamp());
        searchModel.setDeviceType(DeviceType.getRandomDeviceType());
        searchModel.setCity(Cities.getRandomCity());
        searchModel.setUserId(UserId.generateUserId());
        return searchModel;
    }


}
