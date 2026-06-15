class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupString = new HashMap<>();
        for (String str: strs) {
            char [] sarr = str.toCharArray();
            Arrays.sort(sarr);
            String s = new String(sarr);
            groupString.computeIfAbsent(s, st -> new ArrayList<>()).add(str);
        }
        return groupString.entrySet().stream().map(Map.Entry::getValue).toList();
    }
}
