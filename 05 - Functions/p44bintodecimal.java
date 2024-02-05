public class p44bintodecimal {

    public static void bintodecimal(int n ) {
        int decNum=0;
        int pow=0;

        while(n > 0)
        {
            int lastDigit= n% 10;

            decNum= decNum + (lastDigit  *  (int)Math.pow(2, pow));

            pow++;
            n=n/10;
        }
        System.out.println( "Decimal number "  + "is " + decNum);
    }
    public static void main(String[] args) {
        bintodecimal(101);
    }
}
