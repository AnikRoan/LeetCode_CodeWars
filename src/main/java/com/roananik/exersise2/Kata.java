package com.roananik.exersise2;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class Kata {
    public static String getMiddle(String word) {
        char[] box = word.toCharArray();
        StringBuilder bild = new StringBuilder();
        if (box.length % 2 != 0) {
            bild.append(box[box.length / 2]);

            return String.valueOf(bild);
        } else {
            bild.append(box[box.length / 2 - 1]).append(box[box.length / 2]);
            return String.valueOf(bild);

        }

    }

    public static String remove(String str) {

        return str.substring(1, str.length() - 1);
    }


    public static int enough(int cap, int on, int wait) {
        //cap кол люд кот может принять автобус
        //on кол людей в автобусе искл водителя
        //wait кол люд ожидающих сесть в автобус
        //если места достаточно вернуть 0
        // иначе вернуть кол пасажиров кот не может принять

        if (cap - on - wait == 0 || cap > on + wait) {
            return 0;
        } else {
            return (cap - on - wait) * -1;
        }

    }

    public static int findShort(String s) {
        String[] str = s.split(" ");
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < str.length; i++) {
            if (result > str[i].length()) {
                result = str[i].length();
            }
        }


        return result;


    }

    public static double sum(double[] numbers) {
        //return Arrays.stream(numbers).sum();
        double sum = 0;
        if (numbers == null || numbers.length == 0) {
            return 0.0;
        } else {
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }

        }
        return sum;
    }

    public static int findSmallestInt(int[] args) {
        OptionalInt o = Arrays.stream(args).min();

        return o.getAsInt();

    }


}
