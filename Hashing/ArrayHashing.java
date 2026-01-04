package Hashing;

public class ArrayHashing {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 3, 2, 2 };
        int[] hashArr = new int[13];
        for (int i = 0; i < arr.length; i++) {
            hashArr[arr[i]] += 1;
        }
        for (int i : hashArr) {
            System.out.println(i);

        }
    }
}
