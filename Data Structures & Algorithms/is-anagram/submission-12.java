class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int [] arr = new int[26];
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        for (char c : sarr) {
            arr[c - 'a']++;
        }
        for (char c : tarr) {
            arr[c - 'a']--;
        }
        for (int n : arr) {
            if (n != 0) {
                return false;
            }
        }
        return true;
    }
}
