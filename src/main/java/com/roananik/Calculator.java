package com.roananik;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = true;
        System.out.println("this is a calculator, enter arguments. To exit enter \"exit\"");

        while (exit) {
            String equation = scanner.nextLine().replaceAll(" ", "");

            String copyEquation = equation;
            equation = equation.replaceFirst("-", "");

            String[] numbers = equation.split("[+\\-*/]");
            if (equation.equalsIgnoreCase("exit")) {
                exit = false;
            } else {
                try {


                    double firstArgument = Double.parseDouble(numbers[0]);
                    if (copyEquation.charAt(0) == '-') {

                        firstArgument = -firstArgument;
                    }


                    String arithmeticOperation = equation.replaceAll("[0-9.]+", "");

                    double secondArgument = Double.parseDouble(numbers[1]);

                    switch (arithmeticOperation) {
                        case "+" -> System.out.println(firstArgument + secondArgument);
                        case "-" -> System.out.println(firstArgument - secondArgument);
                        case "*" -> System.out.println(firstArgument * secondArgument);
                        case "/" -> {
                            if (firstArgument != 0 || secondArgument != 0) {
                                System.out.println(firstArgument / secondArgument);
                            } else {
                                System.out.println("you cant divide by zero");
                            }
                        }
                    }


                } catch (NumberFormatException n) {
                    System.out.println("wrong character " + n.getMessage());
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("there are not enough numbers " + e.getMessage());
                }

            }


        }


    }

}
