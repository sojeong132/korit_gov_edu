package loop;

import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        // 문자열의 길이가 5 이상인 단어의 개수를 출력하시오.
        List<String> words = List.of("apple", "cat", "banana", "dog", "grapes");
        int answer = 0;

        for(String str : words) {
            if(str.length() > 4) answer++;
        }
        System.out.println(answer);
    }
}
