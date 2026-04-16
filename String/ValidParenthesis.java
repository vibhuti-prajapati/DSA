package String;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "() }";
        Stack<Character> stack = new Stack<>();
        boolean isValid = true;
        for (char i : s.toCharArray()) {
            if (i == '(' || i == '[' || i == '{') {
                stack.push(i);
            } else if (i == ')' || i == ']' || i == '}') {
                if (stack.isEmpty()) {
                    isValid = false;
                    break;
                }
                    char p = stack.peek();
                    if ((i == ')' && p == '(') || (i == ']' && p == '[')
                            || (i == '}' && p == '{')) {
                        stack.pop();
                    }else {
                        isValid=false;
                        break;
                    }
            }
        }
        if (!stack.isEmpty()) {
            isValid = false;
        }

        System.out.println(isValid);
    }
    }
