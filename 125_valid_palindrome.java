class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        
        while (left < right) {
            // Agar left character letter ya digit nahi hai, to skip karo
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Agar right character letter ya digit nahi hai, to skip karo
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Agar characters equal nahi hain (case-insensitive), to false return karo
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            // Move both pointers
            left++;
            right--;
        }

        return true;
    }
}