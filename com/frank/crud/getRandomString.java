package com.frank.crud;

import java.util.Random;

public class getRandomString {
    public static void main(String[] args) {
        String s = "a";
        Random r = new Random();
        int num = r.nextInt(10000000)+1;
        s = s + num;
        System.out.println(s);
    }
}