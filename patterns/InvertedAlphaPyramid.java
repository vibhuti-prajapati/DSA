package patterns;

public class InvertedAlphaPyramid {
        public static void main(String[] args) {
        int n=4;
        for (int i = n; i >=0; i--) {
            char c= 'A';
            for (int j = 0; j <=i; j++) {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}
