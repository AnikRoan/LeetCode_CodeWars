package com.roananik.GOFpatterns.adapter;

public class Main {
    public static void main(String[] args) {
        Database data = new Adapter();
        data.remove();
        data.addFile();
        data.deleteFile();
    }
}
