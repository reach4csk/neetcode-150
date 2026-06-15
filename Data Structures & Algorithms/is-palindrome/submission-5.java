class Solution {
    public boolean isPalindrome(String s) {
        char[] carr = s.toCharArray();
        String st = "";
        for (char c : carr) {
            if (c != ' ' && isAplhaNum(c)) {
                st += String.valueOf(c);
            }
        }
        String str = "";
        int i = carr.length-1;
        while (i >=0) {
            if (carr[i] != ' ' && isAplhaNum(carr[i])) {
                str += String.valueOf(carr[i]);
            }
            i--;
        }
        return st.toLowerCase().equals(str.toLowerCase());
    }
    private boolean isAplhaNum(char c) {
        return c >= 'a' && c <= 'z' 
        || c >= 'A' && c <= 'Z' 
        || c >= '0' && c <= '9'; 
    }
}
