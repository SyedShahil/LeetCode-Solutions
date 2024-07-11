class Maximum_Nesting_Depth_of_the_Parentheses{
    public int maxDepth(String s) {
        int maxDepth = 0;
        int currentDepth = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                currentDepth++;
                if (currentDepth > maxDepth) {
                    maxDepth = currentDepth;
                }
            } else if (ch == ')') {
                currentDepth--;
            }
        }

        return maxDepth;
    }
}
