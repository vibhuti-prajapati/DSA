package patterns;

public class Diamond {
    public static void main(String[] args) {
        // center pyramid
        // then inverted center pyramid

        int row = 4;
        int col = 2 * row - 1;
        int mid = col / 2;
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= i; j++) {
                if (j > (mid - i) && j < (mid + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = row-1; i >=0; i--) {
            for (int j = 0; j <= i; j++) {
                if (j > (mid - i) && j < (mid + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
