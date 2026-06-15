class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> nMap = new HashMap<>();
        for (int n : nums) {
            nMap.merge(n, 0, (oldVal, newVal) -> oldVal +1);
        }
        int[] array = nMap.entrySet().stream()
                .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                .mapToInt(Map.Entry::getKey).toArray();
        return Arrays.copyOf(array, k);
    }
}
