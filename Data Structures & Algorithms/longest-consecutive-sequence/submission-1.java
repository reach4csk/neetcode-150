class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int i=0, expected=nums[i], seqCounter=0, result=0, len=nums.length;
        while (i < len) {
            if (expected != nums[i]) {
                expected = nums[i];
                seqCounter = 0;
            }
            while (i < len && expected == nums[i]) {
                i++;
            }
            seqCounter++;
            expected++;
            result = Math.max(result, seqCounter);
        }
        return result;
    }
}
