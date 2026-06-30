class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int head = 0; head < len - 2; head++) {
            if (head > 0 && nums[head] == nums[head - 1]) {
                continue;
            }
            int left = head + 1, right = len - 1;
            while (left < right) {
                int headVal = nums[head], leftVal = nums[left], rightVal = nums[right];
                int sum = headVal + leftVal + rightVal;
                if (sum == 0) {
                    List<Integer> inner = new ArrayList<>();
                    inner.add(headVal);
                    inner.add(leftVal);
                    inner.add(rightVal);
                    result.add(inner);
                    left++; right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (right > left && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;
    }
}
