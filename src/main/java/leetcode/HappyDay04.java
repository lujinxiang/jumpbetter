package leetcode;


import common.ArrayUtil;
import common.TreeNode;

import java.util.*;

/**
 * @author jinxianglu
 * @description 二叉树专题
 */
public class HappyDay04 {


    public static void main(String[] args) {

        HappyDay04 happyDay04 = new HappyDay04();
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        left.left = new TreeNode(4);
        left.right = new TreeNode(5);
        right.left = new TreeNode(6);
        right.right = new TreeNode(7);
        int res = happyDay04.maxDistance(root);
        System.out.print(res);
    }

    /**
     * 二叉树的层次遍历
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> innerList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode curNode = queue.poll();
                innerList.add(curNode.val);
                if (curNode.left != null) {
                    queue.offer(curNode.left);
                }
                if (curNode.right != null) {
                    queue.offer(curNode.right);
                }
            }
            res.add(innerList);
        }
        return res;
    }


    /**
     * 路径总和
     *
     * @param root
     * @param targetSum
     * @return
     */
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        if (root == null) {
            return res;
        }
        dfs(root, targetSum, path, res);
        return res;
    }

    private void dfs(TreeNode root, int targetSum, LinkedList<Integer> path, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        path.addLast(root.val);
        targetSum -= root.val;
        if (root.left == null && root.right == null) {
            if (targetSum == 0) {
                res.add(new ArrayList<>(path));
            }
            return;
        }
        if (root.left != null) {
            dfs(root.left, targetSum, path, res);
            path.removeLast();
        }
        if (root.right != null) {
            dfs(root.right, targetSum, path, res);
            path.removeLast();
        }
    }


    /**
     * 二叉搜索树的最近公共祖先
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
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


    /**
     * 求根节点到叶节点数字之和
     *
     * @param root
     * @return
     */
    public int sumNumbers2(TreeNode root) {

        LinkedList path = new LinkedList();
        List<List<Integer>> res = new ArrayList<>();
        dfs(root, path, res);
        int sum = 0;
        for (int i = 0; i < res.size(); i++) {
            List<Integer> curList = res.get(i);
            StringBuilder sb = new StringBuilder();
            int curNum = 0;
            for (Integer temp : curList) {
                sb.append(temp);
            }
            curNum = Integer.valueOf(sb.toString());
            sum += curNum;
        }
        return sum;
    }

    private void dfs(TreeNode root, LinkedList path, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        path.addLast(root.val);
        if (root.left == null && root.right == null) {
            res.add(new ArrayList(path));
            return;
        }
        if (root.left != null) {
            dfs(root.left, path, res);
            path.removeLast();
        }
        if (root.right != null) {
            dfs(root.right, path, res);
            path.removeLast();
        }
    }


    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode root, int prevSum) {
        if (root == null) {
            return 0;
        }
        int sum = prevSum * 10 + root.val;
        if (root.left == null && root.right == null) {
            return sum;
        }
        int left = dfs(root.left, sum);
        int right = dfs(root.right, sum);
        return left + right;
    }


    /**
     * 二叉搜索树中第k小的元素
     * <p>
     * 1.第k小
     * 2.二叉搜索树中序遍历有序
     */
    public int kthSmallest(TreeNode root, int k) {

        if (root == null || k <= 0) {
            return 0;
        }
        int[] res = new int[1];
        int[] kth = new int[1];
        kth[0] = k;
        findKth(root, kth, res);
        return res[0];
    }


    private void findKth(TreeNode root, int[] k, int[] res) {
        if (root == null) {
            return;
        }
        findKth(root.left, k, res);
        k[0] = k[0] - 1;
        k[0] = k[0];
        if (k[0] == 0) {
            res[0] = root.val;
            return;
        }
        findKth(root.right, k, res);
    }


    /**
     * 二叉搜索树的最小绝对差
     *
     * @param root
     * @return
     */
    public int getMinimumDifference(TreeNode root) {
        int min = Integer.MAX_VALUE;
        int[] res = new int[1];
        res[0] = min;
        TreeNode[] t1 = new TreeNode[1];
        TreeNode preNode = null;
        t1[0] = preNode;
        getMinDiff(root, t1, res);
        return res[0];
    }


    private void getMinDiff(TreeNode root, TreeNode[] treeNodes, int[] res) {
        if (root == null) {
            return;
        }
        getMinDiff(root.left, treeNodes, res);
        if (treeNodes[0] != null) {
            res[0] = Math.min(res[0], Math.abs(root.val - treeNodes[0].val));
        }
        treeNodes[0] = root;
        getMinDiff(root.right, treeNodes, res);
    }


    /**
     * 寻找第二小
     *
     * @param root
     * @return
     */
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int[] res = new int[2];
        res[0] = root.val;
        res[1] = -1;
        findSecondMin(root, res);
        return res[1];
    }

    private void findSecondMin(TreeNode root, int[] res) {
        if (root == null) {
            return;
        }
        findSecondMin(root.left, res);
        if (root.val < res[0]) {
            res[1] = res[0];
            res[0] = Math.min(root.val, res[0]);
        } else if (res[0] == root.val) {
            res[0] = Math.min(res[0], root.val);
        } else if (res[0] < root.val) {
            res[1] = res[1] == -1 ? root.val : Math.min(root.val, res[1]);
        }
        findSecondMin(root.right, res);
    }


    /**
     * 出现次数最多的子树元素和
     *
     * @param root
     * @return
     */
    public int[] findFrequentTreeSum(TreeNode root) {
        int[] res = new int[]{};
        if (root == null) {
            return res;
        }

        while (root != null) {
            int sum = sumTree(root);
            int leftSum = sumTree(root.left);
            int rightSum = sumTree(root.right);

        }

        return null;
    }

    private int sumTree(TreeNode root) {

        return 0;
    }


    public int maxDistance(TreeNode root) {
        int[] record = new int[1];
        return postOrder(root, record);
    }

    private int postOrder(TreeNode root, int[] record) {
        if (root == null) {
            record[0] = 0;
            return 0;
        }
        int lMax = postOrder(root.left, record);//左
        int maxFromLeft = record[0];
        int rMax = postOrder(root.right, record);//右
        int maxFromRight = record[0];
        int curNodeMax = maxFromLeft + maxFromRight + 1;//中
        record[0] = Math.max(maxFromLeft, maxFromRight) + 1;
        return Math.max(Math.max(lMax, rMax), curNodeMax);
    }

}




