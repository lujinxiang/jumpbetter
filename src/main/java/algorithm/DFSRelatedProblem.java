package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * DFS相关问题
 */
public class DFSRelatedProblem {

    public static void main(String[] args) {
       /* int[] arr = new int[]{3, 3, 3, 3, 4};
        boolean b = canBeSquare(arr);
        System.out.println(b);*/
/*        List<List<String>> lists = solveNQueens(4);
        System.out.println(lists.size());
        System.out.print(lists);*/
        int[] arr = new int[]{1, 2, 3};
        List<List<Integer>> childCollection = getChildCollection(arr);
        System.out.println(childCollection);
    }

    /**
     * 1.N皇后问题
     * <p>
     * 题目：N皇后问题是指在N*N的棋盘上要摆N个皇后 要求任何两个皇后不同行、不同列 也不在一条斜线上
     * 给定一个整数n 返回n皇后的摆法有多少种？
     * <p>
     * 思路：n皇后问题的核心解法
     * 1.状态判断：判断当前位置 是否满足n皇后的定义
     * 2.状态探索：递归地向下探索下一个位置
     * 3.状态回溯：比如进行到某一位置时 发现没有办法进行往下探索 就需要回溯到上一个状态
     */
    public static List<List<String>> solveNQueens(int n) {
        char[][] chs = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chs[i][j] = '.';
            }
        }
        List<List<String>> res = new ArrayList<>();
        backTracing(chs, 0, n, res);
        return res;
    }

    private static void backTracing(char[][] chs, int row, int n, List<List<String>> res) {
        //每行都摆满皇后时，则产生了一种解法
        if (row == n) {
            res.add(chsToList(chs));
            return;
        }
        //一行一行地摆放，在确定一行中的那个皇后应该摆在哪一列时，需要当前列是否合法。
        //如果合法，则将皇后放置在当前位置，并进行递归，回溯。
        for (int col = 0; col < chs[0].length; col++) {
            if (isValid(chs, row, col)) {
                chs[row][col] = 'Q';
                //递归
                backTracing(chs, row + 1, n, res);
                //回溯
                chs[row][col] = '.';
            }
        }
    }

    private static List<String> chsToList(char[][] chs) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < chs.length; i++) {
            list.add(new String(chs[i]));
        }
        return list;
    }

    //判断合法：当前将要摆放'Q'的位置和其他已摆放‘Q’的位置不能在同一列，且不能在同一条45度斜线或135度斜线上。
    //这里判断是否在同一条斜线上可通过当前将要摆放'Q'的位置和其他已摆放‘Q’的位置横坐标之差和纵坐标之差的绝对值是否相等来判断。
    private static boolean isValid(char[][] chs, int x, int y) {
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j < chs[0].length; j++) {
                if (chs[i][j] == 'Q' && (j == y || Math.abs(x - i) == Math.abs(y - j))) {
                    return false;
                }
            }
        }
        return true;
    }


    /**
     * 2.火柴摆正方形
     * <p>
     * 题目：输入为小女孩拥有火柴的数目，每根火柴用其长度表示。输出即为是否能用所有的火柴拼成正方形。
     * <p>
     * 思路：回溯探索 DFS+剪枝操作
     * 所有火柴组成正方形：
     * <p>
     * 1.正方形4条边：每条边的长度为所有火柴长度之和/4;
     * 2.设置4个桶放火柴 进行探索尝试 如果所有桶都能够放满火柴 则表示能够组成正方形 如果不能 则探索失败
     * 3.为了避免多次回溯 算法复杂度高 进行剪枝操作 将火柴进行排序 大的先放 这样可以避免多次回溯
     */
    public static boolean canBeSquare(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        if (arr.length < 4) {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 4 != 0) {
            return false;
        }
        //需要降序的排序arr数组 是为了避免多次回溯 降低时间复杂度
        Arrays.sort(arr);
        int[] bucket = new int[4];
        return backTrack(0, arr, sum / 4, bucket);//回溯地尝试火柴的放置
    }

    /**
     * @param i:正在遍历的数组下标
     * @param arr：火柴数组
     * @param edge：边长
     * @param bucket：4个桶存放火柴
     * @return
     */
    private static boolean backTrack(int i, int[] arr, int edge, int[] bucket) {
        if (i >= arr.length) {
            return true;
        }
        for (int j = 0; j < 4; j++) {
            if (arr[i] + bucket[j] > edge) {
                continue;
            }
            bucket[j] += arr[i];
            if (backTrack(i + 1, arr, edge, bucket)) {
                return true;
            }
            bucket[j] -= arr[i];
        }
        return false;
    }

    /**
     * 3.走迷宫问题
     *
     * 题目：一个由n * m 个格子组成的迷宫，起点是(1, 1)， 终点是(n, m)，
     * 每次可以向上下左右四个方向任意走一步，并且有些格子是不能走动，求从起点到终点经过每个格子至多一次的走法数。
     */



    /**
     * 4.子集问题
     * <p>
     * 题目：给定一组不含重复元素的整数数组nums 返回该数组所有可能的子集（幂集）
     * <p>
     * 思路：
     * 1.初始状态选择：
     * 2.状态递归选择：
     * 3.状态回溯：
     */
    public static List<List<Integer>> getChildCollection(int[] arr) {
        List<List<Integer>> outer = new ArrayList<List<Integer>>();
        List<Integer> inner = new ArrayList<Integer>();
        dfs(outer, inner, arr, 0);
        return outer;
    }

    private static void dfs(List<List<Integer>> outer, List<Integer> inner, int[] arr, int index) {
        outer.add(new ArrayList<Integer>(inner));
        for (int i = index; i < arr.length; i++) {
            inner.add(arr[i]); //① 加入 nums[i]
            dfs(outer, inner, arr, i + 1);//② 递归
            inner.remove(inner.size() - 1);//③ 移除 nums[i]
        }
    }


    /**
     * 5.查找最大的连通面积
     *
     *
     */

    /**
     * 6.好友关系的连通分量数目
     */



}
