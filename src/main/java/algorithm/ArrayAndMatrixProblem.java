package algorithm;

import common.ArrayUtil;

import java.util.*;

/**
 * 数组和矩阵相关的问题
 */
public class ArrayAndMatrixProblem {


    /**
     * 递增的三元子序列
     * <p>
     * <p>
     * 完成情况：done
     */
    public boolean increasingTriplet(int[] nums) {
        //记录三数中的最小数字
        int small = Integer.MAX_VALUE;
        //记录中间的数字
        int mid = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= small) {
                small = num;
            } else if (num <= mid) {
                mid = num;
            } else {
                return true;
            }
        }
        return false;
    }


    /**
     * 转圈打印矩阵
     * <p>
     * 题目：给定一个整型矩阵matrix 请按照转圈的方式打印它
     */
    public static void spiralOrderPrint(int[][] matrix) {
        int tR = 0;
        int tC = 0;
        int dR = matrix.length - 1;
        int dC = matrix[0].length - 1;
        while (tR <= dR && tC <= dC) {
            printEdge(matrix, tR++, tC++, dR--, dC--);
        }
    }

    private static void printEdge(int[][] matrix, int tR, int tC, int dR, int dC) {
        if (tR == dR) {
            //子矩阵只有一行
            for (int i = tC; i <= dC; i++) {
                System.out.print(matrix[tR][i] + " ");
            }
        } else if (tC == dC) {
            //子矩阵只有一列
            for (int i = tC; i <= dC; i++) {
                System.out.print(matrix[i][tC] + " ");
            }
        } else {
            int curC = tC;
            int curR = tR;
            while (curC != dC) {
                System.out.print(matrix[tR][curC] + " ");
            }
            while (curR != dR) {
                System.out.print(matrix[curR][dC] + " ");
            }
            while (curC != tC) {
                System.out.print(matrix[dR][curC] + " ");
            }
            while (curR != tR) {
                System.out.print(matrix[curR][tC] + " ");
            }
        }
    }

    /**
     * 将正方形矩阵顺时针转动90度
     * <p>
     * 题目：给定一个N*N的矩阵matrix 把这个矩阵调整成顺时针转动90度后的形式
     * <p>
     * 思路：分圈转动转换
     */
    public static void rotate(int[][] matrix) {
        int tr = 0;
        int tc = 0;
        int dr = matrix.length - 1;
        int dc = matrix[0].length - 1;
        while (tr < dr) {
            rotateEdge(matrix, tr++, tc++, dr--, dc--);
        }
    }

    private static void rotateEdge(int[][] matrix, int tr, int tc, int dr, int dc) {
        int times = dc - tc;//times就是总的组数
        int temp = 0;
        for (int i = 0; i != times; i++) {
            //一次循环就是一组占据调整
            temp = matrix[tr][tc + i];
            matrix[tr][tc + i] = matrix[dr - i][tc];
            matrix[dr - i][tc] = matrix[dr][dc - i];
            matrix[dr][dc - i] = matrix[tr + i][dc];
            matrix[tr + i][dc] = temp;
        }
    }

    /**
     * 给定一个矩阵matrix 按照"之"字形的方式打印这个矩阵
     */
    public static void printMatrixZigZag(int[][] matrix) {
        int tr = 0;
        int tc = 0;
        int dr = 0;
        int dc = 0;
        int endR = matrix.length - 1;
        int endC = matrix[0].length - 1;
        boolean fromUp = false;
        while (tr != endR + 1) {
            printLevel(matrix, tr, tc, dr, dc, fromUp);
            tr = tc == endC ? tr + 1 : tr;
            tc = tc == endC ? tc : tc + 1;
            dc = dr == endR ? dc + 1 : dc;
            dr = dr == endR ? dr : dr + 1;
            fromUp = !fromUp;
            System.out.println();
        }
    }

    private static void printLevel(int[][] matrix, int tr, int tc, int dr, int dc, boolean fromUp) {
        if (fromUp) {
            while (tr != dr + 1) {
                System.out.println(matrix[tr++][tc--] + " ");
            }
        } else {
            while (dr != tr - 1) {
                System.out.println(matrix[dr--][dc++] + " ");
            }
        }
    }

    /**
     * 找到无序数组中最小的k个数
     * <p>
     * 题目：给定一个无序的整型数组arr 找到其中最小的k个数
     * <p>
     * 思路：维护一个有k个数的大根堆
     */

    public static int[] getMinKNumsByHeap(int[] arr, int k) {
        if (k < 1 || k > arr.length) {
            return arr;
        }
        int[] kHeap = new int[k];
        for (int i = 0; i != k; i++) {
            heapInsert(kHeap, arr[i], i);
        }
        for (int i = k; i != arr.length; i++) {
            if (arr[i] < kHeap[0]) {
                kHeap[0] = arr[i];
                heapify(kHeap, 0, k);
            }
        }
        return kHeap;
    }

    private static void heapInsert(int[] arr, int value, int index) {
        arr[index] = value;
        while (index != 0) {
            int parent = (index - 1) / 2;
            if (arr[parent] < arr[index]) {
                ArrayUtil.swap(arr, parent, index);
                index = parent;
            } else {
                break;
            }
        }
    }

    private static void heapify(int[] arr, int index, int heapSize) {
        int left = index * 2 + 1;
        int right = index * 2 + 2;
        int largest = index;
        while (left < heapSize) {
            if (arr[left] > arr[index]) {
                largest = left;
            }
            if (right < heapSize && arr[right] > arr[largest]) {
                largest = right;
            }
            if (largest != index) {
                ArrayUtil.swap(arr, largest, index);
            } else {
                break;
            }
            index = largest;
            left = index * 2 + 1;
            right = index * 2 + 2;
        }
    }

    /**
     * 需要排序的最短子数组长度
     * <p>
     * 题目：给定一个无序数组arr 求出需要排序的最短子数组长度
     * <p>
     * 例如：arr=[1,5,3,4,2,6,7]返回4 因为只有【5，3，4，2】需要排序
     */
    public static int getMinLength(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }
        int min = arr[arr.length - 1];
        int noMinIndex = -1;
        for (int i = arr.length - 2; i != -1; i--) {
            if (arr[i] > min) {
                noMinIndex = i;
            } else {
                min = Math.min(min, arr[i]);
            }
        }
        if (noMinIndex == -1) {
            return 0;
        }
        int max = arr[0];
        int noMaxIndex = -1;
        for (int i = 1; i != arr.length; i++) {
            if (arr[i] < max) {
                noMaxIndex = i;
            } else {
                max = Math.max(max, arr[i]);
            }
        }
        return noMaxIndex - noMinIndex + 1;
    }

    /**
     * 在数组中找到出现次数大于N/k的数
     * <p>
     * 题目：给定一个整型数组arr 打印其中出现次数大于一半的数 如果没有这样的数 打印提示信息
     * <p>
     * 题目2：给定一个整型数组arr 再给定一个整数k 打印所有出现次数大于N/k的数 如果没有 打印提示信息
     */
    public static void printHalfMajor(int[] arr) {
        int cand = 0;
        int times = 0;
        for (int i = 0; i != arr.length; i++) {
            if (times == 0) {
                cand = arr[i];
                times = 1;
            } else if (arr[i] == cand) {
                times++;
            } else {
                times--;
            }
        }
        times = 0;
        for (int i = 0; i != arr.length; i++) {
            if (arr[i] == cand) {
                times++;
            }
        }
        if (times > arr.length / 2) {
            System.out.println(cand);
        } else {
            System.out.println("no such number.");
        }
    }

    public static void printKMajor(int[] arr, int k) {
        if (k < 2) {
            System.out.println("the value of K is invalid");
            return;
        }
        HashMap<Integer, Integer> cands = new HashMap<>();
        for (int i = 0; i != arr.length; i++) {
            if (cands.containsKey(arr[i])) {
                cands.put(arr[i], cands.get(arr[i]) + 1);
            } else {
                if (cands.size() == k - 1) {
                    allCandsMinusOne(cands);
                } else {
                    cands.put(arr[i], 1);
                }
            }
        }
        HashMap<Integer, Integer> reals = getReals(arr, cands);
        boolean hasPrint = false;
        for (Map.Entry<Integer, Integer> set : cands.entrySet()) {
            Integer key = set.getKey();
            if (reals.get(key) > arr.length / k) {
                hasPrint = true;
                System.out.print(key + " ");
            }
        }
        System.out.println(hasPrint ? "" : "no such number.");
    }

    private static HashMap<Integer, Integer> getReals(int[] arr, HashMap<Integer, Integer> cands) {
        HashMap<Integer, Integer> reals = new HashMap<>();
        for (int i = 0; i != arr.length; i++) {
            int curNum = arr[i];
            if (cands.containsKey(curNum)) {
                if (reals.containsKey(curNum)) {
                    reals.put(curNum, reals.get(curNum) + 1);
                } else {
                    reals.put(curNum, 1);
                }
            }
        }
        return reals;
    }

    private static void allCandsMinusOne(HashMap<Integer, Integer> cands) {
        List<Integer> removeList = new LinkedList<Integer>();
        for (Map.Entry<Integer, Integer> set : cands.entrySet()) {
            Integer key = set.getKey();
            Integer value = set.getValue();
            if (value == 1) {
                removeList.add(key);
            }
            cands.put(key, value - 1);
        }
        for (Integer removeKey : removeList) {
            cands.remove(removeKey);
        }
    }

    /**
     * 在行列都排好序的矩阵中找数
     * <p>
     * 题目：给定一个有N*M的整型矩阵matrix和一个整数K matrix中的每一行和每一列都是排好序的
     * 实现一个函数 判断K是否在matrix中
     */
    public static boolean isContains(int[][] matrix, int k) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col > -1) {
            if (matrix[row][col] == k) {
                return true;
            } else if (matrix[row][col] > k) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }

    /**
     * 最长的可整合子数组的长度
     * <p>
     * 题目：先给出可整合数组的定义 如果一个数组在排序后 每相邻两个数差的绝对值都为1 则该数组为可整合数组
     * 给定一个整型数组arr 请返回其中最大可整合子数组的长度
     */
    //方法1 暴力破解法
    public static int getCompactArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (isIntegrated(arr, i, j)) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }

    private static boolean isIntegrated(int[] arr, int left, int right) {
        int[] newArr = Arrays.copyOfRange(arr, left, right + 1);
        Arrays.sort(newArr);
        for (int i = 1; i < newArr.length; i++) {
            if (newArr[i - 1] != newArr[i] - 1) {
                return false;
            }
        }
        return true;
    }

    //方法2：一个数组中如果没有重复元素 并且最大值减去最小值 再加1的结果等于元素个数 那么这个数组就是整合数组
    public static int getCompactArray2(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int len = 0;
        int max = 0;
        int min = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;
            for (int j = i; j < arr.length; j++) {
                if (set.contains(arr[j])) {
                    break;
                }
                set.add(arr[j]);
                max = Math.max(max, arr[j]);
                min = Math.min(min, arr[j]);
                if (max - min == j - i) {
                    len = Math.max(len, j - i + 1);
                }
                set.clear();
            }
        }
        return len;
    }

    /**
     * 不重复打印排序数组中相加和为给定值的所有二元组和三元组
     * <p>
     * 题目：给定排序数组arr和整数k 不重复打印arr中所有相加和为k的不降序二元组
     */
    public static void printUniquePair(int[] arr, int k) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] < k) {
                left++;
            } else if (arr[left] + arr[right] > k) {
                right--;
            } else {
                if (left == 0 || arr[left - 1] != arr[left]) {
                    System.out.println(arr[left] + "," + arr[right]);
                }
                left++;
                right--;
            }
        }
    }

    //三元组
    public static void printUniqueTriad(int[] arr, int k) {
        if (arr == null || arr.length < 3) {
            return;
        }
        for (int i = 0; i < arr.length - 2; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                //找到一个不重复的元素 剩余的两个还是按照二元组的方式进行寻找
                printRest(arr, i, i + 1, arr.length - 1, k - arr[i]);
            }
        }
    }

    private static void printRest(int[] arr, int f, int l, int r, int k) {
        while (l < r) {
            if (arr[l] + arr[r] < k) {
                l++;
            } else if (arr[l] + arr[r] > k) {
                r--;
            } else {
                if (l == f + 1 || arr[l - 1] != arr[l]) {
                    System.out.println(arr[f] + "," + arr[l] + "," + arr[r]);
                }
                l++;
                r--;
            }
        }
    }

    /**
     * 未排序正数数组中累加和为给定值的最长子数组长度
     * <p>
     * 题目：给定一个数组arr 该数组无序 但是每个值均为正数 再给定一个正数k 求arr的所有子数组中所有元素相加和为k的
     * 最长子数组长度
     */
    public static int getMaxLength(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k < 0) {
            return 0;
        }
        int left = 0;
        int right = 0;
        int sum = arr[0];
        int len = 0;
        while (right < arr.length) {
            if (sum == k) {
                len = Math.max(len, right - left + 1);
                sum -= arr[left++];
            } else if (sum < k) {
                right++;
                if (right == arr.length) {
                    break;
                }
                sum += arr[right];
            } else {
                sum -= arr[left++];
            }
        }
        return len;
    }

    /**
     * 自然数数组的排序
     * <p>
     * 题目：给定一个长度为N的整型数组arr 其中有N个互不相等的自然数1-N
     * 请实现arr的排序 但是不要把下标0-N-1位置上的数通过直接赋值的方式替换成1-N
     */
    public static void sort1(int[] arr) {
        int temp = 0;
        int next = 0;
        for (int i = 0; i != arr.length; i++) {
            temp = arr[i];
            while (arr[i] != i + 1) {
                next = arr[temp - 1];
                arr[temp - 1] = temp;
                temp = next;
            }
        }
    }

    public static void sort2(int[] arr) {
        int temp = 0;
        for (int i = 0; i != arr.length; i++) {
            while (arr[i] != i + 1) {
                temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }
    }

    /**
     * 奇数下标都是奇数或者偶数下标都是偶数
     * <p>
     * 题目：给定一个长度不小于2的数组arr 实现一个函数调整arr 要么让所有的偶数下标都是偶数
     * 要么让所有的奇数下标都是奇数
     * <p>
     * 要求：如果arr的长度为N 函数要求时间复杂度为O(N) 空间复杂度为O(1)
     */
    public static void modify(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int even = 0;
        int odd = 1;
        int end = arr.length - 1;
        while (even <= end && odd <= end) {
            if ((arr[end] & 1) == 0) {
                ArrayUtil.swap(arr, end, even);
                even += 2;
            } else {
                ArrayUtil.swap(arr, end, odd);
                odd += 2;
            }
        }
    }

    /**
     * 子数组的最大累加和问题
     * <p>
     * 题目：给定一个数组arr 返回子数组中的最大累加和
     */
    public static int maxSum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int cur = 0;
        for (int i = 0; i != arr.length; i++) {
            cur += arr[i];
            max = Math.max(max, cur);
            cur = cur < 0 ? 0 : cur;
        }
        return max;
    }

    /**
     * 子矩阵的最大累加和问题
     * <p>
     * 题目：给定一个矩阵matrix 其中的值有正、负、0； 返回子矩阵的最大累加和
     */
    public static int maxSum(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int cur = 0;
        int[] s = null;
        for (int i = 0; i != matrix.length; i++) {
            s = new int[matrix[0].length];
            for (int j = i; j != matrix.length; j++) {
                cur = 0;
                for (int k = 0; k != s.length; k++) {
                    s[k] += matrix[j][k];
                    cur += s[k];
                    max = Math.max(max, cur);
                    cur = cur < 0 ? 0 : cur;
                }
            }
        }
        return max;
    }

    /**
     * 在数组中找到一个局部最小的值
     * <p>
     * 题目：定义局部最小的概念 arr长度为1时 arr[0]是局部最小 arr的长度为N(N>1)时
     * 如果arr[0]<arr[1] 那么arr[0]是局部最小 如果arr[N-1]<arr[N-2] 那么
     * arr[N-1]是局部最小 如果0<i<N-1 既有arr[i]<arr[i-1] 又有arr[i]<arr[i+1]
     * 那么arr[i]是局部最小的
     * <p>
     * 给定无序数组arr 已知arr中任意两个相邻的数都不相等 写一个函数 只需返回arr中任意一个
     * 局部最小出现的位置即可。
     */
    public static int getLessIndex(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        if (arr.length == 1 || arr[0] < arr[1]) {
            return 0;
        }
        if (arr[arr.length - 1] < arr[arr.length - 2]) {
            return arr.length - 1;
        }
        int left = 1;
        int right = arr.length - 2;
        int mid = 0;
        while (left < right) {
            mid = (left + right) / 2;
            if (arr[mid] > arr[mid - 1]) {
                right = mid - 1;
            } else if (arr[mid] > arr[mid + 1]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return left;
    }

    /**
     * 数组中子数组的最大累乘积
     * <p>
     * 完成情况:done
     * <p>
     * 题目：给定一个double类型的数组arr 其中的元素可正、可负、可0 返回子数组累乘的最大乘积
     */
    public static double maxProduct(double[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        double max = arr[0];
        double min = arr[0];
        double res = arr[0];
        double maxEnd = 0;
        double minEnd = 0;
        for (int i = 1; i < arr.length; ++i) {
            maxEnd = max * arr[i];
            minEnd = min * arr[i];
            max = Math.max(Math.max(maxEnd, minEnd), arr[i]);
            min = Math.min(Math.min(maxEnd, minEnd), arr[i]);
            res = Math.max(res, max);
        }
        return res;
    }

    /**
     * 打印N个数组整体最大的Top K
     * <p>
     * 题目：有N个长度不一的数组 所有的数组都是有序的 请从大到小打印这N个数组整体最大的前K个数
     */
    static class HeapNode {
        public int value;//值是什么
        public int arrNum;//来自哪个数组
        public int index;//来自数组的哪个位置

        public HeapNode(int value, int arrNum, int index) {
            this.value = value;
            this.arrNum = arrNum;
            this.index = index;
        }
    }

    public static void printTopK(int[][] matrix, int topK) {
        int heapSize = matrix.length;
        HeapNode[] heap = new HeapNode[heapSize];
        for (int i = 0; i != heapSize; i++) {
            int index = matrix[i].length - 1;
            heap[i] = new HeapNode(matrix[i][index], i, index);
            heapInsert(heap, i);
        }
        System.out.println("TOP" + topK + ":");
        for (int i = 0; i != topK; i++) {
            if (heapSize == 0) {
                break;
            }
            System.out.println(heap[0].value + " ");
            if (heap[0].index != 0) {
                heap[0].value = matrix[heap[0].arrNum][--heap[0].index];
            } else {
                swap(heap, 0, --heapSize);
            }
            heapify(heap, 0, heapSize);
        }
    }

    private static void heapify(HeapNode[] heap, int index, int heapSize) {
        int left = index * 2 + 1;
        int right = index * 2 + 2;
        int largest = index;
        while (left < heapSize) {
            if (heap[left].value > heap[index].value) {
                largest = left;
            }
            if (right < heapSize && heap[right].value > heap[largest].value) {
                largest = right;
            }
            if (largest != index) {
                swap(heap, largest, index);
            } else {
                break;
            }
            index = largest;
            left = index * 2 + 1;
            right = index * 2 + 2;
        }
    }

    private static void heapInsert(HeapNode[] heap, int index) {
        while (index != 0) {
            int parent = (index - 1) / 2;
            if (heap[parent].value < heap[index].value) {
                swap(heap, parent, index);
                index = parent;
            } else {
                break;
            }
        }

    }

    private static void swap(HeapNode[] heap, int index1, int index2) {
        HeapNode temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    /**
     * 数组中出现的最小正整数
     * <p>
     * 题目：给定一个无序整型数组arr 找出数组中未出现的最小正整数
     */
    public static int missNum(int[] arr) {
        int l = 0;
        int r = arr.length;
        while (l < r) {
            if (arr[l] == l + 1) {
                l++;
            } else if (arr[l] <= 1 || arr[r] > r || arr[arr[l] - 1] == arr[l]) {
                arr[l] = arr[--r];
            } else {
                ArrayUtil.swap(arr, l, arr[l] - 1);
            }
        }
        return l + 1;
    }

    /**
     * 数组排序之后相邻数的最大差值
     * <p>
     * 题目：给定一个整型数组arr 返回排序后的相邻两数的最大差值
     */
    public static int maxGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        int len = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        if (min == max) {
            return 0;
        }
        boolean[] hasNum = new boolean[len + 1];
        int[] maxs = new int[len + 1];
        int[] mins = new int[len + 1];
        int bid = 0;
        for (int i = 0; i < len; i++) {
            bid = bucket(nums[i], len, min, max);//算出桶号
            mins[bid] = hasNum[bid] ? Math.min(mins[bid], nums[i]) : nums[i];
            maxs[bid] = hasNum[bid] ? Math.max(maxs[bid], nums[i]) : nums[i];
        }
        int res = 0;
        int lastMax = 0;
        int i = 0;
        while (i < len) {
            if (hasNum[i++]) {
                lastMax = maxs[i - 1];
                break;
            }
        }
        for (; i <= len; i++) {
            if (hasNum[i]) {
                res = Math.max(res, mins[i] - lastMax);
                lastMax = maxs[i];
            }
        }
        return res;
    }

    private static int bucket(long num, long len, long min, long max) {
        return (int) ((num - min) * len / (max - min));
    }

    /**
     * 数组的partition调整
     * <p>
     * 题目：给定一个有序数组arr 调整arr使得这个数组的左半部分没有重复元素且升序 而不保证右部分是否有序
     * <p>
     * 题目2：给定一个数组arr 其中只可能含有0、1、2三个值 请实现arr的排序
     * <p>
     * 补充题目：有一个数组 再给定一个值k 请实现比k小的数放在数组的左边 等于k的数放在数组的中间 比k大的数
     * 都放在数组的右边
     */
    public static void leftUnique(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int u = 0;
        int i = 1;
        while (i != arr.length) {
            if (arr[i++] != arr[u]) {
                ArrayUtil.swap(arr, ++u, i - 1);
            }
        }
    }

    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int left = -1;
        int index = 0;
        int right = arr.length;
        while (index < right) {
            if (arr[index] == 0) {
                ArrayUtil.swap(arr, ++left, index++);
            } else if (arr[index] == 2) {
                ArrayUtil.swap(arr, index, --right);
            } else {
                index++;
            }
        }
    }


    /**
     * 计算数组的小和
     * <p>
     * 题目：数组的小和的定义 例如：数组s=[1,3,5,2,4,6] 在s[0]的左边小于或者等于s[0]的数的和为0；
     * 在s[1]的左边小于或等于s[1]的数的和为1 在s[2]的左边小于或等于s[2]的数的和为1+3=4.在s[3]的左边
     * 小于或等于s[3]的数的和为1，...
     * <p>
     * 给定一个数组s 实现函数返回s的小和
     */
    public static int getSmallSum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        return func(arr, 0, arr.length - 1);
    }

    private static int func(int[] arr, int l, int r) {
        if (l == r) {
            return 0;
        }
        int mid = (l + r) / 2;
        return func(arr, l, mid) + func(arr, mid + 1, r) + merge(arr, l, mid, r);
    }

    private static int merge(int[] arr, int left, int mid, int right) {
        int[] h = new int[right - left + 1];
        int hi = 0;
        int i = left;
        int j = mid + 1;
        int smallSum = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                smallSum += arr[i] * (right - j + 1);
                h[hi++] = arr[i++];
            } else {
                h[hi++] = arr[j++];
            }
        }
        for (; (j < right + 1) || (i < mid + 1); j++, i++) {
            h[hi++] = i > mid ? arr[j] : arr[i];
        }
        for (int k = 0; k != h.length; k++) {
            arr[left++] = h[k];
        }
        return smallSum;
    }

    /**
     * 求最短通路值
     * <p>
     * 题目：用一个整型矩阵matrix代表一个网络，1代表有路，0代表没有路，每一个位置只要不越界，都有上下左右四个方向，
     * 求从最左上角到最右下角的最短通路值；
     * <p>
     * <p>
     * 解法：宽度优先遍历，使用队列来实现；
     */
    public static int getMinPathValue(int[][] m) {

        return 0;

    }


}
