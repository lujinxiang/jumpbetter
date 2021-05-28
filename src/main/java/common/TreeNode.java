package common;

public class TreeNode {
    public int value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int value) {
        this.value = value;
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
}
