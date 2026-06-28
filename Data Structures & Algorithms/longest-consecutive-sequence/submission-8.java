class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> nset = new HashSet<>();
        for (int n : nums) {
            nset.add(n);
        }
        int max = 0;
        for (int num : nset) {
            if (!nset.contains(num - 1)) {
                int r = num + 1, rcount = 1;
                while (nset.contains(r)) {
                    rcount++;
                    r++;
                }
                max = Math.max(max, rcount);
            }
        }
        return max;
    }
}
