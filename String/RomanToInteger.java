package String;
import java.util.Map;
public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int number =0;
        Map<Character, Integer> guide = Map.of('X' ,10, 'I',1, 'V',5,'L',50, 'C',100, 'D',500, 'M',1000);

        for (int i = 0; i <s.length(); i++) {
            int curr=guide.get(s.charAt(i));
            int next =  (i + 1 < s.length())  ? guide.get(s.charAt(i+1)) : 0;
            if(curr<next){
                number-=curr;
            }else{
                number+=curr;
            }
        }
        System.out.println(number);

    }

}
