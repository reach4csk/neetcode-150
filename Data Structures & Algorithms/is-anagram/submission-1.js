class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        const x = s.split('').sort().join('')
        const y = t.split('').sort().join('')

        return x === y
    }
}
