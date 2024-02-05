public class p56printsubarrays {

    public static void subarray(int nums[]) {
        int total = 0;

        for (int i = 0; i < nums.length; i++) {

            int start = i;

            for (int j = i; j < nums.length; j++) {
                int sum = 0;

                int end = j;
                for (int k = start; k <= end; k++) // print
                {
                    System.out.print(nums[k] + ""); // subaaray
                    sum = sum + nums[k];
                }

                total++;
                System.out.println("Sums of subarray " + sum);

                System.out.println();

            }
            System.out.println();

        }
        System.out.println("Total number of subarrays " + total);
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 7 };
        subarray(nums);
    }
}
