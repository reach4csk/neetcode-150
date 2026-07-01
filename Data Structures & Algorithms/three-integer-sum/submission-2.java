class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int head = 0; head < len - 2; head++) {
            if (head > 0 && nums[head] == nums[head - 1]) {
                continue;
            }
            int l = head + 1, r = len - 1;
            while (l < r) {
                int sum = nums[head] + nums[l] + nums[r];
                if (sum == 0) {
                    List<Integer> in = new ArrayList<>();
                    in.add(nums[head]);
                    in.add(nums[l]);
                    in.add(nums[r]);
                    result.add(in);
                    l++; r--;
                    while (l<r && nums[l] == nums[l-1]) {
                        l++;
                    }
                    while (r>l && nums[r] == nums[r+1]) {
                        r--;
                    }
                } else if (sum > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return result;
    }
}
