class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numerator = numer1 * denom2 + numer2 * denom1;
        int denominator = denom1 * denom2;
        int gcd = 1;

        for (int i = 1; i <= numerator; i++) {
            if (numerator % i == 0 & denominator % i == 0) {
                gcd = i;
            }
        }

        return new int[]{numerator / gcd, denominator / gcd};
    }
}