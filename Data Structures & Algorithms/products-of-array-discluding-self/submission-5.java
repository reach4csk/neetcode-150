class Solution {
    public int[] productExceptSelf(int[] nums) {
        int head = 0;
        int left = 0, right = 0;
        int len = nums.length;
        int [] finalArr = new int[len];
        while (head < len) {
            left = head - 1;
            right = head + 1;
            int leftPrd = 1;
            int rightPrd = 1;
            while (left >= 0) {
                leftPrd *= nums[left];
                left--;
            }
            while (right < len) {
                rightPrd *= nums[right];
                right++;
            }
            finalArr[head] = leftPrd * rightPrd;
            head++;
        }
        return finalArr;
    }
}  
