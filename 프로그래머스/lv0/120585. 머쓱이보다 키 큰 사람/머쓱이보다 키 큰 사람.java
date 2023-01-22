import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        return (int) Arrays.stream(array)
                .filter(x -> height < x)
                .count();
    }
}