package loop;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        // 중복된 단어를 제거하고 출력하시오.
        List<String> words = List.of("apple", "banana", "apple", "grape", "banana");

        Set<String> w = new HashSet<>();
        for(String str : words) {
            w.add(str);
        }
//        w.addAll(words);
        System.out.println(w);

        List<String> cwords = new ArrayList<>();
        for(String str : words) {
            if(cwords.contains(str)) continue;
            cwords.add(str);
        }
        System.out.println(cwords);

    }
}
