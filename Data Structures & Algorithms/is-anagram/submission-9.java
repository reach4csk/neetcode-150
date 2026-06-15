class Solution {
    public boolean isAnagram(String s, String t) {
        char[] farr = s.toCharArray();
        char[] sarr = t.toCharArray();
        Arrays.sort(farr);
        Arrays.sort(sarr);
        int i = 0;
        if (farr.length != sarr.length) {
            return false;
        }
        while (i < farr.length) {
            if (farr[i] != sarr[i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
