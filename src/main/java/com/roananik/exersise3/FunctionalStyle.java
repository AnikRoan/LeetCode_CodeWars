package com.roananik.exersise3;

import java.util.Arrays;
import java.util.Objects;

public class FunctionalStyle {
    public static void main(String[] args) {
        Object[] words = {" ", '3', null, "2", 1, ""};
        Arrays.stream(words)
//                .map(String::valueOf)
//                .filter(c->c.matches("^\\d+S"))
//                .mapToInt(Integer::parseInt)
//                .sorted()
//                .forEach(System.out::println);
                .filter(Objects::nonNull)
                .map(Objects::toString)
                .map(String::trim)
                .filter((s)->!s.isEmpty())
                .map(Integer::parseInt)
                .sorted()

                .forEach(System.out::println);// 1  2  3

    }


}

