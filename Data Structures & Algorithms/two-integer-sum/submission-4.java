class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> nMap = new HashMap<>();
        int i=0;
        while (i < nums.length) {
            int n = nums[i];
            int diff = target - n;
            if (nMap.containsKey(diff)) {
                return new int[] {nMap.get(diff), i};
            }
            nMap.put(n, i);
            i++;
        }
        return new int[0];
    }
}
