class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> nMap = new HashMap<>();
        int i =0;
        int len = nums.length;
        for (int n : nums) {
            if (nMap.containsKey(n)) {
                nMap.put(n, nMap.get(n) + 1);
            } else {
                nMap.put(n, 0);
            }
        }
        int [] arr = nMap.entrySet().stream().sorted((o1, o2) ->
                        o2.getValue().compareTo(o1.getValue()))
                .mapToInt(Map.Entry::getKey).toArray();

        int[] num = new int[k];
        int j = 0;
        do {
            num[j] = arr[j];
            j++;
        } while (j < k);
        return num;
    }
}
