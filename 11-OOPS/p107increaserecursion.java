import java.util.Scanner;

public class p107increaserecursion {

    public static void increaseorder(int n){

        if(n==1){
            System.out.println(n + "");
            return;
        }

        increaseorder(n-1);
        
        System.out.println(n + "");

       

    }

    public static void main(String[] args) {
        int n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();

        increaseorder(n);
    }
}
