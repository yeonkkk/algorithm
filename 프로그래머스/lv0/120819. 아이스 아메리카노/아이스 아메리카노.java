class Solution {
    public static final int AMERICANO = 5_500;

    public int[] solution(int money) {
        int[] answer = new int[2];

        answer[0] = money / AMERICANO;
        answer[1] = money % AMERICANO;

        return answer;
    }
}