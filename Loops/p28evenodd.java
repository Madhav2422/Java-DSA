import java.util.Scanner;

public class p28evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int e = 0;
        int o = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter integer");
            int no = sc.nextInt();

            if (no % 2 == 0) {

              e=no+e;
                System.out.println("Even numbers " + e);

            } else {
                o=no+o;
                System.out.println("Odd numbers " + o);
            }
        }
    }
}
