class Solution {
    public int maxArea(int[] heights) {
        int len = heights.length;
        int l = 0, r = len - 1;
        int max = 0;
        while (l < r) {
            int size = (r - l) * (Math.min(heights[l], heights[r]));
            max = Math.max(max, size);
            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}
