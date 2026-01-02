package patterns;

public class AlphaCenterPyramid {
    public static void main(String[] args) {
        int n=4;

        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }

            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
        // int col=2*n-1;    
        // int mid= col/2;                   
        // for (int i = 0; i <=n; i++) {
        //     char c='A';
        //     for (int j = 0; j <=col; j++) {
        //         if(j>(mid-i) && j<(mid+i)){
        //             System.out.print(c);
        //             c++;
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
    }
}
