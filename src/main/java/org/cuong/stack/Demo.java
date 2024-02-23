package org.cuong.stack;

import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        // Stack stack = new Stack();
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        Stack s = new Stack();
        String code = "machingBrace.keySet().contains(s);"; // good
        // String code = "machingBrace.keySet().containss);"; // open
        // String code = "machingBrace.keySet().contains(s;"; // close
        // String code = "machingBrace.keySet().contains(s];"; // mismatched
        for (int i = 0; i < code.length(); i++) {
            Character c = (code.charAt(i));
            if (CodeLinter.isOpeningBrace(c)) {
                s.push(c);
            } else if (CodeLinter.isClosingBrace(c)) {
                Character openingBrace = s.pop();
                if (openingBrace == null) {
                    throw new RuntimeException(c + " doesn't have opening brace");
                }
                if (!CodeLinter.isMatched(openingBrace, c)) {
                    throw new RuntimeException(c + " has mismatched opening brace");
                }
            }
        }
        if (s.pop() != null) {
            throw new RuntimeException("does not close brace");
        }
    }
}

class CodeLinter {
    private final static Map<Character, Character> machingBrace = Map.of('{', '}', '(', ')', '[', ']');

    public static boolean isClosingBrace(Character s) {
        return machingBrace.values().contains(s);
    }

    public static boolean isOpeningBrace(Character s) {
        return machingBrace.keySet().contains(s);
    }

    public static boolean isMatched(Character open, Character close) {
        return close == machingBrace.get(open);
    }
}

/**
 * Stack
 */
class Stack {

    private int size = 10;
    private int pointer = -1;
    private Character[] arr = new Character[size];

    public void push(Character ele) {
        if (pointer >= size) {
            int[] newArr = new int[size * 2];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            size = size * 2;
        }
        arr[++pointer] = ele;
    }

    public Character pop() {
        if (pointer == -1)
            return null;
        return arr[pointer--];
    }

    public int peek() {
        return arr[pointer];
    }
}
