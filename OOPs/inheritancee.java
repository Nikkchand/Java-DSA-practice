public class inheritancee{
    public static void main(String args[]) {
        Dog duggu = new Dog();
        duggu.breed ="german shepard";
        System.out.println(duggu.breed);
        duggu.legs = 4;
        System.out.println("legs: "+duggu.legs);
        duggu.eat();
        duggu.run(); 

        Fish shark = new Fish();
        System.out.println("Fish-shark: ");
        shark.swim();
        shark.eat();
        // shark.run();  this not inherit in fish as it is mammal properties

        Bird crow = new Bird();
        System.out.println("Bird - crow: ");
        crow.fly();
        crow.breathe(); 
        // crow.swim();  this not be inherit in bird as it is property of fish

        Peacock p1 = new Peacock();
        System.out.println("Peacock: ");
        p1.color = "green and blue";
        System.out.println(p1.color);
        p1.national();
        p1.fly();
    }
}

//Base class
class Animal{
    String color;

    void eat(){
        System.out.println("can Eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
    
}

// single level inheritance

class Mammal extends Animal{
    int legs;
    void run() {
        System.out.println("can runs");
    }
}

// Multi-level inheritance

class Dog extends Mammal{
    String breed;
}


// Heirarchical Inheritance

class Fish extends Animal{
    int fins;
    void swim() {
        System.out.println("can swim");
    }
}

class Bird extends Animal{
    int feather;
    void fly() {
        System.out.println("can fly");
    }
}
// Hybrid -mix of all inheritance  -- includes upper example
class Peacock extends Bird{
    void fly(){    //Method override
        System.out.println("Not Fly");
    }
    void national(){
        System.out.println("National Bird as it is very beautiful");
    }
}

