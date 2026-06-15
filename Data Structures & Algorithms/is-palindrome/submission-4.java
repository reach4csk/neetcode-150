class Solution {
    public boolean isPalindrome(String s) {
        char [] sarr = s.toCharArray();
        StringBuilder sbr = new StringBuilder();
        for (char c : sarr) {
            if (isAlphaNum(c)) {
                sbr.append(c);
            }
        }
        StringBuilder revSbr = new StringBuilder();
        for (int i=sarr.length-1; i >=0; i--) {
            if (isAlphaNum(sarr[i])) {
                revSbr.append(sarr[i]);
            }
        }
        return revSbr.toString().toLowerCase()
        .contentEquals(sbr.toString().toLowerCase());
    }

    private static boolean isAlphaNum (char c) {
        return (c >= 'a' && c <= 'z')
                || (c >= 'A' && c <= 'Z')
                || (c >= '0' && c <= '9');
    }
}
