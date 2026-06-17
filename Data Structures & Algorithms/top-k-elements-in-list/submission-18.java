class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> nmap = new HashMap<>();
        for (int n : nums) {
            nmap.merge(n, 1, Integer::sum);
        }
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : nmap.entrySet()) {
            int freq = entry.getValue();
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(entry.getKey());
        }
        int [] result = new int[k];
        int i = 0;
        for (int f=bucket.length-1; f >= 1 && i < k; f--) {
            List<Integer> num = bucket[f];
            if (num != null) {
                for (int n : num) {
                    result[i] = n;
                    i++;
                    if (i == k) {
                    break;
                    }
                }
            }
        }
        return result;
    }
}
