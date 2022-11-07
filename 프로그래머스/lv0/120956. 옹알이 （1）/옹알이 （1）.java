import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        List<String> babblingList = List.of("aya", "ye", "woo", "ma");  
        int result = 0;
        
        for (String str : babbling) {
            if (verifyStr(str, babblingList)) result++;
        }
        
        return result;
    }
    
    public boolean verifyStr(String str, List<String> babblingList) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : str.toCharArray()) {
            sb.append(c);
            
            if (babblingList.contains(sb.toString())) {
                sb.setLength(0);
                
            }
        }
        return sb.length() == 0;
    }
}