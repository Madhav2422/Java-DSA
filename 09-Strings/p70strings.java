import java.util.Scanner;

public class p70strings {

    // print each letter of the string 
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "abc";
        String str2 = new String("ABC");

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();

        System.out.println(str);

        // concatenation
        String firstName="Madhav";
        String lastName="Hirani";
        String fullName= firstName + " " + lastName;
        System.out.println(fullName);

        printLetters(fullName);
    }
}
