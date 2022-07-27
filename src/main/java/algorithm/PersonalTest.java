package algorithm;

import common.ArrayUtil;
import common.TreeNode;
import javafx.util.Pair;
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
/*        PersonalProgress4 progress = new PersonalProgress4();
        TreeNode root = new TreeNode(2);
        TreeNode left = new TreeNode(4);
        root.left = left;
        root.right = new TreeNode(6);
        left.left = new TreeNode(5);
        left.right = new TreeNode(1);
        boolean flag = progress.hasPathSum(root, 13);
        System.out.println(flag);
        List<List<Integer>> res = progress.preOrderTree(root);
        for (int i = 0; i < res.size(); i++) {
            List<Integer> integers = res.get(i);
            for (Integer temp : integers) {
                System.out.print(temp + " ");
            }
            System.out.println(" ");
        }*/


/*        PersonalProgress8 progress8 = new PersonalProgress8();
        int[] arr = new int[]{1, 2, 0, 3, 4, 0};
        progress8.duplicateZeros2(arr);*/

/*

        PersonalProgress9 progress9 = new PersonalProgress9();
        ListNode head = new ListNode(1);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(4);
        head.next = l1;
        l1.next = l2;
        l2.next = l3;
        ListNode res = progress9.removeNthFromEnd(head, 1);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
*/

/*
        PersonalProgress8 progress8 = new PersonalProgress8();
        int[] arr = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        int i = progress8.removeDuplicates2(arr);
        System.out.print(i);*/


/*        PersonalProgress11 personalProgress11 = new PersonalProgress11();
        personalProgress11.generateParenthesis2(2);*/


        /* PersonalProgress11 progress11 = new PersonalProgress11();

         *//*        String res = progress11.multiply("123456789", "987654321");
        System.out.print(res);*//*

        String s = progress11.multiply("123", "45");
        System.out.print(s);*/

 /*       PersonalProgress12 progress12 = new PersonalProgress12();
        double v = progress12.myPow2(2, 10);
        System.out.print(v);
*/
/*
        PersonalProgress4 progress4 = new PersonalProgress4();
        TreeNode root = new TreeNode(2);
        TreeNode leftNode = new TreeNode(1);
        root.left = leftNode;
        root.right = new TreeNode(3);
        boolean res = progress4.isValidBST(root);
        System.out.print(res);*/

/*        PersonalProgress9 progress9 = new PersonalProgress9();
        ListNode head = new ListNode(2);
        head.next = new ListNode(2);


        ListNode newHead = progress9.deleteDuplicates(head);
        while (newHead != null) {
            System.out.print(newHead.val + "");
            newHead = newHead.next;
        }*/
/*        PersonalProgress8 progress8 = new PersonalProgress8();
        int[] nums1 = new int[]{4, 5, 6, 0, 0, 0};
        int[] nums2 = new int[]{1, 2, 3};
        progress8.merge(nums1, 3, nums2, 3);*/
/*
        PersonalProgress12 progress12 = new PersonalProgress12();
        int res = progress12.numDecodings("12346");
        System.out.print(res);*/


/*        PersonalProgress1 progress1 = new PersonalProgress1();
        int[] arr = new int[]{100, 200, 4, 12};
        List<List<Integer>> res = progress1.combinationSum(arr, 400);
        for (int i = 0; i < res.size(); i++) {
            List<Integer> inners = res.get(i);
            for (Integer temp : inners) {
                System.out.print(temp + " ");

            }
            System.out.println();
        }*/
/*
        PersonalProgress10 progress10 = new PersonalProgress10();
        int[][] board = {{4, 5}, {1, 4}, {0, 1}};
        int[][] res = progress10.merge(board);

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }*/


/*        PersonalProgress1 progress1 = new PersonalProgress1();
        int[] arr = new int[]{1, 2, 3};
        progress1.findQue(arr);*/


/*        PersonalProgress4 progress4 = new PersonalProgress4();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(5);
        progress4.sumNumbers(root);*/
/*

        PersonalProgress11 progress11 = new PersonalProgress11();
        String str = "aab";
        progress11.partition(str);
*/

        PersonalProgress12 progress12 = new PersonalProgress12();
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        List<Integer> list3 = new ArrayList<>();
        list3.add(6);
        list3.add(5);
        list3.add(7);
        List<Integer> list4 = new ArrayList<>();
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);
        arr.add(list1);
        arr.add(list2);
        arr.add(list3);
        arr.add(list4);
        progress12.minimumTotal(arr);

/*        PersonalProgress8 progress8 = new PersonalProgress8();
        int[] arr = new int[]{4, 1, 2, 1, 2};
        progress8.singleNumber(arr);*/


/*        PersonalProgress9 progress9 = new PersonalProgress9();
        ListNode root = new ListNode(4);
        root.next = new ListNode(2);
        root.next.next = new ListNode(1);
        root.next.next.next = new ListNode(3);
        progress9.insertionSortList(root);*/
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

/**
 * 快速排序
 */
class PersonalProgress {

    public void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    private void quickSort(int[] arr, int left, int right) {
        //递归跳出条件
        if (left > right) {
            return;
        }
        int low = left;
        int high = right;
        int cur = arr[left];
        while (low < high) {
            while (low < high && arr[high] >= cur) {
                high--;
            }
            while (low < high && arr[low] <= cur) {
                low++;
            }
            if (low < high) {
                swapNumber(arr, low, high);
            }
        }
        swapNumber(arr, left, low);
        quickSort(arr, left, high - 1);
        quickSort(arr, high + 1, right);
    }

    private void swapNumber(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}


/**
 * 组合、排列、子集
 */
class PersonalProgress1 {

    /**
     * findQue完成情况：done
     */
    public List<List<Integer>> findQue(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<Integer> path = new LinkedList<>();
        dfs(arr, (LinkedList<Integer>) path, res);
        return res;
    }

    public List<List<Integer>> findQue2(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<Integer> path = new LinkedList<>();
        int startIndex = 0;
        dfs(arr, startIndex, (LinkedList<Integer>) path, res);
        return res;
    }

    public List<List<Integer>> findQue3(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<Integer> path = new LinkedList<>();
        boolean[] used = new boolean[arr.length];
        dfs(arr, used, (LinkedList<Integer>) path, res);
        return res;
    }

    /**
     * 带startIndex的遍历: 属于组合问题，
     * <p>
     * 一般的场景是：1-n的树，选择k个，形成的组合；
     * 我们这个相当于n=3,k=3的组合，答案只有1，2，3
     *
     * @param arr
     * @param startIndex
     * @param path
     * @param res
     */
    private void dfs(int[] arr, int startIndex, LinkedList<Integer> path, List<List<Integer>> res) {
        if (path.size() == arr.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        //这边i可以剪枝
        for (int i = startIndex; i < arr.length; i++) {
            path.add(arr[i]);
            dfs(arr, i + 1, path, res);
            path.removeLast();
        }
    }

    /**
     * 这种方式找出了 {1,2,3}的全部组合，每个位置都有3种选择，共27种答案；
     * 啥特殊参数都不带的遍历
     * <p>
     * 完成情况：done
     *
     * @param arr
     * @param path
     * @param res
     */
    private void dfs(int[] arr, LinkedList<Integer> path, List<List<Integer>> res) {
        if (path.size() == arr.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            path.add(arr[i]);
            dfs(arr, path, res);
            path.removeLast();
        }
    }


    /**
     * 带used参数的选择
     *
     * @param arr
     * @param used
     * @param path
     * @param res
     */
    private void dfs(int[] arr, boolean[] used, LinkedList<Integer> path, List<List<Integer>> res) {
        if (path.size() == arr.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            path.add(arr[i]);
            dfs(arr, used, path, res);
            path.removeLast();
            used[i] = false;
        }
    }


    /**
     * 下一个排列
     * <p>
     * 完成情况：done
     *
     * @param nums
     */
    public void nextPermutation(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        int high = nums.length - 1;
        int low = high - 1;
        if (nums[low] < nums[high]) {
            swap(nums, low, high);
            return;
        } else {
            while (low >= 0 && nums[low] >= nums[high]) {
                high = high - 1;
                low = high - 1;
            }
            if (low == -1) {
                //排完序的数组；
                Arrays.sort(nums);
                return;
            } else {
                //寻找diff最小的值替代low位置上的值；然后对high-arr.length-1位置上的值进行排序；
                int index = findMinDiffIndex(low, nums.length - 1, nums);
                swap(nums, low, index);
                Arrays.sort(nums, high, nums.length);
                return;
            }
        }
    }

    private int findMinDiffIndex(int low, int maxIndex, int[] arr) {
        int minDiff = Integer.MAX_VALUE;
        int res = low;
        for (int i = low + 1; i <= maxIndex; i++) {
            if (arr[i] <= arr[low]) {
                continue;
            }
            if (Math.abs(arr[i] - arr[low]) < minDiff) {
                res = i;
            }
        }
        return res;
    }

    private void swap(int[] arr, int low, int high) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }


    /**
     * 组合总和
     * 需求：arr[2,2,3,7] 无重复元素数组，每个数字可以被重复选择
     *
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        LinkedList<Integer> path = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        int sum = 0;
        dfs(map, candidates, target, res, path, sum);
        return res;
    }

    private void dfs(HashMap<String, Integer> map, int[] candidates, int target, List<List<Integer>> res, LinkedList<Integer> path, int sum) {
        if (sum == target) {
            //String pathString = toListString(new ArrayList<>(path));
           /* if (!map.containsKey(pathString)) {
                //setMap(map, pathString);

            }*/
            res.add(new ArrayList<>(path));
            return;
        }
        if (sum > target) {
            return;
        }
        for (int i = 0; i < candidates.length; i++) {
            sum += candidates[i];
            path.addLast(candidates[i]);
            dfs(map, candidates, target, res, path, sum);
            path.removeLast();
            sum -= candidates[i];
        }
    }

    private void setMap(HashMap<String, Integer> map, String path) {
        if (map.containsKey(path)) {
            return;
        } else {
            map.put(path, 1);
        }
    }

    private String toListString(List<Integer> path) {
        path.sort(Integer::compareTo);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < path.size(); i++) {
            sb.append(path.get(i));
        }
        return sb.toString();
    }

}


/**
 * 滑动窗口
 * <p>
 * 完成情况：done
 */
class PersonalProgress2 {


    public int[] maxSlidingWindow(int[] arr, int w) {

        LinkedList<Integer> queueMax = new LinkedList<>();
        int[] res = new int[arr.length - w + 1];

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            //维护queueMax队列，只存放窗口最大值
            while (!queueMax.isEmpty() && arr[queueMax.peekLast()] <= arr[i]) {
                queueMax.pollLast();
            }
            //进数据
            queueMax.addLast(i);
            if (queueMax.peekFirst() == i - w) {
                //出数据
                queueMax.pollFirst();
            }
            //存放结果集
            if (i >= w - 1) {
                res[index++] = arr[queueMax.peekFirst()];
            }
        }
        return res;
    }


}

/**
 * 动态规划
 */
class PersonalProgress3 {


    /**
     * 1. 最长递增子序列
     * <p>
     * 完成情况：done
     *
     * @param arr
     * @return
     */
    public int lengthOfLIS(int[] arr) {

        int res = Integer.MIN_VALUE;
        int[] dp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            res = Math.max(dp[i], res);
        }
        return res;
    }


    /**
     * 最长递增子串
     *
     * @param arr
     * @return
     */
    public int lengthOfLISString(int[] arr) {

        int res = Integer.MIN_VALUE;
        int[] dp = new int[arr.length];
        dp[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            dp[i] = 1;
            if (arr[i] > arr[i - 1]) {
                dp[i] = Math.max(dp[i], dp[i - 1] + 1);
            }
            res = Math.max(dp[i], res);
        }
        return res;
    }


    /**
     * 0-1背包问题：获取最大价值
     *
     * @param weight
     * @param values
     * @param threshold
     * @return
     */
    public int getMaxValue(int[] weight, int[] values, int threshold) {
        int[][] dp = new int[weight.length][threshold + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int i = 1; i < dp[0].length; i++) {
            if (weight[0] < i) {
                dp[0][i] = values[0];
            } else {
                dp[0][i] = 0;
            }
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                if (j - weight[i] > 0) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i]] + values[i]);
                }
            }
        }
        return dp[weight.length - 1][threshold];
    }


    /**
     * 最小路径和
     * <p>
     * 完成情况：done
     *
     * @param grid
     * @return
     */
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        int curSum = 0;
        for (int i = 0; i < grid.length; i++) {
            dp[i][0] = grid[i][0] + curSum;
            curSum = dp[i][0];
        }
        curSum = 0;
        for (int i = 0; i < grid[0].length; i++) {
            dp[0][i] = grid[0][i] + curSum;
            curSum = dp[0][i];
        }
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[grid.length - 1][grid[0].length - 1];
    }

    /**
     * 最长有效括号
     *
     * @param s
     * @return
     */
    public int longestValidParentheses(String s) {
        return 0;
    }


    /**
     * 不同路径
     * <p>
     * 完成情况：done
     *
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        //m代表行，n代表列
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }
        return dp[m - 1][n - 1];
    }


    /**
     * 不同路径II
     * <p>
     * 带着障碍物的不同路径
     *
     * @param obstacleGrid
     * @return
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        return 0;
    }
}


/**
 * 二叉树、二叉搜索树相关
 */
class PersonalProgress4 {

    /**
     * 二叉树的层次遍历
     * <p>
     * 完成情况：done
     *
     * @param root
     * @return
     */
    public List<List<Integer>> printTreeByLevel(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<List<Integer>> res = new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> innerRes = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                innerRes.add(cur.val);
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
            }
            res.add(innerRes);
        }
        Collections.reverse(res);
        return res;
    }


    /**
     * 路径总和
     * <p>
     * 完成情况：done
     *
     * @param root
     * @param targetSum
     * @return
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        targetSum -= root.val;
        if (root.left == null && root.right == null && targetSum == 0) {
            return true;
        }
        boolean left = hasPathSum(root.left, targetSum);
        boolean right = hasPathSum(root.right, targetSum);
        return left || right;
    }


    /**
     * 前序遍历的全路径
     */
    public List<List<Integer>> preOrderTree(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        preOderTree(root, path, res);
        return res;
    }

    private void preOderTree(TreeNode root, List<Integer> path, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        if (root.left == null && root.right == null) {
            res.add(new ArrayList<>(path));
            return;
        }
        preOderTree(root.left, path, res);
        path.remove(path.size() - 1);
        preOderTree(root.right, path, res);
        path.remove(path.size() - 1);
    }


    /**
     * 二叉树的中序遍历
     * <p>
     * 完成情况：done
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, res);
        return res;

    }

    private void dfs(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        dfs(root.left, res);
        res.add(root.val);
        dfs(root.right, res);
    }

    /**
     * 验证二叉搜索树
     * <p>
     * <p>
     * 二叉搜索树：
     * 1. 左子树的最右节点< root 节点
     * 2. 右子树的最左节点> root 节点
     * 3. 左子树所有节点都< root节点
     * 4. 右子树所有节点都> root节点
     * <p>
     * 3.二叉搜索树的特质：中序遍历的数组是排序数组；
     * <p>
     * <p>
     * 完成情况：done
     *
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root) {
        return dfs(root);
    }

    private boolean dfs(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean leftFlag = dfs(root.left);
        boolean flag = false;
        TreeNode leftCurNode = findLeftTreeRightNode(root.left);
        TreeNode rightCurNode = findRightTreeLeftNode(root.right);
        if (leftCurNode != null && rightCurNode != null) {
            flag = leftCurNode.val < root.val && root.val < rightCurNode.val;
        } else if (leftCurNode == null && rightCurNode != null) {
            flag = root.val < rightCurNode.val;
        } else if (leftCurNode != null && rightCurNode == null) {
            flag = leftCurNode.val < root.val;
        } else if (leftCurNode == null && rightCurNode == null) {
            flag = true;
        }
        boolean rightFlag = dfs(root.right);
        return leftFlag && flag && rightFlag;
    }


    /**
     * 寻找左子树的最右节点
     *
     * @param root
     * @return
     */
    private TreeNode findLeftTreeRightNode(TreeNode root) {
        if (root == null) {
            return null;
        }
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }


    /**
     * 寻找左子树的最右节点
     */
    private TreeNode findRightTreeLeftNode(TreeNode root) {
        if (root == null) {
            return null;
        }
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }


    /**
     * 二叉树的最大深度
     * <p>
     * 完成情况：done
     *
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return 1 + Math.max(leftDepth, rightDepth);
    }


    /**
     * 二叉树的最小深度
     * <p>
     * 最小深度：从根节点到最近叶子节点的最短路径上的节点数量；
     * <p>
     * <p>
     * 完成情况：done
     *
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        if (leftDepth == 0) {
            return rightDepth + 1;
        } else if (rightDepth == 0) {
            return leftDepth + 1;
        }
        return Math.min(leftDepth, rightDepth) + 1;
    }

    /**
     * 平衡二叉树
     * <p>
     * 一个二叉树每个节点的左右两个子树的高度差的绝对值不超过 1 。
     * <p>
     * 思路：
     * 1.分：对每个节点都看下左右子树的高度差；
     * 2.合：比较左右子树的高度差；
     * <p>
     * <p>
     * 完成情况：done
     *
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean leftChoose = isBalanced(root.left);
        boolean rightChoose = isBalanced(root.right);
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        int diff = Math.abs(leftDepth - rightDepth);
        return leftChoose && rightChoose && diff <= 1;
    }


    /**
     * 求根节点到叶子节点数字之和
     * <p>
     * <p>
     * 完成情况：done
     *
     * @param root
     * @return
     */
    public int sumNumbers(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        if (root == null) {
            return 0;
        }
        findPath(root, path, res);
        int sum = 0;
        for (int i = 0; i < res.size(); i++) {
            List<Integer> inners = res.get(i);
            StringBuilder sb = new StringBuilder();
            for (Integer temp : inners) {
                sb.append(temp);
            }
            sum += Integer.valueOf(sb.toString());
        }
        return sum;
    }

    /**
     * 寻找头节点---->叶子节点的全路径
     *
     * @param root
     * @param path
     * @param res
     */
    private void findPath(TreeNode root, LinkedList<Integer> path, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        //path.add(value)必须写在这边；
        path.add(root.val);
        if (root.left == null && root.right == null) {
            res.add(new ArrayList<>(path));
            return;
        }
        if (root.left != null) {
            findPath(root.left, path, res);
            path.removeLast();
        }
        if (root.right != null) {
            findPath(root.right, path, res);
            path.removeLast();
        }
    }


    /**
     * 路径总和II:时间复杂度不低,运行时间较长；
     * <p>
     * 完成情况：done
     *
     * @param root
     * @param targetSum
     * @return
     */
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        findPath(root, path, res, targetSum);
        return res;
    }

    private void findPath(TreeNode root, LinkedList<Integer> path, List<List<Integer>> res, int targetSum) {
        if (root == null) {
            return;
        }
        //path.add(value)必须写在这边；
        path.add(root.val);
        if (root.left == null && root.right == null && getPathSum(path) == targetSum) {
            res.add(new ArrayList<>(path));
            return;
        }
        if (root.left != null) {
            findPath(root.left, path, res, targetSum);
            path.removeLast();
        }
        if (root.right != null) {
            findPath(root.right, path, res, targetSum);
            path.removeLast();
        }
    }

    private int getPathSum(List<Integer> path) {
        if (path == null) {
            return 0;
        }
        int sum = 0;
        for (Integer temp : path) {
            sum += temp;
        }
        return sum;
    }


    /**
     * 从前序和中序遍历序列构造二叉树
     * <p>
     * 1.前序序列第一个元素为root节点；
     * 2.root节点到中序序列中选择位置；
     * 3.位置左边为左子树节点，位置右边为右子树节点；
     *
     * @param preorder
     * @param inorder
     * @return
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null) {
            return null;
        }
        if (preorder.length != inorder.length) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        root.left = preConstructTree(preorder, inorder, 0);
        root.right = preConstructTree(preorder, inorder, 0);
        return root;
    }

    /**
     * 构建树
     *
     * @param preorder
     * @param inorder
     * @return
     */
    private TreeNode preConstructTree(int[] preorder, int[] inorder, int startIndex) {
        int targetIndex = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[startIndex]) {
                targetIndex = i;
                break;
            }
        }
        TreeNode root = new TreeNode(startIndex);
        root.left = preConstructTree(preorder, inorder, startIndex + 1);
        root.right = preConstructTree(preorder, inorder, targetIndex + 1);
        return root;
    }


    /**
     * 二叉树中的最大路径和
     * <p>
     * 路径：被定义为一条从树中任意节点出发，沿父节点-子节点连接，达到任意节点的序列。
     * 同一个节点在一条路径序列中至多出现一次。该路径至少包含一个节点，且不一定经过根节点。
     *
     * @param root
     * @return
     */
    public int maxPathSum(TreeNode root) {


        return 0;
    }

}

/**
 * 栈、队列、数组等数据结构相关
 */
class PersonalProgress5 {


}

/**
 * 双指针相关
 */
class PersonalProgress6 {


}

/**
 * 字符串相关
 */
class PersonalProgress7 {


}


/**
 * 数组相关
 */
class PersonalProgress8 {

    /**
     * 复写0
     * <p>
     * 完成情况：done
     *
     * @param arr
     */
    public void duplicateZeros(int[] arr) {
        List<Integer> innerList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            innerList.add(arr[i]);
            if (arr[i] == 0) {
                innerList.add(0);
            }
        }
        List<Integer> resList = innerList.subList(0, arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = resList.get(i);
        }
    }


    /**
     * 完成情况：done
     *
     * @param arr
     */
    public void duplicateZeros2(int[] arr) {
        int leftZeroSize = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                ++leftZeroSize;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            //leftZeroSize统计的是当前位置左侧0的个数，因此如果当前位置为0，那么左侧0的位置需要减一；
            if (arr[i] == 0) {
                leftZeroSize--;
            }
            //当前位置的值，移动到未来的某个位置；
            if (i + leftZeroSize < arr.length) {
                arr[i + leftZeroSize] = arr[i];
            }
            //当前位置为0，那么当前位置的下一个位置，需要置为0，前提都是需要满足放置位置小于arr.length;
            if (i + leftZeroSize + 1 < arr.length && arr[i] == 0) {
                arr[i + leftZeroSize + 1] = 0;
            }
        }
    }


    /**
     * 盛最多水的容器
     * <p>
     * 测试用例通过，但是时间复杂度较高；
     */
    public int maxArea(int[] height) {
        //含义：以i位置结尾的最大放水面积为dp[i];
        int[] dp = new int[height.length];
        dp[0] = 0;
        dp[1] = height[0] > height[1] ? height[1] : height[0];
        if (height.length < 1) {
            return 0;
        }
        if (height.length == 2) {
            return dp[1];
        }
        int res = Integer.MIN_VALUE;
        int maxSize = 0;
        int minValue = 0;
        for (int i = 2; i < height.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (height[j] > height[i]) {
                    maxSize = Math.max(Math.max(height[i] * (i - j), dp[j]), maxSize);
                } else if (height[j] <= height[i]) {
                    minValue = height[j];
                    maxSize = Math.max(Math.max(maxSize, minValue * (i - j)), dp[j]);
                }
                dp[i] = maxSize;
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }


    public int maxArea2(int[] height) {

        return 0;
    }

    /**
     * 最接近的三数之和
     * <p>
     * 暴力解法：
     * 1.滑动窗口：窗口值为3，然后计算每个窗口的和；找到最接近的和即可； (做法不对)
     * <p>
     * 双指针法：
     * 1. 先对数组排序
     * 2. 固定一个数字，建立头尾指针遍历寻找
     * <p>
     * <p>
     * 完成情况：done
     */
    public int threeSumClosest(int[] nums, int target) {
        //先对数组进行排序
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        //记录和与target相差最小的diff
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int curSum = nums[i] + nums[high] + nums[low];
                if (curSum == target) {
                    return target;
                } else if (curSum < target) {
                    low++;
                } else if (curSum > target) {
                    high--;
                }
                int diff = Math.abs(target - curSum);
                if (diff < minDiff) {
                    minDiff = Math.min(minDiff, diff);
                    res = curSum;
                }
            }
        }
        return res;
    }

    /**
     * 移除元素
     *
     * @param nums
     * @param val
     * @return 完成情况：done
     */
    public int removeElement(int[] nums, int val) {
        int targetNumSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                int cur = Integer.MAX_VALUE;
                targetNumSize++;
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - 1] = cur;
                i = -1;
            }
        }
        return nums.length - targetNumSize;
    }


    /**
     * 完成情况：done
     *
     * @param nums
     * @param val
     * @return
     */
    public int removeElement2(int[] nums, int val) {
        //index始终指向不等于val的位置，index指向的位置等于val,就不动了
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }


    /**
     * 搜索插入位置
     * <p>
     * 完成情况：done
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            }
        }
        if (target > nums[low]) {
            return low + 1;
        } else if (target < nums[low]) {
            return low;
        }
        return low;
    }


    /**
     * 全排列
     * <p>
     * 完成情况：done
     */
    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> path = new LinkedList<>();
        boolean[] used = new boolean[nums.length];
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums, path, used, res);
        return res;
    }

    private void dfs(int[] nums, LinkedList<Integer> path, boolean[] used, List<List<Integer>> res) {
        if (nums.length == path.size()) {
            res.add(new ArrayList<>(path));
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            path.addLast(nums[i]);
            used[i] = true;
            dfs(nums, path, used, res);
            used[i] = false;
            path.removeLast();
        }
    }

    /**
     * 在排序数组中查找元素的第一个和最后一个位置
     * <p>
     * 思路：两次二分查找
     * 1.查找最左匹配的target 左边界
     * 2.查找最右匹配的target 右边界
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange(int[] nums, int target) {

        return null;

    }


    /**
     * 最大子数组和
     * <p>
     * 完成情况：done
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        //dp[i]: i位置的最大子数组和为dp[i]；从i位置开始或者以i位置结束
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = dp[0];
        for (int i = 1; i < nums.length; i++) {
            //考虑子数组的连续性；子数组要么从i位置开始，要么以i位置结束；
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
            res = Math.max(res, dp[i]);
        }
        return res;
    }


    /**
     * 加一
     *
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        int over = 0;
        int sum = digits[digits.length - 1] + 1;
        digits[digits.length - 1] = sum % 10;
        over = sum / 10;
        for (int i = digits.length - 2; i >= 0; i--) {
            int tempSum = digits[i] + over;
            digits[i] = tempSum % 10;
            over = tempSum / 10;
        }
        if (over != 0) {
            int[] res = new int[digits.length + 1];
            res[0] = over;
            for (int i = 0; i < digits.length; i++) {
                res[i + 1] = digits[i];
            }
            return res;
        }
        return digits;
    }


    /**
     * 删除有序数组中的重复项 II
     * <p>
     * 原地修改数组，空间复杂度O(1)
     * <p>
     * 完成情况：done
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        int startIndex = 0;
        int endIndex = startIndex;
        int duplicateSize = 1;
        int threshold = 2;
        int allStep = 0;
        int numLength = nums.length;
        for (int i = 0; i <= numLength - 1; i++) {
            startIndex = endIndex = i;
            //找当前startIndex重复的数据；
            while (endIndex < numLength) {
                endIndex++;
                if (endIndex < numLength && nums[endIndex] == nums[startIndex]) {
                    duplicateSize++;
                } else {
                    break;
                }
            }
            if (duplicateSize > threshold) {
                //所有元素往前移动duplicateSize-threshold位；
                int step = duplicateSize - threshold;
                allStep += step;
                removeSameNumber(endIndex - 1, nums, step);
                i = endIndex - step - 1;
                numLength = numLength - step;
            }
            duplicateSize = 1;
        }
        return nums.length - allStep;
    }

    private void removeSameNumber(int endIndex, int[] nums, int step) {
        for (int i = endIndex; i <= nums.length - 1; i++) {
            nums[i - step] = nums[i];
        }
    }


    /**
     * 删除有序数组中的重复项 II (方式2)
     * <p>
     * <p>
     * 利用双指针
     * <p>
     * 完成情况：done
     *
     * @param nums
     * @return
     */
    public int removeDuplicates2(int[] nums) {
        int low = 1;
        for (int high = 2; high < nums.length; high++) {
            if (nums[high] == nums[low] && nums[high] == nums[low - 1]) {
                continue;
            }
            low += 1;
            nums[low] = nums[high];
        }
        return low + 1;
    }


    /**
     * 跳跃游戏
     *
     * @param nums
     * @return
     */
    public boolean canJump(int[] nums) {


        return false;
    }

    /**
     * BFS 解决跳跃问题
     *
     * @param nums
     * @return
     */
    public boolean canJump2(int[] nums) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[nums.length];
        q.offer(0);
        while (!q.isEmpty()) {
            for (int size = q.size(); size > 0; size--) {
                // idx is current position
                int idx = q.remove();
                // if this condition is true, we can find an answer
                if (idx >= nums.length - 1) return true;
                // i is the next rightmost position we can reach
                for (int i = idx + 1; i < nums.length &&
                        i <= idx + nums[idx]; i++) {
                    if (visited[i]) continue;
                    visited[i] = true;
                    q.offer(i);
                }
            }
        }
        return false;
    }


    /**
     * 合并两个有序数组
     * <p>
     * 完成情况：done
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null && nums2 == null) {
            return;
        }
        if (m <= 0 && n <= 0) {
            return;
        }
        if (m > 0 && n <= 0) {
            return;
        }
        int low1 = 0;
        int low2 = 0;
        int step = 0;
        while (low1 < m + step && low2 < n) {
            if (nums1[low1] < nums2[low2]) {
                low1++;
            } else if (nums1[low1] >= nums2[low2]) {
                moveArr(low1, nums1, m + step);
                nums1[low1] = nums2[low2];
                low2++;
                low1++;
                step++;
            }
        }
        while (low2 < n) {
            nums1[low1++] = nums2[low2++];
        }
    }

    private void moveArr(int low1, int[] nums1, int m) {
        for (int i = m - 1; i >= low1; i--) {
            nums1[i + 1] = nums1[i];
        }
    }


    /**
     * 只出现一次的数字
     * <p>
     * 思路：本质上应该是要使用位运算来解答；
     * <p>
     * 完成情况：done
     *
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int next = 1;
        while (next < nums.length) {
            if (nums[start] == nums[next]) {
                start += 2;
                next += 2;
            } else {
                break;
            }
        }
        return nums[start];
    }
}


/**
 * 链表相关
 */

class PersonalProgress9 {

    /**
     * 两两交换链表中的节点
     * <p>
     * 题目: 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。
     * 你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
     * <p>
     * 完成情况：done
     *
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        //指向第一个节点
        ListNode low = head;
        // 指向第二个节点，这样可以保证每次反转low-high范围内的节点；
        // low和high的step=2;
        ListNode high = low.next;
        ListNode newHead = null;
        ListNode curHead = reverseNode(low, high);
        newHead = curHead;
        low = newHead;
        high = low.next;
        while (low != null && low.next != null && low.next.next != null && high != null) {
            //low和high同时后移两位；
            if (low.next != null) {
                low = low.next.next;
            }
            if (high.next != null) {
                high = high.next.next;
            }
            if (high != null && low != null) {
                ListNode curNode = reverseNode(low, high);
                curHead.next.next = curNode;
                curHead = curHead.next.next;
                low = curNode;
                high = curNode.next;
            }
        }
        return newHead;
    }

    private ListNode reverseNode(ListNode low, ListNode high) {
        if (high == null) {
            return low;
        }
        ListNode temp = high.next;
        high.next = low;
        low.next = temp;
        return high;
    }


    /**
     * 反转单链表
     * <p>
     * 完成情况：done
     */

    public ListNode reverseNode(ListNode head) {
        if (head == null) {
            return null;
        }
        //遍历节点cur
        ListNode cur = head;
        //指向cur节点的下一个节点
        ListNode next = null;
        //指向cur节点的前一个节点；
        ListNode pre = null;
        while (cur != null) {
            //记录下一个节点
            next = cur.next;
            //反转链表
            cur.next = pre;
            //更新指针
            pre = cur;
            //更新为下一个节点的指向；为了继续循环迭代
            cur = next;
        }
        //cur==null，跳出循环，返回cur节点的前一个节点，也就是pre节点；
        return pre;
    }


    /**
     * 删除链表的倒数第n个节点
     * <p>
     * 方式1：遍历两次
     * <p>
     * 方式2：快慢指针，遍历一次；
     * <p>
     * 完成情况：done
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        ListNode pre = null;
        int sum = 0;
        while (cur != null) {
            sum++;
            cur = cur.next;
        }
        cur = head;
        //pre记录当前节点的前一个节点
        for (int i = 0; i < sum - n; i++) {
            pre = cur;
            cur = cur.next;
        }
        //考虑边界情况，删除头节点；
        if (pre == null) {
            return head.next;
        }
        //删除cur节点；
        pre.next = cur.next;
        return head;
    }


    /**
     * 合并两个有序列表
     * <p>
     * 完成情况：done
     *
     * @param list1
     * @param list2
     * @return
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode newHead = new ListNode(0);
        ListNode curNode = newHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                curNode.next = new ListNode(list1.val);
                list1 = list1.next;
                curNode = curNode.next;
            } else if (list1.val > list2.val) {
                curNode.next = new ListNode(list2.val);
                list2 = list2.next;
                curNode = curNode.next;
            } else if (list1.val == list2.val) {
                curNode.next = new ListNode(list1.val);
                curNode = curNode.next;
                curNode.next = new ListNode(list2.val);
                list1 = list1.next;
                list2 = list2.next;
                curNode = curNode.next;
            }
        }
        while (list1 != null) {
            curNode.next = new ListNode(list1.val);
            list1 = list1.next;
            curNode = curNode.next;
        }
        while (list2 != null) {
            curNode.next = new ListNode(list2.val);
            list2 = list2.next;
            curNode = curNode.next;
        }
        return newHead.next;
    }


    /**
     * 删除排序链表中的重复元素II
     * <p>
     * 完成情况：done
     *
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode curHead = head;
        ListNode pre = null;
        ListNode low = head;
        ListNode high = low.next;
        ListNode next = null;
        while (high != null) {
            next = high.next;
            if (high.val == low.val) {
                while (high != null) {
                    high = high.next;
                    if (high != null) {
                        next = high.next;
                    } else {
                        next = null;
                    }
                    if (high != null && high.val != low.val) {
                        break;
                    }
                }

                if (pre == null) {
                    curHead = high;
                    low = curHead;
                    if (curHead != null) {
                        high = curHead.next;
                    } else {
                        high = null;
                    }
                } else {
                    pre.next = high;
                    low = high;
                    high = next;
                }
            } else {
                pre = low;
                low = high;
                high = next;
            }
        }
        if (curHead != head) {
            return curHead;
        }
        return head;
    }


    /**
     * 分隔链表：未完成
     *
     * @param head
     * @param x
     * @return
     */
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }
        ListNode targetIndex = null;
        while (head != null) {
            if (head.val == x) {
                targetIndex = head;
                break;
            }
            head = head.next;
        }
        if (targetIndex == null) {
            return null;
        }


        ListNode low = head;
        ListNode lowNext = low.next;
        ListNode high = targetIndex.next;


        if (high.val >= x) {
            high = high.next;
        } else {
            low.next = high;
            high.next = lowNext;
            low = lowNext;
        }
        return null;
    }


    /**
     * 环形链表
     * <p>
     * 思路：
     * 快慢指针：快指针一次走两步，慢指针一次走一步，如果快指针追上了慢指针，则说明有环的存在；
     * <p>
     * 完成情况：done
     *
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = true;
                break;
            }
        }
        return flag;
    }


    /**
     * 对链表进行插入排序
     * <p>
     * <p>
     * 插入排序：
     * 1. 左边部分有序，右边部分遍历插入；
     * 2. 左边部分始终从0位置开始，查找遍历数字插入的位置，然后插入即可；
     * <p>
     * <p>
     * 完成情况：done
     *
     * @param head
     * @return
     */
    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return null;
        }
        //采用一个虚拟节点，便于在头部插入节点；
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        ListNode cur = head;
        ListNode preNext = dummy;
        ListNode next = null;
        dummy.next = head;
        while (cur != null && cur.next != null) {
            next = cur.next;
            if (next.val > cur.val) {
                cur = cur.next;
            } else {
                //寻找插入位置；
                while (preNext != null) {
                    preNext = pre.next;
                    if (preNext.val < next.val) {
                        pre = pre.next;
                    } else {
                        break;
                    }
                }
                //pre和preNext节点之间插入next节点；
                ListNode temp = next.next;
                pre.next = next;
                next.next = preNext;
                cur.next = temp;
                //pre重新指向dummy,每次都从dummy开始寻找插入位置；
                pre = dummy;
            }
        }
        return dummy.next;
    }
}


/**
 * 矩阵相关
 */
class PersonalProgress10 {


    /**
     * 矩阵置0
     * <p>
     * 完成情况：done
     *
     * @param matrix
     */
    public void setZeroes(int[][] matrix) {
        if (matrix == null) {
            return;
        }
        List<Pair<Integer, Integer>> path = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    Pair<Integer, Integer> pair = new Pair(i, j);
                    path.add(pair);
                }
            }
        }
        if (path.size() == 0) {
            return;
        }

        for (Pair<Integer, Integer> pair : path) {
            int row = pair.getKey();
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[row][i] = 0;
            }
            int col = pair.getValue();
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][col] = 0;
            }
        }
    }


    /**
     * 搜索二维矩阵
     * <p>
     * 完成情况：done
     * <p>
     * 思路：根据二维数组中数字排列的特性，从矩阵的左下角进行向右和向上的搜素；
     *
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null) {
            return false;
        }
        int row = matrix.length - 1;
        boolean flag = false;
        int col = 0;
        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] > target) {
                row--;
            } else if (matrix[row][col] < target) {
                col++;
            } else if (matrix[row][col] == target) {
                flag = true;
                break;
            }
        }
        return flag;
    }


    /**
     * 单词搜索：自己写的，存在问题，有点思路没想通透；
     *
     * @param board
     * @param word
     * @return
     */
    public boolean exist(char[][] board, String word) {
        if (word == null) {
            return false;
        }
        char endStrCharacter = word.charAt(word.length() - 1);
        List<String> res = new ArrayList<>();
        String path = "";
        boolean[][] used = new boolean[board.length][board.length];
        int curRow = 0;
        int curCol = 0;
        dfs(res, path, used, board, curRow, curCol);
        return false;
    }

    private void dfs(List<String> res, String path, boolean[][] used, char[][] board, int curRow, int curCol) {
        if (curCol > board[0].length - 1 || curRow < 0 || curCol < 0 || curRow > board.length - 1) {
            return;
        }
        if (curRow == board.length - 1 && curCol == board[0].length - 1) {
            res.add(path);
            return;
        }
        if (!used[curRow][curCol]) {
            path += board[curRow][curCol];
        }
        used[curRow][curCol] = true;
        dfs(res, path, used, board, curRow + 1, curCol);
        dfs(res, path, used, board, curRow - 1, curCol);
        dfs(res, path, used, board, curRow, curCol + 1);
        dfs(res, path, used, board, curRow, curCol - 1);
        used[curRow][curCol] = false;
        path.replaceFirst(Character.toString(board[curRow][curCol]), "");
    }


    public boolean exist2(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                //从[i,j]这个坐标开始查找
                if (dfs(board, words, i, j, 0))
                    return true;
            }
        }
        return false;
    }

    boolean dfs(char[][] board, char[] word, int i, int j, int index) {
        //边界的判断，如果越界直接返回false。index表示的是查找到字符串word的第几个字符，
        //如果这个字符不等于board[i][j]，说明验证这个坐标路径是走不通的，直接返回false
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[index])
            return false;
        //如果word的每个字符都查找完了，直接返回true
        if (index == word.length - 1)
            return true;
        //把当前坐标的值保存下来，为了在最后复原
        char tmp = board[i][j];
        //然后修改当前坐标的值
        board[i][j] = '.';
        //走递归，沿着当前坐标的上下左右4个方向查找
        boolean res = dfs(board, word, i + 1, j, index + 1) || dfs(board, word, i - 1, j, index + 1) ||
                dfs(board, word, i, j + 1, index + 1) || dfs(board, word, i, j - 1, index + 1);
        //递归之后再把当前的坐标复原
        board[i][j] = tmp;
        return res;
    }


    /**
     * 合并区间
     * <p>
     * 完成情况：done 耗时较多
     *
     * @param intervals
     * @return
     */
    public int[][] merge(int[][] intervals) {
        int minIndex = findLowestIndex(intervals);
        int nextIndex = findLowerIndex(intervals, minIndex, intervals[minIndex][0]);
        if (intervals.length <= 1) {
            return intervals;
        }
        int first = minIndex;
        int next = nextIndex;
        int firstLow = intervals[first][0];
        int firstHigh = intervals[first][1];
        int nextLow = intervals[next][0];
        int nextHigh = intervals[next][1];
        int size = 0;
        int totalSize = 0;
        int searchTime = 0;
        while (searchTime < intervals.length - 1) {
            //查看high位置的可能性，然后比较second的区间长度是否和first区间长度有重合，不就完事了；
            if (nextHigh < firstLow) {
                first = next;
                next = next + 1;
            } else if (nextHigh >= firstLow && nextHigh <= firstHigh) {
                int step = nextHigh - nextLow;
                int preStep = nextHigh - firstLow;
                if (step >= preStep) {
                    intervals[first][0] = nextLow;
                } else {
                    intervals[next][0] = intervals[first][0];
                    intervals[next][1] = intervals[first][0];
                }
                size++;
            } else if (nextHigh > firstHigh) {
                int gap = nextLow - firstHigh;
                int preLowStep = nextLow - firstLow;
                if (gap <= 0) {
                    if (preLowStep >= 0) {
                        intervals[first][1] = nextHigh;
                    } else {
                        intervals[first][0] = intervals[next][0];
                        intervals[first][1] = intervals[next][1];
                    }
                    size++;
                }
            }
            if (size != 0) {
                intervals[next][0] = intervals[first][0];
                intervals[next][1] = intervals[first][1];
                intervals[first][0] = Integer.MAX_VALUE;
                totalSize += size;
                size = 0;
            }
            first = next;
            next = findLowerIndex(intervals, next, nextLow);
            if (searchTime < intervals.length - 1) {
                firstLow = intervals[first][0];
                firstHigh = intervals[first][1];
                nextLow = intervals[next][0];
                nextHigh = intervals[next][1];
                searchTime++;
            }
        }
        int[][] res = null;
        int index = 0;
        if (totalSize != 0) {
            res = new int[intervals.length - totalSize][intervals[0].length];
            for (int i = 0; i < intervals.length; i++) {
                if (intervals[i][0] != Integer.MAX_VALUE) {
                    res[index++] = new int[]{intervals[i][0], intervals[i][1]};
                }
            }
        }
        if (res != null) {
            return res;
        }
        return intervals;
    }


    private int findLowerIndex(int[][] intervals, int index, int value) {
        int minNumber = Integer.MAX_VALUE;
        int targetIndex = 0;
        for (int i = 0; i < intervals.length; i++) {
            if (i == index) {
                continue;
            }
            if (Math.abs(intervals[i][0] - value) < minNumber && intervals[i][0] >= value) {
                if (Math.abs(intervals[i][0] - value) < minNumber) {
                    minNumber = intervals[i][0] - value;
                    targetIndex = i;
                }
            }
        }
        return targetIndex;
    }


    private int findLowestIndex(int[][] intervals) {
        int minNumber = Integer.MAX_VALUE;
        int targetIndex = 0;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] < minNumber) {
                minNumber = intervals[i][0];
                targetIndex = i;
            }
        }
        return targetIndex;
    }

}


/**
 * 字符串相关
 */
class PersonalProgress11 {


    /**
     * 有效的括号
     * <p>
     * 完成情况：done
     *
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        if (arr.length % 2 != 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] == ')' || arr[0] == ']' || arr[0] == '}') {
                return false;
            }
            if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
                if (arr[i] == '(') {
                    stack.push('(');
                    stack.push(')');
                } else if (arr[i] == '{') {
                    stack.push('{');
                    stack.push('}');
                } else if (arr[i] == '[') {
                    stack.push('[');
                    stack.push(']');
                }
            } else if (arr[i] == ')' || arr[i] == '}' || arr[i] == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (arr[i] == ')') {
                    if (stack.peek() != arr[i]) {
                        return false;
                    }
                    stack.pop();
                    stack.pop();
                } else if (arr[i] == '}') {
                    if (stack.peek() != arr[i]) {
                        return false;
                    }
                    stack.pop();
                    stack.pop();
                } else if (arr[i] == ']') {
                    if (stack.peek() != arr[i]) {
                        return false;
                    }
                    stack.pop();
                    stack.pop();
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }


    /**
     * 括号生成
     * <p>
     * 回溯法：两种选择
     * 1. "("
     * 2. ")"
     *
     * @param n
     * @return
     */
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n <= 0) {
            return res;
        }
        dfs(n, "", res, 0, 0);
        return res;
    }

    private void dfs(int n, String path, List<String> res, int open, int close) {
        // open记录左括号的个数；
        // close记录右括号的个数；
        if (open > n || close > open) {
            return;
        }

        if (path.length() == 2 * n) {
            res.add(path);
            return;
        }

        dfs(n, path + "(", res, open + 1, close);
        dfs(n, path + ")", res, open, close + 1);
    }


    /**
     * 方法2：生成了所有的括号组合；思路比较重要
     *
     * @param n
     * @return
     */
    public List<String> generateParenthesis2(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder path = new StringBuilder();
        char[] arr = new char[]{'(', ')'};
        dfs(arr, res, path, n);
        return res;
    }

    private void dfs(char[] arr, List<String> res, StringBuilder path, int n) {
        if (path.length() == n * 2) {
            res.add(path.toString());
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            path.append(arr[i]);
            dfs(arr, res, path, n);
            path.deleteCharAt(path.length() - 1);
        }
    }

    /**
     * 字符串相乘
     * <p>
     * <p>
     * 完成情况：done
     *
     * @param num1
     * @param num2
     * @return
     */
    public String multiply(String num1, String num2) {
        if (num1.length() == 1 && Integer.valueOf(num1) == 0) {
            return "0";
        }
        if (num2.length() == 1 && Integer.valueOf(num2) == 0) {
            return "0";
        }
        List<String> res = new ArrayList<>();
        int overSize = 0;
        boolean flag = false;
        if (num1.length() < num2.length()) {
            flag = true;
        }
        for (int i = flag == true ? num1.length() - 1 : num2.length() - 1; i >= 0; i--) {
            StringBuilder sb = new StringBuilder();
            for (int j = flag == true ? num2.length() - 1 : num1.length() - 1; j >= 0; j--) {
                int curSum = Integer.valueOf(Character.toString(flag == true ? num2.charAt(j) : num1.charAt(j)))
                        * Integer.valueOf(Character.toString(flag == true ? num1.charAt(i) : num2.charAt(i))) + overSize;
                int tempNum = curSum % 10;
                overSize = curSum / 10;
                sb.append(tempNum);
            }
            if (overSize != 0) {
                sb.append(overSize);
                overSize = 0;
            }
            int step = Math.abs((flag == true ? num1.length() : num2.length()) - 1 - i);
            String resString = sb.reverse().toString();
            for (int k = 0; k < step; k++) {
                resString += "0";
            }
            res.add(resString);
        }
        String resStr = "";
        for (String s : res) {
            resStr = sumString(resStr, s);
        }
        return resStr;
    }

    /**
     * 字符串的十进制求和
     *
     * @param s1
     * @param s2
     * @return
     */
    public String sumString(String s1, String s2) {

        if (s1 == null && s2 != null) {
            return s2;
        } else if (s1 != null && s2 == null) {
            return s1;
        } else if (s1 == null && s2 == null) {
            return "";
        }
        int overSize = 0;


        int size = s1.length() > s2.length() ? s1.length() : s2.length();
        int diff = Math.abs(s1.length() - s2.length());
        int index = size - 1;
        StringBuilder res = new StringBuilder();
        if (s1.length() < s2.length()) {
            for (int i = 0; i < diff; i++) {
                s1 = "0" + s1;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                s2 = "0" + s2;
            }
        }
        while (index >= 0) {
            int curSum = Integer.valueOf(Character.toString(s1.charAt(index))) +
                    Integer.valueOf(Character.toString(s2.charAt(index))) + overSize;
            int curNum = curSum % 10;
            overSize = curSum / 10;
            res.append(curNum);
            index--;
        }
        if (overSize != 0) {
            res.append(overSize);
        }
        return res.reverse().toString();
    }


    /**
     * 验证回文串
     * <p>
     * 完成情况:done
     *
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {

        if (s == null || s.length() == 0) {
            return true;
        }

        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= 'A' && chars[i] <= 'Z')
                    || (chars[i] >= 'a' && chars[i] <= 'z')
                    || (chars[i] >= '0' && chars[i] <= '9')) {
                sb.append(chars[i]);
            }
        }
        String res = sb.toString().toLowerCase();
        int startIndex = 0;
        int endIndex = res.length() - 1;
        boolean flag = true;
        while (startIndex <= endIndex) {
            if (res.charAt(startIndex) == res.charAt(endIndex)) {
                startIndex++;
                endIndex--;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }


    /**
     * 分割回文串
     * <p>
     * <p>
     * 思路：分割回文串类比组合问题
     * <p>
     * 完成情况：done
     *
     * @param s
     * @return
     */
    public List<List<String>> partition(String s) {
        LinkedList<String> path = new LinkedList<>();
        List<List<String>> res = new ArrayList<>();
        int startIndex = 0;
        partitionString(s, path, res, startIndex);
        return res;
    }

    private void partitionString(String s, LinkedList<String> path, List<List<String>> res, int startIndex) {
        //如果起始位置大于s的大小，说明找到了一组分割方案
        if (startIndex >= s.length()) {
            res.add(new ArrayList(path));
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            //如果是回文子串，则记录
            if (isPalindrome(s, startIndex, i)) {
                String str = s.substring(startIndex, i + 1);
                path.addLast(str);
            } else {
                continue;
            }
            //起始位置后移，保证不重复
            partitionString(s, path, res, i + 1);
            path.removeLast();
        }
    }

    //判断是否是回文串
    private boolean isPalindrome(String s, int startIndex, int end) {
        for (int i = startIndex, j = end; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

}

/**
 * 数字相关
 */
class PersonalProgress12 {

    /**
     * Pow(x,n)
     * <p>
     * 暴力破解：超出时间限制；
     *
     * @param x
     * @param n
     * @return
     */
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 1) {
            return 1;
        }
        double res = 1.0;
        double temp = -1.0;
        if (n < 0) {
            temp = temp * n;
        } else {
            temp = n;
        }
        for (int i = 0; i < temp; i++) {
            res = res * x;
        }
        if (n < 0) {
            res = 1 / res;
        }
        return res;
    }


    /**
     * Pow(x,n)：使用递归实现
     * <p>
     * 存在栈溢出
     *
     * @param x
     * @param n
     * @return
     */
    public double myPow2(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 1) {
            return 1;
        }
        if (n < 0) {
            return 1 / dfs(x, -1 * n);
        }
        return dfs(x, n);
    }

    private double dfs(double x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * dfs(x, n - 1);
    }


    /**
     * 二进制位移
     *
     * @param x
     * @param n
     * @return
     */
    public double myPow3(double x, int n) {
        return 0.0;
    }


    /**
     * 解码方法
     * <p>
     * <p>
     * 使用动态规划来实现，但是我这个实现方式可能有问题；
     *
     * @param s
     * @return
     */
    public int numDecodings(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for (int k = 0; k < s.length(); k++) {
            if (s.charAt(k) != 0) {
                dp[k][k] = 1;
            }
        }
        for (int i = s.length() - 2; i >= 0; i--) {
            for (int j = i + 1; j <= s.length() - 1; j++) {
                //行数字
                int rowNum = Integer.valueOf(Character.toString(s.charAt(i)));
                int colNum = Integer.valueOf(Character.toString(s.charAt(j)));
                //当前字符和前一个字符组成的数字
                String twoString = s.substring(j - 1, j + 1);
                int twoNums = Integer.valueOf(s.substring(j - 1, j + 1));
                if (rowNum == 0) {
                    dp[i][j] = 0;
                    continue;
                }
                if (twoString.startsWith("0") && colNum == 0) {
                    dp[i][j] = dp[i][j - 1];
                    continue;
                }
                if (twoNums <= 26) {
                    if (dp[i + 1][j] == dp[i][j - 1] && dp[i + 1][j] == 1) {
                        dp[i][j] = dp[i + 1][j] + dp[i][j - 1];
                    } else if (dp[i + 1][j] == dp[i][j - 1]) {
                        dp[i][j] = dp[i + 1][j] + dp[i][j - 1] - 1;
                    } else if (dp[i + 1][j] != dp[i][j - 1]) {
                        dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                    }
                } else if (twoNums > 26) {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][s.length() - 1];
    }


    /**
     * 三角形最小路径和
     *
     * @param triangle
     * @return
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return 0;
        }
        if (triangle.size() == 1) {
            return triangle.get(0).get(0);
        }
        int sum = 0;
        int firstIndex = triangle.size() - 2;
        int nextIndex = firstIndex + 1;
        int first = 0;
        int next = getNextIndex(triangle, first, firstIndex);
        sum += triangle.get(firstIndex).get(first);
        while (nextIndex >= 0) {
            sum += triangle.get(nextIndex).get(next);
            firstIndex++;
            nextIndex++;
            first = next;
            if (firstIndex < triangle.size() - 1 && first < triangle.size() - 1) {
                next = getNextIndex(triangle, first, firstIndex);
            }
        }
        return sum;
    }

    private int getNextIndex(List<List<Integer>> triangle, int first, int firstIndex) {
        List<Integer> nextRowValue = triangle.get(firstIndex + 1);
        return nextRowValue.get(first) < nextRowValue.get(first + 1) ? first : first + 1;
    }


}







