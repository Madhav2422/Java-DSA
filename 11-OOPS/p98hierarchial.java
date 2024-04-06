public class p98hierarchial {
    public static void main(String[] args) {
        Mammal m1=new Mammal();
        m1.eat();
        m1.breathe();
        m1.walk();
    }

}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    int walk;

    void walk(){
        System.out.println("Walks");
    }
}

class Fish extends Animal {
    int swims;

    void swims(){
        System.out.println("Swims");
    }
}

class Bird extends Animal {
    int fly;

    void fly(){
        System.out.println("Fly");
    }
}