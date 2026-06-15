class Solution {
    public boolean hasDuplicate(int[] num) {
        final Set<Integer> numSet = new HashSet<>();
        int itr = 0;
        int len = num.length;
        while (itr < len) {
            if (numSet.contains(num[itr])) {
                return true;
            }
            numSet.add(num[itr]);
            itr++;
        }
        return false;
    }
}
