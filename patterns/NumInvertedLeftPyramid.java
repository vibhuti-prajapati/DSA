package patterns;

public class NumInvertedLeftPyramid {
      public static void main(String[] args) {
        int n=4;
        for (int i = n; i >=0; i--) {
            int p=1;
            for (int j = 0; j <= i; j++) {
                System.out.print(p);
                p++;
            }
            System.out.println("");
        }
    }  
}
