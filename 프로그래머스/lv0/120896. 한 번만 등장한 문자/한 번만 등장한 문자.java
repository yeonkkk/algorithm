import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(String s) {
        List<String> answer = new ArrayList<>();

        for (char cur : s.toCharArray()) {
            if (s.indexOf(cur) == s.lastIndexOf(cur)) {
                answer.add(String.valueOf(cur));
            }
        }

        Collections.sort(answer);

        return String.join("", answer);
    }
}