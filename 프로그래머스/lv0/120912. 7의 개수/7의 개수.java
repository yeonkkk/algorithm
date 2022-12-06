class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int num : array) {
            answer += counter(num);
        }
        
        return answer;
    }
    
    public int counter(int k) {
        int count = 0;
        while (k > 0) {
            if (k % 10 == 7) {
                count++;
            }
            k /= 10;
        }
        return count;
    }
}