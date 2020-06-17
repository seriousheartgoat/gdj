package com.woniu.gdj.tools;

import java.util.Random;

public class NumberCreate {
    public static String getNumber(){
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            number.append(new Random().nextInt(10));
        }
        return number.toString();
    }
}
