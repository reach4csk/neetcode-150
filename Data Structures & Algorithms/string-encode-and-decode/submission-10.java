class Solution {

    public String encode(List<String> strs) {
        StringBuffer sbr = new StringBuffer();
        for (String str: strs) {
            sbr.append(str.length());
            sbr.append(",");
        }
        sbr.append("#");
        for (String st: strs) {
            sbr.append(st);
        }
        return sbr.toString();
    }

    public List<String> decode(String str) {
        List<Integer> sizes = new ArrayList<>();
        List<String> strs = new ArrayList<>();
        int delimPos = str.indexOf("#");
        int i=0;
        while (i < delimPos) {
            int j=i;
            while (str.charAt(j) != ',' && str.charAt(j) != '#') {
                j++;
            }
            sizes.add(Integer.parseInt(str.substring(i, j)));
            i = j+1;
        }
        int n = delimPos+1;
        for (int len: sizes) {
            String s = str.substring(n, n+len);
            strs.add(s);
            n = n+len;
        }
        return strs;
    }
}
