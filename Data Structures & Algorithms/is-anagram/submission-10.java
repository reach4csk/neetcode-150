class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int i = 0;
        int [] alpha = new int[26];
        while (i < s.length()) {
            alpha[s.charAt(i) - 'a']++;
            i++;
        }
        i = 0;
        while (i < t.length()) {
            alpha[t.charAt(i) - 'a']--;
            i++;
        }
        for (int n : alpha) {
            if (n != 0) {
                return false;
            }
        }
        return true;
    }
}
