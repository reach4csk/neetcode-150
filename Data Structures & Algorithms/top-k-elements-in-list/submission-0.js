class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        const result = nums.reduce((acc , items) => {
            if(acc[items]){
                acc[items]++
            }
            else{
                acc[items] = 1
            }
            return acc
        },{})

        // Step 2 : Sort descending
        const sorted = Object.entries(result).sort((a,b) => b[1] - a[1])

        // Step 3 : slice
        return sorted.slice(0 ,k).map(item => Number(item[0]))
    }
}
