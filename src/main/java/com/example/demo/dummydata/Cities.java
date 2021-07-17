package com.example.demo.dummydata;

import com.example.demo.util.RandomNumberGenerator;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Cities {

    public static String getRandomCity() {
        List<String> cities = Arrays.asList("Adana", "Urfa", "Diyarbakır", "İzmir", "Bursa", "Istanbul", "Ankara",
                "Tokat", "Malatya", "Kocaeli", "Bartın", "Balıkesir", "Yalova", "Konya", "Tekirdağ", "Çankırı",
                "Edirne", "Mersin", "Elazığ", "Kars", "Afyonkarahisar", "Eskişehir", "Kayseri", "Trabzon", "Rize",
                "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu"
        );
        return cities.get(RandomNumberGenerator.getRandomNumber(cities.size()));
    }
}
