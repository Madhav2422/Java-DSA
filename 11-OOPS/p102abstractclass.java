public class p102abstractclass {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        // chicken c=new chicken();
        // c.eat();
        // c.walk();
    }
}

abstract class Animal{
    String color;
    Animal(){
        color="brown";
    }

    void eat(){
    System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("horse wals on 4 legs");
    }

    void color(){
        color="dark brown";
    }

}

class chicken extends Animal{
    void walk (){
        System.out.println("Walks on 2 legs");
    }
    void color(){
        color="peach";
    }
}