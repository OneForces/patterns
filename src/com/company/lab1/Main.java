package com.company.lab1;
import java.util.function.Consumer;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        String c = "abcdvarlsadtyftyftyftyfghfhjhfhgf";
        Consumer get = x ->a(c);
        get.accept(c);
    }
    public static void a (String bb){
        char [] str = bb.toCharArray();
        for (int i = 0; i < str.length;i++){
            if((i+1) %3 == 0){
                str[i] = Character.toUpperCase(str[i]);
            }
        }
        System.out.println(String.valueOf(str));
    }
}
