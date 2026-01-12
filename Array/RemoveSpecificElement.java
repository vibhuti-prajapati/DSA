package Array;

import java.util.Arrays;

public class RemoveSpecificElement {
    public static void main(String[] args) {
        removeElement(new int[] { 0, 3, 4, 4, 5 }, 4);
    }

    public static int removeElement(int[] nums, int val) {

        if (nums.length == 0) {
            return 0;
        }

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }
}