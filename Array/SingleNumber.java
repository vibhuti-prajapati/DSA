package Array;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] {1,2,1,3,2}));
    }
    public  static int singleNumber(int[] nums) {
        int missingNumber=0;
        for (int num : nums) {
            missingNumber = missingNumber ^ num;
        }
        return missingNumber;
    }
}
