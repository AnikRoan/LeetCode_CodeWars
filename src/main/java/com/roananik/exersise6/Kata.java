package com.roananik.exersise6;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;

public class Kata {
    public static void main(String[] args) {
        Kata kata = new Kata();
        System.out.println(kata.canBeTypedWords("leet code", "lt"));
    }

    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], 0);
            }
        }
        int sum = 0;

        for (int k : map.keySet()) {
            if (map.get(k) == 0) {//get() возвращает значение по ключу!!!!!!
                sum += k;
            }
        }
        return sum;
    }

    public int countKDifference(int[] nums, int k) {
        //  Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1 + i; j < nums.length; j++) {
                int num = i - j;
                if (Math.abs(num) == k) {
                    count++;
                }
            }
        }
        return count;


    }


    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        char letter = 'a';
        for (var m : message.toCharArray()) {
            if (!map.containsKey(m) || m != ' ') {
                map.put(m, letter++);
            }
        }

        StringBuilder result = new StringBuilder();
        key = key.replace(" ", "");
        for (var i : key.toCharArray()) {
            if (map.containsKey(i)) {
                result.append(map.get(i));
            } else result.append(i);
        }


        return result.toString();
    }


    public int canBeTypedWords(String text, String brokenLetters) {
        String[] s = text.split(" ");
        long intStream = Arrays.stream(s).filter(p -> {
            for (var v : brokenLetters.toCharArray()) {
                if (p.contains(String.valueOf(v))) {
                    return false;
                }
            }

            return true;
        }).count();
        return (int) intStream;
//        int count = 0;
//        String [] tex = text.split(" ");
//        for(var v:tex) {
//            boolean can = true;
//            for (var i : brokenLetters.toCharArray()) {
//
//                if (v.contains(String.valueOf(i))) {
//                    can = false;
//                    break;
//                }
//
//
//            }
//            if (can) {
//                count++;
//            }
//        }
//
//        return count;


    }


    public String destCity(List<List<String>> paths) {
        String result = null;
        for (int i = 0; i < paths.size(); i++) {
            List<String> res = paths.get(i);
            if (res.size() > 0 || Character.isLetter('a')) {
                result = res.get(res.size() - 1);
            }

        }
        return result;

    }

    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : stones.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);


        }
        int result = 0;
        for (char c : jewels.toCharArray()) {
            result += map.get(c);

        }
        return result;

    }

    public int arithmeticTriplets(int[] nums, int diff) {
      
        List<Integer> list = new ArrayList<>();
        for (Integer in : nums) {
            list.add(in);
        }


        int count = 0;

        for (int i = 0; i < nums.length ; i++) {
            int one = nums[i];
            int two = nums[i] + diff;
            int three = nums[i] + (diff * 2);
            if (list.contains(two)
                    && list.contains(three) && one < two && two < three) {
list.set(i,0);
                count++;

            }
        }
        return count;

    }
}
