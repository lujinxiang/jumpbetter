package algorithm;

import common.ArrayUtil;
import common.Node;
import common.TreeNode;

import java.util.*;

import static java.util.Arrays.binarySearch;

/**
 * 剑指offer上面的题目实现
 */
public class SwordOfferRelatedProblem {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left = left;
        left.left = new TreeNode(4);
        left.right = new TreeNode(5);

        List<List<TreeNode>> res = printBinaryTreeByLevel(root);
        for (int i = 0; i < res.size(); i++) {
            List<TreeNode> treeNodes = res.get(i);
            for (int j = 0; j < treeNodes.size(); j++) {
                System.out.print(treeNodes.get(j).val + " ");
            }
            System.out.println();
        }
    }


    //链表问题

    /**
     * 从尾到头打印链表
     */
    public static void reverseNode(Node head) {
        Stack<Node> stack = new Stack<Node>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        while (!stack.empty()) {
            System.out.print(stack.pop().value + " ");
        }
    }

    /**
     * 链表中倒数第k个结点
     * <p>
     * 题目：输入一个链表，输出该链表中倒数第k个结点。
     * <p>
     * 思路：定义快慢指针 快指针先走k步 然后慢指针开始走 快指针到尾时 慢指针找到了倒数第k个节点
     */
    public static Node lastKNode(Node head, int k) {
        if (head == null || k < 1) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        while (k-- > 1) {
            if (fast.next == null) {
                return null;
            }
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }


    /**
     * 反转链表
     * <p>
     * 题目：输入一个链表，反转链表后，输出链表的所有元素。
     */
    public static Node reversList(Node head) {
        Node pre = null;
        Node cur = head;
        while (cur != null) {
            Node next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    /**
     * 合并两个排序的链表
     * <p>
     * 题目：输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
     */
    public static Node mergeTwoList(Node head1, Node head2) {
        Node preHead = new Node(-1);
        Node pre = preHead;
        while (head1 != null && head2 != null) {
            if (head1.value < head2.value) {
                pre.next = head1;
                head1 = head1.next;
            } else {
                pre.next = head2;
                head2 = head2.next;
            }
            pre = pre.next;
        }
        pre.next = head1 == null ? head2 : head1;
        return preHead.next;
    }


    /**
     * 复杂链表的复制
     *
     * 题目：输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
     * 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
     */

    /**
     * 两个链表的第一个公共结点
     *
     * 题目：输入两个链表，找出它们的第一个公共结点。
     */


    /**
     * 链表中环的入口结点
     * <p>
     * 题目：一个链表中包含环，请找出该链表的环的入口结点。
     */
    public static Node entryNodeOfLoop(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        do {
            fast = fast.next.next;
            slow = slow.next;
        } while (slow != fast);
        return slow;
    }

    /**
     * 删除链表中重复的结点
     *
     * 题目：在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，
     * 返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5。
     */


    //二叉树问题

    /**
     * 重建二叉树
     * <p>
     * 题目：输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
     * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
     */
    public static TreeNode reconstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null || pre.length == 0 || in.length == 0) {
            return null;
        }
        if (pre.length != in.length) {
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        for (int i = 0; i < pre.length; i++) {
            if (pre[0] == in[i]) {
                root.left = reconstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
                root.right = reconstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(in, i + 1, in.length));
            }
        }
        return root;
    }

    /**
     * 树的子结构
     * <p>
     * 题目：输入两颗二叉树A，B，判断B是不是A的子结构。（PS：我们约定空树不是任意一个树的子结构）。
     * <p>
     * 思路：若根节点相等 利用递归比较他们的子树是否相等 若根节点不相等 则利用递归分别在左右子树中查找
     */
    public static boolean hasSubTree(TreeNode source, TreeNode target) {
        if (target == null) {
            return true;
        }
        if (source == null) {
            return false;
        }
        if (doesTre1HaveTree2(source, target)) {
            return true;
        }
        return hasSubTree(source.left, target) || hasSubTree(source.right, target);
    }

    private static boolean doesTre1HaveTree2(TreeNode source, TreeNode target) {
        if (source == null && target == null) {
            return true;
        }
        if (source == null || target == null) {
            return false;
        }
        if (source.val != target.val) {
            return false;
        }
        return doesTre1HaveTree2(source.left, target.left) && doesTre1HaveTree2(source.right, target.right);
    }

    /**
     * 二叉树的镜像
     * <p>
     * 题目：操作给定的二叉树，将其变换为源二叉树的镜像。
     */
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private static boolean isMirror(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null) {
            return true;
        }
        if (leftNode == null || rightNode == null) {
            return false;
        }
        return leftNode.val == rightNode.val && isMirror(leftNode.left, rightNode.right) && isMirror(leftNode.right, rightNode.left);
    }

    public boolean isSymmetric2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode t1 = stack.pop();
            TreeNode t2 = stack.pop();
            if (t1 == null && t2 == null) {
                continue;
            }
            if (t1 == null || t2 == null) {
                return false;
            }
            if (t1.val != t2.val) {
                return false;
            }
            stack.push(t1.left);
            stack.push(t2.right);
            stack.push(t1.right);
            stack.push(t2.left);
        }
        return true;
    }

    /**
     * 从上往下打印二叉树
     * <p>
     * 题目：从上往下打印出二叉树的每个节点，同层节点从左至右打印。
     * <p>
     * 思路：利用队列辅助实现
     */
    public static List<Integer> printFromTopToBottom(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node.val);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return list;
    }

    /**
     * 二叉树中和为某一值的路径
     * <p>
     * 题目：输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
     * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
     * <p>
     * 思路：先保存根节点 然后分别递归左右子树中找目标值 若找到即到达叶子节点 打印路径中的值
     */
    public static List<List<Integer>> findPath(TreeNode root, int target) {
        List<List<Integer>> listAll = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return listAll;
        }
        list.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            listAll.add(new ArrayList<>(list));
        }
        findPath(root.left, target);
        findPath(root.right, target);
        //回退
        list.remove(list.size() - 1);
        return listAll;
    }


    /**
     * 二叉树的深度
     * <p>
     * 题目：输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
     * <p>
     * 思路：利用递归遍历分别返回左右子树深度
     */
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

    /**
     * 平衡二叉树
     * <p>
     * 题目：输入一棵二叉树，判断该二叉树是否是平衡二叉树。
     * 平衡二叉树的定义是：所谓的平衡之意，就是树中任意一个结点下左右两个子树的高度差不超过 1。
     * 解题思路有两种，只遍历一次的方法最优。
     * <p>
     * 思路：平衡二叉树的条件是左子树是平衡二叉树 右子树是平衡二叉树 左右子树高度不超过1
     */
    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean condition = Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1;
        return condition && isBalanced(root.left) && isBalanced(root.right);
    }


    /**
     * 二叉树的下一个结点
     * <p>
     * 题目：给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
     * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
     */
    public static TreeNode findNextNode(TreeNode root, TreeNode targetNode) {


        return null;
    }


    /**
     * 对称的二叉树
     * <p>
     * 题目：请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
     */
    public static boolean isSimilarTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSimilarTree(root.left, root.right);
    }

    /**
     * 递归函数判断左右子树是否是对称的二叉树
     *
     * @param left
     * @param right
     * @return
     */
    private static boolean isSimilarTree(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null && right != null) {
            return false;
        } else if (left != null && right == null) {
            return false;
        } else if (left.val != right.val) {
            return false;
        }
        //比较外层的节点是否相等
        boolean outSide = isSimilarTree(left.left, right.right);
        //比较内层的节点是否相等
        boolean inSide = isSimilarTree(left.right, right.left);
        return outSide && inSide;
    }


    /**
     * 按之字顺序打印二叉树
     *
     * 题目：请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
     * 第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
     */

    /**
     * 把二叉树打印成多行
     * <p>
     * 题目：从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
     */
    public static List<List<TreeNode>> printBinaryTreeByLevel(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<TreeNode>> res = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            List<TreeNode> temp = new ArrayList<>();
            for (int i = 0; i < queueSize; i++) {
                TreeNode cur = queue.poll();
                temp.add(cur);
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
            }
            res.add(temp);
        }
        return res;
    }


    /**
     * 序列化二叉树
     * <p>
     * 题目：请实现两个函数，分别用来序列化和反序列化二叉树。
     */
    public static String serialize(TreeNode root) {
        if (root == null) {
            return "#";
        }
        return root.val + " " + serialize(root.left) + " " + serialize(root.right);
    }

    /**
     * 二叉搜索树的后序遍历序列
     * <p>
     * 题目：输入一个整型数组 判断该数组是不是某个二叉搜索树的后续遍历的结果 假设输入的数组的任意两个数字都是互不相同的
     */
    public static boolean verifySquenceofBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        return verify(sequence, 0, sequence.length - 1);
    }

    private static boolean verify(int[] sequence, int first, int last) {
        if (last - first <= 1) {
            return true;
        }
        int rootVal = sequence[last];
        int curIndex = first;
        while (curIndex < last && sequence[curIndex] <= rootVal) {
            curIndex++;
        }
        for (int i = curIndex; i < last; i++) {
            if (sequence[i] < rootVal) {
                return false;
            }
        }
        return verify(sequence, first, curIndex - 1) && verify(sequence, curIndex, last - 1);
    }

    /**
     * 二叉搜索树与双向链表
     * <p>
     * 题目：输入一棵二叉搜索树 将该二叉搜索树转换成一个排序的双向链表 要求不能创建任何新的节点 只能调整树中节点指针的指向
     * <p>
     * 思路：定义一个链表的尾节点 递归处理左右子树 最后返回链表的头节点
     */
    public static TreeNode convert(TreeNode pRootOfTree) {
        TreeNode lastList = convert(pRootOfTree, null);
        TreeNode pHead = lastList;
        while (pHead != null && pHead.left != null) {
            pHead = pHead.left;
        }
        return pHead;
    }

    private static TreeNode convert(TreeNode root, TreeNode lastList) {
        if (root == null) {
            return null;
        }
        TreeNode cur = root;
        if (cur.left != null) {
            lastList = convert(cur.left, lastList);
        }
        cur.left = lastList;
        if (lastList != null) {
            lastList.right = cur;
        }
        lastList = cur;
        if (cur.right != null) {
            lastList = convert(cur.right, lastList);
        }
        return lastList;
    }

    /**
     * 二叉搜索树的第k个结点
     * <p>
     * 注意事项：不能直接传入k，必须传入k的引用才可以；
     * <p>
     * 完成情况：done
     */
    public static TreeNode kthNode(TreeNode root, int k) {
        if (root == null) {
            return null;
        }
        List<TreeNode> res = new ArrayList<>();

        List<Integer> kth = new ArrayList<>();
        kth.add(k);
        findTree(root, kth, res);
        return res.get(0);
    }

    private static void findTree(TreeNode root, List<Integer> kth, List<TreeNode> res) {
        if (root == null) {
            return;
        }
        findTree(root.left, kth, res);

        int temp = kth.get(0) - 1;
        kth.remove(0);
        kth.add(temp);
        if (temp == 0) {
            res.add(root);
            return;
        }

        findTree(root.right, kth, res);
    }


    //数组问题

    /**
     * 二维数组中的查找
     * <p>
     * 题目：在一个二维数组中，每一行都按照从左到右递增的顺序排序，
     * 每一列都按照从上到下递增的顺序排序。请完成一个函数
     * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     */
    public static boolean isContainsNumber(int[][] matrix, int k) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int col = matrix[0].length;
        int startRow = 0;
        while (startRow <= matrix.length && col > 0) {
            if (matrix[startRow][col] == k) {
                return true;
            } else if (matrix[startRow][col] > k) {
                col--;
            } else {
                startRow++;
            }
        }
        return false;
    }


    /**
     * 旋转数组的最小数字
     * <p>
     * 题目：把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
     * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
     * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
     * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
     * <p>
     * 思路：利用二分法
     */
    public static int minInReverseList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        if (arr.length == 1 || arr[arr.length - 1] > arr[0]) {
            return arr[0];
        }
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return arr[mid + 1];
            }
            if (arr[mid - 1] > arr[mid]) {
                return arr[mid];
            }
            if (arr[mid] > arr[0]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    /**
     * 调整数组顺序使奇数位于偶数前面
     * <p>
     * 题目：输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
     * 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
     * <p>
     * 思路：利用双指针
     */
    public static void reOrderArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (left < right && arr[left] % 2 != 0) {
                left++;
            }
            while (left < right && arr[right] % 2 == 0) {
                right--;
            }
            if (left < right) {
                ArrayUtil.swap(arr, left, right);
            }
        }
    }


    /**
     * 数组中出现次数超过一半的数字
     * <p>
     * 题目：数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
     * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，
     * 超过数组长度的一半，因此输出2。如果不存在则输出0。
     * <p>
     * 思路：将首次出现的数count+1 与之后的数比较 相等则+1 否则-1 最后校验是否超过长度的一半
     */
    public static int moreThanHalfNum(int[] arr) {
        int count = 0;
        int candidate = 0;
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            count += num == candidate ? 1 : -1;
        }
        return checkMoreThanHalf(arr, candidate) ? candidate : 0;
    }

    private static boolean checkMoreThanHalf(int[] arr, int candidate) {
        int times = 0;
        for (int num : arr) {
            if (num == candidate) {
                times++;
            }
        }
        return times * 2 >= arr.length;
    }

    /**
     * 连续子数组的最大和
     * <p>
     * 题目：输入一个整型数组 数组中有正数也有负数 数组中一个或连续的多个整数组成一个子数组 求连续子数组的最大和
     * <p>
     * 思路：若和小于0 则将最大和置为当前值 否则计算最大和
     */
    public static int maxSubArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int sum = 0;
        int result = arr[0];
        for (int num : arr) {
            sum = sum > 0 ? sum + num : num;
            result = Math.max(sum, result);
        }
        return result;
    }


    /**
     * 把数组排成最小的数
     *
     * 题目：输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
     * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
     */

    /**
     * 数组中的逆序对
     *
     * 题目：在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
     * 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007。
     */

    /**
     * 数字在排序数组中出现的次数
     * <p>
     * 题目：统计一个数字在排序数组中出现的次数。
     */
    public static int getNumberOfk(int[] arr, int k) {
        int first = binarySearch(arr, k);
        int last = binarySearch(arr, k + 1);
        return (first == arr.length || arr[first] != k) ? 0 : last - first;
    }


    /**
     * 数组中只出现一次的数字
     * <p>
     * 题目：一个整型数组里除了两个数字之外，其他的数字都出现了两次。
     * 请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
     * <p>
     * 思路：两个相同的数异或后为0 一个数和0异或还是它本身 将所有数异或后即可得到A、B异或的结果
     * 然后求得1在该数最右边出现的index 然后判断每个数右移index后是不是1¬
     */
    public static void findNumsAppearOnce(int[] arr, int[] num1, int[] num2) {
        if (arr == null) {
            return;
        }
        num1[0] = 0;
        num2[0] = 0;
        int number = arr[0];
        for (int i = 1; i < arr.length; i++) {
            number ^= arr[i];
        }
        int index = 0;
        while ((number & 1) == 0) {
            number = number >> 1;
            index++;
        }
        for (int i = 0; i < arr.length; i++) {
            boolean isBit = ((arr[i] >> index) & 1) == 0;
            if (isBit) {
                num1[0] ^= arr[i];
            } else {
                num2[0] ^= arr[i];
            }
        }
    }

    /**
     * 数组中重复的数字
     * <p>
     * 题目：在一个长度为n的数组里的所有数字都在0到n-1的范围内。
     * 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。
     * 请找出数组中任意一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
     * <p>
     * 思路：就是0位置放0 1位置放1 如果不是的话 就交换0位置上的数字代表的index 让0位置和index位置上的数交换
     * 最后如果0位置上的数值=index值位置上的数值 则存在重复的数据
     */
    public static boolean getDuplicateNumber(int[] arr) {
        if (arr == null || arr.length <= 0) {
            return false;
        }
        List<Integer> deplicateNumbers = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != i) {
                if (arr[i] == arr[arr[i]]) {
                    deplicateNumbers.add(arr[i]);
                    return true;
                } else {
                    //交换arr[i]和arr[arr[i]]的值
                    int temp = arr[i];
                    arr[i] = arr[temp];
                    arr[temp] = temp;
                }
            }
        }
        return false;
    }


    /**
     * 构建乘积数组
     *
     * 题目：给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
     * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
     */

    //字符串问题

    /**
     * 替换空格
     * <p>
     * 题目：请实现一个函数，将一个字符串中的空格替换成“%20”。
     * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     * <p>
     * 思路：遍历空格数量 从后往前遍历数组 进行空格的替换
     */
    public static void replaceBlank(char[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int blankNumber = 0;
        for (int i = 0; i != arr.length; i++) {
            if (arr[i] == ' ') {
                blankNumber++;
            }
        }
        int newLength = blankNumber * 2 + arr.length;
        int indexOfOriginal = arr.length - 1;
        int indexOfNew = newLength - 1;
        char[] newArr = new char[newLength];
        while (indexOfOriginal >= 0 && indexOfNew >= indexOfOriginal) {
            if (arr[indexOfOriginal] == ' ') {
                newArr[indexOfNew--] = '0';
                newArr[indexOfNew--] = '2';
                newArr[indexOfNew--] = '%';
            } else {
                newArr[indexOfNew] = arr[indexOfOriginal];
                indexOfNew--;
            }
            indexOfOriginal--;
        }
        System.out.println(new String(newArr));
    }



    /**
     * 第一个只出现一次的字符
     *
     * 题目：在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置。
     */




    /**
     * 左旋转字符串
     *
     * 题目：例如：输入字符串"abcdefg"和数字2，该函数将返回左旋转2位得到的结果"cdefgab";
     */

    /**
     * 翻转单词顺序序列
     */

    /**
     * 把字符串转换成整数
     */

    /**
     * 正则表达式匹配
     *
     * 题目：请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。
     * 在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配。
     */

    /**
     * 表示数值的字符串
     *
     * 题目：请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
     * 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
     * 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
     */


    //栈的问题

    /**
     * 用两个栈实现队列
     */
    static class MyStack {
        public Stack<Integer> stack1 = new Stack<>();
        public Stack<Integer> stack2 = new Stack<>();

        public void push(int data) {
            stack1.push(data);
        }

        public void pop() throws Exception {
            if (stack1.isEmpty() && stack2.isEmpty()) {
                throw new Exception("stack is empty");
            }

            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
        }
    }

    /**
     * 包含min函数的栈
     */

    /**
     * 栈的压入、弹出序列
     */


    //递归问题

    /**
     * 裴波那契数列
     */
    public static long fibonacci(int n) {
        long result = 0;
        long preOne = 1;
        long preTwo = 0;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        for (int i = 2; i <= n; i++) {
            result = preOne + preTwo;
            preTwo = preOne;
            preOne = result;
        }
        return result;
    }

    /**
     * 跳台阶
     * <p>
     * 题目：一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
     */
    public static int jumpFloor(int n) {
        if (n < 3) {
            return n;
        }
        int result = 0;
        int preOne = 2;
        int preTwo = 1;
        for (int i = 3; i <= n; i++) {
            result = preOne + preTwo;
            preTwo = preOne;
            preOne = result;
        }
        return result;
    }

    /**
     * 变态跳台阶
     * <p>
     * 题目：一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
     */
    public static int JumpFloorII(int target) {
        int[] dp = new int[target];
        Arrays.fill(dp, 1);
        for (int i = 1; i < target; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j];
            }
        }
        return dp[target - 1];
    }

    /**
     * 矩形覆盖
     *
     * 题目：我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
     */

    //回溯问题
    /**
     * 矩阵中的路径
     *
     * 题目：请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一个格子开始，
     * 每一步可以在矩阵中向左，向右，向上，向下移动一个格子。如果一条路径经过了矩阵中的某一个格子，
     * 则该路径不能再进入该格子。 例如在下面的3x4的矩阵中包含一条字符串"bcced"的路径（路径中的字母用斜体表示）。
     * 但是矩阵中不包含"abcb"路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入这个格子。
     */

    /**
     * 机器人的运动范围
     * <p>
     * 题目：地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
     * 但是不能进入行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
     * 但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
     */
    public static int movingCount(int rows, int cols, int target) {
        if (target < 0 || rows <= 0 || cols <= 0) {
            return 0;
        }
        boolean[] visited = new boolean[rows * cols];
        for (int i = 0; i < rows * cols; i++) {
            visited[i] = false;
        }
        int count = movingCountCore(target, rows, cols, 0, 0, visited);

        return count;
    }

    private static int movingCountCore(int target, int rows, int cols, int row, int col, boolean[] visited) {
        int count = 0;
        if (check(target, rows, cols, row, col, visited)) {
            visited[row * cols + col] = true;
            //当前(i,j)处的格子 + 遍历四个相邻的格子
            count += 1 + movingCountCore(target, rows, cols, row - 1, col, visited)
                    + movingCountCore(target, rows, cols, row, col - 1, visited)
                    + movingCountCore(target, rows, cols, row + 1, col, visited)
                    + movingCountCore(target, rows, cols, row, col + 1, visited);
        }
        return count;
    }

    private static boolean check(int target, int rows, int cols, int row, int col, boolean[] visited) {
        if (row >= 0 && row < rows && col >= 0 && col < cols && getDigitSum(row) + getDigitSum(col) <= target && !visited[row * cols + col]) {
            return true;
        }
        return false;
    }

    private static int getDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }


    //其他问题
    /**
     * 二进制中1的个数
     *
     * 题目：输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
     */

    /**
     * 数值的整数次方
     * <p>
     * 题目：给定一个double类型的浮点数base和int类型的整数exponent 求base的exponent次方
     * 不得使用库函数 不需要考虑大数问题
     */
    public static double power(double base, int exponent) {
        double res = 0;
        if (equal(base, 0)) {
            return 0;
        }
        if (exponent == 0) {
            return 1;
        }
        if (exponent > 0) {
            res = multiply(base, exponent);
        } else {
            res = multiply(1 / base, -exponent);
        }
        return res;
    }

    private static double multiply(double base, int exponent) {
        double sum = 1;
        for (int i = 0; i < exponent; i++) {
            sum = sum * base;
        }
        return sum;
    }

    private static boolean equal(double a, double b) {
        if (a - b < 0.000001 && a - b > -0.000001) {
            return true;
        }
        return false;
    }

    /**
     * 顺时针打印矩阵
     */

    /**
     * 最小的K个数
     * <p>
     * 题目：输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。
     * <p>
     * 思路：先将前k个数放入数组 进行堆排序 若之后的数比它还小 则对堆进行调整
     */
    public static List<Integer> getleastNumbers(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        if (arr == null | k <= 0 || k > arr.length) {
            return list;
        }
        int[] kArr = Arrays.copyOfRange(arr, 0, k);
      /*  //创建大根堆
        buildHeap(kArr);
        for (int i = k; i < arr.length; i++) {
            if (arr[i] < kArr[0]) {
                kArr[0] = arr[i];
                heapify(kArr, 0);
            }
        }*/
        return null;
    }


    /**
     * 整数中1出现的次数（从1到n整数中1出现的次数）
     * <p>
     * 题目：输入一个整数n，求从1到n这n个整数的十进制表示中1出现的次数。例如输入12，
     * 从1到12这些整数中包含1的数字有1，10，11和12，1一共出现了5次。
     * <p>
     * 思路：若百位上数字为0 百位数可能出现1的次数由更高位决定
     * 若百位数字为1 百位上可能出现1的次数不仅受更高位影响还受地位影响
     * 若百位数字大于1 则百位上出现1的情况仅由更高位决定
     */
    public static int NumberOf1(int n) {
        int count = 0;//1的个数
        int i = 1;//当前位
        int current = 0;
        int after = 0;
        int before = 0;
        while ((n / i) != 0) {
            before = n / (i * 10);//高位
            current = (n / i) % 10;//当前位
            after = n - (n / i) * i;//低位

            if (current == 0) {
                count += before * i;
            } else if (current == 1) {
                count += before * i + after + 1;
            } else {
                count += (before + 1) * i;
            }
            i = i * 10;//前移一位
        }
        return count;
    }

    /**
     * 丑数
     * <p>
     * 题目：把只包含因子2、3和5的数称作丑数（Ugly Number）。
     * 例如6、8都是丑数，但14不是，因为它包含因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
     * <p>
     * 思路：乘2或3或5 之后比较取最小值
     */
    public static int getUglyNumber(int n) {
        if (n < 0) {
            return 0;
        }
        int[] arr = new int[n];
        arr[0] = 1;
        int multiply2 = 0;
        int multiply3 = 0;
        int multiply5 = 0;
        for (int i = 1; i < n; i++) {
            int min = Math.min(arr[multiply2] * 2, Math.min(arr[multiply3], arr[multiply5]));
            arr[i] = min;
            if (arr[multiply2] * 2 == min) {
                multiply2++;
            }
            if (arr[multiply3] * 3 == min) {
                multiply3++;
            }
            if (arr[multiply5] * 5 == min) {
                multiply5++;
            }
        }
        return arr[n - 1];
    }

    /**
     * 和为S的连续正数序列
     * <p>
     * 题目：输出所有和为s的连续正数序列 序列内按照从小到大的顺序 序列之间按照开始数字从小到大的顺序
     * <p>
     * 思路：定义两个指针 分别递增 寻找和为s的序列
     */
    public List<List<Integer>> findContinuousSequence(int sum) {
        List<List<Integer>> arrList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if (sum < 3) {
            return arrList;
        }
        int small = 1;
        int big = 2;
        while (small < (sum + 1) / 2) {
            int s = 0;
            for (int i = small; i <= big; i++) {
                s += i;
            }
            if (s == sum) {
                for (int i = small; i <= big; i++) {
                    list.add(i);
                }
                arrList.add(new ArrayList<>(list));
                list.clear();
                small++;
            } else {
                if (s > sum) {
                    small++;
                } else {
                    big--;
                }
            }
        }
        return arrList;
    }

    /**
     * 和为S的两个数字
     */

    /**
     * 扑克牌顺子
     *
     * 题目：
     */

    /**
     * 孩子们的游戏（圆圈中最后剩下的数）
     */

    /**
     * 求1+2+3+…+n
     */

    /**
     * 不用加减乘除的加法
     */

    /**
     * 字符流中第一个不重复的字符
     *
     * 题目：请实现一个函数用来找出字符流中第一个只出现一次的字符。
     * 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
     * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
     */

    /**
     * 数据流中的中位数
     *
     * 题目：如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
     * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
     */

    /**
     * 滑动窗口的最大值
     *
     * 题目：给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
     * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
     * 他们的最大值分别为{4,4,6,6,6,5}。
     */

}
