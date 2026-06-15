class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] f = new int[nums.length];
        int[] cop = Arrays.copyOf(nums, nums.length);
        int prod = 1;
        for(int i=0; i< nums.length; i++) {
            int temp = cop[i];
            cop[i] = 1;
            prod = IntStream.of(cop).reduce(1, (v1, v2) -> v1*v2);
            cop[i] = temp;
            f[i] = prod;
        }
        return f;
    }
}  
