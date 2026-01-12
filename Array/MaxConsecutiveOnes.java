package Array;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        findMaxConsecutiveOnes(new int[] {1,1,0,1,1,1,0,1,1});
    }
    public static int findMaxConsecutiveOnes(int[] nums){
        int maxLen=0;
        int left=0;
        for (int i = 0; i < nums.length; i++) {
            while(nums[i]!=1){
                left++;
                break;
            }
            if(i-left>maxLen){
                maxLen=i-left;
            }
        }
        return maxLen;
    }
}
