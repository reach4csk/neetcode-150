class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> nset = new HashSet<>();
        for (int n : nums) {
            if (nset.contains(n)) {
                return true;
            }
            nset.add(n);
        }
        return false;
    }
}