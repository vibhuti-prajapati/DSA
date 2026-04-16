public class ReverseInteger {
    public static void main(String[] args) {
        int a=2147483647;
        System.out.println(reverse(a));
    }
    static int reverse(int a){
        int rev=0;
        while(a!=0){
            int digit = a % 10;

            if (rev > Integer.MAX_VALUE / 10 ||
                    (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (rev < Integer.MIN_VALUE / 10 ||
                    (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            rev= rev*10 + digit;
            a/=10;
        }
        return rev;
    }
}
