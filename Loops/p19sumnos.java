import java.util.Scanner;

public class p19sumnos {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        while (i <= no) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum is" + sum);

    }
}
