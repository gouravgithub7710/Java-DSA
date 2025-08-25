import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0; 
        int maxLen = 0;

        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);

            // agar char repeat hua toh start update karo
            if (map.containsKey(ch)) {
                // start ko maximum rakho, piche mat le jao
                start = Math.max(start, map.get(ch) + 1);
            }

            // update latest index of character
            map.put(ch, end);

            // window length = end - start + 1
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }
}
