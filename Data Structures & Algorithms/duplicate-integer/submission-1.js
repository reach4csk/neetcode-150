class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        const result = nums.reduce((acc , items) => {
            if(acc[items]){
                acc[items]++
            }
            else{
            acc[items] = 1
            }
            return acc
        } , {})

        return Object.values(result).some(item => item > 1)
    }
}
