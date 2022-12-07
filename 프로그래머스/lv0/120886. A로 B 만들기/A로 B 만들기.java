import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        return check(before, after);
    }
    
    private int check(String before, String after) {
        if (before.length() != after.length()) return 0;
        
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();
        
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        
        
        for(int i = 0; i < before.length(); i++) {
            if (beforeArr[i] != afterArr[i]) return 0;
        }
        return 1;
    }
}