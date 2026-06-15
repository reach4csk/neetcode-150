class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] f = new int[nums.length];
        int prod = 1;
        for(int i=0; i< nums.length; i++) {
            int[] cop = Arrays.copyOf(nums, nums.length);
            cop[i] = 1;
            prod = IntStream.of(cop).reduce(1, (v1, v2) -> v1*v2);
            f[i] = prod;
        }
        return f;
    }
}  
