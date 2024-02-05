import java.util.Scanner;

public class p36functionadd {

    public static int sum(int num1, int num2) //parameters or formal parameters
    {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

       int sum= sum(a, b);      // Arguments or actual parameters

        System.out.println("Sum " + sum);


    }
}
