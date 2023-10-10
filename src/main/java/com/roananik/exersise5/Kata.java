package com.roananik.exersise5;

import java.util.*;

public class Kata {
    public static String binaryAddition(int a, int b) {
        // return Integer.toBinaryString(a + b);
        int sum = a + b;
        StringBuilder builder = new StringBuilder();
        while (sum != 0) {
            int res = sum % 2;
            sum /= 2;
            builder.insert(0, res);
        }
        //your code here
        return builder.toString();
    }

    public static long findNb(long m) {
        //Вам дается общий объем m здания. Будучи данным m,
        // можете ли вы найти количество n кубов, которые вам придется построить?
//        long mm = 0, n = 0;
//        while (mm < m) mm += ++n * n * n;
//        return mm == m ? n : -1;
        long n = 1;
        long sum = 0;
        while (sum < m) {
            sum += n * n * n;
            if (sum == m) {
                return n;
            }
            n++;


        }

        return -1;
        // your code
    }


    public static int sum(int[] arr) {
        return Arrays.stream(arr).filter((e) -> e >= 0).sum();
    }


    public static int count(String st) {
        //return (int) of(st.split(" ")).distinct().filter(w -> w.matches("[HIMNOSWXZ]+")).count();
        //"^[HINOSXZW]+$"
        int count = 0;
        if (st.isEmpty()) {
            return count;
        }


        String[] words = st.split(" ");
        List<String> list = new ArrayList<>();
        for (String s : words) {
            if (!list.contains(s)) {
                list.add(s);
            }
        }
        for (String s : list) {
            if (s.matches("^[HINOSXZWM]+$")) {
                count++;
            }

        }


        return count;
    }


    public static String camelCase(String input) {
        //return input.replaceAll("([A-Z])", " $1");
        //insert()
        StringBuilder s = new StringBuilder(input);
        char[] c = input.toCharArray();
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                count += i;
                s.insert(count, " ");
                count++;
                count = count - i;


            }

        }
        return s.toString();
    }

    public static int[] getConcatenation(int[] nums) {
        int o = 0;

        int[] result = new int[nums.length * 2];

        for (int j = 0; j < nums.length; j++) {
            result[j] = nums[j];

        }
        for (int i = nums.length; i < result.length; i++) {
            result[i] = nums[o];
            o++;


        }


        return result;
    }


    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        s = s.trim().toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        while (left != right) {

            if (Character.isLetterOrDigit(s.charAt(left)) && Character.isLetterOrDigit(s.charAt(right))) {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }
            }
            return true;
        }




        StringBuilder result = new StringBuilder(s.replaceAll(",\\s", "").toLowerCase());
        StringBuilder revers = new StringBuilder(result.reverse().toString().toLowerCase());
        return result.toString().equals(revers.toString());

    }
}

