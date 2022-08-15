import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> nums = new ArrayList();
        for (int i = 1; i <= n; i++) nums.add(i);

        bw.write("" + calculator(nums));
        br.close();
        bw.close();
    }

    public static int calculator(ArrayList<Integer> nums) {
        int t = 2;
        int idx = 0;
        int size = nums.size();
        if (size == 1) return 1;
        else {
            nums.remove(0);
            size--;
        }

        while (size > 1) {

            int k = (int) (Math.pow(t, 3) % size) - 1;
            k = (k < 0 ? k + size : k);

            idx += k;

            if (size <= idx) idx = idx - size;
            nums.remove(idx);
            t++;
            size--;

        }
        return nums.get(0);
    }
}
