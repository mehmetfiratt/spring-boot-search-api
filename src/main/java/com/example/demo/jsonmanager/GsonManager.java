package com.example.demo.jsonmanager;

import com.example.demo.abstracts.JsonService;
import com.example.demo.models.SearchModel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("GsonService")

public class GsonManager implements JsonService<SearchModel> {
    private final GsonBuilder builder;
    private final Gson gson;

    public GsonManager() {
        builder = new GsonBuilder().setDateFormat("yyyy-MM-dd hh:mm:ss");
        gson = builder.create();
    }

    @Override
    public String toJson(SearchModel data) {
        return gson.toJson(data);
    }
}
