package algorithm;

import java.util.HashMap;

/**
 * 动态规划相关的问题
 */
public class DynamicRelatedProblem {

    public static void main(String[] args) {
        /*int matrix[][] = new int[][]{
                {1, 3, 5, 9},
                {8, 1, 3, 4},
                {5, 0, 6, 1},
                {8, 8, 4, 0}
        };
        int[] minPathValue = getMinPathValue2(matrix);
        ArrayUtil.recursiveArray(minPathValue);
        System.out.println(" ");
        int[] arr = new int[]{5, 2, 3};
        int aim = 20;
        int minMoneyNumber = getMinMoneyNumber(arr, aim);
        System.out.println(minMoneyNumber);
        System.out.println();*/
   /*     int[] arr2 = new int[]{5, 10, 25, 1};
        int aim = 15;
        int res = changeMoneyMethod4(arr2, aim);
        System.out.println(res);*/
    /*    int length = 8;
        int maxProductAfterCutting = getMaxProductAfterCutting(length);
        System.out.println(maxProductAfterCutting);*/
/*

        String str1 = "1AB2345CD";
        String str2 = "12345EF";
        String maxCommonString = getMaxCommonString(str1, str2);
        System.out.println(maxCommonString);
*/
/*        String str1 = "abc";
        String str2 = "abc";
        int ic = 5;
        int dc = 3;
        int rc = 2;
        int i = minCost(str1, str2, ic, dc, rc);
        System.out.println(i);*/
    /*    int[] arr = new int[]{3, 2, 3, 1, 1, 4};
        int jump = jump(arr);
        System.out.println(jump);

        String s1 = "AB";
        String s2 = "12";
        String aim = "A1B2";
        boolean cross = isCross(s1, s2, aim);
        System.out.println(cross);*/
/*
        int[][] map = new int[][]{
                {-2, -3, 3},
                {-5, -10, 1},
                {0, 30, -5}
        };
        int i = minHp(map);
        System.out.println(i);*/
      /*  int[] arr = new int[]{3, 3, 2, 3};
        int maxValue = getMaxValue(arr);
        System.out.println(maxValue);*/
       /* String str = "abfdgdfd789abcdefdfkkff";
        String maxSubString = getMaxSubString(str);
        System.out.println(maxSubString);*/

        int aba = minCut("ABA");
        System.out.println(aba);

    }

    /**
     * 0-1背包问题
     * <p>
     * 题目：有一个背包，它的容量为C（Capacity），现在有n种不同的物品编号分别为0...n-1，
     * 其中每一件物品的重量为w(i)，价值为v(i)。问可以向这个背包中盛放哪些物品，使得在不超过背包容量的基础上，物品的总价值最大。
     * <p>
     * 思路：
     * 1.先确定dp的含义：n个物品装入capacity容量的背包中的最大值
     * 2.再确定dp中空格计算公式：dp[n][capacity]=Math.max(dp[n-1][capacity],(dp[n-1][capacity-weight[i]])+values[i]])
     * 3.最终算出dp中最后一格的数值
     */

    public static int[][] getMaxValue(int n, int[] weight, int[] value, int capacity) {
        int[][] arr = new int[n + 1][capacity + 1];

        for (int i = 0; i <= capacity; i++)
            arr[0][i] = 0;

        for (int j = 0; j <= n; j++)
            arr[j][0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= capacity; j++) {
                if (weight[i - 1] <= j) {
                    if (arr[i - 1][j] < arr[i - 1][j - weight[i - 1]] + value[i - 1])
                        arr[i][j] = arr[i - 1][j - weight[i - 1]] + value[i - 1];
                    else
                        arr[i][j] = arr[i - 1][j];
                } else {
                    arr[i][j] = arr[i - 1][j];
                }
            }
        }
        return arr;
    }

    /**
     * 矩阵的最小路径和
     * <p>
     * 题目：给定一个矩阵m 从左上角开始每次只能向右或者向下走 最后到达右下角的位置 路径上所有的数字累加起来就是路径和
     * 返回所有的路径中最小的路径和
     * <p>
     * 思路：
     * 1.先确定dp的含义：从（0，0）位置上 到达 当前位置上 路径的最小和
     * 2.再确定dp公式：dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+m[i][j]
     * 3.dp初始化：第一行的数据和第一列的数据 只能是向右走 或者 向下走得到 其实就是计算数据的累加和
     */
    public static int[][] getMinPathValue(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return null;
        }
        int[][] dp = new int[matrix.length][matrix[0].length];
        dp[0][0] = matrix[0][0];
        for (int i = 1; i < dp[0].length; i++) {
            dp[0][i] = matrix[0][i] + dp[0][i - 1];
        }
        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = matrix[i][0] + dp[i - 1][0];
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp.length; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + matrix[i][j];
            }
        }
        return dp;
    }

    /**
     * 矩阵的最小和矩阵 空间压缩
     * <p>
     * 思路：可以用一维数组作为我们的dp数组 滚动更新我们的dp数组 不可回溯
     * <p>
     * dp[j]:代表从（0，0）位置到 （0，j）位置的最小路径和
     */
    public static int[] getMinPathValue2(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return null;
        }

        int more = Math.max(matrix.length, matrix[0].length);
        int less = Math.min(matrix.length, matrix[0].length);
        int[] dp = new int[less];
        boolean rowMore = more == matrix.length;
        dp[0] = matrix[0][0];
        for (int i = 1; i < less; i++) {
            dp[i] = (rowMore ? matrix[0][i] : matrix[i][0]) + dp[i - 1];
        }
        for (int i = 1; i < more; i++) {
            dp[0] = dp[0] + (rowMore ? matrix[i][0] : matrix[0][i]);
            for (int j = 1; j < less; j++) {
                dp[j] = Math.min(dp[j - 1], dp[j]) + (rowMore ? matrix[i][j] : matrix[j][i]);
            }
        }
        return dp;
    }

    /**
     * 换钱的最少货币数
     * <p>
     * 题目：给定数组arr arr中所有的值都为正数且不重复 每个值代表一种面值的货币 每种面值的货币可以使用任意张
     * 再给定一个整数aim代表要找的钱数 求组成aim的最少货币数
     * <p>
     * 思路：
     * 1.先确定dp[i][j]的含义：在可以任意使用arr[0...i-1]货币的情况下 组成j所需的最小张数
     * 2.dp[i][j]=Math.min(dp[i-1][j],dp[i][j-arr[i]]+1)
     */
    public static int getMinMoneyNumber(int[] arr, int aim) {
        if (arr == null || arr.length == 0 || aim < 0) {
            return -1;
        }
        int max = Integer.MAX_VALUE;//钱如果找不开 就设置为max
        int[][] dp = new int[arr.length][aim + 1];
        //初始化第一行的数据  默认为max 如果当前货币可以找开 就当前货币数量+1；
        for (int i = 1; i <= aim; i++) {
            dp[0][i] = max;
            if (i - arr[0] >= 0 && dp[0][i - arr[0]] != max) {
                dp[0][i] = dp[0][i - arr[0]] + 1;
            }
        }
        int left = 0;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j <= aim; j++) {
                left = max;
                //判断当前需要的目标金额是否大于当前的面值数量 并且 减去当前纸币面值后还可以找开
                if (j - arr[i] >= 0 && dp[i][j - arr[i]] != max) {
                    left = dp[i][j - arr[i]] + 1;
                }
                dp[i][j] = Math.min(left, dp[i - 1][j]);
            }
        }
        return dp[arr.length - 1][aim] != max ? dp[arr.length - 1][aim] : -1;
    }


    /**
     * 换钱：指定钱币的数量
     * <p>
     * 题目：给定数组arr,arr中所有的值都为正数 每个值仅代表一张钱的面值
     * 再给定一个正数aim代表要找的钱数 求组成aim的最少货币数
     * <p>
     * 思路：
     * 1.确定dp的含义：在可以任意使用arr[0...i]货币的情况下(每个值仅代表一张货币) 组成j所需的最小张数
     * 2.确定dp的公式：dp[i][j]=Math.min(dp[i-1][j-arr[i]]+1,dp[i-1][j])
     * 3.初始化dp数组：
     */
    public static int getMinMoneyNumber2(int[] arr, int aim) {
        int[][] dp = new int[arr.length][aim + 1];
        int max = Integer.MAX_VALUE;
        for (int i = 0; i <= aim; i++) {
            dp[0][i] = max;
        }
        if (arr[0] <= aim) {
            dp[0][arr[0]] = 1;
        }
        int leftUp = 0;//左上角某个位置的值
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                leftUp = max;
                if (aim - arr[i] > 0 && dp[i - 1][j - arr[i]] != max) {
                    leftUp = dp[i - 1][j - arr[i]] + 1;
                }
                dp[i][j] = Math.min(leftUp, dp[i - 1][j]);
            }
        }
        return dp[arr.length - 1][aim] != max ? dp[arr.length - 1][aim] : -1;
    }

    /**
     * 换钱的方法数
     * <p>
     * 题目：给定数组arr arr中所有的值都为正数且不重复 每个值代表一种面值的货币
     * 每种面值的货币可以使用任意张 再给定一个整数aim代表要找的钱数 求换钱有多少种方法
     * <p>
     * 思路1：暴力破解法 主要是暴力递归
     * <p>
     * 先选择0张5元的... 让剩下的组成aim的方法数 为res1;
     * 先选择1张5元的... 让剩下的组成aim的方法数 为res2;
     * 先选择2张5元的... 让剩下的组成aim的方法数 为res3;
     * ......
     * 先选择x张5远的... 让剩下的组成aim的方法数 为resx;
     * 总的方法数为：allResult=res1+res2+...+resx;
     * 暴力递归：从上到下执行
     * <p>
     * 思路2：记忆化搜索方法
     * <p>
     * 暴力搜索方法时间复杂度较高 是因为递归调用存在大量的重复计算
     * 因此可以将递归过程中的中间值存储下来 减少重复计算 提高算法的执行效率
     * <p>
     * 思路3：动态规划法
     */
    public static int changeMoneyMethods(int[] arr, int aim) {
        if (arr == null || aim < 0 || arr.length == 0) {
            return 0;
        }
        return process(arr, 0, aim);
    }

    /**
     * 递归函数的含义：如果用arr[index...N-1]这些面值的钱组成aim 返回总的方法数
     *
     * @param arr
     * @param index
     * @param aim
     * @return
     */
    private static int process(int[] arr, int index, int aim) {
        int res = 0;
        if (index == arr.length) {
            res = aim == 0 ? 1 : 0;
        } else {
            for (int i = 0; arr[index] * i <= aim; i++) {
                res += process(arr, index + 1, aim - arr[index] * i);
            }
        }
        return res;
    }

    /**
     * 方式2：使用记忆化来搜索优化
     */
    public static int changeMoneyMethod2(int[] arr, int aim) {
        if (arr == null || aim < 0 || arr.length == 0) {
            return 0;
        }
        int[][] map = new int[arr.length + 1][aim + 1];
        return process2(arr, 0, aim, map);
    }

    private static int process2(int[] arr, int index, int aim, int[][] map) {
        int res = 0;
        if (index == arr.length) {
            res = aim == 0 ? 1 : 0;
        } else {
            int mapValue = 0;
            for (int i = 0; arr[index] * i <= aim; i++) {
                mapValue = map[index + 1][aim - arr[index] * i];
                if (mapValue != 0) {
                    res += mapValue == -1 ? 0 : mapValue;
                } else {
                    res += process2(arr, index + 1, aim - arr[index] * i, map);
                }
            }
        }
        map[index][aim] = res == 0 ? -1 : res;
        return res;
    }


    /**
     * 方式3：动态规划来解决
     * <p>
     * 思路：
     * 1.确定dp的含义：dp[i][j]代表在使用arr[0...i]货币的情况下 组成钱数j有多少种方法
     * case1:完全不用arr[i]货币  只使用arr[0...i-1]货币时          方法数=dp[i-1][j]；
     * case2:只使用1个arr[i]货币 剩下的钱用货币arr[0...i-1]组成时   方法数=dp[i-1][j-arr[i]]；
     * case3:只使用2个arr[i]货币 剩下的钱用货币arr[0...i-1]组成时   方法数=dp[i-1][j-2*arr[i]]；
     * ....
     * caseK:只使用k个arr[i]货币 剩下的钱用货币arr[0...i-1]组成时   方法数=dp[i-1][j-k*arr[i]]；
     * <p>
     * 第一种情况的方法数=dp[i-1][j]; 第二种到第k种的总和为dp[i][j-arr[i]]
     * <p>
     * 2.确定dp的公式:dp[i][j]=dp[i-1][j]+dp[i][j-arr[i]];
     * <p>
     * 3.初始化dp:
     * <p>
     * 方法3是使用过程的方式演示了上面case的过程
     * <p>
     * 方法4是直接是直接使用了dp[i][j]公式来计算硬币的方法数
     */
    public static int changeMoneyMethod3(int[] arr, int aim) {
        if (arr == null || arr.length == 0 || aim < 0) {
            return 0;
        }
        int[][] dp = new int[arr.length][aim + 1];
        for (int i = 0; i < arr.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; arr[0] * i <= aim; i++) {
            dp[0][arr[0] * i] = 1;
        }
        int num = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j <= aim; j++) {
                num = 0;
                for (int k = 0; j - arr[i] * k >= 0; k++) {
                    num += dp[i - 1][j - arr[i] * k];
                }
                dp[i][j] = num;
            }
        }
        return dp[arr.length - 1][aim];
    }

    public static int changeMoneyMethod4(int[] arr, int aim) {
        if (arr == null || arr.length == 0 || aim < 0) {
            return 0;
        }
        int[][] dp = new int[arr.length][aim + 1];
        for (int i = 0; i < arr.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; arr[0] * i <= aim; i++) {
            dp[0][arr[0] * i] = 1;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j <= aim; j++) {
                dp[i][j] = dp[i - 1][j];
                dp[i][j] += j - arr[i] >= 0 ? dp[i][j - arr[i]] : 0;
            }
        }
        return dp[arr.length - 1][aim];
    }


    /**
     * 最长递增子序列
     * <p>
     * 题目：给定数组arr 返回arr的最长递增子序列
     * <p>
     * example:arr=[2,1,5,3,6,4,8,9,7] 返回的最长递增子序列为[1,3,4,8,9]
     * <p>
     * 思路：
     * 1.确定dp的含义：dp[i]代表在以arr[i]这个数结尾的情况下 arr[0...i]中的最大递增子序列长度
     * 2.确定dp的公式：dp[i]=Math.max(dp[j]+1) 其中0<=j<i,arr[j]<arr[i]
     * 3.初始化dp:
     */
    public static int[] getMaxLengthSequence(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        int[] dp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return generateLIS(arr, dp);
    }

    private static int[] generateLIS(int[] arr, int[] dp) {

        return null;
    }

    /**
     * 最长公共子序列问题
     * <p>
     * 题目：给定两个字符串str1和str2 返回两个字符串的最长公共子序列
     * <p>
     * example：str1="1A2C3D4B56" str2="B1D23CA45B6A" "123456"或者"12C4B6"都是最长公共子序列 返回哪一个都可以
     * <p>
     * 思路：
     * 1.确定dp的含义:dp[i][j]代表str1[0...i]与str2[0...j]的最长公共子序列的长度
     * <p>
     * 2.确定dp的公式:
     * dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1],dp[i-1][j-1]+1);
     * <p>
     * 3.dp进行初始化:
     * 初始一个角落 dp[0][0]=str1[0]==str2[0]?1:0;
     * 初始化一行数据
     * 初始化一列数据
     * <p>
     * 4.还原序列数组
     * a.根据得到的dp数组 对最长公共子序列进行还原 还原的方法就是根据得到dp的方法来进行反向还原
     * b.得到dp:        向右、向下、向右下
     * c.得到序列数组：   向左、向上、向左上
     */
    public static int[][] getMaxCommonSequenceDp(char[] str1, char[] str2) {
        int[][] dp = new int[str1.length][str2.length];
        dp[0][0] = str1[0] == str2[0] ? 1 : 0;
        for (int i = 1; i < str1.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], str1[i] == str2[0] ? 1 : 0);
        }
        for (int i = 1; i < str2.length; i++) {
            dp[0][i] = Math.max(dp[0][i - 1], str2[i] == str1[0] ? 1 : 0);
        }
        for (int i = 1; i < str1.length; i++) {
            for (int j = 1; j < str2.length; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                if (str1[i] == str2[j]) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + 1);
                }
            }
        }
        return dp;
    }


    /**
     * 最长公共子串
     * <p>
     * 题目：给定两个字符串str1和str2 返回两个字符串的最长公共子串
     * <p>
     * example：str1="1AB2345CD" str2="12345EF" 返回2345
     * <p>
     * 思路：
     * 1.确定dp的含义：dp[i][j]代表 在必须把str1[i]和str2[j]当作公共子串最后一个字符的情况下 公共子串最长能有多长
     * <p>
     * 2.确定dp的公式：
     * dp[i][j]=0                  str1[i]!=str2[j]
     * dp[i][j]=dp[i-1][j-1]+1     str1[i]==str2[j]
     * <p>
     * 3.dp进行初始化：
     * dp[i][0]=1                  str1[i]==str2[0]
     * dp[i][0]=0                  str1[i]!=str2[0]
     * dp[0][j]=0                  str1[0]!=str2[j]
     * dp[0][j]=1                  str1[0]==str2[j]
     */

    public static String getMaxCommonString(String str1, String str2) {
        if (str1 == null || str2 == null || str1.equals("") || str2.equals("")) {
            return "";
        }
        char[] chas1 = str1.toCharArray();
        char[] chas2 = str2.toCharArray();
        int[][] dp = getDp(chas1, chas2);
        int end = 0;//end用于记录长度为max的字符下标
        int max = 0;
        for (int i = 0; i < chas1.length; i++) {
            for (int j = 0; j < chas2.length; j++) {
                if (dp[i][j] > max) {
                    end = i;
                    max = dp[i][j];
                }
            }
        }
        return str1.substring(end - max + 1, end + 1);
    }

    private static int[][] getDp(char[] str1, char[] str2) {
        int[][] dp = new int[str1.length][str2.length];
        for (int i = 0; i < str1.length; i++) {
            if (str1[i] == str2[0]) {
                dp[i][0] = 1;
            }
        }
        for (int j = 1; j < str2.length; j++) {
            if (str1[0] == str2[j]) {
                dp[0][j] = 1;
            }
        }
        for (int i = 1; i < str1.length; i++) {
            for (int j = 1; j < str2.length; j++) {
                if (str1[i] == str2[j]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
            }
        }
        return dp;
    }


    /**
     * 最小编辑代价
     * <p>
     * 题目：给定两个字符str1和str2 再给定三个整数ic、dc和rc 分别代表插入、删除和替换一个字符的代价
     * 返回将str1编辑成str2的最小代价
     * <p>
     * 思路：
     * 1.确定dp的含义：dp[i][j]代表str1[0...i-1]编辑成str2[0...j-1]的最小代价
     * 2.确定dp的公式：
     * 3.对dp初始化:
     * <p>
     * 操作类型：
     * 1.dc:删除操作；delete controller
     * 2.ic:插入操作；insert controller
     * 3.rc:替换操作；replace controller
     */
    public static int minCost(String str1, String str2, int ic, int dc, int rc) {
        if (str1 == null || str2 == null) {
            return 0;
        }
        char[] chas1 = str1.toCharArray();
        char[] chas2 = str2.toCharArray();
        int row = chas1.length + 1;
        int col = chas2.length + 1;
        int[][] dp = new int[row][col];
        for (int i = 1; i < row; i++) {
            dp[i][0] = dc * i;
        }
        for (int j = 1; j < col; j++) {
            dp[0][j] = ic * j;
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (chas1[i - 1] == chas2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + rc;
                }
                dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] + ic);
                dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + dc);
            }
        }
        return dp[row - 1][col - 1];
    }

    /**
     * 剪绳子
     * <p>
     * 题目：给你一根长度为n的绳子 请把绳子剪成m段（m、n都是整数，n>1&&m>1）每段绳子的长度记为k[0],k[1],...k[m]
     * 请问k[0]*k[1]*...k[m]可能的最大乘积是多少？
     * <p>
     * 例如：当绳子的长度是8时 我们把它剪成长度分别为2，3，3的三段 此时得到的最大乘积是18；
     * <p>
     * 思路：
     * 1.确定dp的含义：
     * 2.确定dp的公式：
     * 3.dp进行初始化：
     */
    public static int getMaxProductAfterCutting(int length) {
        if (length < 2) {
            return 0;
        }
        if (length == 2) {
            return 1;
        }
        if (length == 3) {
            return 2;
        }
        int[] dp = new int[length + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        int max = Integer.MIN_VALUE;
        for (int i = 4; i <= length; i++) {
            for (int j = 1; j <= i / 2; j++) {
                int temp = dp[j] * dp[i - j];
                if (max < temp) {
                    max = temp;
                }
                dp[i] = max;
            }
        }
        return dp[length];
    }

    /**
     * 连续子数组的的最大和
     *
     * 题目：输入一个整型数组 数组里有正数也有负数 数组中的一个或连续多个整数组成一个子数组
     * 求所有数组的和的最大值 要求时间复杂度为O(n)
     *
     * 思路：
     * 1.确定dp的含义：dp[i]表示以第i个数字结尾的子数组的最大和
     * 2.确定dp的公式：
     *          dp[i]=data[i]           i==0或者dp[i-1]<=0
     *          dp[i]=dp[i-1]+data[i]   i!=0并且dp[i-1]>0
     * 3.dp进行初始化：
     */


    /**
     *
     */

    /**
     * 跳跃游戏
     * <p>
     * 题目：给定数组arr arr[i]==k 代表可以从位置i向右跳1-k个距离；比如arr[2]==3 代表从位置2可以跳到位置3、位置4或位置5
     * 如果从位置0出发 返回最少跳几次能跳到arr最后的位置上
     * <p>
     * 思路：三个变量
     * 1.jump: 代表目前跳了多少步
     * 2.cur:  代表如果只跳jump步 最远能够达到的位置
     * 3.next: 代表如果再多跳一步 最远能够达到的位置
     * <p>
     * case1:cur<i:说明只跳jump不能到达位置i 需要多跳一步才行
     * case2:cur>i:说明跳jump步可以到达位置i 此时什么都不要做
     */
    public static int jump(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int jump = 0;
        int cur = 0;
        int next = 0;
        for (int i = 0; i < arr.length; i++) {
            if (cur < i) {
                jump++;
                cur = next;
            }
            next = Math.max(next, i + arr[i]);
        }
        return jump;
    }

    /**
     * 数组中的最长连续序列
     * <p>
     * 题目：给定无序数组arr 返回其中最长的连续序列的长度
     * 例子：arr=[100,4,200,1,3,2] 最长的连续序列为[1,2,3,4] 所以返回4；
     * <p>
     * 思路：使用HashMap来进行数的存储分析
     * <p>
     * HashMap的含义：
     * 1.key:   代表遍历过的某个数
     * 2.value: 代表这个数所在的最长连续序列的长度
     */
    public static int getLongestConsecutive(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int max = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            }
            if (map.containsKey(arr[i] - 1)) {
                max = Math.max(max, merge(map, arr[i] - 1, arr[i]));
            }
            if (map.containsKey(arr[i] + 1)) {
                max = Math.max(max, merge(map, arr[i], arr[i] + 1));
            }
        }
        return max;
    }

    private static int merge(HashMap<Integer, Integer> map, int less, int more) {
        int left = less - map.get(less) + 1;
        int right = more + map.get(more) - 1;
        int len = right - left + 1;
        map.put(left, len);
        map.put(right, len);
        return len;
    }

    /**
     * 字符串的交错组成
     * <p>
     * 题目：给定三个字符串str1、str2和aim 如果aim包含且仅包含来自str1和str2的所有字符
     * 而且在aim中属于str1的字符之间保持原来在str1中的顺序 属于str2的字符之间保持原来在str2中的顺序
     * 那么称aim是str1和str2的交错组成 实现一个函数 判断aim是否是str1和str2的交错组成
     * <p>
     * 例子：str1="AB" str2="12" 那么"AB12"、"A1B2"、"A12B"等都是str1和str2的交错组成
     * <p>
     * 思路：
     * 1.确定dp的含义：dp[i][j]的值代表aim[0...i+j-1]能否被str1[0...i-1]和str2[0...j-1]交错组成
     * 2.确定dp的公式：
     * 3.确定dp初始化：
     */
    public static boolean isCross(String str1, String str2, String aim) {
        if (str1 == null || str2 == null || aim == null) {
            return false;
        }
        char[] chas1 = str1.toCharArray();
        char[] chas2 = str2.toCharArray();
        char[] chasAim = aim.toCharArray();
        if (chasAim.length != chas1.length + chas2.length) {
            return false;
        }
        boolean[][] dp = new boolean[chas1.length + 1][chas2.length + 1];
        dp[0][0] = true;
        for (int i = 1; i <= chas1.length; i++) {
            if (chas1[i - 1] != chasAim[i - 1]) {
                break;
            }
            dp[i][0] = true;
        }
        for (int i = 1; i <= chas2.length; i++) {
            if (chas2[i - 1] != chasAim[i - 1]) {
                break;
            }
            dp[0][i] = true;
        }
        for (int i = 1; i <= chas1.length; i++) {
            for (int j = 1; j <= chas2.length; j++) {
                if ((chas1[i - 1] == chasAim[i + j - 1] && dp[i - 1][j]) ||
                        chas2[j - 1] == chasAim[i + j - 1] && dp[i][j - 1]) {
                    dp[i][j] = true;
                }
            }
        }
        return dp[chas1.length][chas2.length];
    }

    /**
     * 龙与地下城游戏
     * <p>
     * 题目：给定一个二维数组map 含义是一张地图 游戏规则如下：
     * 1.骑士从左上角出发 每次只能向右或者向下走 最后到达最右下角见到公主
     * 2.地图中的每个位置的值 代表骑士要遭遇的事情
     * <p>
     * 2.1如果为负数 说明此处有怪兽 要让骑士损失血量
     * 2.2如果为非负数 说明此处有血瓶 能让骑士回血
     * <p>
     * 3.骑士从左上角到右下角的过程中 走到任何一个位置时 血量都不能少于1
     * <p>
     * 思路：
     * 1.确定dp的含义：dp[i][j]代表如果骑士要走上位置[i,j] 并且从该位置选一条最优的路径 最后走到右下角 骑士最起码应该具备的血量
     * 2.确定dp的公式：dp[i][j]=Math.max(dp[i][j+1]-map[i][j],dp[i+1][j]-map[i][j],1)
     * 3.确定dp初始化：
     * 4.dp的遍历方式：从右下角 往左上角 开始遍历
     */
    public static int minHp(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return 1;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] dp = new int[row--][col--];
        dp[row][col] = matrix[row][col] > 0 ? 1 : -matrix[row][col] + 1;
        for (int i = col - 1; i >= 0; i--) {
            dp[row][i] = Math.max(dp[row][i + 1] - matrix[row][i], 1);
        }
        int right = 0;
        int down = 0;
        for (int i = row - 1; i >= 0; i--) {
            dp[i][col] = Math.max(dp[i + 1][col] - matrix[i][col], 1);
            for (int j = col - 1; j >= 0; j--) {
                right = Math.max(dp[i][j + 1] - matrix[i][j], 1);
                down = Math.max(dp[i + 1][j] - matrix[i][j], 1);
                dp[i][j] = Math.min(right, down);
            }
        }
        return dp[0][0];
    }


    /**
     * 房屋抢劫
     * <p>
     * 题目：每个房间里都有不同数量的财物，给出能抢劫的最大财物数。这里的唯一限制是不能同时对相邻的房间进行抢劫。
     * <p>
     * 思路：
     * 1.确定dp的含义：dp[i]代表以位置i为结尾时 抢劫的最大财物数
     * <p>
     * 2.确定dp的表达式：
     * case1: i位置不抢   dp[i]=dp[i-1]
     * case2: i位置抢的话 dp[i]=dp[i-2]+arr[i]
     * <p>
     * 3.确定dp初始化：
     * case1: 只有一个房间：dp[0]=arr[0];
     * case2: 存在两个房间：dp[1]=Math.max(arr[0],arr[1])
     */
    public static int getMaxValue(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i]);
        }
        return dp[arr.length - 1];
    }


    /**
     * 最长递增子串
     * <p>
     * 输入：a-z和0-9
     * 输出：1.不重复 2.有顺序
     * <p>
     * 例子：输入：abfdgdfd789abcdefdfkkff
     * 输出：789abcdef
     * <p>
     * <p>
     * 思路：
     * 1.dp[i]:以位置i结尾的情况下 最长的递增子串长度为dp[i];
     * 2.dp[i]=Math.max(dp[i-1]+1,1)//
     * 3.dp[0]=arr[i];
     */

    public static String getMaxSubString(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int[] maxLengthDp = getMaxLengthDp(str);
        int index = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < maxLengthDp.length; i++) {
            if (maxLengthDp[i] > max) {
                max = maxLengthDp[i];
                index = i;
            }
        }
        return str.substring(index - max + 1, index + 1);
    }

    public static int[] getMaxLengthDp(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        char[] chas = str.toCharArray();
        int[] dp = new int[chas.length];
        dp[0] = 1;
        for (int i = 1; i < chas.length; i++) {
            if (chas[i] > chas[i - 1] && dp[i - 1] >= 1 && !isDuplicate(chas, i, dp[i - 1])) {
                dp[i] = dp[i - 1] + 1;
            } else {
                dp[i] = 1;
            }
        }
        return dp;
    }


    private static boolean isDuplicate(char[] chas, int index, int len) {
        boolean flag = false;
        for (int i = index - 1; i >= index - len; i--) {
            if (chas[index] == chas[i]) {
                flag = true;
                break;
            }
        }
        return flag;
    }


    /**
     * 回文最少分割数
     * <p>
     * 题目：给定一个字符串str 返回把str全部切成回文子串的最小分割数
     * <p>
     * 思路：
     * 1.确定dp的含义：dp[i]代表子串str[i...len-1]至少需要切割几次 才能把str[i...len-1]全部切成回文子串
     * 2.确定dp的公式：dp[i]=Math.min(dp[j+1]+1) (i=<j<len 且str[i...j]必须是回文串)
     * 3.确定dp的初始化：
     * <p>
     * p[i][j]的作用：用于判断str[i...j]是否是回文串
     * <p>
     * p[i][j]=true:说明字符串str[i...j]是回文串 否则不是 p[i][j]=true的三种情况：
     * <p>
     * 1.str[i...j]由一个字符组成
     * 2.str[i...j]由两个字符组成且两个字符相等
     * 3.str[i+1...j-1]是回文串 即p[i+1][j-1]=true且str[i]==str[j] 即str[i...j]上首尾两个字符相等
     * <p>
     * [i...j...len-1]
     */
    public static int minCut(String str) {
        if (str == null || str.equals("")) {
            return 0;
        }
        char[] chas = str.toCharArray();
        int len = chas.length;
        int[] dp = new int[len + 1];
        dp[len]=-1;
        boolean[][] p = new boolean[len][len];
        for (int i = len - 1; i >= 0; i--) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = i; j < len; j++) {
                if (chas[i] == chas[j] && (j - i < 2 || p[i + 1][j - 1])) {
                    p[i][j] = true;
                    dp[i] = Math.min(dp[i], dp[j + 1] + 1);
                }
            }
        }
        return dp[0];
    }


}
