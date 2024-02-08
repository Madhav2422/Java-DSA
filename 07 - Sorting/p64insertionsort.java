public class p64insertionsort {

    public static void insertionSort(int nums[]) {
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int prev = i - 1;

            // finding out the correct pos to insert
            while (prev >= 0 && nums[prev] > curr) {
                nums[prev + 1] = nums[prev];
                prev--;
            }
            // insertion
            nums[prev + 1] = curr;
        }
    }

    public static void printArr(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public static void main(String[] args) {
        int nums[] = { 5, 4, 1, 3, 2 };
        insertionSort(nums);
        printArr(nums);

    }
}
