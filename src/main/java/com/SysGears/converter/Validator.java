package com.sysgears.converter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Validator {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public String unit;
    public String convertTo;
    public String value;
    public void validUnit(String message, List<String> base) throws IOException {
        while(true){
            System.out.println(message);
            unit = reader.readLine();
            if (base.contains(unit)){
                break;
            } else if (unit.equals("exit")) System.exit(0);
            else System.out.println("Incorrect value");
        }
    }
    public void validConvert_to(String message, List<String> base) throws IOException {
        while(true){
            System.out.println(message);
            convertTo = reader.readLine();
            if (base.contains(convertTo) && !unit.equals(convertTo) ){
                break;
            } else if (convertTo.equals("exit")) System.exit(0);
            else System.out.println("Incorrect value");
        }
    }
    public void validValue(String message) throws IOException {
        boolean isNumber;
        while(true){
            System.out.println(message);
            value = reader.readLine();
            try {
                Integer.parseInt(value);
                isNumber = true;
            } catch (NumberFormatException e){
                isNumber = false;
            }
            if (isNumber && Integer.valueOf(value) > 0){
                break;
            } else if (value.equals("exit")) System.exit(0);
            else System.out.println("Incorrect value");
    }


    }
}
