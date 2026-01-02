package patterns;

public class NumHollowedPyramid {
    public static void main(String[] args) {
        int n = 4;
       
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            for(int space=1; space<=2*(n-i);space++){
                System.out.print(" ");
            }
            for (int j =i; j >=1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        // for (int i = 0; i < n; i++) {
        // int p = 1;
        // int spaces = n - i;
        // for (int j = 0; j <= i; j++) {
        // System.out.print(p);
        // p++;
        // }
        // for (int j = 0; j < spaces; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 0; j <= i; j++) {
        // System.out.print(p);
        // p++;
        // }
        // System.out.println(" ");
        // }

        // for (int i = 0; i < n; i++) {
        // int p = 1;
        // int spaces = n - i;
        // for (int j = 0; j < spaces; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 0; j <= i; j++) {
        // System.out.print(p);
        // p++;
        // }
        // System.out.println(" ");
        // }

    }
}