class Solution {
    public boolean isPalindrome(String str) {
        int l = 0;
        int r = str.length() - 1;
        while (l < r) {
            while (l<r && !isAlphaNum(str.charAt(l))) {
                l++;
            }
            while (r>l && !isAlphaNum(str.charAt(r))) {
                r--;
            }
            if (Character.toLowerCase(str.charAt(l)) != Character.toLowerCase(str.charAt(r))) {
                return false;
            }
            l++; r--;
        }
        return true;
    }

    public static boolean isAlphaNum (char c) {
        return (c >= 'A' && c <= 'Z')
                || (c >= 'a' && c<= 'z')
                || (c >= '0' && c<= '9');
    }
}
