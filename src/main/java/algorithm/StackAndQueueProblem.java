package algorithm;

import common.ArrayUtil;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 1. 栈和队列相关的问题总结
 */
public class StackAndQueueProblem {

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        int k = 3;
        int[] maxWindow = getMaxWindow(arr, k);
        ArrayUtil.recursiveArray(maxWindow);
    }

    /**
     * 设计一个有getMin功能的栈
     * <p>
     * 题目：实现一个特殊的栈 在实现栈的基本功能的基础上 再实现返回栈中的最小元素的操作
     */
    static class MyStack1 {
        private Stack<Integer> stackData;
        private Stack<Integer> stackMin;

        public MyStack1() {
            this.stackData = new Stack<>();
            this.stackMin = new Stack<>();
        }

        public void push(int newNum) {
            if (this.stackMin.isEmpty()) {
                this.stackMin.push(newNum);
            } else if (newNum <= this.getMin()) {
                this.stackMin.push(newNum);
            }
            this.stackData.push(newNum);
        }

        public int pop() {
            if (this.stackData.isEmpty()) {
                throw new RuntimeException("Your stack is empty");
            }
            int value = this.stackData.pop();
            if (value == this.getMin()) {
                this.stackMin.pop();
            }
            return value;
        }

        public int getMin() {
            if (this.stackMin.isEmpty()) {
                throw new RuntimeException("Your stack is empty.");
            }
            return this.stackMin.peek();
        }
    }

    /**
     * 由两个栈组成的队列
     * <p>
     * 题目：编写一个类 用两个栈实现队列 支持队列的基本操作（add、poll、peek)
     */
    static class TwoStackQueue {
        public Stack<Integer> stackPush;
        public Stack<Integer> stackPop;

        public TwoStackQueue() {
            this.stackPop = new Stack<>();
            this.stackPush = new Stack<>();
        }

        public void add(int pushInt) {
            stackPush.push(pushInt);
        }

        public int poll() {
            if (stackPop.empty() && stackPush.empty()) {
                throw new RuntimeException("Queue is empty");
            } else if (stackPop.empty()) {
                while (!stackPush.empty()) {
                    stackPop.push(stackPush.pop());
                }
            }
            return stackPop.pop();
        }

        public int peek() {
            if (stackPop.empty() && stackPush.empty()) {
                throw new RuntimeException("Queue is empty");
            } else if (stackPop.empty()) {
                while (!stackPush.empty()) {
                    stackPop.push(stackPush.pop());
                }
            }
            return stackPop.peek();
        }
    }

    /**
     * 如何仅用递归函数和栈操作逆序一个栈
     */
    public static int getAndRemoveLastElement(Stack<Integer> stack) {
        int result = stack.pop();
        if (stack.isEmpty()) {
            return result;
        } else {
            int last = getAndRemoveLastElement(stack);
            stack.push(result);
            return last;
        }
    }

    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int i = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(i);
    }

    /**
     * 用一个栈实现另一个栈的排序
     */
    public static void sortStackByStack(Stack<Integer> stack) {
        Stack<Integer> help = new Stack<>();
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            while (!help.isEmpty() && help.peek() > cur) {
                stack.push(help.pop());
            }
            help.push(cur);
        }
        while (!help.isEmpty()) {
            stack.push(help.pop());
        }
    }

    /**
     * 用栈来解决汉罗塔问题
     *
     */


    /**
     * 生成窗口最大值数组
     * <p>
     * 题目：有一个整型数组arr和一个大小为w的窗口从数组的最左边滑动到最右边 窗口每次向右滑动一个位置
     * <p>
     * 思路：双端队列实现
     */
    public static int[] getMaxWindow(int[] arr, int w) {
        if (arr == null || arr.length < w || w < 1) {
            return null;
        }
        LinkedList<Integer> qmax = new LinkedList<>();
        int index = 0;
        int[] res = new int[arr.length - w + 1];
        for (int i = 0; i < arr.length; i++) {
            while (!qmax.isEmpty() && arr[qmax.peekLast()] <= arr[i]) {
                qmax.pollLast();
            }
            qmax.addLast(i);
            //i指针是遍历的指针 i-w代表窗口的初始位置 双端队列里面存储的也是位置
            if (qmax.peekFirst() == i - w) {
                qmax.pollFirst();
            }
            if (i >= w - 1) {
                res[index++] = arr[qmax.peekFirst()];
            }
        }
        return res;
    }

    /**
     * 最大值减去最小值小于或者等于num的子数组数量
     */
    public static int getNum(int[] arr, int num) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        LinkedList<Integer> qmin = new LinkedList<>();
        LinkedList<Integer> qmax = new LinkedList<>();
        int i = 0;
        int j = 0;
        int res = 0;
        while (i < arr.length) {
            while (j < arr.length) {
                while (!qmin.isEmpty() && arr[qmin.peekLast()] >= arr[j]) {
                    qmin.pollLast();
                }
                qmin.addLast(j);
                while (!qmax.isEmpty() && arr[qmax.peekLast()] >= arr[j]) {
                    qmax.pollLast();
                }
                qmax.addLast(j);
                if (arr[qmax.getFirst()] - arr[qmin.getFirst()] > num) {
                    break;
                }
                j++;
            }
            if (qmin.peekFirst() == i) {
                qmin.pollFirst();
            }
            if (qmax.peekFirst() == i) {
                qmax.pollFirst();
            }
            res += j - i;
            i++;
        }
        return res;
    }
}
