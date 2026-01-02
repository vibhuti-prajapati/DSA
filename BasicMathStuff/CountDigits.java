package BasicMathStuff;

public class CountDigits {
    public static void main(String[] args) {
        int n = 7894;
        // still fails some scenarios
        // n=0000 ->0 
        int count =String.valueOf(Math.abs(n)).length();
        System.out.println(count);

        // works but the incase n=5555
        // -> then the output is just 0
        // int n = 12345;
        // int i;
        // for ( i = 0; n!=0; ++i) {
        // n/=10;
        // }
        // System.out.println(i);
    }
}
