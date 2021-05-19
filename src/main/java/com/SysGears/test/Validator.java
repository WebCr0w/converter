package com.SysGears.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Validator {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public String parameter;
    public String parameter2;
    public String value;
    public void validUnit(String message, List<String> base) throws IOException {
        while(true){
            System.out.println(message);
            parameter = reader.readLine();
            if (base.contains(parameter)){
                System.out.println("Poidet");
                break;
            } else if (parameter.equals("exit")) System.exit(0);
            else System.out.println("Nevernoie znachenie");
        }
    }
    public void validConvert_to(String message, List<String> base) throws IOException {
        while(true){
            System.out.println(message);
            parameter2 = reader.readLine();
            if (base.contains(parameter2) && !parameter.equals(parameter2) ){
                System.out.println("Poidet");
                break;
            } else if (parameter2.equals("exit")) System.exit(0);
            else System.out.println("Nevernoie znachenie");
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
                System.out.println("Poidet");
                break;
            } else if (value.equals("exit")) System.exit(0);
            else System.out.println("Nevernoie znachenie");
    }


    }
}
