class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int i = 0;
        int [] output = new int[len];
        while (i < len) {
            int j = 0;
            int result = 1;
            while (j < len) {
                if (i != j) {
                    result = result * nums[j];
                }
                j++;
            }
            output[i] = result;
            i++;
        }
        return output;
    }
}  
