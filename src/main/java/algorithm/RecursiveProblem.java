package algorithm;

import leetcode.ListNode;

/**
 * 4.递归相关的问题
 * <p>
 * 树相关的问题 基本很多都可以使用递归来解决
 * <p>
 * <p>
 * <p>
 * 递归问题的特征：
 * 1.大问题可以拆分成两个子问题；
 * 2.子问题的求解方式和大问题一样；
 * 3.存在最小子问题；
 *
 * @author jinxianglu
 */
public class RecursiveProblem {

    public static void main(String[] args) {

        Solution34 solution33 = new Solution34();
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        ListNode listNode = solution33.reverseList(root);
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }

}


/**
 * 题目：将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * 思路：递归比较
 */
class Solution31 {

    /**
     * 1. 明确递归函数的意义和作用，我觉得这一点很重要；
     * <p>
     * 2. 明确递归函数的参数和返回值
     * <p>
     * 3. 明确递归函数的终止条件
     * <p>
     * 4. 明确递归函数的操作；(//这一段逻辑是要干什么？？？？)
     *
     * @param head1
     * @param head2
     * @return
     */

    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {

        //1. 作用：对两个链表进行排序的，返回排序后的头节点； done
        //2. 参数：两个链表的头节点，够吗？？？返回值：排序后的头节点 done
        //3. 终止条件：head1==null && head2==null 返回头节点； done
        //4. 递归的操作：先写一层的操作
        if (head1 == null) {
            return head2;
        } else if (head2 == null) {
            return head1;
        } else if (head1.val < head2.val) {
            head1.next = mergeTwoLists(head1.next, head2);
            return head1;
        } else {
            head2.next = mergeTwoLists(head1, head2.next);
            return head2;
        }
    }
}

/**
 * 题目：给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。
 * 你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
 */
class Solution32 {

    /**
     * 1. 先写递归跳出条件
     * 2. 再写一层递归函数的逻辑
     * 3. 最后再写递归的逻辑
     * <p>
     * 完成情况：done
     *
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        //定义第一个节点；
        ListNode first = head;
        //定义第二个节点；
        ListNode second = head.next;
        //交换
        dfs(head, first, second);
        return head;
    }


    //交换递归函数
    private void dfs(ListNode head, ListNode first, ListNode second) {
        //跳出逻辑
        if (first == null || second == null) {
            return;
        }
        //一层递归逻辑：也即是实际的操作；
        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        //递归逻辑
        if (first.next != null && second.next != null) {
            dfs(head, first.next.next, second.next.next);
        }
    }
}

/**
 * 题目：实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn ）。
 * <p>
 * 完成情况：未完成，存在栈内存溢出；
 */
class Solution33 {
    public double myPow(double x, int n) {

        if (n < 0) {
            return 1 / dfs(x, -1 * n);
        } else if (n == 0) {
            return 1;
        } else {
            return dfs(x, n);
        }
    }

    /**
     * 计算x的n次方的值；
     */
    private double dfs(double x, int n) {
        if (n < 0) {
            return x;
        } else if (n == 0) {
            return 1;
        }
        return x * dfs(x, n - 1);
    }
}


/**
 * 题目：反转链表；
 * <p>
 * 完成情况：done
 */
class Solution34 {


    public ListNode reverseList(ListNode head) {

        if (head == null) {
            return head;
        }
        ListNode root = dfs(head);
        return root;
    }

    /**
     * 反转单链表并返回单链表的头节点；
     *
     * @param head
     * @return
     */
    private ListNode dfs(ListNode head) {
        //step1:递归跳出条件
        if (head == null || head.next == null) {
            return head;
        }

        //cur是作为最终返回的头节点，因此cur是不会进行改变的；
        ListNode cur = dfs(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }
}


/**
 * 题目：给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。
 * <p>
 * 如果存在一个整数 x 使得n == 2x ，则认为 n 是 2 的幂次方。
 */
class Solution35 {

    public boolean isPowerOfTwo(int n) {
        // 为正数
        if (n > 0) {
            // 特解
            if (n == 1) {
                return true;
            }
            // 排除奇数
            if (n % 2 == 1) {
                return false;
            }
            return isPowerOfTwo(n / 2);
        }
        return false;
    }
}

/**
 * 题目：通配符匹配
 * 给定一个字符串 (s) 和一个字符模式 (p) ，实现一个支持 '?' 和 '*' 的通配符匹配。
 * '?' 可以匹配任何单个字符。
 * '*' 可以匹配任意字符串（包括空字符串）。
 * 两个字符串完全匹配才算匹配成功。
 */
class Solution36 {


    public boolean isMatch(String s, String p) {
        return false;
    }


}






