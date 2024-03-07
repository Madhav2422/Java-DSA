import java.util.Scanner;

public class p79lowercase {

    public static int LowercaseVowels(String str)
    {
        int count = 0;
       
        for(int i=0;i<str.length();i++)
        {  
           char ch=str.charAt(i);
           if(ch=='a' ||ch=='e' || ch=='i' || ch=='o' || ch=='u' )
           {
            count++;
           }
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a string ");
        String str=sc.nextLine();

        int vowelcount=LowercaseVowels(str);
        System.out.println("Total number of vowels " + vowelcount);
    }
}
