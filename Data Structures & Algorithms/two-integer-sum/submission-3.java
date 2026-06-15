class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> nMap = new HashMap<>();
        int i = 0;
        int len = nums.length;
        while (i < len) {
            int num = nums[i];
            int diff = target - num;
            if (nMap.containsKey(diff)) {
                return new int [] {nMap.get(diff), i};
            }
            nMap.put(num, i);
            i++;
        }
        return new int [0];
    }
}
