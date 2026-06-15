class Solution {
    /**
     * @param {string[]} strs
     * @returns {string}
     */
    encode(strs) {
        const result = strs.reduce((acc,item) => {
            return [...acc , item.length + '#' , item]
        } ,[])
        return result.join('')
    }

    /**
     * @param {string} str
     * @returns {string[]}
     */
    decode(str) {
        let i = 0
        const result = []

        while(i< str.length){
            let j = i
            while(str[j] !== '#'){
                j++
            }
           

            // Step1 : Parse the length
            const len = Number(str.slice(i,j))
            // Step2 : Get the actual string
            const actual = str.slice(j+1 , j+1+len)
            result.push(actual)

            // Step3: Increament i
            i = j + 1 + len

        }
        return result
        
    }
}
