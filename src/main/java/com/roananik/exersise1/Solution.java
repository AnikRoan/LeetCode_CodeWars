package com.roananik.exersise1;



public class Solution {
    public static String doubleChar(String s) {
        char[] word = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char c : word) {
            builder.append(c).append(c);//запись чтобы дважды прибавить одно и то же
            //только вот так
        }

        return String.valueOf(builder);
    }


}
