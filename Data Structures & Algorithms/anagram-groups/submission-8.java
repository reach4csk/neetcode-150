class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> smap = new HashMap<>();
        for (String str : strs) {
            char[] carr = str.toCharArray();
            int[] arr = new int[26];
            for (char c : carr) {
                arr[c - 'a']++;
            }
            StringBuilder sbr = new StringBuilder();
            for (int n : arr) {
                sbr.append(n).append("#");
            }
            String s = sbr.toString();
            smap.computeIfAbsent(s, k -> new ArrayList<>()).add(str);
        }
        return smap.values().stream().toList();
    }
}
