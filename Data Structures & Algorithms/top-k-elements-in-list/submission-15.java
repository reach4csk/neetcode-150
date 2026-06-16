class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> nmap = new HashMap<>();
        for (int n : nums) {
            nmap.merge(n, 1, Integer::sum);
        }
        int[] fArr = nmap.entrySet().stream().sorted((o1, o2) -> 
        o2.getValue().compareTo(o1.getValue()))
        .mapToInt(Map.Entry::getKey).toArray();

        return Arrays.copyOf(fArr, k);
    }
}
