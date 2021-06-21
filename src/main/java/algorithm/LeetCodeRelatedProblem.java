package algorithm;

import common.Node;

/**
 * leetCode上面相关的题目
 */
public class LeetCodeRelatedProblem {

    public static void main(String[] args) {

    }

    //双指针问题

    /**
     * 1. 有序数组的Two sum
     * <p>
     * 题目：在有序数组中找出两个数 使他们的和为target
     */
    public static int[] twoSum(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == target) {
                return new int[]{start + 1, end + 1};
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return null;
    }

    /**
     * 2. 判断链表是否有环
     */
    public static boolean hasCycle(Node head) {
        if (head == null) {
            return false;
        }
        Node slow = head;
        Node fast = head.next;
        while (slow != null && fast != null && fast.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    //排序
    /**
     * 快速排序 、堆排序
     *
     * 其中堆排序 就是优先队列PriorityQueue
     */

    //贪心思想

    /**
     * 1.分配饼干
     *
     * 题目描述：每个孩子都有一个满足度，每个饼干都有一个大小，只有饼干的大小大于等于一个孩子的满足度，该孩子
     * 才会获得满足。求解最多可以获得满足的孩子数量。
     *
     * Input: [1,2], [1,2,3] Output: 2
     */

    //二分查找

    /**
     * 1.写一个二分查找出来
     */
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    //分治


    //BFS：广度优先搜索遍历
    /**
     *
     */

    //DFS：深度优先搜索遍历

    //回溯

    //动态规划

    //链表

    //树

    //数组和矩阵

    //字符串

    //位运算

    //图

    //哈希表

    //栈和队列

    //数学问题
}
