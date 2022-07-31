import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sNums = br.readLine().split(" ");
        int[] nums = new int[sNums.length];
        for (int i = 0; i < nums.length; i++) nums[i] = Integer.parseInt(sNums[i]);
        Arrays.sort(nums);

        String result = "" + nums[0];
        for (int i = 1; i < nums.length; i++) result += " " + nums[i];

        bw.write(result);
        br.close();
        bw.close();
    }
}
