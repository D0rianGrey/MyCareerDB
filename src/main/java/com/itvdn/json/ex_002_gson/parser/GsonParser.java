package com.itvdn.json.ex_002_gson.parser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import com.itvdn.json.ex_002_gson.entity.CurrencyRate;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class GsonParser {
    public static void parseJson(String url) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        try {
            JsonReader jsonReader = new JsonReader(new InputStreamReader(new URL(url).openStream()));
            CurrencyRate[] currencyRates = gson.fromJson(jsonReader, CurrencyRate[].class);
            for (CurrencyRate currencyRate : currencyRates) {
                System.out.println(currencyRate);
            }

            String gsonString = gson.toJson(currencyRates);
            Files.write(Paths.get("C:\\Users\\utyfd\\IdeaProjects\\MyCareerDB\\src\\main\\java\\Resources\\gsonCurrency.json"), gsonString.getBytes(), StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
