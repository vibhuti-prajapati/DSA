package String;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContaining {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        String[] words = {"abc", "ijkl", "odada"};
        char x='a';
        for( int i=0; i<words.length; i++){
            if(words[i].indexOf(x) != -1){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
