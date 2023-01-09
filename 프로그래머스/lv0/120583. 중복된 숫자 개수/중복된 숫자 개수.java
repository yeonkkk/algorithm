class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;

        for (int element : array) {
            if (element == n) {
                answer++;
            }
        }

        return answer;
    }
}