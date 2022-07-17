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
            //① 加入 nums[i]
            inner.add(arr[i]);
            //② 递归
            dfs(outer, inner, arr, i + 1);
            //③ 移除 nums[i]
            inner.remove(inner.size() - 1);
        }
    }




}
