public class Main {
    private final static int LIMIT = 10000;
    public static boolean[] check = new boolean[LIMIT + 1];

    public static void main(String[] args) {
        for (int i = 1; i < LIMIT; i++) {
            d(i);
        }

        for (int i = 1; i <= LIMIT; i++) {
            if (!check[i]) {
                System.out.println(i);
            }
        }
    }

    public static void d(int n) {
        int result = n;

        while (n != 0) {
            result += (n % 10);
            n /= 10;
        }

        if (result <= LIMIT) check[result] = true;
    }
}