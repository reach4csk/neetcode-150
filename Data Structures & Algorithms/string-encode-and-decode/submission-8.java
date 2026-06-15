class Solution {

    public String encode(List<String> strings) {
        StringJoiner sizeJoiner = new StringJoiner(",");
        for (String str : strings) {
            sizeJoiner.add(String.valueOf(str.length()));
        }
        StringBuilder result = new StringBuilder(sizeJoiner.toString());
        result.append("#");
        for (String str : strings) {
            result.append(str);
        }
        return result.toString();
    }

    public List<String> decode(String strs) {
        List<Integer> sizes = new ArrayList<>();
        List<String> result = new ArrayList<>();
        int i = 0;
        int hashCharPos = strs.indexOf("#");
        while (i < hashCharPos) {
            int j = i;
            while (strs.charAt(j) != ',' && strs.charAt(j) != '#') {
                j++;
            }
            sizes.add(Integer.parseInt(strs.substring(i, j)));
            i=j+1;
        }
        for (int n : sizes) {
            result.add(strs.substring(i, i+n));
            i += n;
        }
        return result;
    }
}
