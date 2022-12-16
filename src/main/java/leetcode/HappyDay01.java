package leetcode;

import common.ListNode;

import java.util.*;

/**
 * LeetCode_Day01
 *
 * @author jinxianglu
 */
public class HappyDay01 {


    public static void main(String[] args) {
        HappyDay01 happyDay01 = new HappyDay01();
        int[] arr = new int[]{-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4};
        List<List<Integer>> lists = happyDay01.threeSum(arr);
        System.out.print(lists);

    }


    /**
     * 2.无重复字符的最长子串
     * <p>
     * <p>
     * dp[i]表示：i位置上的最长无重复字符子串的长度。
     * 初始化的时候，dp[i]=1;
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int[] dp = new int[s.length()];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            dp[i] = 1;
        }

        for (int i = 1; i < s.length(); i++) {
            int len = dp[i - 1];
            if (len == 1) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    dp[i] = len + 1;
                    max = Math.max(dp[i], max);
                    continue;
                }
            }
            if (!s.substring(i - len, i).contains(String.valueOf(s.charAt(i)))) {
                dp[i] = Math.max(dp[i - 1] + 1, dp[i]);
            } else {
                for (int j = i - 1; j >= i - len; j--) {
                    if (s.charAt(j) == s.charAt(i)) {
                        dp[i] = Math.abs(i - j);
                        break;
                    }
                }
            }
            max = Math.max(dp[i], max);
        }
        return max;
    }


    /**
     * 3.最长回文子串
     * <p>
     * str[i...j]是回文子串的情况：
     * 1.str[i...j]只有一个元素
     * 2.str[i...j]有两个元素 str[i]==str[j] 是回文串 dp[i][j]=dp[
     * 3.str[i...j]不只有两个元素，那么str[i]==str[j],且str[i+1...j-1]要是回文子串
     * <p>
     * 依赖i+1和j-1位置的值，那么是不是
     * 1.i方向上需要从下往上遍历
     * 2.j方向上需要从左往右遍历
     * <p>
     * <p>
     * <p>
     * dp[i]:表示i位置上的最长回文子串长度为dp[i];
     */
    public String longestPalindrome(String s) {
        int[][] dpLen = new int[s.length()][s.length()];
        if (s == null || s.length() == 0 || s.length() == 1) {
            return s;
        }


        int max = Integer.MIN_VALUE;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = Boolean.TRUE;
            dpLen[i][i] = 1;
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (Math.abs(i - j) > 1 && dp[i + 1][j - 1]) {
                        dp[i][j] = Boolean.TRUE;
                        dpLen[i][j] = Math.max(dpLen[i][j], dpLen[i + 1][j - 1] + 2);
                    } else if (Math.abs(i - j) <= 1) {
                        dp[i][j] = Boolean.TRUE;
                        if (Math.abs(i - j) == 1) {
                            dpLen[i][j] = Math.max(dpLen[i][j], dpLen[i][i] + 1);
                        }
                    }
                }
                max = Math.max(1, Math.max(dpLen[i][j], max));
            }
        }


        for (int i = 0; i < dpLen.length; i++) {
            for (int j = dpLen.length - 1; j >= i; j--) {
                if (dpLen[i][j] == max) {
                    return s.substring(i, j + 1);
                }
            }
        }
        return null;
    }


    /**
     * 4.Z字形变换
     */
    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0 || numRows <= 1) {
            return s;
        }
        Character[][] dp = new Character[numRows][s.length()];
        char[] chas = s.toCharArray();
        boolean rotateFlag = true;
        int dpColIndex = 0;
        int chasIndex = 0;
        int rows = numRows - 1;
        while (chasIndex < chas.length) {
            while (rotateFlag) {
                for (int i = 0; i < numRows; i++) {
                    if (chasIndex < chas.length) {
                        dp[i][dpColIndex] = chas[chasIndex++];
                    }
                }
                rotateFlag = false;
            }
            if (rows > 1) {
                for (int i = rows - 1; i > 0; i--) {
                    if (chasIndex < chas.length) {
                        dp[i][++dpColIndex] = chas[chasIndex++];
                    }
                }
            }
            dpColIndex++;
            rotateFlag = true;
            rows = numRows - 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (dp[i][j] != null) {
                    sb.append(dp[i][j]);
                }
            }
        }
        return sb.toString();
    }


    /**
     * 5.整数反转
     */
    public int reverse(int x) {
        try {
            if (x < Integer.MIN_VALUE || x > Integer.MAX_VALUE || x == 0) {
                return 0;
            }
            if (x < 0) {
                return -1 * reverseNumber(-x);
            }
            return reverseNumber(x);
        } catch (Exception e) {
            return 0;
        }
    }

    private int reverseNumber(int x) {
        StringBuilder sb = new StringBuilder();
        int cur = 0;
        while (x != 0) {
            cur = x % 10;
            x = x / 10;
            sb.append(cur);
        }
        return Integer.valueOf(sb.toString());
    }

    /**
     * 6.字符串转换整数
     *
     *
     *
     */


    /**
     * 7.盛最多水的容器
     */
    public int maxArea(int[] height) {
        return 0;

    }

    /**
     * 8.整数转罗马数字
     */


    /**
     * 9.三数之和
     */
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        if (arr.length < 3) {
            return res;
        }
        int left = 0;
        int right = arr.length - 1;
        HashMap<Integer, List<Integer>> duplicateMap = new HashMap<>();

        for (int i = 0; i < arr.length - 2; i++) {
            left = i + 1;
            right = arr.length - 1;
            while (left < right) {
                int curSum = arr[left] + arr[right];
                if (curSum == -arr[i]) {
                    List<Integer> innerList = new ArrayList<>();
                    if (!duplicateMap.containsKey(arr[i]) || !duplicateMap.get(arr[i]).contains(arr[left])) {
                        innerList.add(arr[i]);
                        innerList.add(arr[left]);
                        innerList.add(arr[right]);
                        res.add(innerList);
                        List curList = duplicateMap.get(arr[i]);
                        if (curList == null) {
                            curList = new ArrayList();
                        }
                        curList.add(arr[left]);
                        duplicateMap.put(arr[i], curList);
                    }
                    left++;
                    right--;
                } else if (curSum < -arr[i]) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }


    /**
     * 10.最接近的三数之和
     */
    public int threeSumClosest(int[] nums, int target) {
        return 0;

    }


}
