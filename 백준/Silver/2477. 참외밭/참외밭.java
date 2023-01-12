import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    private static final int ANGLE_NUMBER = 6;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int[] nums = new int[ANGLE_NUMBER];
        int maxWidthIndex = -1;
        int maxHeightIndex = -1;

        for (int i = 0; i < ANGLE_NUMBER; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int dir = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            nums[i] = value;

            if (dir == 1 || dir == 2) {
                if (maxWidthIndex == -1 || nums[maxWidthIndex] < value) {
                    maxWidthIndex = i;
                }
                continue;
            }

            if (maxHeightIndex == -1 || nums[maxHeightIndex] < value) {
                maxHeightIndex = i;
            }
        }

        int diffWidth = calculateDiff(maxHeightIndex, nums);
        int diffHeight = calculateDiff(maxWidthIndex, nums);

        int result = (nums[maxHeightIndex] * nums[maxWidthIndex] - diffHeight * diffWidth) * k;
        System.out.println(result);
    }

    private static int calculateDiff(int index, int[] nums) {
        int diff = 0;
        if (index == 0) {
            diff = Math.abs(nums[nums.length - 1] - nums[1]);
        } else if (index == nums.length - 1) {
            diff = Math.abs(nums[0] - nums[index - 1]);
        } else {
            diff = Math.abs(nums[index - 1] - nums[index + 1]);
        }
        return diff;
    }
}