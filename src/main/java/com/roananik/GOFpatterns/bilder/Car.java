package com.roananik.GOFpatterns.bilder;

public class Car {
    private String name;
    private int age;

    private Car(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static CarBilder builder(){
        return new CarBilder();
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    static class CarBilder{
        private String name;
        private int age;

        public CarBilder name(String name){
            this.name=name;
            return this;

        }
        public CarBilder age(int age){
            this.age=age;
            return this;
        }
        public Car build(){
            return  new Car(name,age);
        }


    }
}

