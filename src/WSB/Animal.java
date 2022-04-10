package WSB;

public class Animal {
    String species;
    Double weight;
    Integer age;
    Boolean isAlive;
    String name;


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
