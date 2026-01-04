package BasicMathStuff;

public class CheckPrime {
    public static void main(String[] args) {
        int n=7;
        if(n<2){
            System.out.println("not prime");
        }
        for(int i=2; i<n-1;i++){
            if(n%i!=0){
                System.out.println(" prime");
                break;
            }
            else{
                System.out.println("not prime");
            }
        }
    }
}
