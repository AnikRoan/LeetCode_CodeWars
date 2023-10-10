package com.roananik.GOFpatterns.abstracts;

import com.roananik.GOFpatterns.abstracts.Developer;
import com.roananik.GOFpatterns.abstracts.Manager;
import com.roananik.GOFpatterns.abstracts.Tester;

public class PhpDev implements Developer {
    @Override
    public void writeCode() {
        System.out.println("php code...");
    }
}
class QaTester implements Tester{

    @Override
    public void testCode() {
        System.out.println("Qa tester..");
    }
}
class WebManager implements Manager{

    @Override
    public void managerProject() {
        System.out.println("manager chek project..");
    }
}
