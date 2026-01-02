package patterns;

public class ContinuousAlphaPyramid {
    public static void main(String[] args) {
        int n = 4;
        char c = 'A';
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c);
            }
            c++;
            System.out.println();
        }
    }
}
