class Solution {
    public int maxProfit(int[] num) {
        int l=0, r=1, profit=0;
        while (r < num.length) {
            if (num[r] > num[l]) {
                int res = num[r] - num[l];
                profit = Math.max(profit, res);
            } else {
                l=r;
            }
            r++;
        }
        return profit;
    }
}
