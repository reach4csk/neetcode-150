class Solution {
    public boolean isPalindrome(String s) {
        char[] carr = s.toCharArray();
        int len = carr.length;
        int l = 0, r = len - 1;
        while (l < r) {
            while (l < r && (carr[l] == ' ' || !isAlphaNumber(carr[l]))) {
                l++;
            }
            while (r > l && (carr[r] == ' ' || !isAlphaNumber(carr[r]))) {
                r--;
            }
            if (Character.toLowerCase(carr[l]) != Character.toLowerCase(carr[r])) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean isAlphaNumber(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') 
        || (c >= '0' && c <= '9');  
    }
}
