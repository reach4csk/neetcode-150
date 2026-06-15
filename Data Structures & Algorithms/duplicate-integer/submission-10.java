class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numset = new HashSet<>();
        int i = 0;
        while (i < nums.length) {
            if (numset.contains(nums[i])) {
                return true;
            }
            numset.add(nums[i]);
            i++;
        }
        return false;
    }
}