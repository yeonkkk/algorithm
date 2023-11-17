import java.util.Arrays;

class Solution {
    public int solution(String dartResult) {
        dartResult = dartResult.replace("10", "!");
        int[] scores = new int[3];

        int idx = -1;
        for (char ch : dartResult.toCharArray()) {
            if (ch == '!') {
                idx++;
                scores[idx] = 10;
                continue;
            }

            if (Character.isDigit(ch)) {
                idx++;
                scores[idx] = Character.getNumericValue(ch);
                continue;
            }

            if (Character.isAlphabetic(ch)) {
                if (ch == 'D') {
                    scores[idx] = (int) Math.pow(scores[idx], 2);
                }

                if (ch == 'T') {
                    scores[idx] = (int) Math.pow(scores[idx], 3);
                }
                continue;
            }

            if (ch == '*') {
                scores[idx] = scores[idx] * 2;

                if (idx != 0) {
                    scores[idx - 1] = scores[idx - 1] * 2;
                }
            }

            if (ch == '#') {
                scores[idx] = -1 * scores[idx];
            }
        }

        return Arrays.stream(scores).sum();
    }
}