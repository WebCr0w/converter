package com.SysGears.test;


import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {





    public static void main(String[] args) throws IOException {

        Gson g = new Gson();
        Validator validator = new Validator();
        Converter converter = new Converter();
        Distance distance = g.fromJson(new FileReader("./src/main/java/com/SysGears/test/index.json"), Distance.class);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        validator.validUnit( "Unit?", distance.avalibleUnits);
        validator.validConvert_to("Convert to?", distance.avalibleUnits);
        validator.validValue("Value?");

        System.out.println(converter.convert(validator.parameter, validator.parameter2, Integer.valueOf(validator.value)));




}
}
