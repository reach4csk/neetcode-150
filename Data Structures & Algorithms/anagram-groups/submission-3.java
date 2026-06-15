class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> strMap = new HashMap<>();
        for(int i=0; i<strs.length; i++) {
            char[] cArr = strs[i].toCharArray();
            Arrays.sort(cArr);
            String nStr = new String(cArr);
            strMap.computeIfAbsent(nStr, s -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(strMap.values());
    }
}
