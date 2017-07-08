package com.zenval.interviewpractice.problems.balancedbrackets;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BalancedBracketsTest {

    private BalancedBrackets instance = new BalancedBrackets();

    @Test
    public void when_is_balanced() {
        String input = "{a[b(c<def>g)h]i}";
        assertThat(instance.isBalanced(input)).isTrue();

        input = "{[(<>)]}";
        assertThat(instance.isBalanced(input)).isTrue();

        input = "[[[[[[[[[]]]]]]]]]";
        assertThat(instance.isBalanced(input)).isTrue();

        input = "a";
        assertThat(instance.isBalanced(input)).isTrue();

        input = "[[[[[[[[[]]]]]]]]][[[[[[[[[]]]]]]]]][[[[[[[[[]]]]]]]]][[[[[[[[[]]]]]]]]][[[[[[[[[]]]]]]]]][[[[[[[[[]]]]]]]]]";
        assertThat(instance.isBalanced(input)).isTrue();
    }


    @Test
    public void when_is_not_balanced() {
        String input = "{ab(c<def>g)h]i}";
        assertThat(instance.isBalanced(input)).isFalse();

        input = "{a[b(c<defg)h]i}";
        assertThat(instance.isBalanced(input)).isFalse();

        input = "{a[b(c<def>g)h]i";
        assertThat(instance.isBalanced(input)).isFalse();

        input = "ab(c<def>g)h]i}";
        assertThat(instance.isBalanced(input)).isFalse();

        input = "{ab(c<def>>g)h]i}";
        assertThat(instance.isBalanced(input)).isFalse();

        input = "{{ab(c<def>g)h]i}";
        assertThat(instance.isBalanced(input)).isFalse();

        input = "{";
        assertThat(instance.isBalanced(input)).isFalse();

        input = "}";
        assertThat(instance.isBalanced(input)).isFalse();
    }

    @Test
    public void when_is_invalid_input() {
        String input = "";
        assertThat(instance.isBalanced(input)).isFalse();

        input = null;
        assertThat(instance.isBalanced(input)).isFalse();
    }
}