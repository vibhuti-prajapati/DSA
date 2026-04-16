package String;

public class maxFreqSum {
    // most frequent vowel and consonant summed
    public static void main(String[] args) {
        String s = "sueccess";
        int[] freq = new int[26];
        int vowel = 0;
        int consonant = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = ch -'a';
            freq[index]++; 
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel = Math.max(vowel, freq[index]);
            } else {
                consonant = Math.max(consonant, freq[index]);
            }
        }
        System.out.println(vowel + consonant);
    }
}
