package BasicMathStuff;

public class NumberOf1Bits {
    public static void main(String[] args) {
        System.out.println(setBitsCount(toBinary(8)));
    }

    public static String toBinary(int n) {
        StringBuilder binary = new StringBuilder();
        int curr = n;
        while (curr >= 1) {
            if (curr % 2 == 0) {
                binary.append("0");
                curr /= 2;
            } else {
                binary.append("1");
                curr /= 2;
            }
        }
        return binary.toString();
    } 

    public static int setBitsCount(String binary){
        int weight=0;
        for (int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i)=='1'){
                weight++;
            }
        }
        return weight;
    }
}
