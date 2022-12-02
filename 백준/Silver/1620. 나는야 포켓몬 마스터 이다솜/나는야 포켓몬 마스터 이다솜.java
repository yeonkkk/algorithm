import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * BOJ 1620. 나는야 포켓몬 마스터 이다솜
 */
public class Main {
    /**
     * n : 도감에 수록되어 있는 포켓몬의 개수
     * m : 맞춰야하는 문제의 수
     * pokemons : 포켓몬 도감
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> pokemonsByStr = new HashMap<>();
        Map<Integer, String> pokemonsByNum = new HashMap<>();

        // 도감 입력 받기
        for (int i = 1; i <= n; i++) {
            String input = br.readLine();
            pokemonsByStr.put(input, i);
            pokemonsByNum.put(i, input);
        }

        // 문제 풀기
        for (int i = 0; i < m; i++) {
            solve(pokemonsByStr, pokemonsByNum, br.readLine());
        }
    }

    /**
     * @param pokemonsByStr : 포켓몬 도감 맵 (key 가 포켓몬명)
     * @param pokemonsByNum : 포켓몬 도감 맵 (key 가 포켓몬 번호)
     * @param problem: 문제의 입력 값 (포켓몬 이름 또는 포켓몬 번호)
     *
     * problem 이 영문이면 인덱스 번호 + 1을 출력하고, 그게 아니라면 번호 - 1 을 인덱스로 하여 도감에서 포켓몬을 찾아 출력한다.
     */
    public static void solve(Map<String, Integer> pokemonsByStr, Map<Integer, String> pokemonsByNum, String problem) {
        if (Character.isAlphabetic(problem.charAt(0))) {
            System.out.println(pokemonsByStr.get(problem));
            return;
        }
        System.out.println(pokemonsByNum.get(Integer.parseInt(problem)));
    }
}
