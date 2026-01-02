package patterns;

public class NumLeftHalfPyramid {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            int p =1;
            for (int j = 0; j <= i; j++) {
                System.out.print(p);
                p++;
            }
            System.out.println();
        }
    }
}
