package OOPS;

public class Abstraction {
    public static void main(String[] args) {
        // Chicken murga = new Chicken();
        // Cow c = new Cow();
        // murga.eat();
        // murga.walk();
        // // c.changeColor();
        // System.out.println(c.color);


        Desi gai = new Desi();
        // Animal -> Cow -> Desi
        // gai.changeColor();
    }
}

abstract class Animal{
    String color;
    Animal(){
        // color = "Peach";
        System.out.println("Animal contructor Called");
    }
    void eat(){
        System.out.println("Eats sb kuch");
    }
    abstract void walk();
}

class Cow extends Animal{

    Cow(){
        System.out.println("Cow contructor Called");
    }
    // void changeColor(){
    //     color = "Black white";
    // }
    void walk(){
        System.out.println("Has 4 Legs");
    }
}

class Desi extends Cow{
    Desi(){
        System.out.println("Desi constructor Called ");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "Yellow";
    }
    void walk(){
        System.out.println("Has 2 legs");
    }
}