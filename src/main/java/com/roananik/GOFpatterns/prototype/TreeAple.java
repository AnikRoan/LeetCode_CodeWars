package com.roananik.GOFpatterns.prototype;

public class TreeAple{
    Aple aple;

    public void setAple(Aple aple) {
        this.aple = aple;
    }

    public TreeAple(Aple aple) {
        this.aple = aple;
    }
    Aple cloneApel(){
        return (Aple) aple.copy();
    }
}
