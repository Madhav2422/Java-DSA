public class p55pairsarray {

    public static void printpairs(int nums[]){
        int count=0;
        for(int i=0;i < nums.length;i++)
        {
           
            int curr=nums[i]; //2,4,6,8,10
            for(int j=i+1;j<nums.length;j++)
            {
                System.out.print("(" + curr + "," + nums[j] + ")");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs are " + count);
    }
     public static void main(String[] args) {
        int nums[]={2,4,6,8,10};
        printpairs(nums);
     }
}
