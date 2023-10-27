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

interface AbstractPerson {
    AbstractPerson name(String name);

    AbstractPerson country(String country);

    AbstractPerson age(int age);

    AbstractPerson salary(int salary);

    Person build();
}

class PersonBuilder implements AbstractPerson {
    Person person = new Person();


    public AbstractPerson name(String name) {
        this.person.setName(name);
        return this;
    }


    public AbstractPerson country(String country) {
        this.person.setCountry(country);
        return this;
    }


    public AbstractPerson age(int age) {
        this.person.setAge(age);
        return this;
    }


    public AbstractPerson salary(int salary) {
        this.person.setSalary(salary);
        return this;
    }


    public Person build() {
        return person;
    }
}
