class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> nset = new HashSet<>();
        for (int n : nums) {
            nset.add(n);
        }

        int max = 0;
        int i = 0;
        int len = nums.length;
        while (i < len) {
            int lcount = 0, rcount = 0;
            int left = nums[i] - 1;
            while (nset.contains(left)) {
                lcount++;
                left--;
            }
            int right = nums[i] + 1;
            while (nset.contains(right)) {
                rcount++;
                right++;
            }
            max = Math.max(max, (lcount + rcount + 1));
            i++;
        }
        return max;
    }
}
