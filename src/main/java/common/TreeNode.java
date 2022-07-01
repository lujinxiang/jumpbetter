package common;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    /**
     * 获取二叉树的高度
     *
     * @param head
     * @param l
     * @return
     */
    public static int getTreeHeight(TreeNode head, int l) {
        if (head == null) {
            return 1;
        }
        return Math.max(getTreeHeight(head.left, l + 1), getTreeHeight(head.right, l + 1));
    }

    /**
     * 生成一颗数
     */
    public static TreeNode getTree() {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode left1 = new TreeNode(4);
        TreeNode right1 = new TreeNode(5);
        TreeNode left2 = new TreeNode(6);
        TreeNode right2 = new TreeNode(7);
        root.left = left;
        root.right = right;
        left.left = left1;
        left.right = right1;
        right.left = left2;
        right.right = right2;
        return root;
    }


    public static void preReadTree(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preReadTree(root.left);
        preReadTree(root.right);
    }


}
