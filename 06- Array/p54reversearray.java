public class p54reversearray {

    public static void reverse(int nums[]) {
        int f = 0, l = nums.length - 1;

        while (f < l) {
            int temp;
            temp = nums[l];
            nums[l] = nums[f];
            nums[f] = temp;

            f++;
            l--;
        }

    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8, 10 };
        reverse(nums);

        // print
        for (int i = 0; i <nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

    }
}
