class Solution {
    /**
     * @param {string[]} strs
     * @returns {string}
     */
    encode(strs) {
        const result = strs.reduce((acc ,item) => {
            const encoded = item.length + '#' + item
            return [...acc , encoded]
        },[])
        return result.join('')
    }

    /**
     * @param {string} str
     * @returns {string[]}
     */
     decode(str) {
        // Split the string by '#', remove any empty string at the end
        let i = 0;
        const result = []
        while(i < str.length)
        {
            let j = i
            while(str[j] !== '#'){
                j++
            }

            const length = Number(str.slice(i, j));
            result.push(str.slice(j+1 , j + 1+ length))

            i = j + 1 + length
        }
        return result

    }
}
