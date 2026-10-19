import java.util.*;

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        // Step 1: Count each character
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Convert characters to a list
        List<Character> list = new ArrayList<>(map.keySet());

        // Step 3: Sort by frequency in descending order
        Collections.sort(list, (a, b) ->
            map.get(b) - map.get(a)
        );

        // Step 4: Build the answer
        StringBuilder result = new StringBuilder();

        for (char ch : list) {
            int count = map.get(ch);

            for (int i = 0; i < count; i++) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}