class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> nSet = new HashSet<>();
        int i=0;
        while (i < nums.length) {
            if (nSet.contains(nums[i])) {
                return true;
            }
            nSet.add(nums[i]);
            i++;
        }
        return false;
    }
}
