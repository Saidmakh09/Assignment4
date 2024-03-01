import java.util.Stack;

public class Question4 {
    static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : s.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }

                char top = stack.pop();
                if ((bracket == ')' && top != '(') ||
                        (bracket == ']' && top != '[') ||
                        (bracket == '}' && top != '{')) {
                    return "NO";
                }
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }


}
