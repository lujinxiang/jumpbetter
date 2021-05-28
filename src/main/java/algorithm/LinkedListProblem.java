package algorithm;

import common.DoubleNode;
import common.Node;

import java.util.Stack;

/**
 * 2.链表问题相关
 */
public class LinkedListProblem {
    public static void main(String[] args) {
        Node head = Node.getInstance();
        boolean huiwen = isHuiwen2(head);
        System.out.println(huiwen);
    }

    /**
     * 1. 打印两个有序链表的公共部分
     * <p>
     * 题目：给定两个有序链表的头指针head1和head2 打印两个链表的公共部分
     */
    public static void printCommonPart(Node head1, Node head2) {
        if (null == head1 || null == head2) {
            return;
        }
        while (head1 != null && head2 != null) {
            if (head1.value < head2.value) {
                head1 = head1.next;
            } else if (head1.value > head2.value) {
                head2 = head2.next;
            } else {
                System.out.println(head1.value);
                head1 = head1.next;
                head2 = head2.next;
            }
        }
    }

    /**
     * 2.在单链表和双链表中删除倒数第k个节点
     * <p>
     * 题目：分别实现两个函数 一个可以删除单链表中倒数第k个节点 另一个可以删除双链表中倒数第k
     * <p>
     * 复杂度：时间复杂度-O(n) 空间复杂度-O(1)
     */

    public static Node deleteLastKNode(Node head, int k) {
        if (head == null || k < 1) {
            return head;
        }
        Node cur = head;
        while (cur != null) {
            k--;
            cur = cur.next;
        }
        if (k == 0) {
            head = head.next;
        }
        if (k < 0) {
            cur = head;
            while (++k != 0) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
        return head;
    }

    public DoubleNode removeLastKthNode(DoubleNode head, int laskKth) {
        if (head == null || laskKth < 1) {
            return head;
        }
        DoubleNode cur = head;
        while (cur != null) {
            laskKth--;
            cur = cur.next;
        }
        if (laskKth == 0) {
            head = head.next;
            head.last = null;
        }
        if (laskKth < 0) {
            cur = head;
            while (++laskKth != 0) {
                cur = cur.next;
            }
            DoubleNode newNext = cur.next.next;
            cur.next = newNext;
            if (newNext != null) {
                newNext.last = cur;
            }
        }
        return head;
    }

    /**
     * 3.删除链表的中间节点和a/b处的节点
     * <p>
     * 题目1：给定链表的头节点head 实现删除链表的中间节点的函数
     * 题目2：给定链表的头节点head 整数a和b 实现删除位于a/b处节点的函数
     */
    public static Node removeMidNode(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        if (head.next.next == null) {
            return head.next;
        }
        //慢指针 一次走一格
        Node pre = head;
        //快指针 一次走两格
        Node cur = head.next.next;
        while (cur.next != null && cur.next.next != null) {
            pre = pre.next;
            cur = cur.next.next;
        }
        pre.next = pre.next.next;
        return head;
    }

    public static Node removeByRatio(Node head, int a, int b) {
        if (a < 1 || a > b) {
            return head;
        }
        int n = Node.getNodeNumber(head);
        Node cur = head;
        //计算出需要删除的位置
        n = (int) Math.ceil((double) (a * n) / (double) b);
        if (n == 1) {
            head = head.next;
        }
        if (n > 1) {
            while (--n != 1) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
        return head;
    }

    /**
     * 4.反转单向和双向链表
     * <p>
     * 题目：分别实现反转单向链表和反转双向链表的函数
     * <p>
     * 要求：链表长度为n的话 时间复杂度要求为o(n) 额外空间复杂度要求为o(1);
     */
    public static Node reverseNode(Node head) {

        /**
         * 自我理解：一个pre指针  指向当前节点的前一个节点 （为了记住当前节点的之前的节点 为了倒转）
         *         一个next指针 指向当前节点的下一个节点 （为了记住下一次需要遍历的节点）
         *         一个head指针 指向当前节点 也就是遍历的节点
         */
        Node pre = null;
        Node next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    /**
     * 反转双向链表
     * <p>
     * 区别：就是多维护了一个last指针
     *
     * @param head
     * @return
     */
    public static DoubleNode reverseList(DoubleNode head) {
        DoubleNode pre = null;
        DoubleNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head = next;
        }
        return pre;
    }

    /**
     * 5.反转部分单向链表
     * <p>
     * 题目：给定一个单向链表的头节点head 以及两个整数from和to 在单向链表上把第from个节点到第to个节点这一部分进行反转
     * <p>
     * 要求：时间复杂度o(n) 空间复杂度o(1)
     */
    public static Node reversePart(Node head, int from, int to) {
        /**
         * 自我理解： 将链表从from到to位置进行拆分 将链表分为三段：from段 from-to段 to段
         *          1.from-to里面的节点进行单链表的反转
         *          2.head节点链接指向反转后的头节点 也就是from段和from-to段进行链接
         *          3.合并后的单链表再与to端进行合并
         */
        int len = 0;
        Node node1 = head;
        Node fPre = null;
        Node tPos = null;
        while (node1 != null) {
            len++;
            fPre = len == from - 1 ? node1 : fPre;
            tPos = len == to + 1 ? node1 : tPos;
            node1 = node1.next;
        }
        //参数校验
        if (from > to || from < 1 || to > len) {
            return head;
        }
        node1 = fPre == null ? head : fPre.next;
        Node node2 = node1.next;
        node1.next = tPos;
        Node next = null;
        while (node2 != tPos) {
            next = node2.next;
            node2.next = node1;
            node1 = node2;
            node2 = next;
        }
        if (fPre != null) {
            fPre.next = node1;
            return head;
        }
        return node1;
    }

    /**
     * 6.环形单链表的约瑟夫问题
     * <p>
     * 题目1：一个环形单向链表的头结点head和报数的值m 返回最后生存下来的节点 且这个节点自己组成环形单向链表 其他节点删除
     * <p>
     * 题目2：如果链表节点数为N 想在时间复杂度为O(n)时完成原问题的要求 该怎么实现？
     */
    public static Node getLoopNode(Node head, int m) {
        if (head == null || head.next == head || m < 1) {
            return head;
        }
        Node last = head;
        while (last.next != head) {
            last = last.next;
        }
        int count = 0;
        while (head != last) {
            if (++count == m) {
                //删除头节点
                last.next = head.next;
                count = 0;
            } else {
                last = last.next;
            }
            head = last.next;
        }
        return head;
    }

    /**
     * 7.判断一个链表是否是回文结构
     * <p>
     * 题目：给定一个链表的头结点head 判断链表是否是回文结构
     * <p>
     * 进阶：额外空间复杂度为O(1)
     */
    public static boolean isHuiwen(Node head) {
        /**
         * 利用栈来实现判断
         */
        Stack<Node> stack = new Stack<Node>();
        Node cur = head;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        while (head != null && !stack.isEmpty()) {
            Node temp = stack.pop();
            if (head.value != temp.value) {
                return false;
            }
            head = head.next;
        }
        return true;
    }

    // 空间复杂度为O(1)
    public static boolean isHuiwen2(Node head) {
        if (head == null || head.next == null) {
            return true;
        }
        Node n1 = head;
        Node n2 = head;
        while (n2.next != null && n2.next.next != null) {
            //查找中间节点
            n1 = n1.next;//n1->中部
            n2 = n2.next.next;//n2->尾部
        }
        n2 = n1.next;//n2->右部分第一个节点
        n1.next = null;
        Node n3 = null;
        while (n2 != null) {
            //右半区翻转
            n3 = n2.next;//n3->保存下一个节点
            n2.next = n1;//下一个反转节点
            n1 = n2;//n1移动
            n2 = n3;//n2移动
        }
        n3 = n1;
        n2 = head;
        boolean res = true;
        while (n1 != null && n2 != null) {
            if (n1.value != n2.value) {
                res = false;
                break;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        n1 = n3.next;
        n3.next = null;
        while (n1 != null) {
            //恢复列表
            n2 = n1.next;
            n1.next = n3;
            n3 = n1;
            n1 = n2;
        }
        return res;
    }

    /**
     * 8.将单向链表按某值划分成左边小、中间相等、右边大的形式
     *
     * 复杂度要求：时间 O(n) 空间 O(1)
     */

    /**
     * 9.复制含有随机指针节点的链表
     *
     */

    /**
     * 10.两个单链表生成相加链表
     *
     * 题目：
     */

}
