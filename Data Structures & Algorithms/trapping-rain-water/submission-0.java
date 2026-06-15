class Solution {
    public int trap(int[] num) {
        int l=0, r=num.length-1, res=0;
        int leftMax=num[l], rightMax=num[r];
        while (l<r) {
            if (leftMax < rightMax) {
                l++;
                leftMax = Math.max(leftMax, num[l]);
                res += leftMax-num[l];
            } else {
                r--;
                rightMax = Math.max(rightMax, num[r]);
                res += rightMax-num[r];
            }
        }
        return res;
    }
}
