package algorithm;

import org.springframework.util.StringUtils;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 字符串相关的问题
 */
public class StringRelatedProblem {

    public static void main(String[] args) {
        String s = "123abcabc";
        String from = "abc";
        String to = "X";

        String replace = replace(s, from, to);
        System.out.println(replace);
    }

    /**
     * 判断两个字符串是否互为变形词
     * <p>
     * 题目：给定两个字符串str1和str2 如果str1和str2中出现的字符种类一样且每种字符出现的次数也一样
     * 那么str1和str2互为变形词 请实现函数判断两个字符串是否互为变形词
     * <p>
     * 思路：申请一个长度为256的整型数组map map[a]=b代表字符编码为a的字符出现了b次
     * 初始时map[0...255]都是0 然后遍历字符串str1 统计每种字符出现的数量
     * 比如遍历到字符'a' 其编码值为97 则令map[97]++ 这样map就成了str1中每种字符的词频统计表
     */
    public static boolean isDeformation(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }
        char[] chas1 = str1.toCharArray();
        char[] chas2 = str2.toCharArray();
        int[] map = new int[256];
        for (int i = 0; i < chas1.length; i++) {
            map[chas1[i]]++;
        }
        for (int i = 0; i < chas2.length; i++) {
            if (map[chas2[i]]-- == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 字符串中数字子串求和
     * <p>
     * 题目：给定一个字符串str 求其中全部数字串所代表的数字之和
     * <p>
     * 要求：
     * 1.忽略小数点字符 例如"A1.3" 其中包含两个数字1和3
     * 2.如果紧贴数字子串的左侧出现字符"-" 当连续出现的数量为奇数时 则为负数
     * 连续出现的数量为偶数时 则数字视为正数
     */
    public static int numSum(String str) {
        if (str == null) {
            return 0;
        }
        char[] charArr = str.toCharArray();
        int res = 0;
        int num = 0;
        boolean posi = true;
        int cur = 0;
        for (int i = 0; i < charArr.length; i++) {
            cur = charArr[i] - '0';
            if (cur < 0 || cur > 9) {
                res += num;
                num = 0;
                if (charArr[i] == '-') {
                    if (i - 1 > -1 && charArr[i - 1] == '-') {
                        posi = !posi;
                    } else {
                        posi = false;
                    }
                } else {
                    posi = true;
                }
            } else {
                num = num * 10 + (posi ? cur : -cur);
            }
        }
        res += num;
        return res;
    }

    /**
     * 去掉字符串中连续出现k个0的子串
     * <p>
     * 题目：给定一个字符串str和一个整数k 如果str中正好有连续的k个'0'字符出现时
     * 把k个连续的'0'字符去除 返回处理后的字符串
     */
    public static String removeKZero(String str, int k) {
        if (str == null || k < 1) {
            return str;
        }
        char[] chas = str.toCharArray();
        int count = 0;
        int start = -1;
        for (int i = 0; i != chas.length; i++) {
            if (chas[i] == '0') {
                count++;
                start = start == -1 ? i : start;
            } else {
                if (count == k) {
                    while (count-- != 0) {
                        //设置为空字符串
                        chas[start++] = 0;
                    }
                }
                count = 0;
                start = -1;
            }
        }
        if (count == k) {
            while (count-- != 0) {
                chas[start++] = 0;
            }
        }
        return String.valueOf(chas);
    }

    /**
     * 判断两个字符串是否互为旋转词
     *
     * 题目：如果一个字符串str 把字符串str前面任意的部分挪到后面形成的字符串叫做str的旋转词
     * 比如：str="12345" str的旋转词有"12345" "23451" "34512" "45123" "51234"
     * 给定两个字符串a和b 请判断a和b是否互为旋转词
     *
     * 思路：涉及到KMP算法
     */

    /**
     * 将整数字符串转成整数值
     * <p>
     * 题目：给定一个字符串str 如果str符合日常书法的整数形式 并且属于32位整数的范围 返回str所代表的整数值 否则返回0
     */
    public static int convert(String str) {
        if (str == null || str.equals("")) {
            return 0;
        }
        char[] chas = str.toCharArray();
        if (!isValid(chas)) {
            return 0;
        }
        boolean posi = chas[0] == '-' ? false : true;
        int minq = Integer.MIN_VALUE / 10;
        int minr = Integer.MIN_VALUE % 10;
        int res = 0;
        int cur = 0;
        for (int i = posi ? 0 : 1; i < chas.length; i++) {
            cur = '0' - chas[i];
            if ((res < minq) || (res == minq && cur < minr)) {
                return 0;
            }
            res = res * 10 + cur;
        }
        if (posi && res == Integer.MIN_VALUE) {
            return 0;
        }
        return posi ? -res : res;
    }

    private static boolean isValid(char[] chas) {
        if (chas[0] != '-' && (chas[0] < '0' || chas[0] > '9')) {
            return false;
        }
        if (chas[0] == '-' && (chas.length == 1 || chas[1] == '0')) {
            return false;
        }
        if (chas[0] == '0' && chas.length > 1) {
            return false;
        }
        for (int i = 1; i < chas.length; i++) {
            if (chas[i] < '0' || chas[i] > '9') {
                return false;
            }
        }
        return true;
    }

    /**
     * 替换字符串中连续出现的指定字符串
     * <p>
     * 题目：给定三个字符串str、from、to 把str中所有from的子串全部替换成to字符串
     * 对连续出现from的部分要求只替换成一个to字符串 返回最终的结果字符串
     */

    public static String replace(String str, String from, String to) {

        if (str == null || from == null || str.equals("") || from.equals("")) {
            return str;
        }
        char[] chas = str.toCharArray();
        char[] chaf = from.toCharArray();
        //match指针指向from数组的开始
        int match = 0;
        for (int i = 0; i < chas.length; i++) {
            if (chas[i] == chaf[match++]) {
                if (match == chaf.length) {
                    clear(chas, i, chaf.length);
                    match = 0;
                }
            } else {
                match = 0;
            }
        }
        String res = "";
        String cur = "";
        for (int i = 0; i < chas.length; i++) {
            if (chas[i] != 0) {
                cur = cur + String.valueOf(chas[i]);
            }
            if (chas[i] == 0 && (i == 0 || chas[i - 1] != 0)) {
                res = res + cur + to;
                cur = "";
            }
        }
        if (!cur.equals("")) {
            res = res + cur;
        }
        return res;
    }

    private static void clear(char[] chas, int end, int len) {
        while (len-- != 0) {
            chas[end--] = 0;
        }
    }

    /**
     * 字符串的统计字符串
     * <p>
     * 题目：给定一个字符串str 返回str的统计字符串 例如"aaabbaddffc"的统计字符串为
     * a_3_b_2_a_1_d_3_f_2_c_1
     */
    public static String getCountString(String str) {
        if (str == null || str.equals("")) {
            return "";
        }
        char[] chs = str.toCharArray();
        String res = String.valueOf(chs[0]);
        //记录每个字符出现的次数
        int num = 1;
        for (int i = 1; i < chs.length; i++) {
            if (chs[i] != chs[i - 1]) {
                res = concat(res, String.valueOf(num), String.valueOf(chs[i]));
                num = 1;
            } else {
                num++;
            }
        }
        return concat(res, String.valueOf(num), "");
    }

    private static String concat(String s1, String s2, String s3) {
        return s1 + "_" + s2 + (s3.equals("") ? s3 : "_" + s3);
    }

    /**
     * 补充问题：
     * 给定一个字符串的统计字符串cstr 再给定一个整数index 返回cstr所代表的原始字符串
     * 上的第index个字符 例如：a_1_b_100 所代表的原始字符串上第0个字符是'a' 第50个字符是'b'
     */
    public static char getCharAt(String cstr, int index) {
        if (cstr == null || cstr.equals("")) {
            return 0;
        }
        char[] chas = cstr.toCharArray();
        boolean stage = true;
        char cur = 0;
        int num = 0;
        int sum = 0;
        for (int i = 0; i != chas.length; i++) {
            if (chas[i] == '_') {
                stage = !stage;
            } else if (stage) {
                sum += num;
                if (sum > index) {
                    return cur;
                }
                num = 0;
                cur = chas[i];
            } else {
                num = num * 10 + chas[i] - '0';
            }
        }
        return sum + num > index ? cur : 0;
    }

    /**
     * 判断字符数组中是否所有的字符都只出现过一次
     * <p>
     * 题目：给定一个字符型数组chas[] 判断chas中是否所有的字符都只出现过一次
     * <p>
     * 方法2：让字符数组进行堆排序 然后遍历字符 如果当前字符和前一个字符相等 就返回false 否则返回true
     * <p>
     * 使用了堆排序 时间复杂度较低
     */
    public static boolean isUnique1(char[] chas) {
        if (chas == null) {
            return true;
        }
        boolean[] map = new boolean[256];
        for (int i = 0; i < chas.length; i++) {
            if (map[chas[i]]) {
                return false;
            }
            map[chas[i]] = true;
        }
        return true;
    }

    /**
     * 在有序但含有空的数组中查找字符串
     * <p>
     * 题目1：给定一个字符串数组strs[] 在strs中有些位置为null 但在不为null的位置上 其字符是按照字典
     * 顺序由小到大依次出现的
     * <p>
     * 题目2：再给定一个字符串str 返回str在strs中出现的最左的位置
     */
    public static int getIndex(String[] arr, String str) {
        if (arr == null || arr.length == 0 || str == null) {
            return -1;
        }
        int res = -1;
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        int i = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] != null && arr[mid].equals(str)) {
                res = mid;
                right = mid - 1;
            } else if (arr[mid] != null) {
                if (arr[mid].compareTo(str) < 0) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                i = mid;
                while (arr[i] == null && --i >= left) ;
                if (i < left || arr[i].compareTo(str) < 0) {
                    left = mid + 1;
                } else {
                    res = arr[i].equals(str) ? i : res;
                    right = i - 1;
                }
            }
        }
        return res;
    }

    /**
     * 字符串的调整和替换
     * <p>
     * 题目：给定一个字符类型的数组chas[] chas右半区全是空字符 左半区不含有空字符
     * 现在想将左半区所有的空格字符替换成"%20" 假设chas右半区足够大 可以替换所需要的空间
     * 请完成替换函数
     */
    public void replace(char[] chas) {
        if (chas == null || chas.length == 0) {
            return;
        }
        int num = 0;
        int len = 0;
        for (len = 0; len < chas.length && chas[len] != 0; len++) {
            if (chas[len] == ' ') {
                num++;
            }
        }
        int j = len + num * 2 - 1;
        for (int i = len - 1; i > -1; i--) {
            if (chas[i] != ' ') {
                chas[j--] = chas[i];
            } else {
                chas[j--] = '0';
                chas[j--] = '2';
                chas[j--] = '%';
            }
        }
    }

    /**
     * 翻转字符串
     * <p>
     * 题目：给定一个字符类型的数组chas 请在单词间做逆序调整 只要做到单词顺序逆序即可
     * 对空格的位置没有特别要求
     * <p>
     * 思路：首先把chas整体逆序 在逆序后 遍历chas找到每一个单词 然后把每个单词里的字符逆序即可
     */
    public static void rotateWord(char[] chas) {
        if (chas == null || chas.length == 0) {
            return;
        }
        reverse(chas, 0, chas.length - 1);
        int l = -1;
        int r = -1;
        for (int i = 0; i < chas.length; i++) {
            if (chas[i] != ' ') {
                l = i == 0 || chas[i - 1] == ' ' ? i : 1;
                r = i == chas.length - 1 || chas[i + 1] == ' ' ? i : r;
            }
            if (l != -1 && r != -1) {
                reverse(chas, l, r);
                l = -1;
                r = -1;
            }
        }
    }

    private static void reverse(char[] chas, int start, int end) {
        char temp = 0;
        while (start < end) {
            temp = chas[start];
            chas[start] = chas[end];
            chas[end] = temp;
            start++;
            end--;
        }
    }

    /**
     * 数组中两个字符串的最小距离
     * <p>
     * 题目：给定一个字符串数组strs 再给定两个字符串str1和str2 返回strs中str1与str2的最小距离
     * 如果str1或str2为null 或不在strs中 返回-1
     * <p>
     * 进阶题目：如果查询发生的次数有很多 如何把每次查询的时间复杂度降为O(1)？
     */
    public static int minDistance(String[] arr, String str1, String str2) {
        if (arr == null || StringUtils.isEmpty(str1) || StringUtils.isEmpty(str2)) {
            return -1;
        }
        if (str1.equals(str2)) {
            return 0;
        }
        int last1 = -1;
        int last2 = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i != arr.length; i++) {
            if (arr[i].equals(str1)) {
                min = Math.min(min, last2 == -1 ? min : i - last2);
                last1 = i;
            }
            if (arr[i].equals(str2)) {
                min = Math.min(min, last1 == -1 ? min : i - last1);
                last2 = i;
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    static public class Record {
        private HashMap<String, HashMap<String, Integer>> record;

        public Record(String[] strArr) {
            record = new HashMap<>();
            HashMap<String, Integer> indexMap = new HashMap<>();
            for (int i = 0; i != strArr.length; i++) {
                String curStr = strArr[i];
                update(indexMap, curStr, i);
                indexMap.put(curStr, i);
            }
        }

        private void update(HashMap<String, Integer> indexMap, String str, int i) {
            if (!record.containsKey(str)) {
                record.put(str, new HashMap<>());
            }
            HashMap<String, Integer> strMap = new HashMap<>();
            for (Map.Entry<String, Integer> lastEntry : indexMap.entrySet()) {
                String key = lastEntry.getKey();
                int index = lastEntry.getValue();
                if (!key.equals(str)) {
                    HashMap<String, Integer> lastMap = record.get(key);
                    int curMin = i - index;
                    if (strMap.containsKey(key)) {
                        int preMin = strMap.get(key);
                        if (curMin < preMin) {
                            strMap.put(key, curMin);
                            lastMap.put(str, curMin);
                        }
                    } else {
                        strMap.put(key, curMin);
                        lastMap.put(str, curMin);
                    }
                }
            }
        }

        public int minDistance(String str1, String str2) {
            if (str1 == null || str2 == null) {
                return -1;
            }
            if (str1.equals(str2)) {
                return 0;
            }
            if (record.containsKey(str1) && record.get(str1).containsKey(str2)) {
                return record.get(str1).get(str2);
            }
            return -1;
        }
    }

    /**
     * 添加最少字符让字符串整体都是回文字符串
     * <p>
     * 题目：给定一个字符串str 如果可以在str的任意位置添加字符 请返回在添加字符最少的情况下
     * 让str整体都是回文字符串的一种结果
     * <p>
     * 进阶题目：给定一个字符串str 再给定str的最长回文子序列字符串strlps 请返回在添加字符最少的情况下
     * 让str整体都是回文字符串的一种结果
     */
    public static int[][] getDP(char[] str) {
        int[][] dp = new int[str.length][str.length];
        for (int j = 1; j < str.length; j++) {
            dp[j - 1][j] = str[j - 1] == str[j] ? 0 : 1;
            for (int i = j - 2; i > -1; i--) {
                if (str[i] == str[j]) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j - 1]) + 1;
                }
            }
        }
        return dp;
    }

    public static String getPalindrome1(String str) {
        if (str == null || str.length() < 2) {
            return str;
        }
        char[] chas = str.toCharArray();
        int[][] dp = getDP(chas);
        char[] res = new char[chas.length + dp[0][chas.length - 1]];
        int i = 0;
        int j = chas.length - 1;
        int resl = 0;
        int resr = res.length - 1;
        while (i < j) {
            if (chas[i] == chas[j]) {
                res[resl++] = chas[i++];
                res[resr--] = chas[j--];
            } else if (dp[i][j - 1] < dp[i + 1][j]) {
                res[resl++] = chas[j];
                res[resr--] = chas[j--];
            } else {
                res[resl++] = chas[i];
                res[resr--] = chas[i++];
            }
        }
        return String.valueOf(res);
    }

    /**
     * 括号字符串的有效性和最长有效长度
     * <p>
     * 题目：给定一个字符串str 判断是不是整体有效的括号字符串
     * <p>
     * 补充题目：给定一个括号字符串str 返回最长的有效括号子串
     */
    public static boolean isValid(String str) {
        if (str == null || str.equals("")) {
            return false;
        }
        char[] chas = str.toCharArray();
        int status = 0;
        for (int i = 0; i < chas.length; i++) {
            if (chas[i] != ')' && chas[i] != '(') {
                return false;
            }
            if (chas[i] == ')' && --status < 0) {
                return false;
            }
            if (chas[i] == '(') {
                status++;
            }
        }
        return status == 0;
    }

    public static int maxLength(String str) {
        if (str == null || str.equals("")) {
            return 0;
        }
        char[] chas = str.toCharArray();
        int[] dp = new int[chas.length];
        int pre = 0;
        int res = 0;
        for (int i = 1; i < chas.length; i++) {
            if (chas[i] == ')') {
                pre = i - dp[i - 1] - 1;
                if (pre >= 0 && chas[pre] == '(') {
                    dp[i] = dp[i - 1] + 2 + (pre > 0 ? dp[pre - 1] : 0);
                }
                res = Math.max(res, dp[i]);
            }
        }
        return res;
    }

    /**
     * 公共字符串求值
     * <p>
     * 题目：给定一个字符串str str是一个公式 公式里可能有整数、加减乘除符号和左右括号 返回公式的计算结果
     * <p>
     * 说明：1. 可以认为给定的字符串一定是正确的公式 也就是不需要对str做公式有效性检查
     * 2. 如果是负数 就需要用括号括起来 但是如果负数作为公式的开头或括号部分的开头 则可以没有括号
     */
    public static int getValue(String exp) {
        return value(exp.toCharArray(), 0)[0];
    }

    private static int[] value(char[] chas, int i) {
        Deque<String> deq = new LinkedList<>();
        int pre = 0;
        int[] bra = null;
        while (i < chas.length && chas[i] != ')') {
            if (chas[i] >= '0' && chas[i] < '9') {
                pre = pre * 10 + chas[i++] - '0';
            } else if (chas[i] != '(') {
                addNum(deq, pre);
                deq.addLast(String.valueOf(chas[i++]));
                pre = 0;
            } else {
                bra = value(chas, i + 1);
                pre = bra[0];
                i = bra[1] + 1;
            }
        }
        addNum(deq, pre);
        return new int[]{getNum(deq), i};
    }

    private static int getNum(Deque<String> deq) {
        int res = 0;
        boolean add = true;
        String cur = null;
        int num = 0;
        while (!deq.isEmpty()) {
            cur = deq.pollFirst();
            if (cur.equals("+")) {
                add = true;
            } else if (cur.equals("-")) {
                add = false;
            } else {
                num = Integer.valueOf(cur);
                res += add ? num : (-num);
            }
        }
        return res;
    }

    private static void addNum(Deque<String> deq, int num) {
        if (!deq.isEmpty()) {
            int cur = 0;
            String top = deq.pollLast();
            if (top.equals("+") || top.equals("-")) {
                deq.addLast(top);
            } else {
                cur = Integer.valueOf(deq.pollLast());
                num = top.equals("*") ? (cur * num) : (cur / num);
            }
        }
        deq.addLast(String.valueOf(num));
    }

    /**
     * 找到字符串的最长无重复字符子串
     * <p>
     * 题目：给定一个字符串str 返回str的最长无重复字符子串的长度
     */
    public static int maxUnique(String str) {
        if (str == null || str.equals("")) {
            return 0;
        }
        char[] chas = str.toCharArray();
        int[] map = new int[256];
        for (int i = 0; i < 256; i++) {
            map[i] = -1;
        }
        int len = 0;
        int pre = -1;
        int cur = 0;
        for (int i = 0; i != chas.length; i++) {
            pre = Math.max(pre, map[chas[i]]);
            cur = i - pre;
            len = Math.max(len, cur);
            map[chas[i]] = i;
        }
        return len;
    }

    /**
     * 最小包含子串的长度
     *
     * 题目：给定字符串str1和str2 求str1的子串中含有str2所有字符的最小子串长度
     *
     */

}
