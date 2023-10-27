package com.roananik.GOFpatterns.prototype;

public class Runer {
    public static void main(String[] args) {
        Aple aple=new Aple("antonovka",4);

        TreeAple treeAple = new TreeAple(aple);
        Aple aple1 = treeAple.cloneApel();
        System.out.println(aple1);

    }
}
