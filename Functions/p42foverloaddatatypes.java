public class p42foverloaddatatypes {

    public static int sum(int a ,int b){
        return a+b;
    }

    public static float sum(float a,float b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println("Sum " + sum(2,4 ));
        System.out.println("float " + sum(3.4f, 1.2f)) ;
    }
}
