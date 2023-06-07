package org.xzm.string;

public class Solution {

    public static void main(String[] args) {
        System.out.println("最长回文字符串: " + new Solution().longestPalindrome("abcdefedefbc"));
    }

    public String longestPalindrome(String s) {
        byte[] chars = s.getBytes();
        for (int len = chars.length; len > 0; len--) {
            for (int i = 0; i < chars.length - len + 1; i++) {
                if (isPalindrome(chars, i, len)) {
                    return new String(chars, i, len);
                }
            }
        }
        return null;
    }

    private boolean isPalindrome(byte[] str, int offset, int len) {
        if (len == 1) {
            return true;
        }
        //比较的次数，长度的1/2
        int n = len % 2 == 0 ? len / 2 : len / 2 + 1;
        for (int i = 0; i < n; i++) {
            int f = i+offset;
            int j = len - 1 - i + offset;
            if (f == j) {
                return true;
            }
            if (str[f] != str[j]) {
                return false;
            }
        }
        return true;
    }
}
