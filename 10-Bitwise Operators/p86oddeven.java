public class p86oddeven {

    public static void oddoreven(int n){
        int bitmask=1;

        if((n & bitmask) == 0){
            // Even
            System.out.println("Even");
        }
        else
        {
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        oddoreven(2);
        oddoreven(3);
        oddoreven(22);

    }
}
