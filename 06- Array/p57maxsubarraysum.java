public class p57maxsubarraysum {

    public static void subarray(int nums[]) {
        int total = 0;
        int sum=0;
        int maxsum=Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            int start = i;

            for (int j = i; j < nums.length; j++) {
                 sum = 0;

                int end = j;
                for (int k = start; k <= end; k++) // print
                {
                    sum = sum + nums[k];
                }
                System.out.println(sum);
                if(maxsum<sum){
                    maxsum=sum;
                }

    }
           

        }
        System.out.println("Maximum  subarray " + maxsum);
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 7, 9,8 };
        subarray(nums);
    }
}
