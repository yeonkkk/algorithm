class Solution {
    
    public String solution(String number, int k) {
        int len = number.length() - k - 1;
        int startIdx = 0;
        StringBuilder result = new StringBuilder();

        while (0 <= len) {
            int idx = findMaxIdx(number, startIdx, number.length() - len);
            result.append(number.charAt(idx));
            startIdx = idx + 1;
            len--;
        }
        return result.toString();
    }

    private int findMaxIdx(String number, int startIdx, int endIdx) {
        int maxIdx = startIdx;
        int maxValue = number.charAt(startIdx);

        for (int i = startIdx; i < endIdx; i++) {
            int value = number.charAt(i);

            if (maxValue < value) {
                maxIdx = i;
                maxValue = value;
            }

            if (value == '9') {
                break;
            }
        }

        return maxIdx;
    }
}