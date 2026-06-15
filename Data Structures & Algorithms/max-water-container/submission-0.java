class Solution {
    public int maxArea(int[] num) {
        if (num.length <= 1) {
            return 0;
        }
        int l=0, r=num.length-1;
        int volume=0;
        while (l < r) {
            int height = Math.min(num[l], num[r]);
            int result = height * (r-l);
            volume = Math.max(result, volume);
            if (num[l] <= num[r]) {
                l++;
            } else {
                r--;
            }
        }
        return volume;
    }
}
