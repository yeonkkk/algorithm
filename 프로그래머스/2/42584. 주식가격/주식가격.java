class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int currentPrice = prices[i];
            int count = 0;
            for (int j = i + 1; j < prices.length; j++) {
                int nextPrice = prices[j];
                count++;

                if (nextPrice < currentPrice) {
                    break;
                }
            }
            answer[i] = count;
        }

        return answer;
    }
}