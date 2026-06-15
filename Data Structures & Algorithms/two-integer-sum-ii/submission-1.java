class Solution {
    public int[] twoSum(int[] num, int t) {
        int l=0, r= num.length-1;
        while (l < r) {
            int sum = num[l] + num[r];
            if (sum > t) {
                r--;
            }
            if (sum < t) {
                l++;
            }
            if (sum == t && num[l] != num[r]) {
                return new int[] {l+1, r+1};
            }
        }
        return new int[0];
    }
}
