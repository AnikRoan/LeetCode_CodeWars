package com.roananik.GOFpatterns.builderGodEx;

public class Person {
    private String name;
    private String country;
    private int age;
    private int salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
//  public PersonBuilder create(){
//        return new PersonBuilder();
//  }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

//interface AbstractPerson {
//    AbstractPerson setName(String name);
//    AbstractPerson setCountry(String country);
//    AbstractPerson setAge(int age);
//    AbstractPerson setSalary(int salary);
//    Person build();
//}
class PersonBuilder {
    Person person=new Person();


    public PersonBuilder setName(String name) {
        this.person.setName(name);
        return this;
    }


    public PersonBuilder setCountry(String country) {
        this.person.setCountry(country);
        return this;
    }


    public PersonBuilder setAge(int age) {
        this.person.setAge(age);
        return this;
    }


    public PersonBuilder setSalary(int salary) {
        this.person.setSalary(salary);
        return this;
    }


    public Person build() {
        return person;
    }
}
