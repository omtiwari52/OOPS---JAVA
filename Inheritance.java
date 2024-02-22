package OOPS;

public class Inheritance {
    public static void main(String[] args) {
        // Inheritance 

        ////single level///
        // Fish shark = new Fish();
        // shark.eat();


        /////Multi level///
        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);

        ///// Hierarchial Inheritance ////

        // Bird Sparrow = new Bird();
        // Sparrow.eat();
        // Sparrow.color = ("green");
        // System.out.println(Sparrow.color);

        //// Hybrid ////

        Sparrow silk = new Sparrow();
        silk.color = ("Skin");
        silk.fly();
        System.out.println(silk.color);
        Tuna Chomu = new Tuna();
        Chomu.swim();
        Dog Husky = new Dog();
        Husky.kutta();
    }
}
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

// Single level Inheritance 

// class Fish extends Animal{      
//     int fins;
    
//     void swim(){
//         System.out.println("Swims in water");
//     }
// }



// Multilevel Inheritance

// class Mammal extends Animal{
//     int legs;
// }

// class Dog extends Mammal{
//     String breed;
// }



// Hierarchial Inheritance 

// class Mammal extends Animal{
//     void walk(){
//         System.out.println("Walks");
//     }
// }

// class Fish extends Animal{      
//     void swim(){
//         System.out.println("Swims in water");
//     }
// }

// class Bird extends Animal{
//     void fly(){
//         System.out.println("Fly in Sky");
//     }
// }


// Hybrid Inheritance 


class Mammal extends Animal{
    String color;
    int legs;
    void walk(){
        System.out.println("Walks");
    }
}

class Dog extends Mammal{
    void kutta(){
        System.out.println("Kutta Bhokta hai");
    }
}

class Cat extends Mammal{
    void meow(){
        System.out.println("Billi meow krti hai");
    }
}

class Fish extends Animal{    
    String tair;  
    void swim(){
        System.out.println("Swims in water");
    }
}

class Tuna extends Fish{
    void chutiya(){
        System.out.println("Chutiya Fish");
    }
}

class Shark extends Fish{
    void dhakkan(){
        System.out.println("Shark dhakkan hai");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Fly in Sky");
    }
}

class Sparrow extends Bird{
    void udti(){
        System.out.println("udtii hai");
    }
}

class Pigeons extends Bird{
    void chidiya(){
        System.out.println("Udtaa hai sala");
    }
}