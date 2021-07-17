package com.example.demo.jsonmanager;

import com.example.demo.abstracts.JsonService;
import com.example.demo.models.SearchModel;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("SimpleJSONService")

public class SimpleJsonManager implements JsonService<SearchModel> {
    private final JSONObject jsonObject;

    public SimpleJsonManager() {
        jsonObject = new JSONObject();
    }

    @Override
    public String toJson(SearchModel data) {

        jsonObject.put("term", data.getTerm());
        jsonObject.put("timestamp", data.getTimestamp());
        jsonObject.put("city", data.getCity());
        jsonObject.put("userId", data.getUserId());
        jsonObject.put("deviceType", data.getDeviceType());

        return jsonObject.toJSONString();
    }


}
