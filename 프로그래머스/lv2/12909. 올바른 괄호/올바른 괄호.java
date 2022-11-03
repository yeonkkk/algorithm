import java.util.Stack;

class Solution {
    boolean solution(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
                continue;
            }
            
            if (stack.size() == 0) return false;
            stack.pop();
        }
        
        return stack.size() == 0;
    }
}