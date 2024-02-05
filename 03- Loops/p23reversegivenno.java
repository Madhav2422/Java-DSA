public class p23reversegivenno {
    public static void main(String[] args) {
        int no=10988;
        int rev=0;

        while (no>0) {
            int lastd=no%10;
        rev=(rev*10)+lastd;
        no/=10;
        }
       System.out.println(rev);
    }
}
