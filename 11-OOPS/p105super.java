public class p105super {
    public static void main(String[] args) {
        horse h1=new horse();
        System.out.println(h1.color);
    }

}

class Animal {
    String color;
    Animal(){
        System.out.println("Animal constructor called");
    }
}

class horse extends Animal{
    
    horse(){
         super.color="Red";
        System.out.println("horse constructor called");
    }
}
