class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();

        // Check if the needle is empty, if so return 0 (edge case)
        if (n == 0) {
            return 0;
        }

        for (int i = 0; i <= m - n; i++) {
            // Compare the substring with needle
            if (haystack.substring(i,i+n).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}