public class p22reverseno {
    public static void main(String[] args) {
        int no=10899;

        while(no>0){
            int lastd= no%10;
            System.out.print(lastd);
            no=no/10;
        }
}
}
