public class p53binarysearch {

    public static int binarysearch(int nums[], int key) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparisons

            if (nums[mid] == key) {
                return mid;
            }

            if (nums[mid] < key) { // right
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8, 21, 1 };
        int key = 6;

        System.out.println("Index for the key is " + binarysearch(nums, key));
    }
}
