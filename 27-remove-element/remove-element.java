import java.util.*;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0; // index to place non-val elements

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j]; // overwrite element at index i
                i++;
            }
        }

        return i; // new length
    }

    // \U0001f9ea Main method to test
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int newLength = solution.removeElement(nums, val);

        System.out.println("New length: " + newLength);
        System.out.print("Updated array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
