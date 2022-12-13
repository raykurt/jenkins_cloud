package jenkins;

import java.util.Stack;

public class Valid_Paranteziss {

    public static void main(String[] args) {
        System.out.println("Answer : " + CheckParentesis("([]){}()"));
    }

    public static boolean CheckParentesis(String str)
    {
        if (str.isEmpty())
            return true;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == '{' || current == '(' || current == '[') {
                stack.push(current);
            }


            if (current == '}' || current == ')' || current == ']') {
                if (stack.isEmpty())
                    return false;

                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
