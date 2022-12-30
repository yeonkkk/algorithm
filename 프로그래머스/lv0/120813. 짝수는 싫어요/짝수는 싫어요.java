class Solution {
    public int[] solution(int n) {
        int k = n / 2;

        if (n % 2 != 0) {
            k++;
        }

        int[] answer = new int[k];
        int current = 1;

        for (int i = 0; i < answer.length; i++) {
            answer[i] = current;
            current += 2;
        }

        return answer;
    }
}