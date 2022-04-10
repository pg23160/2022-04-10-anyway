package com.company;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    Boolean isAlive;

    Phone mobile;
    Animal pet;
    Car car;
    private Double salary;


    public Double getSalary(){
        //sprawdzić uprawnienia
        //kontakt z bazą danych
        //zapisać logi
        //obsługa
        return this.salary;
    }

    public void setSalary(Double salary){
        //walidacje
        //integracje
        //zapis do bazy danych
        this.salary = salary;
    }

}