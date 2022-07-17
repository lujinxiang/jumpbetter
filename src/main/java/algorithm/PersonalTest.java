package algorithm;

import common.ArrayUtil;
import common.TreeNode;
import leetcode.problem.ListNode;

import java.util.*;

/**
 * 个人测试算法题目相关 目的有二
 * <p>
 * 1. 测试相关的算法题练习情况
 * <p>
 * 2. 测试相关的算法思想理解情况
 */
public class PersonalTest {

    public static void main(String[] args) {


    }

    /**
     * 全排列 问题
     *
     * @param array
     * @param start
     * @param end
     */
    public static void perm(int[] array, int start, int end) {
        if (start == end) {
            System.out.println(Arrays.toString(array));
        }
        for (int i = start; i <= end; i++) {
            //1，2，3的全排列这块相当于将其中一个提了出来，下次递归从start+1开始
            swap(array, start, i);
            perm(array, start + 1, end);
            //这块是复原数组，为了保证下次另外的同级递归使用数组不会出错
            //这块可以通过树来理解，每次回退一步操作，交换回去
            swap(array, start, i);
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    /**
     * 层次遍历二叉树
     * <p>
     * 层次遍历二叉树 本质就是BFS 利用了队列先进先出的特性来进行广度优先搜索遍历
     */
    public static void levelReadTree(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.val + " ");
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }
    }

    /**
     * 带行号的层次遍历
     */
    public static void levelReadTreeWithLineNumber(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode last = root;//指向当前行最后一个元素
        TreeNode nLast = null;//指向下一行最后一个元素
        int level = 0;
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.val + " ");
            if (temp.left != null) {
                queue.offer(temp.left);
                nLast = temp.left;
            }
            if (temp.right != null) {
                queue.offer(temp.right);
                nLast = temp.right;
            }
            if (temp == last) {
                last = nLast;
                level++;
                System.out.println(" ");
            }
        }
    }


    /**
     * BFS经典问题：迷宫问题
     * <p>
     * 定义一个二维数组：
     * <p>
     * int maze[5][5] = {
     * <p>
     * 0, 1, 0, 0, 0,
     * <p>
     * 0, 1, 0, 1, 0,
     * <p>
     * 0, 0, 0, 0, 0,
     * <p>
     * 0, 1, 1, 1, 0,
     * <p>
     * 0, 0, 0, 1, 0,
     * <p>
     * };
     * 它表示一个迷宫，其中的1表示墙壁，0表示可以走的路，只能横着走或竖着走，
     * 不能斜着走，要求编程序找出从左上角到右下角的最短路径
     */
    public static int[][] findPath(int[][] matrix) {
        Queue queue = new LinkedList();
        queue.offer(matrix[0][0]);
        int[][] visited = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

            }
        }
        return null;
    }

    //判断当前坐标点是否是合理范围内的坐标 且是可以通的
    private boolean validPath(int x, int y, int[][] matrix) {
        if (x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length && matrix[x][y] == 0) {
            return true;
        }
        return false;
    }

    /**
     * 快速排序 自我练习
     */
    public static int[] quickSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        int left = 0;
        int right = arr.length - 1;
        int tempLeft = left;
        int tempRight = right;
        int index = arr[0];
        while (tempLeft < tempRight) {
            while (tempLeft < tempRight && arr[tempRight] > index) {
                tempRight--;
            }
            ArrayUtil.swap(arr, tempLeft, tempRight);
            while (tempLeft < tempRight && arr[tempLeft] < index) {
                tempLeft++;
            }
            ArrayUtil.swap(arr, tempLeft, tempRight);
        }
        arr[tempLeft] = index;
        return arr;
    }

    /**
     * 堆排序 自我练习
     */
    public static int[] dumpSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        for (int i = 1; i < arr.length; i++) {
            dumpInsert(arr, i, arr.length);
        }
        for (int i = arr.length - 1; i > 0; i--) {
            dumpSort(arr, 0, i);

        }
        return null;
    }

    private static void dumpSort(int[] arr, int startIndex, int endIndex) {
        int left = (startIndex + 1) / 2;
        int right = (startIndex + 2) / 2;
        int largest = startIndex;
        while (left < arr.length && right < arr.length) {
            left = (startIndex + 1) / 2;
            right = (startIndex + 2) / 2;
            if (arr[startIndex] < arr[left]) {
                largest = left;
            }
            if (arr[startIndex] < arr[right]) {
                largest = right;
            }
            startIndex = largest;
            left = (startIndex + 1) / 2;

        }
    }

    private static void dumpInsert(int[] arr, int index, int length) {
        while (index != 0) {
            int parent = (index - 1) / 2;
            if (arr[index] > arr[parent]) {
                ArrayUtil.swap(arr, index, parent);
            }
            index = parent;
        }
    }

}

class Solution22 {

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
        //4. 递归的操作：
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

class PersonalProgress {


}