package com.roananik.exersise2;

public class Kata {
    public static String getMiddle(String word) {
        char[] box = word.toCharArray();
        StringBuilder bild = new StringBuilder();
        if (box.length % 2 != 0) {
            bild.append(box[box.length/2]);

           return String.valueOf(bild);
        } else  {
            bild.append(box[box.length / 2 - 1]).append(box[box.length / 2]);
            return String.valueOf(bild);

        }

    }

    public static String remove(String str) {




      return null;
    }

}
