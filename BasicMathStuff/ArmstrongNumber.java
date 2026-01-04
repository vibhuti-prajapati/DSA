package BasicMathStuff;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=103;
        int digits = String.valueOf(n).length();
        int original= n;    
        int sum =0;
        while(n!=0){
            int d = n%10;
            sum+= Math.pow(d,digits);
            n/=10;
        }
        if(sum==original) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
