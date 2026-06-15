class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        int[] alph = new int[26];
        for (char c: sArr) {
            alph[c-'a']++;
        }
        char[] tArr = t.toCharArray();
        for(char f: tArr) {
            alph[f-'a']--;
        }
        for (int a: alph) {
            if (a != 0) {
                return false;
            }
        }
        return true;
    }
}
