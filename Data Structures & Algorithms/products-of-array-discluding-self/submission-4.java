class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int [] finalNum = new int[len];
        int i=0;
        while (i < len) {
            int prod = 1;
            int l = 0;
            int r = i+1;
            while (l < i) {
                prod = prod * nums[l];
                l++;
            }
            while (r < len) {
                prod = prod * nums[r];
                r++;
            }
            finalNum[i] = prod;
            i++;
        }
        return finalNum;
    }
}  
