import java.util.HashSet;
import java.util.Set;

public class Solution {

    private final Set<Integer> newNumbers = new HashSet<>();

    public int solution(String numbers) {
        char[] nums = numbers.toCharArray();
        boolean[] visited = new boolean[nums.length];

        permutation(visited, 0, nums, "");

        return (int) newNumbers.stream()
                .filter(this::isPrimeNumber)
                .count();
    }

    private void permutation(boolean[] visited, int depth, char[] nums, String currentNumber) {
        if (depth >= nums.length) {
            // 종료 조건
            return;
        }

        for (int i = 0; i <nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                String newNumber = currentNumber + nums[i];

                newNumbers.add(Integer.parseInt(newNumber));

                permutation(visited, depth + 1, nums, newNumber);
                visited[i] = false;
            }
        }
    }

    private boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
