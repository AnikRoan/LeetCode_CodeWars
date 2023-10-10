package com.roananik.exersise5;

public class EigthConverter {
    public static int toOctal(int decimal) {
        int i = 0;
        int octal = 0;

        while (decimal != 0) {
            octal += octal + (decimal % 8) * Math.pow(10, i);
            decimal = decimal / 8;
            i++;

        }
        return octal;
    }

    public static int toDecimal(int octal) {
        int i = 0;
        int decim = 0;
        while (octal != 0) {
            decim = (int) (decim + (octal % 10) * Math.pow(8, i));
            octal = octal / 10;
            i++;

        }
        return decim;
    }

    public static String toBinary(int decimal) {
        if (decimal <= 0) {
            return "";
        }
        String result = "";
        while (decimal != 0) {
            result = (decimal % 2) + result;
            decimal = decimal / 2;


        }
        return result;
    }


    public static int toDecimal(String binaru) {
        if (binaru==null||binaru.isEmpty()) {
            return 0;
        }
        int result =0;
        for(int i=0;i<binaru.length();i++){
//            int s = binaru.length()-1-i;
//            int val=Character.getNumericValue(binaru.charAt(s));
//            result+=val*Math.pow(2,i);
            result= (int) (result+Math.pow((binaru.charAt(i)*2),i));

        }
        return result;

    }

    public static void main(String[] args) {
        int dec = Integer.MAX_VALUE;
        String s="1111111111111111111111111111111" ;
        System.out.println(toBinary(dec));
        System.out.println(toDecimal(s));

//        int decimal = 21;
//        System.out.println("desyatichnoe " + decimal + " ravno " + toOctal(decimal));
//        int octal = 25;
//        System.out.println("vosmirichnoe " + octal + " ravno " + toDecimal(octal));

    }
}
