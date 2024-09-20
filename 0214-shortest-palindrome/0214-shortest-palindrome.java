class Solution {
    public String shortestPalindrome(String s) {
        // Reverse the original string
        String reversed = new StringBuilder(s).reverse().toString();
        
        // Find the longest palindromic prefix
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(0, s.length() - i).equals(reversed.substring(i))) {
                // Append the non-matching part of the reversed string to the front
                return reversed.substring(0, i) + s;
            }
        }
        
        // If the string is already a palindrome
        return s;
    }
}