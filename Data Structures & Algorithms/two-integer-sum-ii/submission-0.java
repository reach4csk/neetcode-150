class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> sumMap = new HashMap<>();
        int i=0;
        while (i < numbers.length) {
            int n = numbers[i];
            int diff = target - n;
            if (sumMap.containsKey(diff)) {
                int [] finArr = new int[] {sumMap.get(diff), i+1};
                return finArr;
            } else if (n != diff) {
                sumMap.put(n, i+1);
            }
            i++;
        }
        return new int[0];
    }
}
