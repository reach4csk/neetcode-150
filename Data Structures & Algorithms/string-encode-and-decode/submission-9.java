class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String st: strs) {
            sb.append(st.length());
            sb.append(",");
        }
        sb.append("#");
        for (String str: strs) {
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<Integer> sizes = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        int i=0;
        int len = str.length();
        while (i < str.indexOf("#")) {
            int j=i;
            while(str.charAt(j) != ',' && str.charAt(j) != '#') {
                j++;
            }
            int val = Integer.parseInt(str.substring(i, j));
            sizes.add(val);
            i=j+1;
        }
        int n = str.indexOf("#") + 1;
        for (int l: sizes) {
            String s = str.substring(n, n+l);
            strings.add(s);
            n += l;
        }
        return strings;
    }
}
