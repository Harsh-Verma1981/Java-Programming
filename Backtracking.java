import java.util.*;

class Solution {

    static Map<Character, String> map = new HashMap<>();

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits.length() == 0) return result;

        // Mapping
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        solve(digits, 0, "", result);

        return result;
    }

    private void solve(String digits, int index, String current, List<String> result) {

        // Base Case
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        String letters = map.get(digits.charAt(index));

        for (char ch : letters.toCharArray()) {
            // Choose
            current += ch;

            // Explore
            solve(digits, index + 1, current, result);

            // Backtrack
            current = current.substring(0, current.length() - 1);
        }
    }
          }
