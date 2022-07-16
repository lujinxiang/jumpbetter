package algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 回溯相关的问题
 * <p>
 * 回溯其实本质上和DFS纠缠在一起了
 * <p>
 * 回溯=dfs+剪枝
 */
public class RollBackRelatedProblem {

    /**
     * 回溯解决的问题
     * <p>
     * 1. 组合问题：N个数里面按照一定规则找出k个数的集合；
     * <p>
     * 2. 切割问题：一个字符串按一定规则有几种切割方式；
     * <p>
     * 3. 子集问题：一个N个数的集合里有多少符合条件的子集；
     * <p>
     * 4. 排列问题：N个数按一定规则全排列，有几种排列方式；
     * <p>
     * 5. 棋盘问题：N皇后、解数独；
     * <p>
     * <p>
     * 回溯问题解决模板：
     * <p>
     * void backtracking(参数) {
     * if (终⽌条件) {
     * 存放结果;
     * return;
     * }
     * for (选择：本层集合中元素（树中节点孩⼦的数量就是集合的⼤⼩）) {
     * 处理节点;
     * backtracking(路径，选择列表); // 递归
     * 回溯，撤销处理结果
     * }
     * }
     */

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] arr = new int[]{2, 3, 6, 7};
        List<List<Integer>> combine = solution.combinationSum(arr, 7);
        System.out.println(combine);
    }


}

/**
 * 题目：给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 * <p>
 * 示例:
 * 输⼊: n = 4, k = 2
 * 输出: [
 * [2,4],
 * [3,4],
 * [2,3],
 * [1,2],
 * [1,3],
 * [1,4],
 * ]
 * <p>
 * 解题思路：
 * 需求：  在1，2，3，4中取两个数；
 * 第一层：取 1 ；               取 2；              取3；            取4
 * 第二层：在2，3，4中取一个数；    在 3，4中取一个数    在4中取一个数；     空
 * 第三层：[1,2],[1,3],[1,4]    [2,3],[2,4]        [3,4]
 * <p>
 * for循环：横向遍历；
 * 递归：   纵向遍历；
 * <p>
 * 完成情况：done
 */
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        dfs(n, k, 1);
        return res;
    }

    private void dfs(int n, int k, int startIndex) {
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }
        //这边做了剪枝操作；i <= n - (k - path.size()) + 1
        for (int i = startIndex; i <= n - (k - path.size()) + 1; i++) {
            path.add(i);
            dfs(n, k, i + 1);
            path.removeLast();
        }
    }
}

/**
 * 题目：组合总和
 * <p>
 * 给你一个无重复元素的整数数组candidates和一个目标整数target，找出candidates中可以使数字和为目标数target的所有不同组合 ，
 * 并以列表形式返回。你可以按 任意顺序 返回这些组合。candidates中的同一个数字可以无限制重复被选取 。如果至少一个数字的被选数量不同，则两种组合是不同的
 * 对于给定的输入，保证和为target 的不同组合数少于 150 个。
 * <p>
 * case:
 * 输入：candidates = [2,3,6,7], target = 7
 * 输出：[[2,2,3],[7]]
 * 解释：
 * 2 和 3 可以形成一组候选，2 + 2 + 3 = 7 。注意 2 可以使用多次。
 * 7 也是一个候选， 7 = 7 。
 * 仅有这两种组合。
 * <p>
 * 完成情况：done;
 */
class Solution2 {

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
            path.add(candidates[i]);
            //这边不用i+1表示当前的数，可以重复选择；
            dfs(candidates, i, target - candidates[i], res, path);
            //回溯
            path.removeLast();
        }
    }
}


/**
 * 问题：全排列问题
 * <p>
 * 给定一个不含重复数字的数组 nums ，返回其所有可能的全排列 。你可以按任意顺序返回答案;
 * case:
 * 输入：nums = [1,2,3]
 * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * <p>
 * 完成情况：done
 */
class Solution3 {
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new LinkedList<>();
        boolean[] used = new boolean[arr.length];
        dfs(arr, (LinkedList<Integer>) path, res, used);
        return res;
    }

    private void dfs(int[] arr, LinkedList<Integer> path, List<List<Integer>> res, boolean[] used) {
        //step1：递归返回条件
        if (path.size() == arr.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        //step2:行方向的操作；遍历的起始位置需要注意
        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {
                //step3：列方向上的递归和回溯操作；
                path.addLast(arr[i]);
                used[i] = Boolean.TRUE;
                dfs(arr, path, res, used);
                //回溯
                path.removeLast();
                used[i] = Boolean.FALSE;
            }
        }
    }
}


/**
 * 题目：N皇后问题
 * <p>
 * n皇后问题研究的是如何将n个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
 */

class Solution4 {
    /**
     * N皇后问题
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

}


/**
 * 题目：子集问题
 * 给你一个整数数组 nums ，数组中的元素互不相同 。返回该数组所有可能的子集（幂集）。
 * 解集不能包含重复的子集。你可以按任意顺序返回解集。
 * <p>
 * case:
 * 输入：nums = [1,2,3]
 * 输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 * <p>
 * <p>
 * 完全情况：done
 */
class Solution5 {
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
 * 题目：字符串匹配问题
 * <p>
 * 给你一个字符串s和一个字符规律p，请你来实现一个支持 '.'和'*'的正则表达式匹配。
 * <p>
 * '.' 匹配任意单个字符
 * '*' 匹配零个或多个前面的那一个元素
 * 所谓匹配，是要涵盖整个字符串s的，而不是部分字符串。
 */
class Solution6 {
    public boolean isMatch(String str, String pattern) {
        if (str == null || pattern == null) {
            return false;
        }
        char[] chars = str.toCharArray();
        char[] patterns = pattern.toCharArray();
        return isValid(chars, patterns) ? process(chars, patterns, 0, 0) : false;
    }

    /**
     * text和pattern的有效性判断
     *
     * @param str
     * @param pattern
     * @return
     */
    private boolean isValid(char[] str, char[] pattern) {
        //text中不能包含'*'或者'.';
        for (int i = 0; i < str.length; i++) {
            if (str[i] == '*' || str[i] == '.') {
                return false;
            }
        }
        //pattern中不能是首字符；任意两个'*'字符不相邻；
        for (int i = 0; i < pattern.length; i++) {
            if (pattern[i] == '*' && (i == 0 || pattern[i - 1] == '*')) {
                return false;
            }
        }
        return true;
    }

    private boolean process(char[] str, char[] pattern, int strIndex, int patternIndex) {
        if (patternIndex == pattern.length) {
            return strIndex == str.length;
        }
        if (patternIndex + 1 == pattern.length || pattern[patternIndex + 1] != '*') {
            return strIndex != str.length
                    && (pattern[patternIndex] == str[strIndex] || pattern[patternIndex] == '.')
                    && process(str, pattern, strIndex + 1, patternIndex + 1);
        }
        while (strIndex != str.length && (pattern[patternIndex] == str[strIndex] || pattern[patternIndex] == '.')) {
            if (process(str, pattern, strIndex, patternIndex + 2)) {
                return true;
            }
            strIndex++;
        }
        return process(str, pattern, strIndex, patternIndex + 2);
    }


    /**
     * 方法二
     */
    public boolean isMatch2(String text, String pattern) {
        //如果都为空则匹配成功
        if (pattern.isEmpty()) return text.isEmpty();

        //第一个是否匹配上
        boolean first_match = (!text.isEmpty() &&
                (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));

        if (pattern.length() >= 2 && pattern.charAt(1) == '*') {
            //看看有没有可能剩下的pattern匹配上全部的text
            //看看有没有可能剩下的text匹配整个pattern
            return (isMatch2(text, pattern.substring(2)) ||
                    (first_match && isMatch2(text.substring(1), pattern)));
        } else {
            //没有星星的情况：第一个字符相等，而且剩下的text匹配上剩下的pattern
            return first_match && isMatch2(text.substring(1), pattern.substring(1));
        }
    }
}







