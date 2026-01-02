package BasicMathStuff;

public class PlaindromeNumber {
    public static void main(String[] args) {
            int n=343;
            int temp=n;
        int rev=0;
        while(n>0){
            rev=rev*10 + n%10;
            n/=10;
        }
        System.out.println(rev==temp);
    }
    }
