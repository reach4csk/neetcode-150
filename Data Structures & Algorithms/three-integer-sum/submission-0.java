class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        if (num.length < 3) {
            return List.of();
        }
        List<List<Integer>> finList = new ArrayList<>();
        Arrays.sort(num);
        for (int i=0; i< num.length; i++) {
            if (i>0 && num[i]==num[i-1]) {
                continue;
            }
            int l=i+1, r=num.length-1;
            while (l<r) {
                int sum = num[i] + num[l] + num[r];
                if (sum > 0) {
                    r--;
                }
                if (sum < 0) {
                    l++;
                }
                if (sum==0) {
                    finList.add(List.of(num[i], num[l], num[r]));
                    l++;
                    r--;
                    while (l<r && num[l]==num[l-1]) {
                        l++;
                    }
                }
            }
        }
        return finList;
    }
}
