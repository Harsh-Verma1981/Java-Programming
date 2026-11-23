import java.util.*;
import java.util.Map;

public class InputSample {

    public static String frequencySort(String s) {
        // 1. Count frequencies using a HashMap
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // 2. Put unique characters into a List
        List<Character> chars = new ArrayList<>(freqMap.keySet());

        // 3. Sort: Primary = Frequency (High to Low), Secondary = Alphabetical (a to z)
        Collections.sort(chars, (a, b) -> {
            int freqCompare = freqMap.get(b) - freqMap.get(a); // Descending frequency
            if (freqCompare == 0) {
                return a - b; // Tie-breaker: Ascending lexicographical ('a' before 'b')
            }
            return freqCompare;
        });

        // 4. Build the final string
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            int count = freqMap.get(c);
            for (int i = 0; i < count; i++) {
                result.append(c);
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the input: ");
        String input = sc.nextLine();// tree || cccaabbb

        String sortedOutput = frequencySort(input);
        System.out.print("Sorted output: ");
        System.out.println(sortedOutput);

        sc.close();
    }
}