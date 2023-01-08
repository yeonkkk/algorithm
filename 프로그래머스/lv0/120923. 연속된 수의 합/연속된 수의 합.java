class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int firstValue = total / num;
        int lastValue = total % num == 0 ? num / 2 : num / 2 - 1;
        int finalValue = firstValue - lastValue;

        for (int i = 0; i < num; i++) {
            answer[i] = finalValue;
            finalValue++;
        }

        return answer;
    }
}