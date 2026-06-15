class Solution {
    public boolean isValid(String s) {
        char[] carr = s.toCharArray();
        Deque<Character> dq = new ArrayDeque<>();
        int i = 0;
        while (i < carr.length) {
            char c = carr[i];
            if (c == '(' || c == '[' || c == '{') {
                dq.push(c);
            } else {
                if (dq.isEmpty()) {
                    return false;
                }
                if (c == ')' && dq.peek() != '(' 
            || c == ']' && dq.peek() != '[' || c == '}' && dq.peek() != '{') {
                return false;
            }
                dq.pop();
            }
            i++;
        }
        return dq.isEmpty();
    }
}
