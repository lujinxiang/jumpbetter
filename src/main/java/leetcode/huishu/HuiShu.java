package leetcode.huishu;

import java.util.ArrayList;
import java.util.List;

/**
 * 回溯相关问题
 */
public class HuiShu {


    public static void main(String[] args) {

    }


    /**
     * 求解abc的所有排列组合数并列出来
     */

    public static List<String> combine(String str) {

        int index = 0;
        //dfs(index, str.toCharArray());
        return null;
    }

    private static void dfs(int index, boolean[] used,List<String> res,char[] toCharArray) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(toCharArray[index]);
        if (index == toCharArray.length - 1) {
            res.add(stringBuilder.toString());
        }
        used[index]=true;
        dfs(index++,used,res,toCharArray);
        used[index]=false;
    }


    /**
     * 给定一个仅包含数字2-9的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
     * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
     *
     * @param digits
     * @return
     */

    public static List<String> letterCombinations(String digits) {
        if (digits.length() < 0 || digits.length() > 4) {
            return new ArrayList<>();
        }
        char[] chars = digits.toCharArray();
        for (char temp : chars) {
            if (!('2' < temp && temp < '9')) {
                return new ArrayList<>();
            }
        }

        return null;
    }


}
