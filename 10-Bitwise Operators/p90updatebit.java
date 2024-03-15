public class p90updatebit {

    public static int setbit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;

    }

    public static int clearbit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updatebit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearbit(n, i);
        } else {
            return setbit(n, i);
        }
    }

    public static void main(String[] args) {
        System.out.println(updatebit(10, 2, 1));
    }
}
