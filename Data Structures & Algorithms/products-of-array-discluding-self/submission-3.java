class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i=0;
        int len = nums.length;
        int [] finalNum = new int[len];
        while (i < len) {
            int prod = 1;
            int l=0;
            while (l<i) {
                prod = prod * nums[l];
                l++;
            }
            int r = i+1;
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
