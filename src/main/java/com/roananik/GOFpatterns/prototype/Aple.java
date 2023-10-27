package com.roananik.GOFpatterns.prototype;

public class Aple implements Copyable {
    private String name;
    private int size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Aple(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public Object copy() {
        Aple aple = new Aple(name, size);
        return aple;
    }

    @Override
    public String toString() {
        return "Aple{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
