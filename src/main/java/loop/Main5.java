package loop;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        // 단어의 시작이 A 또는 a로 시작하는 단어를 newWords 리스트에 담아 출력하시오.
        List<String> words = List.of("Apple", "banana", "avocado", "carrot");
        List<String> newWords = new ArrayList<>();
        List<String> newWords2 = new ArrayList<>();
        List<String> newWords3 = new ArrayList<>();

        for(String word : words) {
            if(word.charAt(0) == 'A' || word.charAt(0) == 'a') {
                newWords.add(word);
            }
        }
        System.out.println(newWords);

        for(String word : words) {
            if(word.startsWith("A") || word.startsWith("a")) {
                newWords2.add(word);
            }
        }
        System.out.println(newWords2);

        for(String word : words) {
            String firstStr = word.substring(0, 1);
            if(firstStr.equalsIgnoreCase("a")) {  // 주소값 때문에 equals 사용
                newWords3.add(word);
            }
        }
        System.out.println(newWords3);



    }
}
