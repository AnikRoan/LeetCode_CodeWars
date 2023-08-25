package com.roananik.exersise1;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    //нужно удвоить каждый символ
    public static String doubleChar(String s) {
        char[] word = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char c : word) {
            builder.append(c).append(c);//запись чтобы дважды прибавить одно и то же
            //только вот так
        }

        return String.valueOf(builder);
    }


    public static List<String> number(List<String> lines) {
        List<String> list = new ArrayList<>();
        int count = 1;
        for (String s : lines) {
            list.add(count + ": " + s);
            count++;


        }


        return list;
    }


    public static int getCount(String str) {
        int count = 0;
        Pattern pattern = Pattern.compile("[aeiouAEIOU]");
        Matcher matcher = pattern.matcher(str);
        String result = "";

        while ((matcher.find())){
            result+= matcher.group();
        }
        return result.length();
        // public static int getCount(String str) {
        //    int vowelsCount = 0;
        //    for(int i = 0; i < str.length(); i++) {
        //        switch(str.charAt(i)) {
        //        case 'a':
        //        case 'e':
        //        case 'i':
        //        case 'o':
        //        case 'u':
        //            vowelsCount++;
        //        }
        //    }
        //    return vowelsCount;
        //  }


        // public static int getCount(String str) {
        //    return str.replaceAll("[^aeiou]","").length();//любой символ кроме^aeiou
        //  }


    }

}
// public static String doubleChar(String s){
//     return s.replaceAll(".", "$0$0");}
//регулярное выражение кот удваивает любой символ


