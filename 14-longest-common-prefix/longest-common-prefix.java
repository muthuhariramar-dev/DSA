public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            // Keep reducing the prefix until it matches the start of the current string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    // \U0001f9ea Main method to test
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] input1 = {"flower", "flow", "flight"};
        String[] input2 = {"dog", "racecar", "car"};

        System.out.println("LCP of input1: " + solution.longestCommonPrefix(input1)); // Output: fl
        System.out.println("LCP of input2: " + solution.longestCommonPrefix(input2)); // Output: (empty)
    }
}
