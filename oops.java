
public class oops {

    public static void main(String[] args) {
        animal A1 = new animal();
        animal A2 = new animal();

        A1.name = "Cheetah";
        A1.legs = 4;
        A1.color = "Yellowish black";
        A1.type = "Herbivorous";

        A2.name = "Lion";
        A2.legs = 4;
        A2.color = "yellow & Black";
        A2.type = "Carnivorous";

        A1.runFast();
        A2.runFast();

        A1.print();
        A2.print();

    }
}

class animal {

    String name;
    int legs;
    String color;
    String type;

    void runFast() {
        if (name == "cheetah") {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    void print() {
        System.out.println(name + "," + legs + "," + color + "," + type);
    }

}
