package com.roananik.GOFpatterns.factoryMethod;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory dev = developerChoos("java");
        Developer d = dev.createDeveloper();
        d.writeCode();

    }
    public static DeveloperFactory developerChoos(String string){
        if(string.equalsIgnoreCase("java")){
            return new JavaDevFabric();
        }else if(string.equalsIgnoreCase("php")){
            return new PhpDevFabric();
        }else if(string.equalsIgnoreCase("cpp")){
            return new CppDevFabric();
        }else
            throw new RuntimeException("no developer");
    }
}
