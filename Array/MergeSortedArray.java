package Array;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        merge(new int[] {1,2,3,0,0,0}, 3, new int[] {2,5,6}, 3);
        // merge(new int[] { 0,0,0 }, 0, new int[] { 2, 5, 6 }, 3);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] num1Copy=new int[m];
        int p1=0,p2=0;
        for (int i = 0; i < m; i++) {
            num1Copy[i]=nums1[i];
        }
        for (int i = 0; i < m+n; i++) {
            if( p2>=n || (p1<m && num1Copy[p1]<nums2[p2])){
                nums1[i]=num1Copy[p1];
                p1++;
            }else{
                nums1[i]=nums2[p2];
                p2++;
            }
        }


        // for (int i = 0; i < nums2.length; i++) {
        //     nums1[m] = nums2[i];
        //     m++;
        // }
        // for (int i = 1; i < nums1.length; i++) {
        //     if (nums1[i] < nums1[i - 1]) {
        //         int temp = nums1[i - 1];
        //         nums1[i - 1] = nums1[i];
        //         nums1[i] = temp;
        //     }
        // }
        System.out.println(Arrays.toString(nums1));
    }
}
