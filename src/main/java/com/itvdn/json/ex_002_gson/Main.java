package com.itvdn.json.ex_002_gson;

import com.itvdn.json.ex_002_gson.parser.GsonParser;

public class Main {
    public static void main(String[] args) {
        GsonParser.parseJson("https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5");
    }
}
