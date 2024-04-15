public class p106recursion {

    public static void Decnum(int n) {

        if (n == 1) {
            System.out.println(n + "");
            return;
        }

        System.out.println(n + "");

        Decnum(n - 1);

    }

    public static void main(String[] args) {
        int n = 10;
        Decnum(n);

    }
}
