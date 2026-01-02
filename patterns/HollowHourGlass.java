package patterns;

public class HollowHourGlass {
    public static void main(String[] args) {
        int row = 4;
        int col = 2 * row - 1;
        int mid = col / 2;

        for (int i = row; i >= 0; i--) {
            for (int j = 0; j < col; j++) {
                if (j > (mid - i) && j < (mid + i)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = 1; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j > (mid - i) && j < (mid + i)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
