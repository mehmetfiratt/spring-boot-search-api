package com.example.demo.dummydata;

import com.example.demo.util.RandomNumberGenerator;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Products {

    public static String getRandomProduct() {
        List<String> products = Arrays.asList("Laptop", "Cep telefonu", "Koltuk", "Masa", "Sandalye",
                "Çaydanlık", "Maske", "Tablet", "Mouse", "Klavye", "PS5", "Oyun Konsolu", "Bebek bezi",
                "Terlik", "Monitor", "Gitar", "Telefon Kılıfı", "Dezenfektan", "Şarj aleti",
                "Soğutucu fan", "Kalem", "Defter", "Silgi", "Mont", "Sweatshirt", "Bluz",
                "Elektrikli Scooter", "Hoverboard", "Paten", "Kaykay", "Kadın Parfüm", "Erkek Parfüm",
                "Çocuk Parfüm", "Paspas", "Koltuk Kılıfı", "Aydınlatma", "Araç Dışı Aksesuar",
                "Araç İçi", "Aksesuar", "Silecek", "Branda", "Bebek Bezi", "Islak Mendil"

        );
        return products.get(RandomNumberGenerator.getRandomNumber(products.size()));
    }
}
