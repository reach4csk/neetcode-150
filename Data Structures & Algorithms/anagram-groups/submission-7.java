class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> smap = new HashMap<>();
        for (String str : strs) {
            char[] carr = str.toCharArray();
            int[] alphaArr = new int[26];
            for (char c : carr) {
                alphaArr[c - 'a']++;
            }
            StringBuilder sbr = new StringBuilder();
            for (int count : alphaArr) {
                sbr.append(count).append("#");
            }
            String s = sbr.toString();
            smap.computeIfAbsent(s, k -> new ArrayList<>()).add(str);
        }
        return smap.values().stream().toList();
    }
}
