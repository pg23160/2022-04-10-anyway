package Zadanie;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    Boolean isAlive;

    Phone mobile;
    Animal pet;
    private Car car;
    private Double salary; //zrobione

    public Car getCar(){
        return this.car;
    }

    public void setCar(Car car){
        if(this.salary > car.value{
            System.out.println("gratulcje kupiłeś za gotówkę" + car.model);
            this.car=car;
            } else if (this.salary > car.value /12.0){
            System.out.println("kupiłeś na raty" + car.model);
            this.car=car;
            } else {
            System.out.println("najpierw na" + car.model);
        }
    }

    public Double getSalary(){
        //sprawdzić uprawnienia
        //kontakt z bazą danych
        //zapisać logi
        //obsługa
        System.out.println("Dane o wypłacie były pobrane " + java.time.LocalDateTime.now());
        return this.salary;
    }

    public void setSalary(Double salary){
        //walidacje
        //integracje
        //zapis do bazy danych
        if (salary < 0 ){
            System.out.println("chyba cię powaliło, nie ma niewolnictwa");
        } else {
            System.out.println("nowa wypłata została wysłana do systemu księgowego");
            System.out.println("odbierz aneks od pania Hani");
            System.out.println("nie ukrywaj dochodów, ZUS i US i tak cię znajdą");
            this.salary = salary;
        }

    }

}