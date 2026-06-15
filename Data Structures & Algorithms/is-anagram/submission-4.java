class Solution {
    public boolean isAnagram(String s, String t) {
        Map<String, Integer> charMatch = new HashMap<>();
        Map<String, Integer> charMatch1 = new HashMap<>();
        char [] fArray = s.toCharArray();
        char [] sArray = t.toCharArray();

        for (int i=0; i< fArray.length; i++) {
            if (charMatch.containsKey(String.valueOf(fArray[i]))) {
                charMatch.put(String.valueOf(fArray[i]), charMatch.get(String.valueOf(fArray[i])) + 1);
            } else {
                charMatch.put(String.valueOf(fArray[i]), 1);
            }
        }

        for (int j=0; j< sArray.length; j++) {
            if (!charMatch.containsKey(String.valueOf(sArray[j]))) {
                return false;
            }
            if (charMatch1.containsKey(String.valueOf(sArray[j]))) {
                charMatch1.put(String.valueOf(sArray[j]), charMatch1.get(String.valueOf(sArray[j])) + 1);
            } else {
                charMatch1.put(String.valueOf(sArray[j]), 1);
            }
        }
        return charMatch.equals(charMatch1);
    }
}
