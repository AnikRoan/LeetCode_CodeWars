package com.roananik.exersise7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Kata {
    public String defangIPaddr(String address) {
        return address.replaceAll(".", "[.]");

    }

    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (int i = 0; i < operations.length; i++) {
            int indexPlus = operations[i].indexOf("++");
            int minus = operations[i].indexOf("--");
            if (indexPlus != -1) {
                result++;
            } else if (minus != -1) {
                result--;
            }

        }

        return result;
    }


    public String interpret(String command) {
        char[] leters = command.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0, j = 2; i < leters.length; i++, j++) {
            if (Character.isLetter(leters[i])) {
                builder.append(leters[i]);
            }
            if (leters[i] == '(' && leters[j - 1] == ')') {
                builder.append("o");
            }
        }

        return builder.toString();
    }

    public int mostWordsFound(String[] sentences) {
        int size = 0;
        for (int i = 0; i < sentences.length; i++) {
            String[] s = sentences[i].split(" ");
            if (size < s.length) {
                size = s.length;
            }
        }


        return size;
    }

    public String truncateSentence(String s, int k) {
        String[] st = s.split(" ");
        if (st.length == k) {
            return s;
        }
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < k; i++) {
            b.append(st[i]).append(" ");
        }
        return b.toString().trim();

    }

    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        String[] result = new String[names.length];
        int count = names.length;
        for (var v:map.entrySet()) {
            if(count!=0){

            result[count]=v.getValue();
            count--;
            }


        }


        return result;
    }

    public int minimizedStringLength(String s) {




    }
}
