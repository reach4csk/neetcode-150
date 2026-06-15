class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        const res = nums.reduce((acc, item)=> {
            if(acc[item]){
                acc[item]++
            }
            else{
                acc[item] = 1
            }
            return acc
        },{})

        // Step 2 - reverse Sort
        const sorted = Object.entries(res).sort((a,b) => b[1] - a[1])

        // Step 3 - Extract the k elements
        return Object.values(sorted).slice(0,k).map(item => Number(item[0]))


    }
}
