class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> nmap = new HashMap<>();
        int len = nums.length;
        int i = 0;
        while (i < len) {
            int n = nums[i];
            int diff = target - n;
            if (nmap.containsKey(diff)) {
                return new int[] {nmap.get(diff), i};
            }
            nmap.put(n, i);
            i++;
        }
        return new int[0];
    }
}
