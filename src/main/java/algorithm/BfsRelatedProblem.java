package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinxianglu
 * <p>
 * BFS（Breadth-First Search）相关问题：广度优先搜索
 */
public class BfsRelatedProblem {

    /**
     * BFS伪代码模板
     *
     * function bfs(graph,start,end){
     *     queue=[];
     *     queue.append([start]);
     *     visited.add(start);
     *     while(queue){
     *         node=queue.pop();
     *         visited.add(node);
     *         process(node);
     *         nodes=generate_related_nodes(node);
     *         queue.add(nodes);
     *     }
     * }
     */


}

/**
 * 题目: 岛屿的最大面积
 * <p>
 * 给你一个大小为 m x n 的二进制矩阵 grid .
 * 岛屿是由一些相邻的 1 (代表土地) 构成的组合，这里的「相邻」要求两个 1 必须
 * 在水平或者竖直的四个方向上相邻。你可以假设 grid 的四个边缘都被 0（代表水）包围着。
 * 岛屿的面积是岛上值为 1 的单元格的数目。
 * <p>
 * 计算并返回 grid 中最大的岛屿面积。如果没有岛屿，则返回面积为 0 。
 */
class Solution61 {


    /**
     * 方式1：DFS+递归
     * <p>
     * 沉岛思想：每次找到岛屿，则直接把找到的岛屿改成0，其实也就避免了去记忆已经找到的岛屿再次被计算；
     * <p>
     * 完成情况：done
     *
     * @param grid
     * @return
     */
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                res = Math.max(res, dfs(i, j, grid));
            }
        }
        return res;
    }


    /**
     * 函数意义：当位于（i,j）位置时，岛屿面积最大是多少；
     *
     * @param i
     * @param j
     * @param grid
     * @return
     */
    private int dfs(int i, int j, int[][] grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;
        int num = 1;
        num += dfs(i + 1, j, grid);
        num += dfs(i - 1, j, grid);
        num += dfs(i, j + 1, grid);
        num += dfs(i, j - 1, grid);
        return num;
    }


    /**
     * 方式2：dfs + 记忆搜素
     */

    /**
     * 方式3：bfs
     */
}


/**
 * 题目：所有可能的路径
 * <p>
 * 给你一个有 n 个节点的 有向无环图（DAG），请你找出所有从节点 0 到节点 n-1 的路径并输出（不要求按特定顺序）
 * graph[i] 是一个从节点 i 可以访问的所有节点的列表（即从节点 i 到节点 graph[i][j]存在一条有向边）。
 * <p>
 * 输入：graph=[[1,2],[3],[3],[]]
 * 输出：[[0,1,3],[0，2，3]]
 */
class Solution62 {

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        // 从0到n-1爆搜即可
        List<List<Integer>> resultList = new ArrayList<>();
        dfs(resultList, new ArrayList<>(), graph, 0, graph.length);
        return resultList;
    }

    private void dfs(List<List<Integer>> resultList, List<Integer> result, int[][] graph, int i, int n) {
        // 跟下面放在一起也可以，不过递归我们一般把返回值放在前面，这样比较清晰一点
        if (i == n - 1) {
            result.add(i);
            resultList.add(new ArrayList<>(result));
            result.remove(result.size() - 1);
            return;
        }

        result.add(i);
        for (int next : graph[i]) {
            dfs(resultList, result, graph, next, n);
        }
        // 回溯：这里注意下不要用remove(i)或者remove(Integer.valueOf(i))
        result.remove(result.size() - 1);
    }

}


/**
 * 题目：零钱兑换
 * <p>
 * 给你一个整数数组 coins ，表示不同面额的硬币；以及一个整数 amount ，表示总金额。
 * 计算并返回可以凑成总金额所需的 最少的硬币个数 。如果没有任何一种硬币组合能组成总金额，返回-1 。
 * 你可以认为每种硬币的数量是无限的。
 * <p>
 * 输入：coins=[1,2,5],amount=11;
 * 输出：3
 * 11=5+5+1；
 */
class Solution63 {


    public int coinChange(int[] coins, int amount) {
        return 0;
    }
}
