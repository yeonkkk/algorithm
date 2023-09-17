import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int i = score.length - m;
        int result = 0;
        while (i >= 0) {
            result += score[i];
            i = i - m;
        }
        
        return result * m;
    }
}