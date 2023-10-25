import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        while (!input.equals("0")) {
            List<Integer> nums1 = Arrays.stream(input.split(" "))
                    .map(Integer::valueOf)
                    .collect(Collectors.toList());
            List<Integer> nums2 = Arrays.stream(reader.readLine().split(" "))
                    .map(Integer::valueOf)
                    .collect(Collectors.toList());

            System.out.println(execute(nums1, nums2));

            input = reader.readLine();
        }
    }

    private static int execute(List<Integer> nums1, List<Integer> nums2) {
        List<Integer> firstNums = nums1.subList(1, nums1.size());
        List<Integer> secondNums = nums2.subList(1, nums2.size());

        List<Integer> common = firstNums.stream()
                .filter(secondNums::contains)
                .collect(Collectors.toList());

        int result = 0;
        int firstIdx = 0;
        int secondIdx = 0;

        for (Integer num : common) {
            int newFirstIdx = firstNums.indexOf(num);
            int newSecondIdx = secondNums.indexOf(num);

            int firstSum = firstNums.subList(firstIdx, newFirstIdx).stream().mapToInt(Integer::valueOf).sum();
            int secondSum = secondNums.subList(secondIdx, newSecondIdx).stream().mapToInt(Integer::valueOf).sum();

            result += Math.max(firstSum, secondSum);

            firstIdx = newFirstIdx;
            secondIdx = newSecondIdx;
        }

        int firstSum = firstNums.subList(firstIdx, firstNums.size()).stream().mapToInt(Integer::valueOf).sum();
        int secondSum = secondNums.subList(secondIdx, secondNums.size()).stream().mapToInt(Integer::valueOf).sum();

        result += Math.max(firstSum, secondSum);

        return result;
    }
}
