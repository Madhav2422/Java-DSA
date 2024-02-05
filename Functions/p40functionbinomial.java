import java.util.Scanner;

public class p40functionbinomial {

    public static int facto(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        return fact;

    }
 
    public static int bincoeff(int n,int r){
        int fact_n=facto(n);
        int fact_r=facto(r);
        int nmr=facto(n-r);

        int bin=fact_n/(fact_r * nmr);
        return bin;
    }


    public static void main(String[] args) {
       System.out.println("Binomial coefficient " +  bincoeff(5,2));
    }

}
