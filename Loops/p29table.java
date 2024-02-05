import java.util.Scanner;

public class p29table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number ");
        int no=sc.nextInt();

        for(int i=0;i<=10;i++)
        {
            System.out.println(no + "X" + i + "=" + no*i);
        }
    }
}
