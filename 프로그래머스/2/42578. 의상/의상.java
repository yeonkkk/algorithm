import java.util.HashMap;

public class Solution {

    private static final int CATEGORY_INDEX = 1;

    public int solution(String[][] clothes) {
        HashMap<String, Integer> categoryCounter = new HashMap<>();

        // defaultValue 1 -> 입지 않는 경우
        for (String[] clothe : clothes) {
            String category = clothe[CATEGORY_INDEX];
            categoryCounter.put(category, categoryCounter.getOrDefault(category, 1) + 1);
        }

        int total = categoryCounter.values().stream()
                .reduce(1, (subTotal, value) -> subTotal * value);

        // 전부 입지 않는 경우 제외
        return total - 1;
    }
}
