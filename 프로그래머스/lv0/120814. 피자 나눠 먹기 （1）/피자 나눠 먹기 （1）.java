class Solution {
    public static final int PIZZA_NUM = 7;

    public int solution(int n) {
        if (n % PIZZA_NUM == 0) {
            return n / PIZZA_NUM;
        }
        return n / PIZZA_NUM + 1;
    }
}