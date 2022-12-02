import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * BOJ 9012. 괄호
 */
public class Main {
    /**
     * t : 입력될 테스트 데이터 수
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            System.out.println(checkVps(br.readLine()));
        }
    }

    /**
     * @param input : 테스트 데이터 (괄호 문자열)  
     * @return : VPS인지 판단한 결과 (YES, NO)
     * 열리는 괄호면 stack에 넣고 닫히는 괄호면 stack에서 제거하는 방식이다. 
     * 값을 제거해야해하는데 stack이 비어있거나, 문자열을 모두 확인했는데 stack에 값이 남아았다면 NO를 반환한다.
     */
    public static String checkVps(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char curChar = input.charAt(i);

            switch (curChar) {
                case '(':
                    stack.push(curChar);
                    break;
                case ')':
                    if (!stack.isEmpty()) {
                        stack.pop();
                        break;
                    }
                    return "NO";
            }
        }
        if (!stack.isEmpty()) {
            return "NO";
        }
        return "YES";
    }
}
