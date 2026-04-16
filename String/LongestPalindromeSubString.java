package String;

public class LongestPalindromeSubString {
    public static void main(String[] args) {
        String str = "babddba";
        String LPS="";
        for (int i = 1; i <str.length(); i++) {
            int left=i;
            int right=i;

            while(str.charAt(left)==str.charAt(right)){
                left--;
                right++;

                if(left==-1 || right==str.length()){
                    break;
                };
            }
            String palindrome = str.substring(left+1, right);
            if(LPS.length()<palindrome.length()){
                LPS=palindrome;
            }
            left=i-1;
            right=i;
            while(str.charAt(left)==str.charAt(right)){
                left--;
                right++;

                if(left==-1 || right==str.length()){
                    break;
                };
            }
             palindrome = str.substring(left+1, right);
            if(LPS.length()<palindrome.length()){
                LPS=palindrome;
            }

        }
        System.out.println(LPS);
    }
}
