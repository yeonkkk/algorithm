class Solution {
    public int solution(int num, int k) {
int size = String.valueOf(num).length() + 1;
        int index = -1;
        int count = 0;

        while (num != 0) {
            count++;
            if (num % 10 == k) {
                index = count;
            }
            num /= 10;
        }
        if (index != -1) {
            index = size - index;
        }
        return index;
    }
}