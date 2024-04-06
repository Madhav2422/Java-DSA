public class p99hybrid {
    public static void main(String[] args) {
        shark s1=new shark();
        Dog d1=new Dog();

        s1.eat();
        s1.breathe();
        s1.color();

        System.out.println("Dog properties");

        d1.eat();
        d1.breathe();
        d1.walk();
        d1.breed();




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

class Mammal extends Animal {
    int walk;

    void walk(){
        System.out.println("Walks");

}
}

class Dog extends Mammal{
   String breed;

   void breed(){
    System.out.println("breeds");
   }
}

class shark extends Fish{
    String color;

    void color(){
        System.out.println("Red color");
    }
}