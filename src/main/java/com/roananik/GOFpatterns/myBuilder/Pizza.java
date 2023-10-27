package com.roananik.GOFpatterns.myBuilder;

public class Pizza {
    private String name;
    private int size;

    private Pizza(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    static class CreatePizza {
        private String name;
        private int size;


        public CreatePizza name(String name) {
            this.name = name;
            return this;

        }

        public CreatePizza size(int size) {
            this.size = size;
            return this;
        }

        public Pizza build() {
          Pizza  pizza = new Pizza(name, size);

            return pizza;
        }

    }
}
