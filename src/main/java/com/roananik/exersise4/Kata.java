package com.roananik.exersise4;

import java.util.*;

public class Kata {
    public static int sequenceSum(int start, int end, int step) {
        // int sum = 0;
        //    for (int i = start; i <= end; i += step) sum += i;
        //    return sum;
        //  }
        int sum = start;
        int result = 0;
        while (sum <= end) {
            result += sum;
            sum += step;

        }
        return result;


//        int sum = start;
//        int[] array = new int[end / step];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = sum;
//            sum += step;
//
//
//        }
//
//        OptionalInt o = Arrays.stream(array).reduce((a, b)->a+b);
//        return o.getAsInt();
    }


    public static String toAlternativeString(String string) {
        //  StringBuilder s = new StringBuilder();
        //    string.chars()
        //       .forEach( i -> {
        //            char c = (char) i;
        //            s.append( Character.isUpperCase(c) ? Character.toLowerCase(c)
        //                                               : Character.toUpperCase(c));
        //    });
        //    return s.toString();

        char[] res = string.toCharArray();
        String result = "";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < res.length; i++) {
            result = String.valueOf(res[i]);
            if (result.equals(result.toUpperCase())) {
                builder.append(result.toLowerCase());
            } else {
                builder.append(result.toUpperCase());

            }

        }
        result = builder.toString();
        return result;


    }

    public int squareDigits(int n) {
        if(n==0){
            return 0;
        }
        StringBuilder builder = new StringBuilder();

        while (n > 0) {
            int number = n % 10;


            n/=10;
        }



        return Integer.parseInt(builder.toString());

    }


    public static int[] sortArray(int[] array) {
        return array;
    }




}
