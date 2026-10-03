public class abstraction{
    public static void main(String[] args) {
        // Animal A = new Animal(); // we can't create object of Animal class as it is abstract

        Horse H1 = new Horse();
        H1.eat();  // it come from animal class as inherited class can access abstract class
        H1.walk(); // it come from horse class
        // System.out.println(H1.color);  // Brown as inherited from parent class
        H1.changeColor();  //Black

        Chicken C = new Chicken();
        C.eat();
        C.walk();


        Mustang myHorse= new Mustang(); 
        // Animal -> Horse -> Mustang   ==== inheritance hierarchy so OUTPUT:
        // Animal constructor is called.....
        // Horse constructor is called.....
        // Mustang constructor is called.....
    }
}

abstract class Animal{
    String color;
    // Animal(){
    //     color = "Brown"; // anything you made in subclass as color but first always by default this constructor is used
    // }

    Animal(){
        System.out.println("Animal constructor is called.....");
    }

    void eat(){
        System.out.println("Eats..");
    }
    abstract void walk(); // with abstract keyword, it only derive not implement. and implementation done in subclass.
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor is called.....");
    }

    void changeColor(){
        color = "Black";
        System.out.println(color);
    }

    void walk(){     // must be implement walk() fn as it is abstract in parent class
        System.out.println("Horse walks at 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is called.....");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "White";
    }
    void walk(){   // must be implemented
        System.out.println("Chicken walks at 2 legs");
    }
}

