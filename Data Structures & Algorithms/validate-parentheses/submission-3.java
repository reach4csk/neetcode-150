class Solution {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        Map<String, String> bMap = Map.of("}", "{", "]", "[", ")", "(");
        for (char c : s.toCharArray()) {
            if (bMap.containsKey(String.valueOf(c))) {
                if (!stack.isEmpty() && stack.peek().equals(bMap.get(String.valueOf(c)))) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(String.valueOf(c));
            }
        }
        return stack.isEmpty();
    }
}
