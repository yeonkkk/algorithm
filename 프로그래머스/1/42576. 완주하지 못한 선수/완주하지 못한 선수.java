import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {

    public String solution(String[] participant, String[] completion) {
        StringBuilder result = new StringBuilder();
        Map<String, Integer> participantsCount = getParticipantsCount(participant);

        for (String name : completion) {
            Integer nameCount = participantsCount.getOrDefault(name, 0);

            if (nameCount == 0) {
                result.append(name);
                break;
            }

            participantsCount.put(name, nameCount - 1);
        }

        for (Entry<String, Integer> entry : participantsCount.entrySet()) {
            if ((result.length() == 0) && (entry.getValue() == 1)) {
                result.append(entry.getKey());
                break;
            }
        }
        return result.toString();
    }

    private static Map<String, Integer> getParticipantsCount(String[] participant) {
        Map<String, Integer> participantsCount = new HashMap<>();

        for (String name : participant) {
            participantsCount.put(name, participantsCount.getOrDefault(name, 0) + 1);
        }
        return participantsCount;
    }
}
