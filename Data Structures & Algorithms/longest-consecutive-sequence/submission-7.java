class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> nSet = new HashSet<>();
        for (int n : nums) {
            nSet.add(n);
        }
        int max = 0;
        for (int num : nSet) {
            if (!nSet.contains(num - 1)) {
                int right = num + 1, rcount = 1;
                while(nSet.contains(right)) {
                    rcount++;
                    right++;
                }
                max = Math.max(max, rcount);
            }
        } 
        return max;
    }
}
