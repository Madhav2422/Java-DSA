public class p107increNum {

    public static void increaseNum(int n){
        if(n==10){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        increaseNum(n+1);
    }

    public static void main(String[] args) {
        int n=1;
        increaseNum(n);
    }
}
