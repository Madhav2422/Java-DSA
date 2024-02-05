import java.util.Scanner;

public class p18noswhile {
    public static void main(String[] args) {
        int cnt=1;

        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();

        while(cnt<=no){
            System.out.print(" " + cnt);
            cnt++;
        }
    }
    }

