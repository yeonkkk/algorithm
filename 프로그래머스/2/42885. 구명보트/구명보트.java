import java.util.Arrays;

class Solution {

    public int solution(int[] people, int limit) {
        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;
        int boatCount = 0;

        while (left <= right) {
            int weightSum = people[left] + people[right];

            if (weightSum <= limit) {
                left++;
            }

            right--;
            boatCount++;
        }

        return boatCount;
    }
}
