import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = reader.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);

        String[] secondLine = reader.readLine().split(" ");
        int[] cards = new int[secondLine.length];
        for (int i = 0; i < secondLine.length; i++) {
            cards[i] = Integer.parseInt(secondLine[i]);
        }

        System.out.println(solution(N, M, cards));
    }

    private static int solution(int N, int M, int[] cards) {
        int answer = 0;
        int subTotal, total;
        int firstNum, secondNum, thirdNum;

        for (int i = 0; i < N; i++) {
            firstNum = cards[i];

            for (int j = i + 1; j < N; j++) {
                secondNum = cards[j];

                subTotal = firstNum + secondNum;

                if (subTotal >= M) {
                    continue;
                }

                for (int k = j + 1; k < N; k++) {
                    thirdNum = cards[k];
                    total = subTotal + thirdNum;

                    if (total > M) {
                        continue;
                    }

                    answer = Math.max(answer, total);
                }
            }
        }

        return answer;
    }
}

/**
 * [상황]
 * N장의 카드
 * 딜러가 M 선언
 * 플레이어는 N장의 카드 중 3장 선택
 * 
 * [요구사항]
 * 카드 N장 중 합이 M을 넘지 않으면서 최대한 가까운 3장 고르기
 */