package com.roananik.GOFpatterns.factoryMethod;

public class CppDevFabric implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CppDev();

    }
}
