public class p73comparestrings {
    public static void main(String[] args) {
        String s1="Madhav";
        String s2="Madhav";
        String s3=new String("Madhav");

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }
        else
        {
            System.out.println("Strings are not equal");
        }
    }
}
