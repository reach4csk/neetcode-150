class Solution {
    public boolean isAnagram(String s, String t) {
        char [] sarr = s.toCharArray();
        char [] tarr = t.toCharArray();
        int [] alpha = new int [26];
        for (int i=0; i<sarr.length; i++) {
            alpha[sarr[i] - 'a']++;
        }
        for (int j=0; j<tarr.length; j++) {
            alpha[tarr[j] - 'a']--;
        }
        for (int n: alpha) {
            if (n !=0) {
                return false;
            }
        }
        return true;
    }
}
