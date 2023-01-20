import java.util.List;

class Solution {
    public String solution(String my_string) {
        StringBuilder result = new StringBuilder();
        List<Character> vowel = List.of('a', 'e', 'o', 'i', 'u');

        for (char c : my_string.toCharArray()) {
            if (!vowel.contains(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }
}