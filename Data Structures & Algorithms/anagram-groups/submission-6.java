class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anMap = new HashMap<>();
        for (String str : strs) {
            char[] sarr = str.toCharArray();
            int[] countArr = new int[26];
            for(char c : sarr) {
                countArr[c - 'a']++;
            }
            StringBuilder sbr = new StringBuilder();
            for (int n : countArr) {
                sbr.append(n).append("#");
            }
            String s = sbr.toString();
            anMap.computeIfAbsent(s, k -> new ArrayList<>()).add(str);
        }
        return anMap.values().stream().toList();
    }
}
