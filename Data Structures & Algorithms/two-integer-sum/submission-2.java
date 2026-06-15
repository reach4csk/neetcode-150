class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> nMap = new HashMap<>();
        int i=0;
        while (i <  nums.length) {
            if (nMap.containsKey(nums[i])) {
                return new int[] {nMap.get(nums[i]), i};
            }
            nMap.put(target - nums[i], i);
            i++;
        }
        return null;
    }
}
