package Zadanie3;

public class Animal {

    private static final Double DEFAULT_DOG_WEIGHT = 9.0;
    static final Double DEFAULT_WEIGHT = 5.0;
    static final Double DEFAULT_CAT_WEIGHT = 2.5;

    final String species;
    private Double weight;
    Integer age;
    Boolean isAlive;
    public String name;

    public Animal(String species){
    this.isAlive = true;
    this.age = 1;
    this.species = species;



    switch (this.species){
        case "felis":this.weight =  DEFAULT_WEIGHT; break;
        case "canis":this.weight = 10.0; break;
        default: this.weight = 5.0; break;
    }
}

    public Double getWeight(){

    }
}


    void feed(){
        if (isAlive) {
            weight += 1.0;
            System.out.println("thx for food");
        } else {
            System.out.println("troche za pozno");

    }

    void takeForAWalk(){
        if (isAlive) {
            weight -= 1.0;
            System.out.println("nice walk, thx");
            if (weight <= 0.0) {
                isAlive = false;
            }
        }else{
            System.out.println("halo Policja, ktoś thx");
        }
}
