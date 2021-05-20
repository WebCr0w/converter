package com.sysgears.converter;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;


public class Converter {
    public String convert(String x, String y, double numb) throws FileNotFoundException {
        double value = 0;

        ArrayList<String> result = new ArrayList<>();
        Gson g = new Gson();
        Distance distance = g.fromJson(new FileReader("./src/main/java/com/sysgears/converter/index.json"), Distance.class);


        for (int i = 0; i < distance.dist.size(); i++){
            if (x.equals(distance.dist.get(i).unit) && y.equals(distance.dist.get(i).convert_to)){
                value = distance.dist.get(i).value;
                break;
            }
        }
        double res = value * numb;
        result.add(y);

        DecimalFormat decimalFormat = new DecimalFormat( "#.##" );
        result.add(decimalFormat.format(res));

        String ress = g.toJson(result);
        return ress;
    }
}
