class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int [] alpha = new int[26];
        int i = 0;
        char[] sarr = s.toCharArray();
        while (i < sarr.length) {
            alpha[sarr[i] - 'a']++;
            i++;
        }
        char[] tarr = t.toCharArray();
        i = 0;
        while (i < tarr.length) {
            alpha[tarr[i] - 'a']--;
            i++;
        }
        for (int a : alpha) {
            if (a != 0) {
                return false;
            }
        }
        return true;
    }
}
