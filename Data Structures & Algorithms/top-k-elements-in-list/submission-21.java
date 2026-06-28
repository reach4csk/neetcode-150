class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] kfreq = new int[k];
        Map<Integer, Integer> nmap = new HashMap<>();
        for (int n : nums) {
            nmap.merge(n, 1, Integer::sum);
        }
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : nmap.entrySet()) {
            int val = entry.getValue();
            if (bucket[val] == null) {
                bucket[val] = new ArrayList<>();
            }
            bucket[val].add(entry.getKey());
        }
        int i = 0;
        for (int freq = bucket.length - 1; freq >= 0 && i < k; freq--) {
            List<Integer> numList = bucket[freq];
            if (numList != null) {
                for (int num : numList) {
                    kfreq[i] = num;
                    i++;
                    if (i > k) {
                        break;
                    }
                }
            }
        }
        return kfreq;
    }
}
