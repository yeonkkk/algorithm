import java.util.List;


class Solution {
    public long solution(String numbers) {
        List<String> number = List.of("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");

        for (String s : number) {
            if (numbers.contains(s)) {
                numbers = numbers.replace(s, String.valueOf(number.indexOf(s)));
            }
        }

        return Long.valueOf(numbers);
    }
}