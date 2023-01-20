class Solution {
    private static final int FREE_DRINK_STANDARD = 10;
    private static final int DINNER_PRICE = 12_000;
    private static final int DRINK_PRICE = 2_000;
    
    public int solution(int n, int k) {
        int answer = 0;
        answer += n * DINNER_PRICE;
        answer += (k - n / FREE_DRINK_STANDARD >= 0 ? k - n / FREE_DRINK_STANDARD : 0) * DRINK_PRICE;
        return answer;
    }
}