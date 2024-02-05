import java.util.Scanner;

public class p14maxbetnthree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b ");
        int b=sc.nextInt();
        System.out.println("Enter the value of c ");
        int c=sc.nextInt();

        if(a>b && a>c){
            System.out.println("A is greater " + a);
        }
        else if(b>c && b>a)
        {
            System.out.println("B is greater " + b);
        }
        else if(c>a && c>b)
        {
            System.out.println("C is greater " + c);
        }
        else
        {
            System.out.println("All are equal ");
        }
    }
}
