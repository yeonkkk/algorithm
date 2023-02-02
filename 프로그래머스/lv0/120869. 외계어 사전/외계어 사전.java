class Solution {
public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for (String element : dic) {
            if (element.length() < spell.length) {
                continue;
            }

            if (check(element, spell)) {
                answer = 1;
                break;
            }
        }

        return answer; 
    }

    public boolean check(String target, String[] spell) {
        int count = 0;

        for (String element : spell) {
            if (target.contains(element)) {
                count++;
            }
        }

        return count == spell.length;
    }
}