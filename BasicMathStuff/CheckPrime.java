package BasicMathStuff;

public class CheckPrime {
    public static void main(String[] args) {
        int n=7;
        for (int i = 2; i <n-1; i++) { //! i++ is useless here fix it 
            if(n%i==0){
                System.out.println(false);
                break;
            }else{
                System.out.println(true);
                break;
            }
        }
    }
}
