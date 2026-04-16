package Array;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[] { 1,1,0,1,1,1 }));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxLen = 0;
        int currCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currCount++;
                maxLen = Math.max(maxLen, currCount);
            }else {
                currCount = 0;
            }
        }
        return maxLen;
    }
}
