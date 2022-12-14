package algorithm;

import common.ArrayUtil;
import common.TreeNode;
import javafx.util.Pair;
import common.ListNode;

import java.util.*;

/**
 * 个人测试算法题目相关 目的有二
 * <p>
 * 1. 测试相关的算法题练习情况
 * <p>
 * 2. 测试相关的算法思想理解情况
 */
public class PersonalProgressProblem {

    public static void main(String[] args) {
/*
        PersonalProgress14 progress14 = new PersonalProgress14();
        List<String> res = progress14.addOperators("123", 6);
        System.out.print(res);
*/


        int res = minLength("adabbca", "acb");
        System.out.print(res);


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

/*        PersonalProgress12 progress12 = new PersonalProgress12();
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
        progress12.minimumTotal(arr);*/
/*
        PersonalProgress8 progress8 = new PersonalProgress8();
        int[] arr = new int[]{2, 1};
        int kthLargest = progress8.findKthLargest(arr, 1);
        System.out.print(kthLargest);*/


/*        PersonalProgress9 progress9 = new PersonalProgress9();
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        progress9.reverseBetween(root, 2, 4);*/

/*        PersonalProgress4.PersonalProgress42 personalProgress42 = new PersonalProgress4.PersonalProgress42();
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        left.left = new TreeNode(4);
        left.right = new TreeNode(5);
        root.left = left;
        root.right = new TreeNode(3);
        int res = personalProgress42.getMinimumDifference(root);
        System.out.print(res);*/

/*        PersonalProgress15 progress15 = new PersonalProgress15();
        int[] goal = new int[]{10, 9, 8, 7};
        int[] size = new int[]{5, 6, 7, 8};
        int contentChildren = progress15.findContentChildren(goal, size);
        System.out.print(contentChildren);*/

/*        PersonalProgress4 progress4 = new PersonalProgress4();
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.left.left = new TreeNode(3);
        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(4);
        root2.right = new TreeNode(5);
        TreeNode root = progress4.mergeTrees(root1, root2);*/

   /*     PersonalProgress1 progress1=new PersonalProgress1();
        List<List<Integer>> combine = progress1.combine(4, 2);
        System.out.print(combine);*/
/*        PersonalProgress8 progress8 = new PersonalProgress8();
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> permute = progress8.permute(nums);
        System.out.print(permute);*/
/*
        PersonalProgress16.PersonalProgress16_1 progress16_1 = new PersonalProgress16.PersonalProgress16_1();
        TreeNode root = TreeNode.getTree();
        TreeNode target = root.left.left;
        progress16_1.distanceK(root, target, 2);*/

        /*PersonalProgress17 progress17 = new PersonalProgress17();
        progress17.wordBreak("aab", Arrays.asList("a", "aa"));*/

/*        PersonalProgress17.PersonalProgress17_1 progress17_1 = new PersonalProgress17.PersonalProgress17_1();
        int[] nums = new int[]{1, 1, 1, 1, 1};
        progress17_1.findTargetSumWays(nums, 3);*/
    }


    public static int minLength(String str1, String str2) {
        char[] chas1 = str1.toCharArray();
        char[] chas2 = str2.toCharArray();
        int[] map = new int[256];
        for (int i = 0; i != chas2.length; i++) {
            map[chas2[i]]++;
        }
        int left = 0;
        int right = 0;
        int match = chas2.length;
        int minLen = Integer.MAX_VALUE;
        while (right != chas1.length) {
            map[chas1[right]]--;
            if (map[chas1[right]] >= 0) {
                match--;
            }
            if (match == 0) {
                while (map[chas1[left]] < 0) {
                    map[chas1[left++]]++;
                }
                minLen = Math.min(minLen, right - left + 1);
                match++;
                map[chas1[left++]]++;
            }
            right++;
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
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
 * 排序相关
 */
class PersonalProgress {

    /**
     * 最小的k个数
     * <p>
     * 思路：堆排序
     * <p>
     * 完成情况：done
     *
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] kHeap = new int[k];
        if (k < 1 || k > arr.length) {
            return kHeap;
        }
        for (int i = 0; i != k; i++) {
            heapInsert(kHeap, arr[i], i);
        }
        for (int i = k; i != arr.length; i++) {
            if (arr[i] < kHeap[0]) {
                kHeap[0] = arr[i];
                heapify(kHeap, 0, k);
            }
        }
        return kHeap;
    }

    private static void heapInsert(int[] arr, int value, int index) {
        arr[index] = value;
        while (index != 0) {
            int parent = (index - 1) / 2;
            if (arr[parent] < arr[index]) {
                ArrayUtil.swap(arr, parent, index);
                index = parent;
            } else {
                break;
            }
        }
    }

    private static void heapify(int[] arr, int index, int heapSize) {
        int left = index * 2 + 1;
        int right = index * 2 + 2;
        int largest = index;
        while (left < heapSize) {
            if (arr[left] > arr[index]) {
                largest = left;
            }
            if (right < heapSize && arr[right] > arr[largest]) {
                largest = right;
            }
            if (largest != index) {
                ArrayUtil.swap(arr, largest, index);
            } else {
                break;
            }
            index = largest;
            left = index * 2 + 1;
            right = index * 2 + 2;
        }
    }


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
     * 子集
     * <p>
     * 完成情况：done
     */
    class PersonalProgress1_111 {
        public List<List<Integer>> subsets(int[] arr) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> path = new LinkedList<>();
            dfs(0, arr, res, (LinkedList<Integer>) path);
            return res;
        }

        private void dfs(int startIndex, int[] arr, List<List<Integer>> res, LinkedList<Integer> path) {
            res.add(new ArrayList<>(path));
            if (startIndex >= arr.length) {
                return;
            }
            for (int i = startIndex; i < arr.length; i++) {
                path.addLast(arr[i]);
                dfs(i + 1, arr, res, path);
                path.removeLast();
            }
        }

    }

    /**
     * 子集II
     * <p>
     * desc:需要对子集结果集进行去重
     * <p>
     * 完成情况：done
     */
    static class PersonalProgress1_1 {
        List<List<Integer>> result = new ArrayList<>();// 存放符合条件结果的集合
        LinkedList<Integer> path = new LinkedList<>();// 用来存放符合条件结果
        boolean[] used;

        public List<List<Integer>> subsetsWithDup(int[] nums) {
            if (nums.length == 0) {
                result.add(path);
                return result;
            }
            Arrays.sort(nums);
            used = new boolean[nums.length];
            subsetsWithDupHelper(nums, 0);
            return result;
        }

        private void subsetsWithDupHelper(int[] nums, int startIndex) {
            result.add(new ArrayList<>(path));
            if (startIndex >= nums.length) {
                return;
            }
            for (int i = startIndex; i < nums.length; i++) {
                //剪枝
                if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                    continue;
                }
                path.add(nums[i]);
                used[i] = true;
                subsetsWithDupHelper(nums, i + 1);
                path.removeLast();
                used[i] = false;
            }
        }
    }


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
     * 组合
     * <p>
     * <p>
     * 完成情况：done
     *
     * @param n
     * @param k
     * @return
     */
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        int startIndex = 1;
        dfs(path, res, n, k, startIndex);
        return res;
    }

    private void dfs(LinkedList<Integer> path, List<List<Integer>> res, int n, int k, int startIndex) {
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }
        //这边的i<=n-(k-path.size())+1做了剪枝的操作；
        for (int i = startIndex; i <= n - (k - path.size()) + 1; i++) {
            path.addLast(i);
            dfs(path, res, n, k, i + 1);
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
     * <p>
     * 完成情况：done
     *
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new LinkedList<>();
        dfs(candidates, 0, target, res, (LinkedList<Integer>) path);
        return res;
    }


    /**
     * 定义递归函数，参数的选择很重要；
     *
     * @param candidates：候选数组；
     * @param startIndex：初始遍历的index；
     * @param target：目标值；
     * @param res:                   存放结果集的地方；
     * @param path：单个满足条件的数据保存路径；
     */
    private void dfs(int[] candidates, int startIndex, int target, List<List<Integer>> res, LinkedList<Integer> path) {
        //step1:先写递归返回条件；
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        //step2:确定遍历的方向；也就是确定行操作；
        for (int i = startIndex; i < candidates.length; i++) {
            //step3:再写递归函数的操作；也就是确定列操作；
            path.addLast(candidates[i]);
            dfs(candidates, i, target - candidates[i], res, path);
            //回溯
            path.removeLast();
        }
    }


    /**
     * 组合总和II
     * <p>
     * 完成情况：done
     *
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int len = candidates.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0) {
            return res;
        }

        // 关键步骤
        Arrays.sort(candidates);
        Deque<Integer> path = new ArrayDeque<>(len);
        dfs(candidates, len, 0, target, path, res);
        return res;
    }

    /**
     * @param candidates 候选数组
     * @param len        冗余变量
     * @param startIndex 从候选数组的 startIndex 位置开始搜索
     * @param target     表示剩余，这个值一开始等于 target，基于题目中说明的"所有数字（包括目标数）都是正整数"这个条件
     * @param path       从根结点到叶子结点的路径
     * @param res
     */
    private void dfs(int[] candidates, int len, int startIndex, int target, Deque<Integer> path, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < len; i++) {
            // 大剪枝：减去 candidates[i] 小于 0，减去后面的 candidates[i + 1]、candidates[i + 2] 肯定也小于 0，因此用 break
            if (target - candidates[i] < 0) {
                break;
            }
            // 小剪枝：同一层相同数值的结点，从第 2 个开始，候选数更少，结果一定发生重复，因此跳过，用 continue
            if (i > startIndex && candidates[i] == candidates[i - 1]) {
                continue;
            }
            path.addLast(candidates[i]);
            // 因为元素不可以重复使用，这里递归传递下去的是 i + 1 而不是 i
            dfs(candidates, len, i + 1, target - candidates[i], path, res);
            path.removeLast();

        }
    }


    /**
     * 组合总和III
     * <p>
     * 完成情况：done
     */
    static class PersonalProgress1_11 {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();

        public List<List<Integer>> combinationSum3(int k, int n) {
            backTracking(n, k, 1, 0);
            return result;
        }

        private void backTracking(int targetSum, int k, int startIndex, int sum) {
            // 减枝
            if (sum > targetSum) {
                return;
            }

            if (path.size() == k) {
                if (sum == targetSum) result.add(new ArrayList<>(path));
                return;
            }

            // 减枝 9 - (k - path.size()) + 1
            for (int i = startIndex; i <= 9 - (k - path.size()) + 1; i++) {
                path.add(i);
                sum += i;
                backTracking(targetSum, k, i + 1, sum);
                //回溯
                path.removeLast();
                //回溯
                sum -= i;
            }
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
     * 最长连续递增序列
     * <p>
     * dp[i]:以下标i为结尾的数组的连续递增的子序列长度为dp[i];
     * <p>
     * 完成情况：done
     *
     * @param nums
     * @return
     */
    public int findLengthOfLCIS(int[] nums) {
        int[] dp = new int[nums.length];
        if (nums.length == 0) {
            return 0;
        }
        int res = 1;
        dp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            if (nums[i] > nums[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            }
            res = Math.max(dp[i], res);
        }
        return res;
    }


    /**
     * 最长重复子数组
     * <p>
     * 完成情况：done
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int findLength(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length + 1][nums2.length + 1];
        int res = Integer.MIN_VALUE;
        for (int i = 1; i <= nums1.length; i++) {
            for (int j = 1; j <= nums2.length; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                res = Math.max(res, dp[i][j]);
            }
        }
        return res;
    }


    /**
     * 判断子序列:判断s是否是t的子序列；
     * <p>
     * dp[i][j]:以下标i-1结尾的字符串s和以下标j-1结尾的字符串t,相同子序列的长度为dp[i][j];
     * <p>
     * 完成情况：done
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isSubsequence(String s, String t) {
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= t.length(); j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        if (dp[s.length()][t.length()] == s.length()) {
            return true;
        }
        return false;
    }


    /**
     * 两个字符串的删除操作
     * <p>
     * dp[i][j]:以i-1结尾的字符串word1和以j-1位结尾的字符串word2,想要达到相等所需要删除元素的最少次数；
     * dp[i][j]=Math.min(dp[i-1][j-1]+2,Math.min(dp[i-1][j]+1,dp[i][j-1]+1));
     * <p>
     * 完成情况：done
     *
     * @param word1
     * @param word2
     * @return
     */
    public int minDistance2(String word1, String word2) {
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 0; i <= word1.length(); i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= word2.length(); j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1] + 2, Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1));
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }


    /**
     * 不同的子序列
     * <p>
     * dp[i][j]:以i-1结尾的s子序列中出现以j-1为结尾的t的个数为dp[i][j];
     * <p>
     * <p>
     * 完成情况：done
     *
     * @param s
     * @param t
     * @return
     */
    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            dp[i][0] = 1;
        }
        for (int j = 1; j < t.length(); j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= t.length(); j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[s.length()][t.length()];
    }

    /**
     * 目标和
     *
     * @param nums
     * @param target
     * @return
     */
    public int findTargetSumWays(int[] nums, int target) {

        return 0;
    }


    /**
     * 打家劫舍
     * <p>
     * dp[i]的含义:考虑下标i(包括下标i)以内的房屋，最多可以偷窃的金额为dp[i];
     * dp[i]的公式：dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
     * <p>
     * <p>
     * 完成情况:done
     *
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }


    /**
     * 打家劫舍II
     * <p>
     * 完成情况：done
     *
     * @param nums
     * @return
     */
    public int rob2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        //case1:包含头，不包含尾部
        int res1 = robRange(nums, 0, nums.length - 2);
        //case2:包含尾部，不包含头
        int res2 = robRange(nums, 1, nums.length - 1);
        return Math.max(res1, res2);
    }

    //逻辑就是打家劫舍的逻辑
    private int robRange(int[] nums, int start, int end) {
        if (start == end) {
            return nums[start];
        }
        int[] dp = new int[nums.length];
        dp[start] = nums[start];
        dp[start + 1] = Math.max(nums[start], nums[start + 1]);
        for (int i = start + 2; i <= end; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[end];
    }


    /**
     * 打家劫舍III 树形结构
     *
     * @param root
     * @return
     */
    public int rob(TreeNode root) {


        return 0;
    }


    /**
     * 完全平方数
     * <p>
     * dp[i]的含义:和为i的完全平方数的最少数量为dp[i];
     * dp[i]的公式：dp[i] = Math.min(dp[i - j * j] + 1, dp[i]);
     * <p>
     * 完成情况：done
     *
     * @param n
     * @return
     */
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int minn = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                minn = Math.min(minn, dp[i - j * j]);
            }
            dp[i] = minn + 1;
        }
        return dp[n];
    }


    /**
     * 分割等和子集
     * <p>
     * 思路：转换成0-1背包问题；
     * <p>
     * 背包容量：sum/2;
     * 背包物品：集合中的元素;
     * 背包价值：元素的数值;
     * <p>
     * 备注：
     * 1.背包需要正好装满;
     * 2.背包中的每一个元素不可重复放入;
     * <p>
     * dp[i]:表示背包容量为i时，最大可以凑成i的子集总和为dp[i];
     * dp[j]= Math.max(dp[j],dp[j-nums[i]+nums[i]);
     * <p>
     * <p>
     * 完成情况：done
     *
     * @param nums
     * @return
     */
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % 2 == 1) {
            return false;
        }
        int[] dp = new int[20000];
        int target = sum / 2;
        for (int i = 0; i < nums.length; i++) {
            for (int j = target; j >= nums[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
        }
        if (dp[target] == target) {
            return true;
        }
        return false;
    }


    /**
     * 整数拆分
     * <p>
     * dp[i]的含义: 分拆数字i,可以得到的最大乘积为dp[i];
     * dp[i]的推理：dp[i]=Math.max(dp[i],(i-j)*j,dp[i-j]*j);
     * <p>
     * 完成情况：done
     *
     * @param n
     * @return
     */
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i - 1; j++) {
                dp[i] = Math.max(dp[i], Math.max((i - j) * j, dp[i - j] * j));
            }
        }
        return dp[n];
    }


    /**
     * 编辑距离
     * <p>
     * 完成情况：done
     *
     * @param word1
     * @param word2
     * @return
     */
    public int minDistance(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        int[][] dp = new int[n1 + 1][n2 + 1];
        // 第一行
        for (int j = 1; j <= n2; j++) {
            dp[0][j] = dp[0][j - 1] + 1;
        }
        // 第一列
        for (int i = 1; i <= n1; i++) {
            dp[i][0] = dp[i - 1][0] + 1;
        }

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i][j - 1]), dp[i - 1][j]) + 1;
                }
            }
        }
        return dp[n1][n2];
    }


    /**
     * 回文子串
     * <p>
     * <p>
     * 完成情况：done
     *
     * @param s
     * @return
     */
    public int countSubstrings(String s) {
        // 动态规划法
        boolean[][] dp = new boolean[s.length()][s.length()];
        int ans = 0;

        for (int j = 0; j < s.length(); j++) {
            for (int i = 0; i <= j; i++) {
                if (s.charAt(i) == s.charAt(j) && (j - i < 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    ans++;
                }
            }
        }

        return ans;
    }


    /**
     * 三角形最小路径和
     * <p>
     * 完成情况：done
     *
     * @param triangle
     * @return
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        // dp[i][j] 表示从点 (i, j) 到底边的最小路径和。
        int[][] dp = new int[n + 1][n + 1];
        // 从三角形的最后一行开始递推。
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0][0];
    }


    /**
     * 交错字符串
     * <p>
     * 完成情况：done
     *
     * @param s1
     * @param s2
     * @param s3
     * @return
     */
    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length(), n = s2.length();
        if (s3.length() != m + n) return false;
        // 动态规划，dp[i,j]表示s1前i字符能与s2前j字符组成s3前i+j个字符；
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        for (int i = 1; i <= m && s1.charAt(i - 1) == s3.charAt(i - 1); i++) dp[i][0] = true; // 不相符直接终止
        for (int j = 1; j <= n && s2.charAt(j - 1) == s3.charAt(j - 1); j++) dp[0][j] = true; // 不相符直接终止
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = (dp[i - 1][j] && s3.charAt(i + j - 1) == s1.charAt(i - 1))
                        || (dp[i][j - 1] && s3.charAt(i + j - 1) == s2.charAt(j - 1));
            }
        }
        return dp[m][n];
    }


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
     * <p>
     * 完成情况：done
     *
     * @param obstacleGrid
     * @return
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m && obstacleGrid[i][0] == 0; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n && obstacleGrid[0][j] == 0; j++) {
            dp[0][j] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    continue;
                }
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }


    /**
     * 买卖股票的最佳时机
     * <p>
     * dp[i][0]:第i天持有股票所得最多现金；
     * <p>
     * dp[i][0]=Math.max(dp[i-1][0],-price[i])
     * <p>
     * dp[i][1]:第i天不持有股票所得最多现金；
     * dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]+prices[i])
     * <p>
     * 完成情况：done
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len == 0) {
            return 0;
        }
        int[][] dp = new int[prices.length][2];
        dp[0][0] -= prices[0];
        dp[0][1] = 0;
        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], -prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + prices[i]);
        }
        return dp[len - 1][1];
    }


    /**
     * 买卖股票的最佳时机II
     *
     * @param prices
     * @return
     */
    public int maxProfit2(int[] prices) {

        return 0;
    }

}


/**
 * 二叉树、二叉搜索树相关
 */
class PersonalProgress4 {

    /**
     * 删除二叉搜索树中的节点
     * <p>
     * 完成情况:done
     *
     * @param root
     * @param key
     * @return
     */
    public TreeNode deleteNode(TreeNode root, int key) {
        //1.找到节点
        //2.删除节点 记录当前节点的前驱节点
        //3.调整节点 记录当前节点的后继节点
        if (root == null) {
            return null;
        }
        if (root.val == key) {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                TreeNode cur = root.right;
                while (cur.left != null) {
                    cur = cur.left;
                }
                cur.left = root.left;
                root = root.right;
                return root;
            }
        }
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        }
        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        }
        return root;
    }

    /**
     * 把二叉搜索树转换为累加树
     *
     * @param root
     * @return
     */
    public TreeNode convertBST(TreeNode root) {


        return null;
    }

    /**
     * 二叉搜索树中的搜索
     * <p>
     * 完成情况：done
     *
     * @param root
     * @param val
     * @return
     */
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        if (root.val > val) {
            return searchBST(root.left, val);
        }
        if (root.val < val) {
            return searchBST(root.right, val);
        }
        return null;
    }


    /**
     * 合并二叉树
     * <p>
     * 完成情况：done
     *
     * @param root1
     * @param root2
     * @return
     */
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        TreeNode root = new TreeNode(0);
        root.val = root1.val + root2.val;
        root.left = mergeTrees(root1.left, root2.left);
        root.right = mergeTrees(root1.right, root2.right);
        return root;
    }


    /**
     * 不同的二叉搜索树
     * <p>
     * 方式1：暴力递归
     * 方式2：动态规划
     * <p>
     * 完成情况：done
     *
     * @param n
     * @return
     */
    public int numTrees(int n) {
        int res = dfs(n);
        return res;
    }

    private int dfs(int n) {
        //1.递归跳出条件
        if (n == 0 || n == 1) {
            return 1;
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            //当用i这个节点当做根节点时
            //左边有多少种子树
            int leftNum = dfs(i - 1);
            //右边有多少种子树
            int rightNum = dfs(n - i);
            count += leftNum * rightNum;
        }
        return count;
    }


    /**
     * 方式2：动态规划解决
     * <p>
     * dp[i]的含义：1-i为节点组成的二叉搜索树的个数为dp[i];
     * dp[i]的公式：dp[i]+=dp[j-1]*dp[i-j]
     * j-1:j为头节点左子树节点数量
     * i-j:j为头节点右子树节点数量
     * <p>
     * 完成情况：done
     *
     * @param n
     * @return
     */
    public int numTrees2(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }


    /**
     * 二叉搜索树的最近公共祖先
     * <p>
     * 完成情况：done
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //如果小于等于0，说明p和q位于root的两侧，直接返回即可
        if ((root.val - p.val) * (root.val - q.val) <= 0)
            return root;
        //否则，p和q位于root的同一侧，就继续往下找
        return lowestCommonAncestor(p.val < root.val ? root.left : root.right, p, q);
    }


    /**
     * 二叉树展开为链表
     * <p>
     * 完成情况：done
     *
     * @param root
     */
    public void flatten(TreeNode root) {
        while (root != null) {
            TreeNode p = root.left;
            if (p != null) {
                while (p.right != null) {
                    p = p.right;
                }
                p.right = root.right;
                root.right = root.left;
                root.left = null;
            }
            root = root.right;
        }
    }


    /**
     * 将有序数组转换为二叉搜索树
     * <p>
     * 完成情况：done
     *
     * @param nums
     * @return
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    private TreeNode dfs(int[] nums, int lo, int hi) {
        if (lo > hi) {
            return null;
        }
        // 以升序数组的中间元素作为根节点 root。
        int mid = lo + (hi - lo) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        // 递归的构建 root 的左子树与右子树。
        root.left = dfs(nums, lo, mid - 1);
        root.right = dfs(nums, mid + 1, hi);
        return root;
    }


    /**
     * 有序链表转换二叉搜索树
     * <p>
     * 完成情况：done
     *
     * @param head
     * @return
     */
    public TreeNode sortedListToBST(ListNode head) {
        return buildTree(head, null);
    }

    public TreeNode buildTree(ListNode left, ListNode right) {
        if (left == right) {
            return null;
        }
        ListNode mid = getMedian(left, right);
        TreeNode root = new TreeNode(mid.val);
        root.left = buildTree(left, mid);
        root.right = buildTree(mid.next, right);
        return root;
    }

    public ListNode getMedian(ListNode left, ListNode right) {
        ListNode fast = left;
        ListNode slow = left;
        while (fast != right && fast.next != right) {
            fast = fast.next;
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }


    /**
     * 恢复二叉搜索树
     * <p>
     * 完成情况:done
     */
    static class PersonalProgress4_1 {
        //用两个变量x，y来记录需要交换的节点
        private TreeNode x = null;
        private TreeNode y = null;
        private TreeNode pre = null;

        public void recoverTree(TreeNode root) {
            dfs(root);
            //如果x和y都不为空，说明二叉搜索树出现错误的节点，将其交换
            if (x != null && y != null) {
                int tmp = x.val;
                x.val = y.val;
                y.val = tmp;
            }
        }

        //中序遍历二叉树，并比较上一个节点(pre)和当前节点的值，如果pre的值大于当前节点值，则记录下这两个节点
        private void dfs(TreeNode root) {
            if (root == null) {
                return;
            }
            dfs(root.left);
            if (pre == null) {
                pre = root;
            } else {
                if (pre.val > root.val) {
                    y = root;
                    if (x == null) {
                        x = pre;
                    }
                }
                pre = root;
            }
            dfs(root.right);
        }
    }


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
            return new ArrayList<>();
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
     * 从前序与中序遍历序列构造二叉树
     * <p>
     * <p>
     * 完成情况：done
     *
     * @param preorder
     * @param inorder
     * @return
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    private TreeNode buildTreeHelper(int[] preorder, int p_start, int p_end, int[] inorder, int i_start, int i_end) {
        // preorder 为空，直接返回 null
        if (p_start == p_end) {
            return null;
        }
        int root_val = preorder[p_start];
        TreeNode root = new TreeNode(root_val);
        //在中序遍历中找到根节点的位置
        int i_root_index = 0;
        for (int i = i_start; i < i_end; i++) {
            if (root_val == inorder[i]) {
                i_root_index = i;
                break;
            }
        }
        int leftNum = i_root_index - i_start;
        //递归的构造左子树
        root.left = buildTreeHelper(preorder, p_start + 1, p_start + leftNum + 1, inorder, i_start, i_root_index);
        //递归的构造右子树
        root.right = buildTreeHelper(preorder, p_start + leftNum + 1, p_end, inorder, i_root_index + 1, i_end);
        return root;
    }


    /**
     * 完全二叉树的节点个数
     * <p>
     * 完成情况：done
     *
     * @param root
     * @return
     */
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);
        return leftNodes + rightNodes + 1;
    }

    /**
     * 对称二叉树
     * <p>
     * 完成情况：done
     *
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return compare(root.left, root.right);
    }

    private boolean compare(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode != null) {
            return false;
        } else if (leftNode != null && rightNode == null) {
            return false;
        } else if (leftNode == null && rightNode == null) {
            return true;
        } else if (leftNode.val != rightNode.val) {
            return false;
        }
        //比较外面的值是否相等
        boolean outSide = compare(leftNode.left, rightNode.right);
        //比较里面的值是否相等
        boolean inSide = compare(leftNode.right, rightNode.left);
        return outSide && inSide;
    }

    /**
     * 二叉树的所有路径
     * <p>
     * 完成情况：done
     *
     * @param root
     * @return
     */

    static class Solution4_1 {
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> res = new ArrayList<>();
            String path = "";
            dfs(root, path + root.val, res);
            return res;
        }

        private void dfs(TreeNode root, String path, List<String> res) {
            if (root.left == null && root.right == null) {
                res.add(path);
                return;
            }

            if (root.left != null) {
                dfs(root.left, path + "->" + root.left.val, res);
            }

            if (root.right != null) {
                dfs(root.right, path + "->" + root.right.val, res);
            }
        }
    }

    /**
     * 左叶子之和
     * <p>
     * 思路：可以使用层次遍历的方式来实现
     * <p>
     * 建议使用递归的方式来实现：后序遍历
     *
     * @param root
     * @return
     */
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfLeftLeaves(root.left);
        int rightSum = sumOfLeftLeaves(root.right);
        int middleSum = 0;
        //判断条件中才满足左叶子
        if (root.left != null && root.left.left == null && root.left.right == null) {
            middleSum += root.left.val;
        }
        return leftSum + rightSum + middleSum;
    }


    /**
     * 二叉搜索树中的众数
     * <p>
     * 完成情况：done
     */
    static class PersonalProgress41 {

        int maxCount = 0;
        int count = 0;
        TreeNode pre = null;

        /**
         * 二叉搜索树中的众数
         *
         * @param root
         * @return
         */
        public int[] findMode(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            inOrderFindMode(root, res);
            int[] resArr = new int[res.size()];
            for (int i = 0; i < res.size(); i++) {
                resArr[i] = res.get(i);
            }
            return resArr;
        }

        /**
         * @param root
         * @param res
         */
        private void inOrderFindMode(TreeNode root, List<Integer> res) {
            if (root == null) {
                return;
            }
            inOrderFindMode(root.left, res);
            if (pre == null) { // 第一个节点
                count = 1;
            } else if (pre.val == root.val) { // 与前一个节点数值相同
                count++;
            } else { // 与前一个节点数值不同
                count = 1;
            }
            pre = root; // 更新上一个节点

            if (count == maxCount) { // 如果和最大值相同，放进result中
                res.add(root.val);
            }

            if (count > maxCount) { // 如果计数大于最大值
                maxCount = count;
                res.clear();     // 很关键的一步，不要忘记清空result，之前result里的元素都失效了
                res.add(root.val);
            }
            inOrderFindMode(root.right, res);
        }
    }


    /**
     * 二叉搜索树的最小绝对差
     * <p>
     * 思路：递归遍历过程中，记录pre；
     * <p>
     * 完成情况：done
     */
    static class PersonalProgress42 {

        //记录当前节点的前驱指针
        TreeNode pre = null;

        int res = Integer.MAX_VALUE;

        /**
         * 二叉搜索树的最小绝对差
         *
         * @param root
         * @return
         */
        public int getMinimumDifference(TreeNode root) {
            inOrderFindMinDifference(root);
            return res;
        }

        private void inOrderFindMinDifference(TreeNode root) {
            if (root == null) {
                return;
            }
            inOrderFindMinDifference(root.left);
            if (pre != null) {
                res = Math.min(res, Math.abs(pre.val - root.val));
            }
            //pre记录前驱节点
            pre = root;
            inOrderFindMinDifference(root.right);
        }
    }

    /**
     * 二叉树的最近公共祖先
     * <p>
     * 完成情况：done
     */
    static class PersonalProgress43 {
        /**
         * 二叉树的最近公共祖先
         * <p>
         * 思路：后序遍历二叉树
         *
         * @param root
         * @param p
         * @param q
         * @return
         */
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == q || root == p || root == null) {
                return root;
            }
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);
            if (left != null && right != null) {
                return root;
            }
            if (left == null) {
                return right;
            }
            return left;
        }
    }


    /**
     * 找树左下角的值
     * <p>
     * 完成情况：done
     */
    static class PersonalProgress44 {

        //记录：最大深度 （全局变量）
        int maxLen = Integer.MIN_VALUE;
        int maxLeftValue = 0;

        /**
         * 找树左下角的值
         * <p>
         * 思路：1.递归：找到最后一行最开始的值；如何寻找最后一行？深度最大的叶子节点一定是最后一行；
         * 思路：2.循环：使用层次遍历来实现；层次遍历的最后一行的第一个元素即为所求结果；
         *
         * @param root
         * @return
         */
        public int findBottomLeftValue(TreeNode root) {
            preOrderFindBottomLeftValue(root, 0);
            return maxLeftValue;
        }

        public void preOrderFindBottomLeftValue(TreeNode root, int leftLen) {
            if (root == null) {
                return;
            }
            if (root.left == null && root.right == null) {
                //如果leftLen大于最大的maxLen,更新maxLeftValue;
                if (leftLen > maxLen) {
                    maxLen = leftLen;
                    maxLeftValue = root.val;
                    return;
                }
            }
            if (root.left != null) {
                preOrderFindBottomLeftValue(root.left, leftLen + 1);
            }
            if (root.right != null) {
                preOrderFindBottomLeftValue(root.right, leftLen + 1);
            }
        }
    }

    /**
     * 二叉树中的最大路径和
     * <p>
     * 完成情况：done
     */
    static class PersonalProgress45 {

        int res = Integer.MIN_VALUE;

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
            dfs(root);
            return res;
        }

        /**
         * 函数的含义：dfs返回以该节点为端点的最大路径和；
         *
         * @param root
         * @param
         * @return
         */
        private int dfs(TreeNode root) {
            if (root == null) {
                return 0;
            }
            //左子树的最大路径和
            int left = dfs(root.left);
            //右子树的最大路径和
            int right = dfs(root.right);
            //左子树+root  或者  右子树+root的最大路径和
            int middle = Math.max(root.val, root.val + Math.max(left, right));
            //左子树+root+右子树的最大路径和；
            res = Math.max(res, Math.max(middle, root.val + left + right));
            return middle;
        }
    }

    /**
     * 二叉树的右视图
     * <p>
     * 完成情况：done
     *
     * @param root
     * @return
     */
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> res = new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if (i == size - 1) {
                    res.add(cur.val);
                }
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
            }
        }
        return res;
    }


    /**
     * 翻转二叉树
     * <p>
     * 完成情况：done
     *
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        //递归函数的终止条件，节点为空时返回
        if (root == null) {
            return null;
        }
        //下面三句是将当前节点的左右子树交换
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;
        //递归交换当前节点的 左子树
        invertTree(root.left);
        //递归交换当前节点的 右子树
        invertTree(root.right);
        //函数返回时就表示当前这个节点，以及它的左右子树
        //都已经交换完了
        return root;
    }


    /**
     * 相同的树
     * <p>
     * 完成情况：done
     *
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        } else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }


}

/**
 * 栈、队列、数组等数据结构相关
 */
class PersonalProgress5 {


    /**
     * 两个队列实现栈 ps：一个队列也可以实现
     * <p>
     * 完成情况：done
     */
    static class PersonalProgress5_1 {
        Queue<Integer> queue1;
        Queue<Integer> queue2;

        /**
         * Initialize your data structure here.
         */
        public PersonalProgress5_1() {
            queue1 = new LinkedList<Integer>();
            queue2 = new LinkedList<Integer>();
        }

        /**
         * Push element x onto stack.
         */
        public void push(int x) {
            queue2.offer(x);
            while (!queue1.isEmpty()) {
                queue2.offer(queue1.poll());
            }
            Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;
        }

        /**
         * Removes the element on top of the stack and returns that element.
         */
        public int pop() {
            return queue1.poll();
        }

        /**
         * Get the top element.
         */
        public int top() {
            return queue1.peek();
        }

        /**
         * Returns whether the stack is empty.
         */
        public boolean empty() {
            return queue1.isEmpty();
        }
    }


}

/**
 * 双指针相关
 */
class PersonalProgress6 {


}

/**
 * 位运算相关
 */
class PersonalProgress7 {

    /**
     * 颠倒二进制位
     * <p>
     * 完成情况：done
     *
     * @param n
     * @return
     */
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = (res << 1) + (n & 1);
            n >>= 1;
        }
        return res;

    }


    /**
     * 比特位计数
     * <p>
     * 完成情况:done
     *
     * @param n
     * @return
     */
    public int[] countBits(int n) {
        int[] bits = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            bits[i] = countOnes(i);
        }
        return bits;
    }

    public int countOnes(int x) {
        int ones = 0;
        while (x > 0) {
            x &= (x - 1);
            ones++;
        }
        return ones;
    }

    /**
     * 位1的个数
     * <p>
     * 完成情况：done
     *
     * @param n
     * @return
     */
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            n = n & (n - 1);
            res += 1;
        }
        return res;
    }
}


/**
 * 数组相关
 */
class PersonalProgress8 {


    /**
     * 移动零
     * <p>
     * 思路：双指针遍历一次
     * 1.找不为0的数字，然后从位置index=0处开始覆写非0的数据;
     * <p>
     * 完成情况：done
     *
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        //从前往后覆写
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        //从当前index处往后开始设置0;
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
        return;
    }


    /**
     * 数组中的第k大个最大元素
     *
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k) {
        int pivot = 0;
        int low = 0;
        int high = nums.length - 1;
        pivot = findPivot(nums, low, high);
        if (pivot == nums.length - k) {
            pivot = nums[pivot];
        } else if (pivot < nums.length - k) {
            pivot = findPivot(nums, pivot + 1, high);
        } else if (pivot > nums.length - k) {
            pivot = findPivot(nums, low, pivot - 1);
        }
        return nums[pivot];
    }

    private int findPivot(int[] nums, int low, int high) {
        int selectedNum = nums[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (i < j && selectedNum <= nums[j]) {
                j--;
            }
            while (i < j && selectedNum >= nums[i]) {
                i++;
            }
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        nums[low] = nums[i];
        nums[i] = selectedNum;
        return i;
    }

    /**
     * 除自身以外数组的乘积
     * <p>
     * 思路：前缀+后缀乘积列表
     * <p>
     * 完成情况：done
     *
     * @param nums
     * @return
     */
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;

        // L 和 R 分别表示左右两侧的乘积列表
        int[] L = new int[length];
        int[] R = new int[length];

        int[] answer = new int[length];

        // L[i] 为索引 i 左侧所有元素的乘积
        // 对于索引为 '0' 的元素，因为左侧没有元素，所以 L[0] = 1
        L[0] = 1;
        for (int i = 1; i < length; i++) {
            L[i] = nums[i - 1] * L[i - 1];
        }

        // R[i] 为索引 i 右侧所有元素的乘积
        // 对于索引为 'length-1' 的元素，因为右侧没有元素，所以 R[length-1] = 1
        R[length - 1] = 1;
        for (int i = length - 2; i >= 0; i--) {
            R[i] = nums[i + 1] * R[i + 1];
        }

        // 对于索引 i，除 nums[i] 之外其余各元素的乘积就是左侧所有元素的乘积乘以右侧所有元素的乘积
        for (int i = 0; i < length; i++) {
            answer[i] = L[i] * R[i];
        }

        return answer;
    }


    /**
     * 搜索旋转排序数组II
     * <p>
     * 完成情况:done
     *
     * @param nums
     * @param target
     * @return
     */
    public boolean search2(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return nums[0] == target;
        }
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[l] == nums[mid] && nums[mid] == nums[r]) {
                ++l;
                --r;
            } else if (nums[l] <= nums[mid]) {
                if (nums[l] <= target && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[n - 1]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return false;
    }


    /**
     * 搜索旋转排序数组
     * <p>
     * 完成情况：done
     *
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1, mid = 0;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // 先根据 nums[mid] 与 nums[lo] 的关系判断 mid 是在左段还是右段
            if (nums[mid] >= nums[lo]) {
                // 再判断 target 是在 mid 的左边还是右边，从而调整左右边界 lo 和 hi
                if (target >= nums[lo] && target < nums[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }


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
     * 三数之和
     * <p>
     * 完成情况：done
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        List<String> map = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int cur = nums[i];
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int curSum = cur + nums[low] + nums[high];
                if (curSum == 0) {
                    List<Integer> inner = new ArrayList<>();
                    StringBuilder sb = new StringBuilder();
                    sb.append(cur);
                    inner.add(cur);
                    inner.add(nums[low]);
                    sb.append(nums[low]);
                    inner.add(nums[high]);
                    sb.append(nums[high]);
                    if (!map.contains(sb.toString())) {
                        res.add(inner);
                        map.add(sb.toString());
                    }
                    low++;
                    high--;
                } else if (curSum < 0) {
                    low++;
                } else if (curSum > 0) {
                    high--;
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
            return;
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
     * 全排列II
     * <p>
     * desc:按任意顺序返回所有不重复的全排列
     * <p>
     * tips:去重
     * <p>
     * 完成情况：done
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> permuteUnique(int[] nums) {

        LinkedList<Integer> path = new LinkedList<>();
        boolean[] used = new boolean[nums.length];
        //需要排序
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        dfs34(nums, path, used, res);
        return res;
    }

    private void dfs34(int[] nums, LinkedList<Integer> path, boolean[] used, List<List<Integer>> res) {
        if (nums.length == path.size()) {
            res.add(new ArrayList<>(path));
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
            path.addLast(nums[i]);
            used[i] = true;
            dfs34(nums, path, used, res);
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
     * <p>
     * 完成情况：done
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange(int[] nums, int target) {
        int leftIdx = binarySearch(nums, target - 1);
        int rightIdx = binarySearch(nums, target) - 1;
        if (leftIdx <= rightIdx && nums[leftIdx] == target) {
            return new int[]{leftIdx, rightIdx};
        }
        return new int[]{-1, -1};
    }

    // 第一个大于 target 的数的下标
    public int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
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
     * 删除有序数组中的重复项
     * <p>
     * 思路：快慢指针
     * <p>
     * 完成情况：done
     *
     * @param nums
     * @return
     */
    public int removeDuplicates3(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int fast = 1, slow = 1;
        while (fast < nums.length) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
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


    /**
     * 只出现一次的数字II
     *
     * @param nums
     * @return
     */
    public int singleNumber2(int[] nums) {


        return 0;
    }


    /**
     * 存在重复元素
     * <p>
     * 完成情况：done
     *
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int count = map.get(nums[i]);
                map.put(nums[i], count + 1);
            }
        }
        List<Integer> values = new ArrayList<>(map.values());
        for (Integer temp : values) {
            if (temp > 1) {
                return true;
            }
        }
        return false;
    }


    /**
     * 存在重复元素II
     * <p>
     * 方式1：两层for循环，时间复杂度较高
     * <p>
     * <p>
     * 完成情况：done
     *
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean flag = false;
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                int lastIndex = map.get(nums[i]);
                if (Math.abs(i - lastIndex) <= k) {
                    flag = true;
                    break;
                }
                map.put(nums[i], i);
            }
        }
        return flag;
    }


    /**
     * 最大数
     * <p>
     * 完成情况：done
     *
     * @param nums
     * @return
     */
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String numsToWord[] = new String[n];
        for (int i = 0; i < n; i++) {
            numsToWord[i] = String.valueOf(nums[i]);
        }
        //compareTo()方法比较的时候是按照ASCII码逐位比较的
        //通过比较(a+b)和(b+a)的大小，就可以判断出a,b两个字符串谁应该在前面
        //所以[3,30,34]排序后变为[34,3,30]
        //[233，23333]排序后变为[23333，233]
        Arrays.sort(numsToWord, (a, b) -> {
            return (b + a).compareTo(a + b);
        });
        //如果排序后的第一个元素是0，那后面的元素肯定小于或等于0，则可直接返回0
        if (numsToWord[0].equals("0")) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(numsToWord[i]);
        }
        return sb.toString();
    }


    /**
     * 寻找旋转排序数组中的最小值
     * <p>
     * 完成情况：done
     *
     * @param nums
     * @return
     */
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        if (nums[high] > nums[low]) {
            return nums[0];  //升序数组，数组完全单调，第一个数最小
        }
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] < nums[0]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return nums[high];
    }


    /**
     * 轮转数组
     * <p>
     * 完成情况：done
     *
     * @param nums
     * @param k
     */

    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return;
        }
        int N = nums.length;
        k = k % N;
        // 左边逆序, 右边逆序, 整体逆序
        reverse(nums, 0, N - k - 1);
        reverse(nums, N - k, N - 1);
        reverse(nums, 0, N - 1);
    }

    private void reverse(int[] nums, int L, int R) {
        while (L < R) {
            int tmp = nums[L];
            nums[L++] = nums[R];
            nums[R--] = tmp;
        }
    }


    /**
     * 最大间距
     *
     * @param nums
     * @return
     */
    public int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        Arrays.sort(nums);

        return 0;
    }


    /**
     * 滑动窗口的最大值
     * <p>
     * 思路：双端队列 + 单调队列解决
     * <p>
     * 完成情况：done
     *
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> queue = new ArrayDeque<>(); //双端队列
        int[] res = new int[n - k + 1];
        for (int i = 0, j = 0; i < n; i++) {
            //判断队头是否在滑动窗口范围内
            while (!queue.isEmpty() && i - k + 1 > queue.getFirst()) {
                queue.pollFirst();
            }
            //维护单调递减队列
            while (!queue.isEmpty() && nums[i] > nums[queue.getLast()]) {
                queue.pollLast();
            }
            queue.offer(i);    //将当前元素插入队尾
            //滑动窗口的元素达到了k个，才可以将其加入答案数组中
            if (i - k + 1 >= 0) {
                res[j++] = nums[queue.getFirst()];
            }
        }
        return res;
    }


    /**
     * 长度最小的子数组
     * <p>
     * 完成情况：done
     *
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen(int target, int[] nums) {
        LinkedList<Integer> queue = new LinkedList();
        int curSum = 0;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i];
            queue.addLast(i);
            while (curSum >= target && !queue.isEmpty()) {
                res = Math.min(res, (i - queue.peekFirst()) + 1);
                curSum -= nums[queue.pollFirst()];
            }
        }
        if (res == Integer.MAX_VALUE) {
            res = 0;
        }
        return res;
    }


    /**
     * 多数元素
     * <p>
     * 思路：摩尔投票法
     * <p>
     * <p>
     * 完成情况：done
     *
     * @return
     */
    public int majorityElement(int[] nums) {
        int targetNum = nums[0], count = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (targetNum == nums[i]) {
                ++count;
            } else if (--count == 0) {
                targetNum = nums[i];
                count = 1;
            }
        }
        return targetNum;
    }


    /**
     * 两数之和 II - 输入有序数组
     * <p>
     * 完成情况：done
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int curSum = numbers[low] + numbers[high];
            if (curSum > target) {
                high--;
            } else if (curSum < target) {
                low++;
            } else if (curSum == target) {
                res[0] = low + 1;
                res[1] = high + 1;
                break;
            }
        }
        return res;
    }

}


/**
 * 链表相关
 */

class PersonalProgress9 {

    /**
     * 相交链表
     * <p>
     * 完成情况：done
     *
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA;
        ListNode l2 = headB;
        while (l1 != l2) {
            l1 = l1 != null ? l1.next : headB;
            l2 = l2 != null ? l2.next : headA;
        }
        return l1;
    }


    /**
     * 排序链表
     * <p>
     * 思路：分治法进行排序
     * <p>
     * 完成情况：done
     *
     * @param head
     * @return
     */
    public ListNode sortList(ListNode head) {
        // 1、递归结束条件
        if (head == null || head.next == null) {
            return head;
        }

        // 2、找到链表中间节点并断开链表 & 递归下探
        ListNode midNode = middleNode(head);
        ListNode rightHead = midNode.next;
        midNode.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);

        // 3、当前层业务操作（合并有序链表）
        return mergeTwoLists2(left, right);
    }

    //  找到链表中间节点（876. 链表的中间结点）
    private ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // 合并两个有序链表（21. 合并两个有序链表）
    private ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode sentry = new ListNode(-1);
        ListNode curr = sentry;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }

            curr = curr.next;
        }

        curr.next = l1 != null ? l1 : l2;
        return sentry.next;
    }


    /**
     * 合并K个升序链表
     * <p>
     * 思路：递归地两两合并链表
     * <p>
     * 完成情况：done
     *
     * @param lists
     * @return
     */
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        return merge(lists, 0, lists.length - 1);
    }

    private ListNode merge(ListNode[] lists, int lo, int hi) {
        if (lo == hi) {
            return lists[lo];
        }
        int mid = lo + (hi - lo) / 2;
        ListNode l1 = merge(lists, lo, mid);
        ListNode l2 = merge(lists, mid + 1, hi);
        return merge2Lists(l1, l2);
    }

    private ListNode merge2Lists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        tail.next = l1 == null ? l2 : l1;

        return dummyHead.next;
    }


    /**
     * K 个一组翻转链表
     * <p>
     * 完成情况：done
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode tail = head;
        for (int i = 0; i < k; i++) {
            //剩余数量小于k的话，则不需要反转。
            if (tail == null) {
                return head;
            }
            tail = tail.next;
        }
        // 反转前 k 个元素
        ListNode newHead = reverse(head, tail);
        //下一轮的开始的地方就是tail
        head.next = reverseKGroup(tail, k);

        return newHead;
    }

    /*
    左闭又开区间
     */
    private ListNode reverse(ListNode head, ListNode tail) {
        ListNode pre = null;
        ListNode next = null;
        while (head != tail) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }


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
     * 删除排序链表中的重复元素
     * <p>
     * 完成情况：done
     *
     * @param head
     * @return
     */
    public ListNode deleteDuplicates2(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
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
     * 删除排序链表中的重复元素II
     * <p>
     * 完成情况：done
     *
     * @param head
     * @return
     */
    public ListNode deleteDuplicates2_1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head;
        ListNode pre = dummy;
        while (cur != null) {
            while (cur.next != null && cur.next.val == cur.val) {
                cur = cur.next;
            }
            //pre.next==cur,说明没有重复的节点
            if (pre.next == cur) {
                pre = pre.next;
            } else {
                pre.next = cur.next;
            }
            cur = cur.next;
        }
        return dummy.next;
    }


    /**
     * 分隔链表
     * <p>
     * 完成情况：done
     *
     * @param head
     * @param x
     * @return
     */
    public ListNode partition(ListNode head, int x) {
        //四个指针，分大小链表的头和尾
        ListNode smallHead = new ListNode(0);
        ListNode smallTail = smallHead;
        ListNode bigHead = new ListNode(0);
        ListNode bigTail = bigHead;

        while (head != null) {
            if (head.val < x) {
                //如果当前节点小于x,则把当前节点挂到小链表的后面；
                smallTail = smallTail.next = head;
            } else {
                bigTail = bigTail.next = head;
            }
            head = head.next;
        }
        //最后把大小链表拼接在一起
        smallTail.next = bigHead.next;
        bigTail.next = null;
        return smallHead.next;
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


    /**
     * 移除链表元素
     * <p>
     * 完成情况：done
     *
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        ListNode next = null;
        while (cur != null) {
            next = cur.next;
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = next;
        }
        return dummy.next;
    }


    /**
     * 删除链表中的节点
     * <p>
     * 完成情况：done
     *
     * @param node
     */
    public void deleteNode(ListNode node) {
        if (node == null) {
            return;
        }
        if (node.next == null) {
            node = null;
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }

    /**
     * 旋转链表
     * <p>
     * <p>
     * 思路1：闭合成环，寻找位置断开环形成新的链表
     * <p>
     * 思路2：遍历两次链表，后n-k位置放到头部
     * <p>
     * <p>
     * 完成情况：done
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0 || head.next == null) {
            return head;
        }
        int count = 1;
        ListNode cur = head;
        while (cur.next != null) {
            count++;
            cur = cur.next;
        }
        //计算需要右移多少步
        int add = count - k % count;
        if (add == count) {
            return head;
        }
        //形成环
        cur.next = head;
        for (int i = 0; i < add; i++) {
            cur = cur.next;
        }
        //断开环
        ListNode newHead = cur.next;
        cur.next = null;
        return newHead;
    }


    /**
     * 反转链表II
     * <p>
     * <p>
     * 完成情况：done
     *
     * @param head
     * @param left
     * @param right
     * @return
     */
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode leftNodePre = head;
        ListNode rightNodePre = head;
        for (int i = 1; i < left - 1; i++) {
            leftNodePre = leftNodePre.next;
        }
        for (int i = 1; i < right - 1; i++) {
            rightNodePre = rightNodePre.next;
        }
        if (head.next == null || left == right) {
            return head;
        }

        if (left == 1) {
            ListNode rightNodeCur = rightNodePre.next;
            ListNode rightNodeNext = rightNodeCur.next;
            rightNodeCur.next = null;
            ListNode newHead = reverseNode(leftNodePre);
            leftNodePre.next = rightNodeNext;
            return newHead;
        }
        ListNode rightNodeCur = rightNodePre.next;
        if (rightNodeCur == null) {
            return head;
        }
        ListNode rightNodeNext = rightNodeCur.next;
        rightNodeCur.next = null;
        ListNode tempHead = leftNodePre.next;
        if (leftNodePre == head) {
            tempHead = leftNodePre;
        }
        ListNode newHead = reverseNode(tempHead);
        leftNodePre.next = newHead;
        tempHead.next = rightNodeNext;
        return head;
    }


    /**
     * 重排链表
     * <p>
     * 完成情况:done
     *
     * @param head
     */
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }

        // 获得中间节点
        ListNode mid = findMid(head);

        // 中间节点之后的部分进行反转
        ListNode head2 = mid.next;
        mid.next = null;
        head2 = reverseList(head2);

        // 合并
        ListNode head1 = head;
        mergeList(head1, head2);
    }

    // LeetCode 876
    private ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // LeetCode 206
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode nextNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextNode;
        }
        return prev;
    }


    private void mergeList(ListNode head1, ListNode head2) {
        ListNode next1 = null;
        ListNode next2 = null;
        while (head1 != null && head2 != null) {
            next1 = head1.next;
            next2 = head2.next;

            head1.next = head2;
            head1 = next1;

            head2.next = head1;
            head2 = next2;
        }
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
     * 搜索二维矩阵II
     *
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix2(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (target > matrix[row][col]) {
                row++;
            } else if (target < matrix[row][col]) {
                col--;
            } else {
                return true;
            }
        }
        return false;
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


    /**
     * 旋转图像
     * <p>
     * 完成情况：done
     *
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        int tr = 0;
        int tc = 0;
        int dr = matrix.length - 1;
        int dc = matrix[0].length - 1;
        while (tr < dr) {
            rotateEdge(matrix, tr++, tc++, dr--, dc--);
        }
    }

    private static void rotateEdge(int[][] matrix, int tr, int tc, int dr, int dc) {
        int times = dc - tc;//times就是总的组数
        int temp = 0;
        for (int i = 0; i != times; i++) {
            //一次循环就是一组占据调整
            temp = matrix[tr][tc + i];
            matrix[tr][tc + i] = matrix[dr - i][tc];
            matrix[dr - i][tc] = matrix[dr][dc - i];
            matrix[dr][dc - i] = matrix[tr + i][dc];
            matrix[tr + i][dc] = temp;
        }
    }

}


/**
 * 字符串相关
 */
class PersonalProgress11 {


    /**
     * Excel表列名称
     * <p>
     * 完成情况：done
     *
     * @param cn
     * @return
     */
    public String convertToTitle(int cn) {
        StringBuilder sb = new StringBuilder();
        while (cn > 0) {
            cn--;
            sb.append((char) (cn % 26 + 'A'));
            cn /= 26;
        }
        sb.reverse();
        return sb.toString();
    }


    /**
     * Excel 表列序号
     * <p>
     * 完成情况:done
     *
     * @param columnTitle
     * @return
     */
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            int num = columnTitle.charAt(i) - 'A' + 1;
            ans = ans * 26 + num;
        }
        return ans;
    }


    /**
     * 反转字符串中的元音字母
     * <p>
     * 完成情况：done
     */
    static class PersonalProgress11_1 {
        static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
        static Set<Character> set = new HashSet<>();

        static {
            for (char c : vowels) {
                set.add(c);
                set.add(Character.toUpperCase(c));
            }
        }

        public String reverseVowels(String s) {
            char[] cs = s.toCharArray();
            int n = s.length();
            int l = 0, r = n - 1;
            while (l < r) {
                if (set.contains(cs[l]) && set.contains(cs[r])) {
                    swap(cs, l++, r--);
                } else {
                    if (!set.contains(cs[l])) l++;
                    if (!set.contains(cs[r])) r--;
                }
            }
            return String.valueOf(cs);
        }

        void swap(char[] cs, int l, int r) {
            char c = cs[l];
            cs[l] = cs[r];
            cs[r] = c;
        }

    }


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


    /**
     * 重复的DNA序列
     * <p>
     * 思路：滑动窗口+map
     * <p>
     * 完成情况：done
     *
     * @param s
     * @return
     */
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();
        int n = s.length();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i + 10 <= n; i++) {
            String cur = s.substring(i, i + 10);
            int cnt = map.getOrDefault(cur, 0);
            if (cnt == 1) {
                ans.add(cur);
            }
            map.put(cur, cnt + 1);
        }
        return ans;
    }


    /**
     * 最后一个单词的长度
     * <p>
     * 思路：从后往前进行遍历
     *
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        if (end < 0) {
            return 0;
        }
        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }
        return end - start;
    }


    /**
     * Z字型变换
     *
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {

        return null;

    }


    /**
     * 字符串转换成整数
     * <p>
     * 完成情况：done
     *
     * @param s
     * @return
     */
    public int myAtoi(String s) {
        int len = s.length();
        // str.charAt(i) 方法回去检查下标的合法性，一般先转换成字符数组
        char[] chars = s.toCharArray();

        // 1、去除前导空格
        int index = 0;
        while (index < len && chars[index] == ' ') {
            index++;
        }

        // 2、如果已经遍历完成（针对极端用例 "      "）
        if (index == len) {
            return 0;
        }

        // 3、如果出现符号字符，仅第 1 个有效，并记录正负
        int sign = 1;
        char firstChar = chars[index];
        if (firstChar == '+') {
            index++;
        } else if (firstChar == '-') {
            index++;
            sign = -1;
        }

        // 4、将后续出现的数字字符进行转换
        // 不能使用 long 类型，这是题目说的
        int res = 0;
        while (index < len) {
            char currChar = chars[index];
            // 4.1 先判断不合法的情况
            if (currChar > '9' || currChar < '0') {
                break;
            }

            // 题目中说：环境只能存储 32 位大小的有符号整数，因此，需要提前判：断乘以 10 以后是否越界
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (currChar - '0') > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && (currChar - '0') > -(Integer.MIN_VALUE % 10))) {
                return Integer.MIN_VALUE;
            }

            // 4.2 合法的情况下，才考虑转换，每一步都把符号位乘进去
            res = res * 10 + sign * (currChar - '0');
            index++;
        }
        return res;
    }

    /**
     * 实现strStr
     * <p>
     * 完成情况：done
     *
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String ss, String pp) {
        int n = ss.length(), m = pp.length();
        char[] s = ss.toCharArray(), p = pp.toCharArray();
        // 枚举原串的「发起点」
        for (int i = 0; i <= n - m; i++) {
            // 从原串的「发起点」和匹配串的「首位」开始，尝试匹配
            int a = i, b = 0;
            while (b < m && s[a] == p[b]) {
                a++;
                b++;
            }
            // 如果能够完全匹配，返回原串的「发起点」下标
            if (b == m) return i;
        }
        return -1;
    }


}

/**
 * 数字相关
 */
class PersonalProgress12 {


    /**
     * 各位相加
     * <p>
     * 完成情况：done
     *
     * @param num
     * @return
     */
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return addDigits(sum);
    }


    /**
     * 3的幂
     * <p>
     * 完成情况：done
     *
     * @param n
     * @return
     */
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

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
     * <p>
     * 完成情况：done
     *
     * @param x
     * @param n
     * @return
     */

    public double myPow3(double x, int n) {
        long N = n;
        return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }

    public double quickMul(double x, long N) {
        double ans = 1.0;
        // 贡献的初始值为 x
        double x_contribute = x;
        // 在对 N 进行二进制拆分的同时计算答案
        while (N > 0) {
            if ((N & 1) == 1) {
                // 如果 N 二进制表示的最低位为 1，那么需要计入贡献
                // 类比：N&1=====N%2
                ans *= x_contribute;
            }
            // 将贡献不断地平方
            x_contribute *= x_contribute;
            // 舍弃 N 二进制表示的最低位，这样我们每次只要判断最低位即可
            // 类比：N>>1======N/2
            N = N >> 1;
        }
        return ans;
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
        return 0;
    }


    /**
     * 阶乘后的零
     * <p>
     * 思路：0来自什么？ 我们只需要判断每个累乘的数有多少个5的因子即可
     * 1.因为含有5的因子每5个出现一次；
     * <p>
     * <p>
     * 完成情况：done
     *
     * @param n
     * @return
     */
    public int trailingZeroes(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            int temp = i;
            while (temp > 0) {
                if (temp % 5 == 0) {
                    count++;
                    temp = temp / 5;
                } else {
                    break;
                }
            }
        }
        return count;
    }


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
     * 两数相除
     * <p>
     * 思路：二分+快速乘
     * <p>
     * 完成情况：done
     *
     * @param dividend：被除数
     * @param divisor：除数
     * @return
     */
    int divide(int dividend, int divisor) {
        boolean flag = false;
        long x = dividend, y = divisor;
        if ((x < 0 && y > 0) || (x > 0 && y < 0)) {
            flag = true;
        }
        if (x < 0) {
            x = -x;
        }
        if (y < 0) {
            y = -y;
        }
        long l = 0, r = x;
        while (l < r) {
            long mid = (l + r + 1) >> 1;//防止0，1死循环
            if (FastMultiply(mid, y) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        long ans = flag ? -l : l;
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int) ans;

    }

    long FastMultiply(long a, long k) {
        long ans = 0;
        while (k != 0) {
            if ((k & 1) == 1) {
                ans += a;
            }
            k >>= 1;
            a += a;
        }
        return ans;
    }


    /**
     * x的平方根
     * <p>
     * 思路：二分查找
     * <p>
     * 完成情况：done
     *
     * @param x
     * @return
     */
    public int mySqrt(int x) {
        int low = 0, high = x, res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((long) mid * mid <= x) {
                res = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }


    /**
     * 4的幂：超时
     * <p>
     * 思路1：按照4的倍数寻找
     * <p>
     * 思路2：转换为2的幂进行二分查找
     *
     * @param n
     * @return
     */
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 4 != 0) {
            return false;
        }
        for (int i = 4; i <= n; i *= 4) {
            if (n == i) {
                return true;
            }
        }
        return false;
    }

    /**
     * 4的幂
     * <p>
     * 完成情况：done
     *
     * @param n
     * @return
     */
    public boolean isPowerOfFour2(int n) {
        if (n <= 0) {
            return false;
        }
        int x = getVal(n);
        return x * x == n && (x & -x) == x;
    }

    int getVal(int n) {
        long l = 0, r = n;
        while (l < r) {
            long mid = l + r >> 1;
            if (mid * mid >= n) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return (int) r;
    }


}


/**
 * 单调栈
 */
class PersonalProgress13 {


    /**
     * 接雨水
     *
     * @param height
     * @return
     */
    public int trap(int[] height) {
        if (height == null || height.length <= 2) {
            return 0;
        }

        // 思路：
        // 单调不增栈，walls元素作为右墙依次入栈
        // 出现入栈元素（右墙）比栈顶大时，说明在右墙左侧形成了低洼处，低洼处出栈并结算该低洼处能接的雨水

        int water = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < height.length; i++) {
            // 栈不为空，且当前元素（右墙）比栈顶（右墙的左侧）大：说明形成低洼处了
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                // 低洼处弹出，尝试结算此低洼处能积攒的雨水
                int bottom = stack.pop();
                // 看看栈里还有没有东西（左墙是否存在）
                // 有右墙+有低洼+没有左墙=白搭
                if (stack.isEmpty()) {
                    break;
                }

                // 左墙位置以及左墙、右墙、低洼处的高度
                int left = stack.peek();
                int leftHeight = height[left];
                int rightHeight = height[i];
                int bottomHeight = height[bottom];

                // 能积攒的水=(右墙位置-左墙位置-1) * (min(右墙高度, 左墙高度)-低洼处高度)
                water += (i - left - 1) * (Math.min(leftHeight, rightHeight) - bottomHeight);
            }

            // 上面的pop循环结束后再push，保证stack是单调不增
            stack.push(i);
        }
        return water;
    }


    /**
     * 2.每日温度
     */


    /**
     * 下一个更大元素
     * <p>
     * 思路：单调栈+哈希表
     * <p>
     * 1.第一个子问题：如何更高效地计算nums2中每个元素右边的第一个更大的值；
     * 2.第二个子问题：如何存储第一个子问题的结果；
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        //key:nums[i],value:index;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            int num = nums2[i];
            while (!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }
            map.put(num, stack.isEmpty() ? -1 : stack.peek());
            stack.push(num);
        }
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }

    /**
     * 4.去除重复字母
     */


    /**
     * 5.股票价格跨度
     */


    /**
     * 6.移掉k位数字
     */


    /**
     * 7.最短无序连续子数组
     */


    /**
     * 8.柱状图中最大的矩形
     * <p>
     * 思路1：两层for循环遍历
     * 思路2：对每个元素，向左右分别寻找边界；
     * 思路3：利用思路2，外加单调栈实现优化；
     * <p>
     * ps:
     * 1.如果柱子的高度递减，那么每个柱子的左边界就是第一根柱子，右边界就是本身；
     * 2.如果柱子的高度递增，那么每个柱子的右边界就是最后一根柱子，左边界就是本身；
     * <p>
     * <p>
     * 完成情况：done
     * <p>
     */
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        int maxarea = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < len; ++i) {
            // 只要栈不为空，并且当前遍历的数据小于栈顶元素，则说明找到了右边界
            while (!stack.empty() && heights[i] < heights[stack.peek()]) {
                // 右边界 heights[i]
                int h = heights[stack.peek()];
                stack.pop();
                // 出栈后，如果栈为空，说明出栈的柱子目前遍历的最短的柱子，否则计算宽度差
                int w = stack.empty() ? i : i - stack.peek() - 1;
                maxarea = Math.max(h * w, maxarea);
            }
            // 栈为空或者当前遍历的数据大于等于栈顶数据，则入栈，不会执行上面的while循环
            // 保证了栈中的数据总是递增的 比如  0 1 2 2 3 4 4 5 6 ...
            stack.push(i);
        }

        // 处理剩余栈中的数据(递增的数据，右边界是柱状图中最右边的柱子)
        while (!stack.empty()) {
            int h = heights[stack.peek()];
            stack.pop();
            // 出栈后，如果栈为空，说明出栈的柱子目前遍历的最短的柱子，否则计算宽度差
            int w = stack.empty() ? len : len - stack.peek() - 1;
            maxarea = Math.max(h * w, maxarea);
        }
        return maxarea;
    }


}

/**
 * 回溯相关
 */
class PersonalProgress14 {


    /**
     * 火柴拼正方形
     * <p>
     * 完成情况：done
     *
     * @param matchsticks
     * @return
     */
    public boolean makesquare(int[] matchsticks) {
        int total = 0;
        for (int num : matchsticks) {
            total += num;
        }
        if (total == 0 || (total & 3) != 0) {
            return false;
        }
        Arrays.sort(matchsticks);
        return backtrack(matchsticks, total >> 2, matchsticks.length - 1, new int[4]);
    }

    /**
     * @param nums:数组
     * @param target：边长
     * @param index：遍历开始的位置
     * @param arr：长度为4的arr数组
     * @return
     */
    private boolean backtrack(int[] nums, int target, int index, int[] arr) {
        if (index == -1) {
            if (arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3]) {
                return true;
            }
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + nums[index] > target || (i > 0 && arr[i] == arr[i - 1])) {
                continue;
            }
            arr[i] += nums[index];
            if (backtrack(nums, target, index - 1, arr)) {
                return true;
            }
            arr[i] -= nums[index];
        }
        return false;
    }


    /**
     * 给表达式添加运算符
     * <p>
     * 完成情况：done
     *
     * @param num
     * @param target
     * @return
     */
    public List<String> addOperators(String num, int target) {
        List<String> res = new ArrayList<>();
        dfs(res, num, target, 0, 0, 0, "");
        return res;
    }

    /**
     * @param res:返回的结果
     * @param num：字符串num
     * @param target:目标值target
     * @param index:访问到字符串的第几个字符
     * @param preNum：前面的连续乘积
     * @param sum：表达式前面计算得到的和
     * @param path：算法表达式，可以看做n叉树的路径
     */
    private void dfs(List<String> res, String num, int target, int index, long preNum, long sum, String path) {
        if (index >= num.length()) {
            if (sum == target) {
                res.add(path);
            }
            return;
        }
        for (int i = index; i < num.length(); i++) {
            if (i != index && num.charAt(index) == '0') {
                break;
            }
            long number = Long.valueOf(num.substring(index, i + 1));
            if (index == 0) {
                //因为第一个数字前面没有符号，所以单独处理；
                dfs(res, num, target, i + 1, number, number, "" + number);
            } else {
                dfs(res, num, target, i + 1, number, sum + number, path + "+" + number);
                dfs(res, num, target, i + 1, -number, sum - number, path + "-" + number);
                dfs(res, num, target, i + 1, preNum * number,
                        sum + preNum * number - preNum, path + "*" + number);
            }
        }

    }

    /**
     * 重新安排行程
     *
     * @param tickets
     * @return
     */
    public List<String> findItinerary(List<List<String>> tickets) {

        return null;
    }


    /**
     * 单词拆分
     * <p>
     * 完成情况：done
     *
     * @param
     * @param
     * @return
     */
    static class PersonalProgress14_1 {
        private int[] cache;
        private Set<String> wordSet = new HashSet<>();

        public boolean wordBreak(String s, List<String> wordDict) {
            for (String word : wordDict) {
                wordSet.add(word);
            }
            cache = new int[s.length()];
            Arrays.fill(cache, 0);
            return backtrack(s, 0);
        }

        private boolean backtrack(String s, int start) {
            if (start == s.length()) {
                return true;
            }
            // 如果子问题已经处理过了，直接返回结果
            if (cache[start] != 0) {
                return cache[start] == 1;
            }
            for (int i = start; i < s.length(); i++) {
                String subStr = s.substring(start, i + 1);
                if (!wordSet.contains(subStr)) {
                    continue;
                }
                boolean subRes = backtrack(s, i + 1);
                if (subRes) {
                    // 说明 [start...n-1] 是可以拆分成单词的
                    cache[start] = 1;
                    return true;
                }
            }
            // 已经完整遍历 [start...n-1] 都无法拆分
            cache[start] = -1;
            return false;
        }

    }


    /**
     * 单词拆分II
     * <p>
     * 完成情况：done
     *
     * @param
     * @param
     * @return
     */
    class PersonalProgress14_2 {
        // 快速判断是否存在某个单词
        private Set<String> wordSet = new HashSet<>();
        private List<String> res = new ArrayList<>();

        public List<String> wordBreak(String s, List<String> wordDict) {
            for (String word : wordDict) wordSet.add(word);
            backtrack(s, 0, new LinkedList<>());
            return res;
        }

        private void backtrack(String s, int start, LinkedList<String> track) {
            // 满足条件，存储当前路径
            if (start == s.length()) {
                // 用空格相连
                res.add(String.join(" ", track));
                return;
            }
            for (int i = start; i < s.length(); i++) {
                // 切分字符串
                String word = s.substring(start, i + 1);
                // 不在 wordSet 中，则跳过
                if (!wordSet.contains(word)) continue;

                // 添加到路径中
                track.addLast(word);

                backtrack(s, i + 1, track);

                // 撤销操作
                track.removeLast();
            }
        }
    }
}

/**
 * 贪心算法
 */
class PersonalProgress15 {

    /**
     * 分发饼干
     * <p>
     * 思路：大饼干优先喂饱胃口大的，小饼干优先喂饱胃口小的；
     * <p>
     * <p>
     * 完成情况：done
     *
     * @param g: 胃口大小
     * @param s： size(饼干尺寸)
     * @return
     */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int index = 0;
        int goal = 0;
        int res = 0;
        while (index <= s.length - 1 && goal <= g.length - 1) {
            if (g[goal] <= s[index]) {
                res++;
                goal++;
            }
            index++;
        }
        return res;
    }


    /**
     * 跳跃游戏
     * <p>
     * 思路：
     * 1.局部最优解：每次取最大跳跃步数（最大覆盖范围）
     * 2.整体最优解：最后得到整体最大覆盖范围，看是否能够达到终点；
     * <p>
     * 完成情况：done
     *
     * @param nums
     * @return
     */
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        if (nums.length == 1) {
            return true;
        }
        boolean flag = false;
        //代表当前最大的覆盖范围；
        int cover = 0;
        for (int i = 0; i <= cover; i++) {
            cover = Math.max(cover, i + nums[i]);
            if (cover >= nums.length - 1) {
                flag = true;
                break;
            }
        }
        return flag;
    }


    /**
     * 跳跃游戏II
     *
     * @param nums
     * @return
     */
    public int jump(int[] nums) {

        return 0;
    }


    /**
     * 柠檬水找零
     * <p>
     * 完成情况：done
     *
     * @param bills
     * @return
     */
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0, twenty = 0;
        for (int bill : bills) {
            // 情况⼀
            if (bill == 5) {
                five++;
            }
            // 情况⼆
            if (bill == 10) {
                if (five <= 0) {
                    return false;
                }
                ten++;
                five--;
            }
            // 情况三
            if (bill == 20) {
                // 优先消耗10美元，因为5美元的找零⽤处更⼤，能多留着就多留着
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                    twenty++; // 其实这⾏代码可以删了，因为记录20已经没有意义了，不会⽤20来找零
                } else if (five >= 3) {
                    five -= 3;
                    twenty++; // 同理，这⾏代码也可以删了
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}

/**
 * BFS相关的问题
 */
class PersonalProgress16 {


    /**
     * 层数最深叶子节点的和
     * <p>
     * 完成情况：done
     *
     * @param root
     * @return
     */
    public int deepestLeavesSum(TreeNode root) {
        int res = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelCount = queue.size();
            //每次都会把res置为0，到最后一层的时候没有下层的res来覆盖
            res = 0;
            for (int i = 0; i < levelCount; i++) {
                TreeNode cur = queue.poll();
                res += cur.val;
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
        }
        return res;
    }


    /**
     * 机器人的运动范围
     * <p>
     * 完成情况：done
     *
     * @param m
     * @param n
     * @param k
     * @return
     */
    public int movingCount(int m, int n, int k) {
        //临时变量visited记录格子是否被访问过
        boolean[][] visited = new boolean[m][n];
        int res = 0;
        //创建一个队列，保存的是访问到的格子坐标，是个二维数组
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        while (!queue.isEmpty()) {
            int[] x = queue.poll();
            int i = x[0], j = x[1];
            //i >= m || j >= n是边界条件的判断，k < sum(i, j)判断当前格子坐标是否
            // 满足条件，visited[i][j]判断这个格子是否被访问过
            if (i >= m || j >= n || k < sum(i, j) || visited[i][j]) {
                continue;
            }
            //标注这个格子被访问过
            visited[i][j] = true;
            res++;
            //把当前格子下边格子的坐标加入到队列中
            queue.add(new int[]{i + 1, j});
            //把当前格子右边格子的坐标加入到队列中
            queue.add(new int[]{i, j + 1});
        }
        return res;
    }

    //计算两个坐标数字的和
    private int sum(int i, int j) {
        int sum = 0;
        while (i != 0) {
            sum += i % 10;
            i /= 10;
        }
        while (j != 0) {
            sum += j % 10;
            j /= 10;
        }
        return sum;
    }


    /**
     * 二叉树最大宽度
     * <p>
     * idea:
     * 1.对节点进行编号
     * 2.二叉树的头节点编号为index,左孩子节点编号为index*2,右孩子节点编号为index*2+1;
     * 3.利用每一层节点的宽度=最大编号-最小编号+1；
     * <p>
     * 完成情况：done
     *
     * @param root
     * @return
     */
    public int widthOfBinaryTree(TreeNode root) {
        int res = 1;
        List<Pair<TreeNode, Integer>> queue = new ArrayList<>();
        queue.add(new Pair(root, 1));
        while (!queue.isEmpty()) {
            List<Pair<TreeNode, Integer>> tmp = new ArrayList<>();
            for (Pair<TreeNode, Integer> pair : queue) {
                TreeNode cur = pair.getKey();
                int index = pair.getValue();
                if (cur.left != null) {
                    tmp.add(new Pair(cur.left, index * 2));
                }
                if (cur.right != null) {
                    tmp.add(new Pair(cur.right, index * 2 + 1));
                }
            }
            res = Math.max(res, queue.get(queue.size() - 1).getValue() - queue.get(0).getValue() + 1);
            queue = tmp;
        }
        return res;
    }


    /**
     * 二叉树中所有距离为k的结点
     * <p>
     * idea:
     * 1.把树想象成一张图
     * 2.从target出发有三个方向（左、右、父节点）
     * <p>
     * tips:
     * 1.用HashMap记录父节点
     * 2.用set用于宽度优先遍历的去重
     * <p>
     * <p>
     * 完成情况：done
     */
    static class PersonalProgress16_1 {

        private Map<TreeNode, TreeNode> parents = new HashMap<>();
        private List<Integer> res = new ArrayList<>();

        public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
            if (k == 0) {
                res.add(target.val);
                return res;
            }
            findParents(root);
            //宽度优先遍历队列
            Queue<TreeNode> queue = new LinkedList<>();
            //防止重复遍历的visit集合
            Set<TreeNode> visit = new HashSet<>();
            queue.offer(target);
            visit.add(target);
            int i = 0;
            while (i != k) {
                i++;
                int size = queue.size();
                for (int j = 0; j < size; j++) {
                    TreeNode cur = queue.poll();
                    //左孩子方向
                    if (cur.left != null && !visit.contains(cur.left)) {
                        queue.offer(cur.left);
                        visit.add(cur.left);
                    }
                    //右孩子方向
                    if (cur.right != null && !visit.contains(cur.right)) {
                        queue.offer(cur.right);
                        visit.add(cur.right);
                    }
                    //父节点方向
                    if (parents.get(cur) != null && !visit.contains(parents.get(cur))) {
                        queue.offer(parents.get(cur));
                        visit.add(parents.get(cur));
                    }
                }
            }
            for (TreeNode temp : queue) {
                res.add(temp.val);
            }
            return res;
        }

        private void findParents(TreeNode root) {
            if (root.left != null) {
                parents.put(root.left, root);
                findParents(root.left);
            }
            if (root.right != null) {
                parents.put(root.right, root);
                findParents(root.right);
            }
        }
    }

}


/**
 * DFS相关的问题
 */
class PersonalProgress17 {


    /**
     * 岛屿数量
     * <p>
     * 完成情况：done
     * <p>
     * idea:
     * 1. 多个相邻的1组成的地域只是一个岛屿；
     * 2. 不是相邻的多个1是代表多个岛屿；
     * 3. 可以将遍历到1的位置设置为0，避免重复的遍历；
     *
     * @param grid
     * @return
     */
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int res = 0;
        //对二维数组中的每个点进行这样的遍历，以任意一个点为起点进行这样的操作；
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    dfs(grid, i, j);
                }
            }
        }
        return res;
    }

    /**
     * 1.上下左右四个方向进行遍历；
     * 2.遍历过程中进行沉岛；
     *
     * @param grid
     * @param i
     * @param j
     */
    private void dfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
    }


    static class PersonalProgress17_1 {
        /**
         * 目标和
         * <p>
         * 完成情况：done
         * <p>
         * idea:
         * 1.每个元素两种选择"-"和"+"；
         * 2.左子树为"-"，右子树为"+"
         *
         * @param nums
         * @param target
         * @return 返回可以组成目标和的总个数
         */
        int res = 0;

        public int findTargetSumWays(int[] nums, int target) {
            dfs(nums, target, 0, 0);
            return res;
        }

        private void dfs(int[] nums, int target, int startIndex, int sum) {
            if (startIndex == nums.length) {
                if (target == sum) {
                    res++;
                }
                return;
            }
            dfs(nums, target, startIndex + 1, sum - nums[startIndex]);
            dfs(nums, target, startIndex + 1, sum + nums[startIndex]);
        }
    }


    /**
     * 单词拆分
     * <p>
     * 完成情况:done
     *
     * @param s
     * @param wordDict
     * @return
     */
    public boolean wordBreak(String s, List<String> wordDict) {
        return dfs(s, wordDict, 0, new HashSet<>());
    }

    /**
     * @param s
     * @param wordDict
     * @param startIndex:表示从字符串s的哪个位置开始
     * @param dupSet:去重的集合
     * @return
     */
    private boolean dfs(String s, List<String> wordDict, int startIndex, HashSet<Integer> dupSet) {
        if (startIndex == s.length()) {
            return true;
        }
        //开始拆分字符串s
        for (int i = startIndex + 1; i <= s.length(); i++) {
            if (dupSet.contains(i)) {
                continue;
            }
            if (wordDict.contains(s.substring(startIndex, i))) {
                if (dfs(s, wordDict, i, dupSet)) {
                    return true;
                }
                dupSet.add(i);
            }
        }
        return false;
    }


    /**
     * 矩阵中的路径
     * <p>
     * 完成情况：done
     * <p>
     * idea:
     * 1.check:判断以网格的(i,j)位置出发，能否搜索到单词word[k...]
     * 1.1 如果board[i][j]!=s[k],当前字符不匹配，直接返回false；
     * 1.2 如果当前已经访问到字符串的末尾，且对应字符依然匹配，此时直接返回true;
     * 1.3 遍历当前位置的所有相邻位置，如果从某个相邻位置触发，能够搜索到子串word[k+1...],则返回true,否则返回false;
     * <p>
     * 2.对每个位置(i,j)都调用函数check进行检查，只要有一处返回true,则说明网格中能够找到相应的单词，否则说明找不到
     *
     * @param board
     * @param word
     * @return
     */
    public boolean exist(char[][] board, String word) {
        int h = board.length, w = board[0].length;
        boolean[][] visited = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                boolean flag = check(board, visited, i, j, word, 0);
                if (flag) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean check(char[][] board, boolean[][] visited, int i, int j, String s, int k) {
        if (board[i][j] != s.charAt(k)) {
            return false;
        } else if (k == s.length() - 1) {
            return true;
        }
        visited[i][j] = true;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        boolean result = false;
        for (int[] dir : directions) {
            int newi = i + dir[0], newj = j + dir[1];
            if (newi >= 0 && newi < board.length && newj >= 0 && newj < board[0].length) {
                if (!visited[newi][newj]) {
                    boolean flag = check(board, visited, newi, newj, s, k + 1);
                    if (flag) {
                        result = true;
                        break;
                    }
                }
            }
        }
        visited[i][j] = false;
        return result;
    }

    /**
     * 机器人的运动范围
     * <p>
     * 完成情况:done
     *
     * @param m
     * @param n
     * @param k
     * @return
     */
    public int movingCount(int m, int n, int k) {
        //临时变量visited记录格子是否被访问过
        boolean[][] visited = new boolean[m][n];
        return dfs(0, 0, m, n, k, visited);
    }

    public int dfs(int i, int j, int m, int n, int k, boolean[][] visited) {
        //i >= m || j >= n是边界条件的判断，k < sum(i, j)判断当前格子坐标是否
        // 满足条件，visited[i][j]判断这个格子是否被访问过
        if (i >= m || j >= n || k < sum(i, j) || visited[i][j]) {
            return 0;
        }
        //标注这个格子被访问过
        visited[i][j] = true;
        //沿着当前格子的右边和下边继续访问
        return 1 + dfs(i + 1, j, m, n, k, visited) + dfs(i, j + 1, m, n, k, visited);
    }

    //计算两个坐标数字的和
    private int sum(int i, int j) {
        int sum = 0;
        while (i != 0) {
            sum += i % 10;
            i /= 10;
        }
        while (j != 0) {
            sum += j % 10;
            j /= 10;
        }
        return sum;
    }

}








