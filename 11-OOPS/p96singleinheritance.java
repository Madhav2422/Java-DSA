public class p96singleinheritance {
    public static void main(String[] args) {
        Fish f1=new Fish();
        f1.eat();
        f1.breathe();
        f1.swim();
    }
}

    // Base class
class Animal{
    String color;

    void eat()
    {
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

   // Derived class
 class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims");
    }

 }

