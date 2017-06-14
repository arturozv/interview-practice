package com.zenval.interviewpractice.problems.balancedbrackets;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by arturo on 13/06/17.
 */
public class BalancedBrackets {

    private final Map<Character, Character> characterMap = new HashMap<>();

    public BalancedBrackets() {
        characterMap.put('}', '{');
        characterMap.put(']', '[');
        characterMap.put(')', '(');
        characterMap.put('>', '<');
    }

    public boolean isBalanced(final String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            Character character = input.charAt(i);

            if (isCloser(character)) {
                if (!stack.isEmpty() && characterMap.get(character).equals(stack.peek())) {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (isOpener(character)) {
                stack.push(character);
            }
        }

        return stack.isEmpty();
    }

    boolean isCloser(Character character) {
        return characterMap.containsKey(character);
    }

    boolean isOpener(Character character) {
        return characterMap.containsValue(character);
    }
}
