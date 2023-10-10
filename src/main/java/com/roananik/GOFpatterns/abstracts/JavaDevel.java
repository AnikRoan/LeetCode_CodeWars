package com.roananik.GOFpatterns.abstracts;

import com.roananik.GOFpatterns.abstracts.Developer;
import com.roananik.GOFpatterns.abstracts.Manager;
import com.roananik.GOFpatterns.abstracts.Tester;


public class JavaDevel implements Developer {
    @Override
    public void writeCode() {
        System.out.println("java code...");
    }
}

class MabagerBank implements Manager{

    @Override
    public void managerProject() {
        System.out.println("menedg code...");

    }
}
