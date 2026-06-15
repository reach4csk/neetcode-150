class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> strMap = new HashMap<>();
        for(int i=0; i<strs.length; i++) {
            char[] cArr = strs[i].toCharArray();
            Arrays.sort(cArr);
            StringBuilder builder = new StringBuilder();
            Stream.of(cArr).forEach(str -> builder.append(str));
            String nStr = builder.toString();
            if (strMap.containsKey(nStr)) {
                List<String> innerList = strMap.get(nStr);
                innerList.add(strs[i]);
            } else {
                List<String> newlist = new ArrayList<>();
                newlist.add(strs[i]);
                strMap.put(nStr, newlist);
            }
        }
        return strMap.entrySet().stream().map(Map.Entry::getValue).toList();
    }
}
