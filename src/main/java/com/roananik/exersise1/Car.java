package com.roananik.exersise1;

public class Car {
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    

    private int a = 10;

}

class Bmw extends Car {




}

class Test {
    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        System.out.println("BMW get " + bmw.getA());
        bmw.setA(20);
        System.out.println("BMW set " + bmw.getA());
        Car car = new Car();
        System.out.println("Car get "+ car.getA());





    }
}
