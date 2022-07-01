package algorithm;

import common.TreeNode;
import org.apache.logging.log4j.util.Strings;

import java.util.*;

/**
 * 二叉树相关的问题
 */
public class TreeRelatedProblem {

    public static void main(String[] args) {

        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(3);
        head.right = new TreeNode(-1);
        TreeNode[] twoErrNodes = getTwoErrNodes(head);
        for (int i = 0; i < twoErrNodes.length; i++) {
            System.out.print(twoErrNodes[i] + " ");
        }
    }

    /**
     * 分层遍历二叉树
     */
    public static void readTreeByLevel(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode curNode = queue.poll();
            System.out.print(curNode.val + " ");
            if (curNode.left != null) {
                queue.add(curNode.left);
            }
            if (curNode.right != null) {
                queue.add(curNode.right);
            }
        }
    }


    /**
     * 分层遍历二叉树2
     */
    public static void readTreeByLevel2(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curNode = queue.poll();
                System.out.print(curNode.val + " ");
                if (curNode.left != null) {
                    queue.add(curNode.left);
                }
                if (curNode.right != null) {
                    queue.add(curNode.right);
                }
            }
            System.out.println("");
        }
    }


    /**
     * 1.二叉树的递归和非递归遍历 分别实现先序、中序、后序遍历
     */

    /**
     * 先序遍历
     *
     * @param head
     */
    public static void preOrder(TreeNode head) {
        if (head == null) {
            return;
        }
        System.out.print(head.val + " ");
        preOrder(head.left);
        preOrder(head.right);
    }

    /**
     * 中序遍历
     */
    public static void inOrder(TreeNode head) {
        if (head == null) {
            return;
        }
        inOrder(head.left);
        System.out.print(head.val + " ");
        inOrder(head.right);
    }

    /**
     * 后序遍历
     */
    public static void postOrder(TreeNode head) {
        if (head == null) {
            return;
        }
        postOrder(head.left);
        postOrder(head.right);
        System.out.print(head.val + " ");
    }

    /**
     * 先序遍历非递归实现
     */
    public static void preOrderN2(TreeNode head) {
        if (head == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(head);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            System.out.print(cur.val + " ");
            if (cur.right != null) {
                stack.push(cur.right);
            }
            if (cur.left != null) {
                stack.push(cur.left);
            }
        }
    }

    /**
     * 中序遍历非递归实现
     */
    public static void inOrderN2(TreeNode head) {
        if (head == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (!stack.isEmpty() || head != null) {
            if (head != null) {
                stack.push(head);
                head = head.left;
            } else {
                //出栈的过程 其实就可以拿到父节点 这个思路可以
                head = stack.pop();
                System.out.print(head.val + " ");
                head = head.right;
            }
        }
    }

    /**
     * 后序遍历非递归实现
     */
    public static void postOrderN2(TreeNode head) {
        if (head == null) {
            return;
        }
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        while (!s1.isEmpty()) {
            head = s1.pop();
            s2.push(head);
            if (head.left != null) {
                s1.push(head.left);
            }
            if (head.right != null) {
                s1.push(head.right);
            }
        }
        while (!s2.isEmpty()) {
            System.out.print(s2.pop().val + " ");
        }
    }

    /**
     * 带层号的 二叉树层次遍历
     * <p>
     * 思想：利用队列实现
     */
    public static void printByLevel(TreeNode head) {
        if (head == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int level = 1;
        TreeNode last = head;//指向当前行
        TreeNode nLast = null;//指向下一行
        queue.offer(head);
        System.out.print("Level " + (level++) + ":");
        while (!queue.isEmpty()) {
            head = queue.poll();
            System.out.print(head.val + "");
            if (head.left != null) {
                queue.offer(head.left);
                nLast = head.left;
            }
            if (head.right != null) {
                queue.offer(head.right);
                nLast = head.right;
            }
            if (head == last && !queue.isEmpty()) {
                System.out.print("\nLevel" + (level++) + ":");
                last = nLast;
            }
        }
        System.out.println();
    }


    /**
     * 在二叉树中找到累加和为指定值的最长路径长度
     * <p>
     * 题目：给定一棵二叉树的头节点head和一个32位整数sum 二叉树节点值类型是整型 求累加和为sum的最长路径长度
     * 路径是指从某个节点往下 每次最多选择一个孩子节点或者不选所形成的节点链
     * <p>
     * 思路：
     */
    public static int getMaxLength(TreeNode head, int sum) {
        HashMap<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
        sumMap.put(0, 0);
        return preOrder(head, sum, 0, 1, 0, sumMap);
    }

    private static int preOrder(TreeNode head, int sum, int preSum, int level, int maxLen, HashMap<Integer, Integer> sumMap) {
        if (head == null) {
            return maxLen;
        }
        int curSum = preSum + head.val;
        if (!sumMap.containsKey(curSum)) {
            sumMap.put(curSum, level);
        }
        if (sumMap.containsKey(curSum - sum)) {
            maxLen = Math.max(level - sumMap.get(curSum - sum), maxLen);
        }
        maxLen = preOrder(head.left, sum, curSum, level + 1, maxLen, sumMap);
        maxLen = preOrder(head.right, sum, curSum, level + 1, maxLen, sumMap);
        if (level == sumMap.get(curSum)) {
            sumMap.remove(curSum);
        }
        return maxLen;
    }

    /**
     * 判断二叉树是否为平衡二叉树
     * <p>
     * 题目：平衡二叉树的性质为：要么是一棵空树 要么任何一个节点的左右子树高度差的绝对值不超过1
     * 给定一棵二叉树的头节点head 判断这棵二叉树是否为平衡二叉树
     * <p>
     * 默认要求算法的时间复杂度为O(n)
     * <p>
     * 思路：二叉树的后序遍历 先判断左子树是否是平衡二叉树 再判断右子树是否是平衡二叉树
     */
    public static boolean isBalanceTree(TreeNode head) {
        boolean[] res = new boolean[1];
        res[0] = true;
        getHeight(head, 1, res);
        return res[0];
    }

    private static int getHeight(TreeNode head, int level, boolean[] res) {
        if (head == null) {
            return level;
        }
        int lH = getHeight(head.left, level + 1, res);
        if (!res[0]) {
            return level;
        }
        int rH = getHeight(head.right, level + 1, res);
        if (!res[0]) {
            return level;
        }
        if (Math.abs(lH - rH) > 1) {
            res[0] = false;
        }
        return Math.max(lH, rH);
    }

    /**
     * 在二叉树中找到两个节点的最近公共祖先
     * <p>
     * 题目：给定一棵二叉树的头节点head 以及这棵树中的两个节点o1和o2 请返回o1和o2的最近公共祖先节点
     * <p>
     * 思路：二叉树的后续遍历
     */
    public static TreeNode lowestAncestor(TreeNode head, TreeNode o1, TreeNode o2) {
        if (head == null || head == o1 || head == o2) {
            return head;
        }
        TreeNode left = lowestAncestor(head.left, o1, o2);
        TreeNode right = lowestAncestor(head.right, o1, o2);
        if (left != null && right != null) {
            return head;
        }
        return left != null ? left : right;
    }


    /**
     * 方式2：寻找两个节点的最近公共祖先节点
     * <p>
     * 思路：遍历二叉树，建立一个map维护 (key,value)
     * 1. key: 代表当前遍历到的节点
     * 2. value: 代表当前节点的父节点
     * <p>
     * 如何寻找最近公共祖先节点？
     * step1:将A节点的所有祖先节点放入 C集合中；
     * step2:遍历map查询B节点的父节点是否在C集合中；
     * step3:找到C集合中的公共值 返回即可；
     *
     * @param head
     * @param o1
     * @param o2
     * @return
     */
    public static TreeNode lowestAncestor2(TreeNode head, TreeNode o1, TreeNode o2) {
        Record record = new Record(head);
        return record.queryCommonTreeNode(o1, o2);
    }

    /**
     * Record静态内部类：存储父节点和子节点映射关系的map;
     */
    static class Record {
        private HashMap<TreeNode, TreeNode> map;

        public Record(TreeNode root) {
            map = new HashMap<>();
            if (root == null) {
                map.put(root, null);
            }
            setMap(root);
        }

        private void setMap(TreeNode root) {
            if (root == null) {
                return;
            }
            if (root.left != null) {
                map.put(root.left, root);
            }
            if (root.right != null) {
                map.put(root.right, root);
            }
            setMap(root.left);
            setMap(root.right);
        }

        public TreeNode queryCommonTreeNode(TreeNode o1, TreeNode o2) {
            HashSet<TreeNode> path = new HashSet<>();
            while (map.containsKey(o1)) {
                path.add(o1);
                o1 = map.get(o1);
            }
            while (!path.contains(o2)) {
                o2 = map.get(o2);
            }
            return o2;
        }
    }


    /**
     * 二叉树节点间的最大距离问题
     * <p>
     * 题目：从二叉树的节点A出发 可以向上或者向下走 但沿途的节点只能经过一次 当到达节点B时
     * 路径上的节点数就叫做A-B的距离
     * <p>
     * 思路：二叉树的后续遍历
     * 最大距离可能的三种情况
     * 1.h的左子树上的最大距离
     * 2.h的右子树上的最大距离
     * 3.h左子树上离h.left最远的距离+1(h)+h右子树上离h.right最远的距离
     * 三个值中最大的那个就是整颗h树中最远的距离
     */
    public static int maxDistance(TreeNode head) {
        int[] record = new int[1];
        return posOrder(head, record);
    }

    private static int posOrder(TreeNode head, int[] record) {
        if (head == null) {
            record[0] = 0;
            return 0;
        }
        //左子树的最大距离
        int lMax = posOrder(head.left, record);
        //左子树上距离head左孩子的最远距离
        int maxFromLeft = record[0];
        //右子树上的最大距离
        int rMax = posOrder(head.right, record);
        //右子树上距离head右孩子的最远距离
        int maxFromRight = record[0];
        int curNodeMax = maxFromLeft + maxFromRight + 1;
        record[0] = Math.max(maxFromLeft, maxFromRight) + 1;
        return Math.max(Math.max(lMax, rMax), curNodeMax);
    }

    /**
     * 统计完全二叉树的节点数
     * <p>
     * 题目：给定一棵完全二叉树的头节点head 返回这棵树的节点个数
     * <p>
     * 要求：如果完全二叉树的节点数为N 请实现时间复杂度低于O(N)的解法
     */
    public static int nodeNum(TreeNode head) {
        if (head == null) {
            return 0;
        }
        return bs(head, 1, mostLeftLevel(head, 1));
    }

    private static int bs(TreeNode head, int l, int h) {
        if (l == h) {
            return 1;
        }
        if (mostLeftLevel(head.right, l + 1) == h) {
            return (1 << (h - 1)) + bs(head.right, l + 1, h);
        } else {
            return (l << (h - l - 1) + bs(head.left, l + 1, h));
        }
    }

    private static int mostLeftLevel(TreeNode head, int level) {
        while (head != null) {
            level++;
            head = head.left;
        }
        return level - 1;
    }


    /**
     * 调整搜索二叉树中两个错误的节点
     * <p>
     * 题目1：一棵二叉树原本是搜索二叉树 但是其中有两个节点调换了位置 使得这颗二叉树不再是搜索二叉树
     * 请找到这两个错误节点并返回 已知二叉树中所有节点的值都不一样 给定二叉树的头节点head
     * 返回一个长度为2的二叉树节点类型的数组errs
     * <p>
     * 题目2：如何在结构上完全交换两个节点的位置 请实现调整的函数
     * <p>
     * 思路：中序遍历搜索二叉树 是有序的 改写了一个中序遍历 就实现了
     * 递归、非递归方式均可以实现
     */
    public static TreeNode[] getTwoErrNodes(TreeNode head) {
        TreeNode[] errs = new TreeNode[2];
        if (head == null) {
            return errs;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while (!stack.isEmpty() || head != null) {
            if (head != null) {
                stack.push(head);
                head = head.left;
            } else {
                head = stack.pop();
                if (pre != null && pre.val > head.val) {
                    errs[0] = errs[0] == null ? pre : errs[0];
                    errs[1] = head;
                }
                pre = head;
                head = head.right;
            }
        }
        return errs;
    }

    /**
     * 题目2：如何在结构上完全交换两个节点的位置 请实现调整的函数
     * <p>
     * 获取两个错误节点的父节点
     */
    public static TreeNode[] getTwoErrParents(TreeNode head, TreeNode e1, TreeNode e2) {
        TreeNode[] parents = new TreeNode[2];
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || head != null) {
            if (head != null) {
                stack.push(head);
                head = head.left;
            } else {
                head = stack.pop();
                if (head.left == e1 || head.right == e1) {
                    parents[0] = head;
                }
                if (head.left == e2 || head.right == e2) {
                    parents[1] = head;
                }
                head = head.right;
            }
        }
        return parents;
    }


    /**
     * 统计和生成所有不同的二叉树
     * <p>
     * 题目：给定一个整数N 如果N<1 代表空树结构 否则代表中序遍历的结果为{1,2,3,...N} 返回可能的二叉树结构有多少？
     */
    public static int numTrees(int n) {
        if (n < 2) {
            return 1;
        }
        int[] num = new int[n + 1];
        num[0] = 1;
        //使用了动态规划来实现的；
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                num[i] += num[j - 1] * num[i - j];
            }
        }
        return num[n];
    }


}

/**
 * 题目：路径总和
 * <p>
 * 给你二叉树的根节点root 和一个表示目标和的整数targetSum 。
 * 判断该树中是否存在 根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和targetSum 。
 * 如果存在，返回 true ；否则，返回 false 。
 * <p>
 * 思路：递归遍历整颗二叉树，需要进行回溯；
 */

class Solution11 {

    /**
     * 方式1：显示的回溯来实现；
     * <p>
     * <p>
     * 完成情况：done
     *
     * @param root
     * @param targetSum
     * @return
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return Boolean.FALSE;
        }
        int count = 0;
        return dfs(root, targetSum - root.val, count);
    }


    /**
     * @param root:根节点
     * @param targetSum：目标targetSum
     * @param count:代表从头节点开始遍历的和；
     * @return
     */
    private boolean dfs(TreeNode root, int targetSum, int count) {
        //遇到叶子节点并且计数和为targetSum时，返回true;
        if (root.left == null && root.right == null && count == targetSum) {
            return Boolean.TRUE;
        }
        //遇到叶子节点直接返回；
        if (root.left == null && root.right == null) {
            return Boolean.FALSE;
        }
        if (root.left != null) {
            //选择
            count += root.left.val;
            if (dfs(root.left, targetSum, count)) {
                return true;
            }
            //回溯
            count -= root.left.val;
        }
        if (root.right != null) {
            count += root.right.val;
            if (dfs(root.right, targetSum, count)) {
                return true;
            }
            count -= root.right.val;
        }
        return false;
    }

    /**
     * 方式2：优化上面的代码，隐式地利用回溯；
     * <p>
     * 函数的入栈和出栈：对应的就是递归和回溯的关系；
     * 1.递归就是入栈
     * 2.回溯就是出栈
     * <p>
     * 3.函数的调用关系天然的满足入栈和出栈的关系；
     * <p>
     * <p>
     * 完成情况：done
     */
    public boolean hasPathSum2(TreeNode root, int targetSum) {
        if (root == null) {
            return Boolean.FALSE;
        }
        if (root.left == null && root.right == null && targetSum == root.val) {
            return Boolean.TRUE;
        }
        return hasPathSum2(root.left, targetSum - root.val)
                || hasPathSum2(root.right, targetSum - root.val);
    }
}

/**
 * 题目：二叉树的所有路径
 * <p>
 * 给你一个二叉树的根节点 root ，按任意顺序 ，返回所有从根节点到叶子节点的路径。
 * 叶子节点 是指没有子节点的节点。
 * <p>
 * <p>
 * 思路：直接使用精简版的代码，这边不显示的进行回溯代码的书写；
 * <p>
 * 完成情况：done
 */

class Solution12 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        String path = Strings.EMPTY;
        dfs(root, path + root.val, res);
        return res;
    }

    private void dfs(TreeNode root, String path, List<String> res) {
        if (root.left == null && root.right == null) {
            res.add(path);
            return;
        }

        // 本质上就是利用了函数栈的原理来进行回溯；
        // 函数进入时，path=path+"->"+root.left.value;
        // 函数退出后，path还是原来那个path
        if (root.left != null) {
            dfs(root.left, path + "->" + root.left.val, res);
        }

        if (root.right != null) {
            dfs(root.right, path + "->" + root.right.val, res);
        }
    }
}


/**
 * 题目：二叉树的最大深度
 * <p>
 * 完成情况：done
 */

class Solution13 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);
        return 1 + Math.max(leftMax, rightMax);
    }
}


/**
 * 题目：二叉树的最近公共祖先
 * <p>
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 */
class Solution14 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return dfs(root, p, q);
    }

    /**
     * @param root
     * @param p
     * @param q
     * @return
     */
    private TreeNode dfs(TreeNode root, TreeNode p, TreeNode q) {
        //递归跳出条件
        if (root == p || root == q || root == null) {
            return root;
        }
        //后序遍历二叉树，实现的是回溯的思想，从下往上进行遍历；
        TreeNode leftRoot = dfs(root.left, p, q);
        TreeNode rightRoot = dfs(root.right, p, q);
        if (leftRoot != null && rightRoot != null) {
            return root;
        }
        if (leftRoot == null && rightRoot != null) {
            return rightRoot;
        } else if (leftRoot != null && rightRoot == null) {
            return leftRoot;
        } else {
            return null;
        }
    }
}


/**
 * 题目：所有可能的满二叉树
 * <p>
 * 满二叉树是一类二叉树，其中每个结点恰好有 0 或 2 个子结点。
 * 返回包含 N 个结点的所有可能满二叉树的列表。 答案的每个元素都是一个可能树的根结点。
 * 答案中每个树的每个结点都必须有 node.val=0。
 * 你可以按任何顺序返回树的最终列表。
 */
class Solution15 {
    public List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> res = new ArrayList<>();
        //n是偶数，不可能是满二叉树；
        if (n % 2 == 0) {
            return new ArrayList<>();
        }
        if (n == 1) {
            res.add(new TreeNode(0));
            return res;
        }
        dfs(n, res);
        return res;
    }

    private void dfs(int n, List<TreeNode> res) {
        if (n == 1) {
            res.add(new TreeNode(0));
            return;
        }

        for (int i = 1; i < n - 1; i += 2) {
            //左子树所有情况
            List<TreeNode> leftNodeRes = new ArrayList<>();
            //右子树所有情况
            List<TreeNode> rightNodeRes = new ArrayList<>();
            dfs(i, leftNodeRes);//左子树i个节点
            dfs(n - i - 1, rightNodeRes);//右子树n-i-1个节点；
            //组合所有情况
            for (TreeNode leftNode : leftNodeRes) {
                for (TreeNode rightNode : rightNodeRes) {
                    //根；
                    TreeNode root = new TreeNode(0);
                    root.left = leftNode;
                    root.right = rightNode;
                    res.add(root);
                }
            }
        }
    }
}

/**
 * 题目：二叉树的中序遍历
 * <p>
 * 给定一个二叉树的根节点root,返回它的中序遍历；
 */
class Solution16 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }
        inorder(root, res);
        return res;
    }

    private void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }
}


/**
 * 题目：不同的二叉搜索树
 * <p>
 * 给你一个整数n ，请你生成并返回所有由n个节点组成且节点值从1到n互不相同的不同二叉搜索树 。
 * 可以按任意顺序返回答案。
 */
class Solution17 {


    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new LinkedList<TreeNode>();
        }
        return generateTrees(1, n);
    }

    public List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> allTrees = new LinkedList<TreeNode>();
        if (start > end) {
            allTrees.add(null);
            return allTrees;
        }

        // 枚举可行根节点
        for (int i = start; i <= end; i++) {
            // 获得所有可行的左子树集合
            List<TreeNode> leftTrees = generateTrees(start, i - 1);

            // 获得所有可行的右子树集合
            List<TreeNode> rightTrees = generateTrees(i + 1, end);

            // 从左子树集合中选出一棵左子树，从右子树集合中选出一棵右子树，拼接到根节点上
            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrees) {
                    TreeNode currTree = new TreeNode(i);
                    currTree.left = left;
                    currTree.right = right;
                    allTrees.add(currTree);
                }
            }
        }
        return allTrees;
    }
}

/**
 * 题目：不同的二叉搜索树
 * 给你一个整数n，求恰由n个节点组成且节点值从1到n互不相同的二叉搜索树有多少种？
 * 返回满足题意的二叉搜索树的种数。
 */
class Solution18 {
    public int numTrees(int n) {
        int res = dfs(n);
        return res;
    }


    /**
     * 获取二叉树的种数
     *
     * @param n
     * @return
     */
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
}

/**
 * 题目：验证二叉搜索树
 * 给你一个二叉树的根节点root,判断其是否是一个有效的二叉搜索树。
 */
class Solution19 {

    public boolean isValidBST(TreeNode root) {
        boolean res = dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
        return res;
    }

    /**
     * 判断一棵二叉树是否是二叉搜索树
     * <p>
     * 如果是二叉搜索树：左子树的节点数字< 中间的节点的节点数字 <右子树的节点数字
     *
     * @param root
     * @param low：协助判断二叉搜索树low   最小值
     * @param high：协助判断二叉搜索树high 最大值
     * @return
     */
    private boolean dfs(TreeNode root, Long low, Long high) {
        if (root == null) {
            return true;
        }
        if (root.val <= low || root.val >= high) {
            return false;
        }
        return dfs(root.left, low, (long) root.val) && dfs(root.right, (long) root.val, high);
    }

}

/**
 * 题目：二叉搜索树中第k小的元素
 * 给定一个二叉搜索树的根节点 root ，和一个整数 k ，请你设计一个算法查找其中第 k 个最小元素（从 1 开始计数）。
 * <p>
 * 完成情况：done
 */
class Solution20 {
    public int kthSmallest(TreeNode root, int k) {
        List<TreeNode> path = new ArrayList<>();
        dfs(root, path);
        int res = path.get(k - 1).val;
        return res;
    }

    private void dfs(TreeNode root, List<TreeNode> path) {
        if (root == null) {
            return;
        }
        dfs(root.left, path);
        path.add(root);
        dfs(root.right, path);
    }
}


/**
 * 路径:被定义为一条从树中任意节点出发，沿父节点-子节点连接，达到任意节点的序列。
 * 同一个节点在一条路径序列中至多出现一次。该路径至少包含一个节点，且不一定经过根节点。
 * 路径和是路径中各节点值的总和。
 * <p>
 * 给你一个二叉树的根节点root,返回其最大路径和 。
 */
class Solution111 {

    int res = Integer.MIN_VALUE;

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
        //res: 记录全局的最大值；
        //递归不能返回res，因为res不符合递归函数的定义
        //左子树+root+右子树的最大路径和；
        res = Math.max(res, Math.max(middle, root.val + left + right));
        return middle;
    }
}


/**
 * 题目：求根节点到叶节点数字之和
 * <p>
 * 给你一个二叉树的根节点 root ，树中每个节点都存放有一个 0 到 9 之间的数字。
 * 每条从根节点到叶节点的路径都代表一个数字：
 * <p>
 * 例如，从根节点到叶节点的路径 1 -> 2 -> 3 表示数字 123 。
 * 计算从根节点到叶节点生成的 所有数字之和 。
 * <p>
 * 叶节点 是指没有子节点的节点。
 * <p>
 * 完成情况：done
 */

class Solution112 {


    /**
     * 思路：1、找出二叉树的所有路径
     * 2、遍历路径求和
     *
     * @param root
     * @return
     */
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new LinkedList<>();
        dfs(root, (LinkedList<Integer>) path, res);
        int sum = 0;
        for (int i = 0; i < res.size(); i++) {
            List<Integer> temp = res.get(i);
            StringBuilder sb = new StringBuilder();
            for (Integer tempInteger : temp) {
                sb.append(tempInteger);
            }
            sum += Integer.valueOf(sb.toString());
        }
        return sum;
    }

    /**
     * 获取二叉树的所有路径；
     *
     * @param root
     * @param path
     * @param res
     */
    public void dfs(TreeNode root, LinkedList<Integer> path, List<List<Integer>> res) {
        path.addLast(root.val);
        if (root.left == null && root.right == null) {
            res.add(new ArrayList<>(path));
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

    /**
     * 获取全部路径方式2;
     * 方式2也是可以通过的；
     * 完成情况：done
     *
     * @param root
     * @param path
     * @param res
     */
    public void dfs2(TreeNode root, LinkedList<Integer> path, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        path.addLast(root.val);
        if (root.left == null && root.right == null) {
            res.add(new ArrayList<>(path));
        }
        dfs2(root.left, path, res);
        dfs2(root.right, path, res);
        path.removeLast();
    }
}

/**
 * 题目：通过有序数组生成平衡搜索二叉树
 * <p>
 * 给定一个有序数组sortArr,已知其中没有重复值，用这个有序数组生成一棵平衡搜索二叉树，
 * 并且该搜索二叉树中中序遍历的结果和sortArr一致；
 */
class Solution113 {


    /**
     * 思路：
     * 1.用有序数组中最中间的数生成搜索二叉树的头节点
     * 2.用这个数左边的数生成左子树
     * 3.用这个数右边的数生成右子树
     *
     * @param sortArr
     * @return
     */
    public TreeNode generateTree(int[] sortArr) {
        if (sortArr == null) {
            return null;
        }
        return generate(sortArr, 0, sortArr.length - 1);
    }

    private TreeNode generate(int[] sortArr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(sortArr[mid]);
        //递归生成左右子树；
        root.left = generate(sortArr, start, mid - 1);
        root.right = generate(sortArr, mid + 1, end);
        return root;
    }
}


/**
 * 题目：二叉树的序列化和反序列化
 */
class Solution114 {
    /**
     * 方式1：二叉树的先序遍历实现二叉树的序列化和反序列化
     * <p>
     * 备注：
     * 1.遇到null节点用"#！"
     * 2."！"表示一个值的结束；
     */
    public String serialByPre(TreeNode root) {
        //终止条件的返回值需要被递归函数使用，需要注意返回的不是null字符串；
        if (root == null) {
            return "#!";
        }
        String res = root.val + "!";
        res += serialByPre(root.left);
        res += serialByPre(root.right);
        return res;
    }

    //反序列化树
    public TreeNode deSerialByPre(String preStr) {
        //按照!符合进行数据拆分，将拆分好的数据放进辅助队列中；
        String[] values = preStr.split("!");
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i != values.length; i++) {
            queue.offer(values[i]);
        }
        return deSerialTree(queue);
    }

    private TreeNode deSerialTree(Queue<String> queue) {
        String value = queue.poll();
        if (value.equals("#")) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(value));
        root.left = deSerialTree(queue);
        root.right = deSerialTree(queue);
        return root;
    }

}


/**
 * 题目：先序、中序和后序数组两两组合重构二叉树
 */
class Solution115 {

}

