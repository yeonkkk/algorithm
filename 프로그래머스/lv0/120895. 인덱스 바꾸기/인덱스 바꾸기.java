class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            int idx = i;
            if (i == num1) {
                idx = num2;
            } else if (i == num2) {
                idx = num1;
            }

            answer.append(my_string.charAt(idx));
        }

        return answer.toString();
    }
}