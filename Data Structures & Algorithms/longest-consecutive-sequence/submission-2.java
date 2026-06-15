class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int n: nums) {
            numSet.add(n);
        }
        int length = 0;
        int i = 0;
        int len = nums.length;
        while (i < len) {
            if (numSet.contains(nums[i] - 1)) {
                i++;
                continue;
            }
            int streak = 0;
            while (numSet.contains(nums[i] + streak)) {
                streak++;
            }
            length = Math.max(length, streak);
            i++;
        }
        return length;
    }
}
