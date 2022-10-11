import java.util.*;

public class valid_parentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        char[] str = s.toCharArray();
        if (str[0] == ']' || str[0] == '}' || str[0] == ')' || str[str.length - 1] == '(' || str[str.length - 1] == '['
                || str[str.length - 1] == '{') {
            return false;
        }
        for (char c : str) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
                count++;
            }
            else if (st.empty()) {
                return false;
            }
            else if (c == ')' && st.peek() == '(') {
                st.pop();
                count--;
            }
            else if (c == '}' && st.peek() == '{') {
                st.pop();
                count--;
            } 
            else if (c == ']' && st.peek() == '[') {
                st.pop();
                count--;
            } 
            else {
                return false;
            }
        }
        if (count == 0)
            return true;
        else
            return false;
    }
}
