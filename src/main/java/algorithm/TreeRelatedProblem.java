package algorithm;

import common.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 二叉树相关的问题
 */
public class TreeRelatedProblem {

    public static void main(String[] args) {

    }

    /**
     * 1.二叉树的递归和非递归遍历 分别实现先序、中序、后序遍历
     */

    /**
     * 先序遍历
     *
     * @param head
     */
    public static void preOrder(TreeNode head) {
        if (head == null) {
            return;
        }
        System.out.print(head.value + " ");
        preOrder(head.left);
        preOrder(head.right);
    }

    /**
     * 中序遍历
     */
    public static void inOrder(TreeNode head) {
        if (head == null) {
            return;
        }
        inOrder(head.left);
        System.out.print(head.value + " ");
        inOrder(head.right);
    }

    /**
     * 后序遍历
     */
    public static void postOrder(TreeNode head) {
        if (head == null) {
            return;
        }
        postOrder(head.left);
        postOrder(head.right);
        System.out.print(head.value + " ");
    }

    /**
     * 先序遍历非递归实现
     */
    public static void preOrderN2(TreeNode head) {
        if (head == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(head);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            System.out.print(cur.value + " ");
            if (cur.right != null) {
                stack.push(cur.right);
            }
            if (cur.left != null) {
                stack.push(cur.left);
            }
        }
    }

    /**
     * 中序遍历非递归实现
     */
    public static void inOrderN2(TreeNode head) {
        if (head == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (!stack.isEmpty() || head != null) {
            if (head != null) {
                stack.push(head);
                head = head.left;
            } else {
                //出栈的过程 其实就可以拿到父节点 这个思路可以
                head = stack.pop();
                System.out.print(head.value + " ");
                head = head.right;
            }
        }
    }

    /**
     * 后序遍历非递归实现
     */
    public static void postOrderN2(TreeNode head) {
        if (head == null) {
            return;
        }
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        while (!s1.isEmpty()) {
            head = s1.pop();
            s2.push(head);
            if (head.left != null) {
                s1.push(head.left);
            }
            if (head.right != null) {
                s1.push(head.right);
            }
        }
        while (!s2.isEmpty()) {
            System.out.print(s2.pop().value + " ");
        }
    }

    /**
     * 带层号的 二叉树层次遍历
     * <p>
     * 思想：利用队列实现
     */
    public static void printByLevel(TreeNode head) {
        if (head == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int level = 1;
        TreeNode last = head;//指向当前行
        TreeNode nLast = null;//指向下一行
        queue.offer(head);
        System.out.print("Level " + (level++) + ":");
        while (!queue.isEmpty()) {
            head = queue.poll();
            System.out.print(head.value + "");
            if (head.left != null) {
                queue.offer(head.left);
                nLast = head.left;
            }
            if (head.right != null) {
                queue.offer(head.right);
                nLast = head.right;
            }
            if (head == last && !queue.isEmpty()) {
                System.out.print("\nLevel" + (level++) + ":");
                last = nLast;
            }
        }
        System.out.println();
    }

    /**
     * zigZag打印的实现
     *
     *
     */

    /**
     * 打印二叉树的边界节点
     */

    /**
     * 在二叉树中找到累加和为指定值的最长路径长度
     * <p>
     * 题目：给定一棵二叉树的头节点head和一个32位整数sum 二叉树节点值类型是整型 求累加和为sum的最长路径长度
     * 路径是指从某个节点往下 每次最多选择一个孩子节点或者不选所形成的节点链
     * <p>
     * 思路：
     */
    public static int getMaxLength(TreeNode head, int sum) {
        HashMap<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
        sumMap.put(0, 0);
        return preOrder(head, sum, 0, 1, 0, sumMap);
    }

    private static int preOrder(TreeNode head, int sum, int preSum, int level, int maxLen, HashMap<Integer, Integer> sumMap) {
        if (head == null) {
            return maxLen;
        }
        int curSum = preSum + head.value;
        if (!sumMap.containsKey(curSum)) {
            sumMap.put(curSum, level);
        }
        if (sumMap.containsKey(curSum - sum)) {
            maxLen = Math.max(level - sumMap.get(curSum - sum), maxLen);
        }
        maxLen = preOrder(head.left, sum, curSum, level + 1, maxLen, sumMap);
        maxLen = preOrder(head.right, sum, curSum, level + 1, maxLen, sumMap);
        if (level == sumMap.get(curSum)) {
            sumMap.remove(curSum);
        }
        return maxLen;
    }

    /**
     * 判断二叉树是否为平衡二叉树
     * <p>
     * 题目：平衡二叉树的性质为：要么是一棵空树 要么任何一个节点的左右子树高度差的绝对值不超过1
     * 给定一棵二叉树的头节点head 判断这棵二叉树是否为平衡二叉树
     * <p>
     * 默认要求算法的时间复杂度为O(n)
     * <p>
     * 思路：二叉树的后序遍历 先判断左子树是否是平衡二叉树 再判断右子树是否是平衡二叉树
     */
    public static boolean isBalanceTree(TreeNode head) {
        boolean[] res = new boolean[1];
        res[0] = true;
        getHeight(head, 1, res);
        return res[0];
    }

    private static int getHeight(TreeNode head, int level, boolean[] res) {
        if (head == null) {
            return level;
        }
        int lH = getHeight(head.left, level + 1, res);
        if (!res[0]) {
            return level;
        }
        int rH = getHeight(head.right, level + 1, res);
        if (!res[0]) {
            return level;
        }
        if (Math.abs(lH - rH) > 1) {
            res[0] = false;
        }
        return Math.max(lH, rH);
    }

    /**
     * 在二叉树中找到两个节点的最近公共祖先
     * <p>
     * 题目：给定一棵二叉树的头节点head 以及这棵树中的两个节点o1和o2 请返回o1和o2的最近公共祖先节点
     * <p>
     * 思路：二叉树的后续遍历
     */
    public static TreeNode lowestAncestor(TreeNode head, TreeNode o1, TreeNode o2) {
        if (head == null || head == o1 || head == o2) {
            return head;
        }
        TreeNode left = lowestAncestor(head.left, o1, o2);
        TreeNode right = lowestAncestor(head.right, o1, o2);
        if (left != null && right != null) {
            return head;
        }
        return left != null ? left : right;
    }

    /**
     * 二叉树节点间的最大距离问题
     * <p>
     * 题目：从二叉树的节点A出发 可以向上或者向下走 但沿途的节点只能经过一次 当到达节点B时
     * 路径上的节点数就叫做A-B的距离
     * <p>
     * 思路：二叉树的后续遍历
     * 最大距离可能的三种情况
     * 1.h的左子树上的最大距离
     * 2.h的右子树上的最大距离
     * 3.h左子树上离h.left最远的距离+l(h)+h右子树上离h.right最远的距离
     * 三个值中最大的那个就是整颗h树中最远的距离
     */
    public static int maxDistance(TreeNode head) {
        int[] record = new int[1];
        return posOrder(head, record);
    }

    private static int posOrder(TreeNode head, int[] record) {
        if (head == null) {
            record[0] = 0;
            return 0;
        }
        int lMax = posOrder(head.left, record);
        int maxFromLeft = record[0];
        int rMax = posOrder(head.right, record);
        int maxFromRight = record[0];
        int curNodeMax = maxFromLeft + maxFromRight + 1;
        record[0] = Math.max(maxFromLeft, maxFromRight) + 1;
        return Math.max(Math.max(lMax, rMax), curNodeMax);
    }

    /**
     * 统计完全二叉树的节点数
     * <p>
     * 题目：给定一棵完全二叉树的头节点head 返回这棵树的节点个数
     * <p>
     * 要求：如果完全二叉树的节点数为N 请实现时间复杂度低于O(N)的解法
     */
    public static int nodeNum(TreeNode head) {
        if (head == null) {
            return 0;
        }
        return bs(head, 1, mostLeftLevel(head, 1));
    }

    private static int bs(TreeNode head, int l, int h) {
        if (l == h) {
            return 1;
        }
        if (mostLeftLevel(head.right, l + 1) == h) {
            return (1 << (h - 1)) + bs(head.right, l + 1, h);
        } else {
            return (l << (h - l - 1) + bs(head.left, l + 1, h));
        }
    }

    private static int mostLeftLevel(TreeNode head, int level) {
        while (head != null) {
            level++;
            head = head.left;
        }
        return level - 1;
    }

    /**
     * 在二叉树中找到一个节点的后继节点
     *
     *
     */

    /**
     * 调整搜索二叉树中两个错误的节点
     * <p>
     * 题目1：一棵二叉树原本是搜索二叉树 但是其中有两个节点调换了位置 使得这颗二叉树不再是搜索二叉树
     * 请找到这两个错误节点并返回 已知二叉树中所有节点的值都不一样 给定二叉树的头节点head
     * 返回一个长度为2的二叉树节点类型的数组errs
     * <p>
     * 题目2：如何在结构上完全交换两个节点的位置 请实现调整的函数
     * <p>
     * 思路：中序遍历搜索二叉树 是有序的 改写了一个中序遍历 就实现了
     * 递归、非递归方式均可以实现
     */
    public static TreeNode[] getTwoErrNodes(TreeNode head) {
        TreeNode[] errs = new TreeNode[2];
        if (head == null) {
            return errs;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while (!stack.isEmpty() || head != null) {
            if (head != null) {
                stack.push(head);
                head = head.left;
            } else {
                head = stack.pop();
                if (pre != null && pre.value > head.value) {
                    errs[0] = errs[0] == null ? pre : errs[0];
                    errs[1] = head;
                }
                pre = head;
                head = head.right;
            }
        }
        return errs;
    }

    /**
     * 题目2：如何在结构上完全交换两个节点的位置 请实现调整的函数
     * <p>
     * 获取两个错误节点的父节点
     */
    public static TreeNode[] getTwoErrParents(TreeNode head, TreeNode e1, TreeNode e2) {
        TreeNode[] parents = new TreeNode[2];
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || head != null) {
            if (head != null) {
                stack.push(head);
                head = head.left;
            } else {
                head = stack.pop();
                if (head.left == e1 || head.right == e1) {
                    parents[0] = head;
                }
                if (head.left == e2 || head.right == e2) {
                    parents[1] = head;
                }
                head = head.right;
            }
        }
        return parents;
    }

    /**
     * 通过先序和中序数组生成后序数组
     * <p>
     * 题目：已知一棵二叉树所有的节点值都不同 给定这棵树正确的先序和中序数组 不要重建整颗树
     * 而是通过这两个数组直接生成正确的后续数组
     */


    /**
     * 统计和生成所有不同的二叉树
     * <p>
     * 题目：给定一个整数N 如果N<1 代表空树结构 否则代表中序遍历的结果为{1,2,3,...N} 返回可能的二叉树结构有多少？
     */
    public static int numTrees(int n) {
        if (n < 2) {
            return 1;
        }
        int[] num = new int[n + 1];
        num[0] = 1;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                num[i] += num[j - 1] * num[i - j];
            }
        }
        return num[n];
    }
}
