import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        answer[0] = (int) Arrays.stream(num_list)
                .filter(n -> ((n % 2) == 0))
                .count();
        answer[1] = num_list.length - answer[0];

        return answer;
    }
}