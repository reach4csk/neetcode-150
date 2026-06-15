class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        // Step 1 : create map
        const result = nums.reduce((acc ,item) => {
            if(acc[item]){
                acc[item]++
            }
            else{
                acc[item] = 1
            }
            return acc
        } ,{})

        // Step 2 : sort
        const sorted = Object.entries(result).sort((a , b) => b[1] - a[1])
        
        console.log(sorted)

        // Step 3 - get the first k
        return sorted.slice(0, k).map(entry => Number(entry[0])); // Convert keys to numbers
    
    }
}
