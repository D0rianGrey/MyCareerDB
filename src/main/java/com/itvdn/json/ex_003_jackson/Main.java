package com.itvdn.json.ex_003_jackson;

import com.itvdn.json.ex_003_jackson.parser.JacksonParser;

public class Main {
    public static void main(String[] args) {
        JacksonParser.parseJson("https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5");
    }
}
