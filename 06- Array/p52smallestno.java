import java.util.*;
public class p52smallestno {

    public static int smallest(int nums[]){
        int sm=Integer.MAX_VALUE; // +infinity

        for(int i=0;i<nums.length;i++)
        {
            if (sm > nums[i]) 
            {
                sm=nums[i];
            }
          
        }
        return sm;
    }
    public static void main(String[] args) {
        int nums[]={2,5,3,12,7,3};
        System.out.println("Smallest number is " + smallest(nums));
    }
}
