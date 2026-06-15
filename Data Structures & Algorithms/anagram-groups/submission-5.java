class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> strMap = new HashMap<>();
        for (String str: strs) {
            char[] sArr = str.toCharArray();
            Arrays.sort(sArr);
            String s = new String(sArr);
            if (strMap.containsKey(s)) {
                List<String> sList = strMap.get(s);
                sList.add(str);
                strMap.put(s, sList);
            } else {
                List<String> sList = new ArrayList<>();
                sList.add(str);
                strMap.put(s, sList);
            }
        }
        return strMap.values().stream().toList();
    }
}
