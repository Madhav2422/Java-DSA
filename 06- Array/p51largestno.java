import java.util.*;
public class p51largestno {
    
    public static int largest(int nums[]) {
        int lar=Integer.MIN_VALUE; // -infinity

        for(int i=0;i<nums.length;i++)
        {
            if(lar < nums[i] )
            {
                lar=nums[i];
            }
        }
        return lar;
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4,15,6};
        System.out.println("Largest number is  " + largest(nums));

    }
}
