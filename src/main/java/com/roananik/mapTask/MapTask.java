package com.roananik.mapTask;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class MapTask {
    public int numIdenticalPairs(int[] nums) {
        //getOrDefault вернет значение если оно есть или 0( или что напишешь вместо 0)
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            result += map.getOrDefault(num, 0);
            map.put(num, map.getOrDefault(num, 0) + 1);//добавляем  ключ и значение+1  потому что єтого елемента теперь 1
        }
        return result;


    }


    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num = 0; num < nums.length; num++) {
            for (int n = 0; n < nums.length; n++) {
                if (nums[num] > nums[n]) {
                    count++;
                }
            }
            map.put(num, map.getOrDefault(num, count));
            count = 0;
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = map.getOrDefault(i, 0);
        }
        return result;


    }

    public boolean checkIfPangram(String sentence) {
        //проверить есть ли в предложении все букві алфавита

//        Set<Character> charSet = sentence.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
//
//        for(char c:sentence.toCharArray()){
//            if(c>='a'&&c<='z'){
//                set.add(c);
//            }
//        }
//        return set.size()==26;
//
//    }


        return false;
    }

}
