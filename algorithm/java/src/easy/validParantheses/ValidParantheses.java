package easy.validParantheses;

// https://leetcode.com/problems/valid-parentheses/

public class ValidParantheses {

    Stack s;

    public boolean isValidParantheses(String str) {
        char[] chars = str.toCharArray();
        s = new Stack(str.length());
        for (char ch: chars) {
            boolean result = operation(ch);
            if (!result) {
                return false;
            }
        }
        return s.isEmpty();
    }

    private boolean operation(char ch) {
        char pop;
        switch (ch) {
            case '(':
                s.push(ch);
                return true;
            case '{' :
                s.push(ch);
                return true;
            case '[' :
                s.push(ch);
                return true;
            case ')':
                if (s.isEmpty()) {
                    return false;
                }
                pop = s.pop();
                return pop == '(';
            case '}':
                if (s.isEmpty()) {
                    return false;
                }
                pop = s.pop();
                return pop == '{';
            case ']':
                if (s.isEmpty()) {
                    return false;
                }
                pop = s.pop();
                return pop == '[';
            default:
                return false;
        }
    }
}
