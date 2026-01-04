package BasicMathStuff;

public class Divisors {
    public static void main(String[] args) {
        int n=36;
        //good enough but there has to be better way to find divisors
        for (int i = 1; i <=n; i++) {
            if(n%i==0){
                System.out.print(i + ", " );
            }
        }
    }
}
