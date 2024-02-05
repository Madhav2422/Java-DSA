public class p37swap {

    public static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;

        System.out.println("Swapping the values" + a);
        System.out.println("Swapping the values  " + b);
    }
    public static void main(String[] args) {
        int a=9;
        int b=10;

        swap(a,b);
    }
}
