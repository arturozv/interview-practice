package com.zenval.interviewpractice.problems.palindrome;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeTest {

    private Palindrome instance = new Palindrome();

    @Test
    public void when_is_palindrome() {
        int input = 121;
        assertThat(instance.isPalindrome(input)).isTrue();

        input = 11;
        assertThat(instance.isPalindrome(input)).isTrue();

        input = 1234321;
        assertThat(instance.isPalindrome(input)).isTrue();

        input = 1221;
        assertThat(instance.isPalindrome(input)).isTrue();
    }

    @Test
    public void when_is_not_palindrome() {
        int input = 123;
        assertThat(instance.isPalindrome(input)).isFalse();

        input = 12;
        assertThat(instance.isPalindrome(input)).isFalse();
    }

   
}