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


      /*  PersonalProgress8 progress8 = new PersonalProgress8();
        int[] arr = new int[]{9};
        int[] res = progress8.plusOne(arr);
        System.out.print(res);*/

        PersonalProgress11 personalProgress11 = new PersonalProgress11();
        personalProgress11.isValid("(){}}{");


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
     *
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {


        return null;
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
     *
     * @param n
     * @return
     */
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs(n, res);
        return res;
    }

    private void dfs(int n, List<String> res) {

    }

}







