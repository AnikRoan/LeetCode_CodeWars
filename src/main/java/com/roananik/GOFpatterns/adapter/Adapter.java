package com.roananik.GOFpatterns.adapter;

public class Adapter extends JavaFile implements Database{
    @Override
    public void remove() {
        removeJava();
    }

    @Override
    public void addFile() {
        addJava();

    }

    @Override
    public void deleteFile() {
        delitejava();

    }
}
