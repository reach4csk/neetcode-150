class Solution {

    public String encode(List<String> strs) {
        StringBuilder sbr = new StringBuilder();
        for (String str : strs) {
            int len = str.length();
            sbr.append(len).append(",");
        }
        sbr.append("#");
        for (String str : strs) {
            sbr.append(str);
        }
        return sbr.toString();
    }

    public List<String> decode(String str) {
        int pos = str.indexOf("#");
        int i = 0;
        List<Integer> lenList = new ArrayList<>();
        List<String> finalList = new ArrayList<>();
        while (i < pos) {
            int j = i;
            while (str.charAt(j) != ',' && str.charAt(j) != '#') {
                j++;
            }
            lenList.add(Integer.parseInt(str.substring(i, j)));
            i = j+1;
        }
        int indx = pos + 1;
        for (int n : lenList) {
            finalList.add(str.substring(indx, indx+n));
            indx += n;
        }
        return finalList;
    }
}
