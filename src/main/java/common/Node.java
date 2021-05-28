package common;

public class Node {
    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
    }

    /**
     * 遍历单链表
     *
     * @param head
     */
    public static void recursiveNode(Node head) {
        while (null != head) {
            System.out.println(head.value);
            head = head.next;
        }
    }

    /**
     * 获取单链表的长度
     */
    public static int getNodeNumber(Node head) {
        int sum = 0;
        while (null != head) {
            sum++;
            head = head.next;
        }
        return sum;
    }

    /**
     * 获取测试的单链表用例
     */
    public static Node getInstance() {
        int[] temp = new int[]{1, 2, 3, 3, 2, 1,3};
        Node head = new Node(temp[0]);
        Node preHead = head;
        for (int i = 1; i < temp.length; i++) {
            Node tempNode = new Node(temp[i]);
            preHead.next = tempNode;
            preHead = tempNode;
        }
        return head;
    }
}
