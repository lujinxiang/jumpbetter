package leetcode;

import common.ListNode;

/**
 * @author jinxianglu
 */
public class HappyDay02 {


    public static void main(String[] args) {
        HappyDay02 happyDay02 = new HappyDay02();
        int[] arr = new int[]{5, 7, 7, 8, 8, 10};
        int[] res = happyDay02.searchRange(arr, 8);
        System.out.print(res);
    }


    /**
     * 删除链表倒数第n个节点
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n <= 0) {
            return head;
        }
        ListNode fast = head;
        ListNode low = head;
        ListNode cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        if (n > count) {
            return head;
        }
        //删除头节点
        if (n == count) {
            return head.next;
        }
        //一般情况，删除的n在合理范围内；
        for (int i = 0; i < n; i++) {
            if (fast.next != null) {
                fast = fast.next;
            }
        }
        while (fast.next != null) {
            low = low.next;
            fast = fast.next;
        }
        low.next = low.next.next;
        return head;
    }


    /**
     * 两两交换链表中的节点
     *
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode left = head;
        ListNode right = left.next;
        ListNode next = right.next;
        right.next = null;
        ListNode newHead = reverseNode(left, right);
        ListNode curHead = newHead;
        while (next != null && right != null && left != null) {
            left = next;
            right = left.next;
            if (right != null) {
                next = right.next;
                right.next = null;
            } else {
                next = null;
            }
            curHead.next.next = reverseNode(left, right);
            curHead = curHead.next.next;
        }
        return newHead;
    }


    private ListNode reverseNode(ListNode left, ListNode right) {
        if (right == null) {
            return left;
        }
        right.next = left;
        left.next = null;
        return right;
    }


    public int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low < high) {
            mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (arr[mid] < target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return arr[low] == target ? low : -1;
    }


    /**
     * 找出字符串中第一个匹配项的下标
     *
     * @param bigStr
     * @param littleStr
     * @return
     */
    public int strStr(String bigStr, String littleStr) {
        if (bigStr == null || littleStr == null || bigStr.length() == 0
                || littleStr.length() == 0 || bigStr.length() < littleStr.length()) {
            return -1;
        }
        int low = 0;
        int high = 0;
        while (high < bigStr.length()) {
            high = low + littleStr.length();
            if (bigStr.substring(low, high).equals(littleStr)) {
                return low;
            }
            low++;
        }
        return -1;
    }


    public int[] searchRange(int[] arr, int target) {
        int[] res = new int[2];
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        res[0] = -1;
        res[1] = -1;
        int left = 0;
        int right = 0;
        if (arr == null || arr.length == 0) {
            return res;
        }
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == target) {
                left = search(mid, arr, true);
                right = search(mid, arr, false);
                res[0] = left;
                res[1] = right;
                return res;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }

    private int search(int mid, int[] arr, boolean flag) {
        int res = mid;
        if (flag) {
            for (int i = mid; i >= 0; i--) {
                if (arr[i] != arr[mid]) {
                    break;
                }
                res = i;
            }
        } else {
            for (int i = mid; i < arr.length; i++) {
                if (arr[i] != arr[mid]) {
                    break;
                }
                res = i;
            }
        }
        return res;
    }


    public int divide(int dividend, int divisor) {
        return 0;
    }
}
