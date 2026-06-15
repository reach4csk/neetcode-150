class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] freq = new int[26];
        char[] fArr = s.toCharArray();
        char[] sArr = t.toCharArray();
        for (char c: fArr) {
            freq[c - 'a']++;
        }
        for (char c: sArr) {
            freq[c - 'a']--;
            if (freq[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
