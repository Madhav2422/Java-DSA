public class p58prefixsubaraysum {

    public static void subarray(int nums[]) {
        int total = 0;
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[nums.length];

        prefix[0]=nums[0];
        // Calculate prefix array
        for(int i=1;i<nums.length;i++)
        {
            prefix[i]=prefix[i-1]+nums[i];
        }


        for (int i = 0; i < nums.length; i++) {

            int start = i;

            for (int j = i; j < nums.length; j++) {
                 sum = 0;

                int end = j;
               
                sum=start == 0 ? prefix[end]:prefix[end]-prefix[start-1];

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
