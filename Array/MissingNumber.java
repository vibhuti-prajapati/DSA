package Array;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println( missingNumber(new int[] {0,1,3}));
    }
    public static int missingNumber(int[] nums) {
        int expectedSum = nums.length*(nums.length+1)/2;
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        System.out.println(expectedSum);
        return expectedSum-sum;
    }}
