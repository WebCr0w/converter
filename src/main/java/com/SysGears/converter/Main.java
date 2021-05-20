package com.sysgears.converter;


import com.google.gson.Gson;


import java.io.FileReader;
import java.io.IOException;



public class Main {





    public static void main(String[] args) throws IOException {

        Gson g = new Gson();
        Validator validator = new Validator();
        Converter converter = new Converter();
        Distance distance = g.fromJson(new FileReader("./src/main/resources/index.json"), Distance.class);


        validator.validUnit( "Unit?", distance.avalibleUnits);
        validator.validConvert_to("Convert to?", distance.avalibleUnits);
        validator.validValue("Value?");

        System.out.println(converter.convert(validator.unit, validator.convertTo, Integer.valueOf(validator.value)));




}
}
