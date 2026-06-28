class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l=0, r=0, head=0;
        int len = nums.length;
        int[] result = new int[len];
        while (head < len) {
            int left=1, right=1;
            l = head - 1;
            r = head + 1;
            while (l >= 0) {
                left *= nums[l];
                l--;
            }
            while (r < len) {
                right *= nums[r];
                r++;
            }
            result[head] = left * right;
            head++;
        }
        return result;
    }
}  
