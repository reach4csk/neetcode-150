class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        let count = 1
        const freqMap = nums.reduce((acc, item) => {
           if(acc[item]){
            acc[item] = ++count
           }  
           acc[item] = count

           return acc
        } ,{})

        return Object.values(freqMap).some(num => num > 1)
    }
}

