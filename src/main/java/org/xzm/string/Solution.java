package org.xzm.string;

public class Solution {

    public static void main(String[] args) {
        System.out.println("最长回文字符串: " + new Solution().longestPalindrome("abcdefedefbc"));
    }

    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        char[] palindrome = new char[chars.length];
        String maxPalindrome = "";
        int maxLen = 0;
        for (int i = 0; i < chars.length; i++) {
            int len;
            for (int j = i; j < chars.length; j++) {
                //拼接字符串
                len = j - i + 1;
                palindrome[len - 1] = chars[j];
                //检验是否是回文字符串
                if (len > maxLen && isPalindrome(palindrome, len)) {
                    String str = new String(palindrome, 0, len);
                    //System.out.println("回文字符串: " + str);
                    //如果比最长回文长，替换最长回文
                    maxLen = len;
                    maxPalindrome = str;
                }
            }
        }
        return maxPalindrome;
    }

    private boolean isPalindrome(char[] str, int len) {
        if (len == 1) {
            return true;
        }
        int k = len % 2 == 0 ? len / 2 - 1 : len / 2;
        for (int i = 0; i <= k; i++) {
            int j = len - 1 - i;
            if (i == j) {
                return true;
            }
            if (str[i] != str[j]) {
                return false;
            }
        }
        return true;
    }
}
