package leetcode;


import java.util.*;

/**
 * 记录leetCode上面没有思路的题目
 */
public class HappyCode {


    public static void main(String[] args) {
        boolean palindrome = isPalindrome(232);
        System.out.println(palindrome);


    }


    /**
     *
     */
    public static boolean isPalindrome(int x) {
        Stack<Character> stack = new Stack<>();
        String s = String.valueOf(x);
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            stack.push(chars[i]);
        }
        boolean flag = true;
        int i = 0;
        while (!stack.isEmpty()) {
            if (stack.pop() != chars[i++]) {
                flag = false;
            }
        }
        return flag;
    }
}