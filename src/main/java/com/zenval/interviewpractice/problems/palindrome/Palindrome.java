package com.zenval.interviewpractice.problems.palindrome;

public class Palindrome {

    public boolean isPalindrome(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        
        System.out.println("length: "+chars.length);
        for (int i=0; i<chars.length-1; i++) {
            int j = chars.length - 1 - i;

            if (chars[i] != chars[j]) {
                return false;
            }
        }

        return true;
    }
}
