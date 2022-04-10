package WSB;

import com.company.Human;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.species = "cains";
        dog.isAlive = true;
        dog.name = "Reksio";
        dog.weight = 10.3;

        System.out.println("ten pies to" + " " + dog.name);
        System.out.println(dog.weight);

        Animal cat = new Animal();
        cat.species = "cains";
        cat.isAlive = true;
        cat.name = "Sierściuch";
        cat.weight = 5.6;

        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();

        System.out.println(dog.weight);

        System.out.println("ten kot to" + " " + cat.name);
        System.out.println(cat.weight);

        Phone iphone6s = new Phone();
        iphone6s.producer = "Apple";
        iphone6s.model = "6s";
        iphone6s.screensize = 4.2;
        iphone6s.os = "ios";

        Human kacper = new Human();
        kacper.firstName = "Kacper";
        kacper.lastName = "Warda";
        kacper.pet.feed();

        System.out.println(kacper.pet.name);
        System.out.println(iphone6s.producer + " " + iphone6s.model);

        Integer i = 2;
        int j = 2 ;
        long l = 123456789;
        short s = 32;
        boolean b = true;
        float f = 32.222f;
        double d = 32.232;
        char c = 'c';
        byte bt;

    }
}
