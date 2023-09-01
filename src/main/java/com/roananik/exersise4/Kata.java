package com.roananik.exersise4;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

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
        if (n == 0) {
            return 0;
        }
        StringBuilder builder = new StringBuilder();

        while (n > 0) {
            int number = n % 10;


            n /= 10;
        }


        return Integer.parseInt(builder.toString());

    }


    public static int[] sortArrayses(int[] array) {

        // OfInt sortedOdds = IntStream
        //        .of(array)
        //        .filter(i -> i % 2 == 1)
        //        .sorted()
        //        .iterator();
        //
        //    return IntStream
        //        .of(array)
        //        .map(i -> i % 2 == 0 ? i : sortedOdds.nextInt())
        //        .toArray();
        int count = 0;
        int []arrays=array;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 != 0) {
                count++;
            }
        }
        int[] ar = new int[count];
        int p = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 != 0) {
                ar[p] = array[i];
                p++;
            }
        }
        Arrays.sort(ar);
        int sec = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 != 0) {
                arrays[i] = ar[sec];
                sec++;
            }

        }
        return arrays;


    }
    public static String abbrevName(String name) {
        //String[] names = name.split(" ");
        //    return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
        String []s = name.split(" ");
        String a = String.valueOf(s[0].charAt(0)).toUpperCase();
        String b = String.valueOf(s[1].charAt(0)).toUpperCase();
        String c= a+"."+b;


        return c;
    }

    static int stray(int[] numbers) {
        // Arrays.sort(numbers);
        //    return numbers[0] == numbers[1] ? numbers[numbers.length-1] : numbers[0];
        int result = 0;
        for(int i:numbers){
            result^=i;
        }


        return result;
    }


}
