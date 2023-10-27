package com.roananik.mapTask;

public class ThreadEx implements Runnable {
    public synchronized void an(){
        System.out.println("AN");

    }
    public synchronized void bn(){
        System.out.println("bn");
    }
    public static void main(String[] args) {
        Thread t = new Thread(new ThreadEx());
        t.start();


    }

    @Override
    public void run() {
        System.out.println("run run");
       an();
        bn();
    }
}
