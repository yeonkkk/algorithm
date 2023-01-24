import java.util.Map;

class Solution {
    public String solution(String rsp) {
        Map<Character, Character> map = Map.of('2', '0', '0', '5', '5', '2');
        StringBuilder result = new StringBuilder();

        for (char key : rsp.toCharArray()) {
            result.append(map.get(key));
        }
        return result.toString();
    }
}