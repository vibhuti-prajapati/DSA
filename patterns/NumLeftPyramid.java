package patterns;

public class NumLeftPyramid {
    public static void main(String[] args) {
        int n =4;
        int p=1;
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(p + " ");
                p++;
            }
            System.out.println();
        }
    }
}
