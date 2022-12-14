package leetcode;

import common.ListNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * LeetCode_Day01
 *
 * @author jinxianglu
 */
public class HappyDay01 {


    public static void main(String[] args) {
        HappyDay01 happyDay01 = new HappyDay01();


    }

    /**
     * 1. 两数相加
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> stackL1 = new Stack<>();
        Stack<ListNode> stackL2 = new Stack<>();
        LinkedList<Integer> queue = new LinkedList<>();
        while (l1 != null) {
            stackL1.push(l1);
            l1 = l1.next;
        }
        while (l2 != null) {
            stackL2.push(l2);
            l2 = l2.next;
        }

        int next = 0;
        int cur = 0;
        while (!stackL1.isEmpty() && !stackL2.isEmpty()) {
            int sum = stackL1.pop().val + stackL2.pop().val + next;
            next = sum / 10;
            cur = sum % 10;
            queue.addLast(cur);
        }

        while (!stackL1.isEmpty()) {
            int sum = stackL1.pop().val + next;
            next = sum / 10;
            cur = sum % 10;
            queue.addLast(cur);
        }

        while (!stackL2.isEmpty()) {
            int sum = stackL2.pop().val + next;
            next = sum / 10;
            cur = sum % 10;
            queue.addLast(cur);
        }

        if (next != 0) {
            queue.addLast(next);
        }
        ListNode newNode = new ListNode(queue.pop());
        ListNode curNode = newNode;
        while (!queue.isEmpty()) {
            ListNode nextNode = new ListNode(queue.pop());
            curNode.next = nextNode;
            curNode = newNode;
        }
        return newNode;
    }


    /**
     * 2.无重复字符的最长子串
     */
    public int lengthOfLongestSubstring(String s) {


        return 0;
    }


    /**
     * 3.最长回文子串
     */
    public String longestPalindrome(String s) {
        return null;


    }


    /**
     * 4.Z字形变换
     */
    public String convert(String s, int numRows) {
        return null;

    }


    /**
     * 5.整数反转
     */
    public int reverse(int x) {
        return 0;


    }

    /**
     * 6.字符串转换整数
     *
     *
     *
     */


    /**
     * 7.盛最多水的容器
     */
    public int maxArea(int[] height) {
        return 0;

    }

    /**
     * 8.整数转罗马数字
     */


    /**
     * 9.三数之和
     */
    public List<List<Integer>> threeSum(int[] nums) {
        return null;
    }


    /**
     * 10.最接近的三数之和
     */
    public int threeSumClosest(int[] nums, int target) {
        return 0;

    }


}
