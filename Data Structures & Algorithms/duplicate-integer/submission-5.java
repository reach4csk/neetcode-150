class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> nSet = new HashSet<>();
        for(int n: nums) {
            if (nSet.contains(n)) {
                return true;
            }
            nSet.add(n);
        }
        return false;
    }
}
