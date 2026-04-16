package String;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels= "aA";
        String stones= "aAAbbb";
        int jewelCount=0;
        for (int i = 0; i < jewels.length(); i++) {
            if(stones.contains(String.valueOf(jewels.charAt(i)))){
                jewelCount++;
            }
        }
        System.out.println(jewelCount);
    }
}
