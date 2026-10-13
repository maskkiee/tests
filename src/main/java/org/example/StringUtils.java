package org.example;

public class StringUtils {

    public boolean isPalindrome(String text) {
        if (text == null) {
            return true;
        }
        String normalized = text.toLowerCase();
        String reversed = new StringBuilder(normalized).reverse().toString();
        return normalized.equals(reversed);
    }
}