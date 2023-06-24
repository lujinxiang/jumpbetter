package algorithm;

import common.Node;
import common.TreeNode;

import java.util.*;

/**
 * leetCode上面相关的题目
 */
public class LeetCodeRelatedProblem {

    public static void main(String[] args) {
        TreeNode root = TreeNode.getTree();
        boolean balance = isBalance(root);
        System.out.print(balance);
    }

    //双指针问题

    /**
     * 1. 有序数组的Two sum
     * <p>
     * 题目：在有序数组中找出两个数 使他们的和为target
     */
    public static int[] twoSum(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == target) {
                return new int[]{start + 1, end + 1};
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return null;
    }

    /**
     * 2. 判断链表是否有环
     */
    public static boolean hasCycle(Node head) {
        if (head == null) {
            return false;
        }
        Node slow = head;
        Node fast = head.next;
        while (slow != null && fast != null && fast.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    //排序
    /**
     * 快速排序 、堆排序
     *
     * 其中堆排序 就是优先队列PriorityQueue
     */

    //贪心思想

    /**
     * 1.分配饼干
     *
     * 题目描述：每个孩子都有一个满足度，每个饼干都有一个大小，只有饼干的大小大于等于一个孩子的满足度，该孩子
     * 才会获得满足。求解最多可以获得满足的孩子数量。
     *
     * Input: [1,2], [1,2,3] Output: 2
     */

    //二分查找

    /**
     * 1.写一个二分查找出来
     */
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    //分治


    //BFS：广度优先搜索遍历
    /**
     *
     */

    //DFS：深度优先搜索遍历

    //回溯

    //动态规划

    //链表

    //树

    //数组和矩阵

    //字符串

    //位运算

    //图

    //哈希表

    //栈和队列

    //数学问题

    public static int maxUnique(String str){
        if(str==null||str.equals("")){
            return 0;
        }
        char[] chas=str.toCharArray();
        int[] map=new int[256];
        for(int i=0;i<256;i++){
            map[i]=-1;
        }
        //记录最大值
        int len=0;
        //记录当前遍历到的字符，出现的前一个位置；
        int pre=-1;
        //记录当前位置的不含重复元素的长度
        int cur=0;
        for(int i=0;i!=chas.length;i++){
            pre=Math.max(pre,map[chas[i]]);
            cur=i-pre;
            len=Math.max(len,cur);
            map[chas[i]]=i;
        }
        return len;
    }

    public static boolean isBalance(TreeNode root){
        boolean[] res=new boolean[1];
        res[0]=true;
        getHeight(root,1,res);
        return res[0];
    }
    public static int getHeight(TreeNode root,int level,boolean[] res){
        if(root==null){
            return level;
        }
        int lH=getHeight(root.left,level+1,res);
        if(!res[0]){
            return level;
        }
        int rH=getHeight(root.right,level+1,res);
        if(!res[0]){
            return level;
        }
        if(Math.abs(lH-rH)>1){
            res[0]=false;
        }
        return Math.max(lH,rH);
    }

    public static void printHalf(int[] arr){
        int cand=0;
        int times=0;
        for(int i=0;i!=arr.length;i++){
            if(times==0){
                cand=arr[i];
                times=1;
            }else if(arr[i]==cand){
                times++;
            }else{
                times--;
            }
        }
        times=0;
        for(int i=0;i!=arr.length;i++){
            if(arr[i]==cand){
                times++;
            }
        }
        if(times>arr.length/2){
            System.out.print(cand);
        }else{
            System.out.print("no data");
        }
    }


    public static int[] getMaxWindow(int[] arr,int w){

        if(arr==null||arr.length==0||w<1||arr.length<w){
            return null;
        }
        LinkedList<Integer> qmax=new LinkedList<>();
        int[] res=new int[arr.length-w+1];
        int index=0;
        for(int i=0;i<arr.length;i++){
            while(!qmax.isEmpty()&&arr[qmax.peekLast()]<=arr[i]){
                qmax.pollLast();
            }
            qmax.addLast(i);
            if(qmax.peekFirst()==i-w){
                qmax.pollFirst();
            }
            if(i>=w-1){
                res[index++]=arr[qmax.peekFirst()];
            }
        }
        return res;
    }

    public static int coins(int[] arr,int aim){
        if(arr==null||arr.length==0||aim<=0){
            return 0;
        }
        int res=process(arr,0,aim);
        return res;
    }

    private static int process(int[] arr, int index, int aim) {
        int res=0;
        if(index==arr.length){
            res= aim==0?1:0;
        }else{
            for(int i=0;arr[index]*i<=aim;i++){
                res+=process(arr,index+1,aim-arr[index]*i);
            }
        }
        return res;
    }


    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Deque<Integer> stack = new ArrayDeque<Integer>();
        for (int i = nums2.length - 1; i >= 0; --i) {
            int num = nums2[i];
            while (!stack.isEmpty() && num >= stack.peek()) {
                stack.pop();
            }
            map.put(num, stack.isEmpty() ? -1 : stack.peek());
            stack.push(num);
        }
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; ++i) {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }


    //接雨水：单调栈的解法
    public static int trap(int[] walls) {
        if (walls == null || walls.length <= 2) {
            return 0;
        }

        // 思路：
        // 单调不增栈，walls元素作为右墙依次入栈
        // 出现入栈元素（右墙）比栈顶大时，说明在右墙左侧形成了低洼处，低洼处出栈并结算该低洼处能接的雨水

        int water = 0;
        Stack<Integer> stack = new Stack<>();
        for (int right=0; right<walls.length; right++) {
            // 栈不为空，且当前元素（右墙）比栈顶（右墙的左侧）大：说明形成低洼处了
            while (!stack.isEmpty() && walls[right]>walls[stack.peek()]) {
                // 低洼处弹出，尝试结算此低洼处能积攒的雨水
                int bottom = stack.pop();
                // 看看栈里还有没有东西（左墙是否存在）
                // 有右墙+有低洼+没有左墙=白搭
                if (stack.isEmpty()) {
                    break;
                }

                // 左墙位置以及左墙、右墙、低洼处的高度
                int left = stack.peek();
                int leftHeight = walls[left];
                int rightHeight = walls[right];
                int bottomHeight = walls[bottom];

                // 能积攒的水=(右墙位置-左墙位置-1) * (min(右墙高度, 左墙高度)-低洼处高度)
                water += (right-left-1) * (Math.min(leftHeight, rightHeight)-bottomHeight);
            }

            // 上面的pop循环结束后再push，保证stack是单调不增
            stack.push(right);
        }

        return water;
    }



}
