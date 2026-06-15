class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> nMap = new HashMap<>();
        for (int n: nums) {
            if (nMap.containsKey(n)) {
                nMap.put(n, nMap.get(n)+1);
            } else {
                nMap.put(n, 1);
            }
        }
        int[] nArr = nMap.entrySet().stream().sorted((o1, o2) -> 
        o2.getValue().compareTo(o1.getValue()))
        .mapToInt(Map.Entry::getKey).toArray();

        return Arrays.copyOf(nArr, k);
    }
}
