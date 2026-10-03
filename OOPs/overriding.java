public class overriding{
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();  // method override
        Animal Dog = new Animal();
        Dog.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Eats anything");
    }
}

class Deer extends Animal{ 
    void eat(){   // same function as eat but different definition so it overrides Animal class's eat function.
        System.out.println("Eats Grass");
    }
}