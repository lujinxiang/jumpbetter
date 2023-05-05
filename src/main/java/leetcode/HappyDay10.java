package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author jinxianglu
 * @description 单调栈
 */
public class HappyDay10 {


    public static void main(String[] args) {
        HappyDay10 happyDay10 = new HappyDay10();
        int[] nums1 = new int[]{4, 1, 2};
        int[] nums2 = new int[]{1, 3, 4, 2};
        happyDay10.nextGreaterElement(nums1, nums2);
    }

    public long subArrayRanges(int[] nums) {
        return 0;
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        //key:nums[i],value:index;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            int num = nums2[i];
            while (!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }
            map.put(num, stack.isEmpty() ? -1 : stack.peek());
            stack.push(num);
        }
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }


    public int thirdMax(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        stack.push(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            
        }
        return 0;
    }


}
