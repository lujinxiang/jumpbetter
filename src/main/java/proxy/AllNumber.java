package proxy;

import java.util.ArrayList;
import java.util.Arrays;

public class AllNumber {
    public static void main(String[] args) {
        String x = "abcd";
        AllNumber a = new AllNumber();
        char[] array = a.toArray(x);
        ArrayList<String> sort3 = a.sort3(array, 0);
        System.out.println(sort3.size());
        System.out.println(sort3);
    }
    // 交换法
    public char[] toArray(String x) {							//将字符串转换为字符数组
        char[] arr = x.toCharArray();
        Arrays.sort(arr);
        return arr;
    }

    ArrayList<String> res = new ArrayList<String>();					//定义一个全局变量来存放所有排列情况

    public ArrayList<String> sort3(char[] arr, int k) {
        if (k == arr.length) {
            res.add(new String(arr));
        }
        for (int i = k; i < arr.length; i++) {					//每次都循环遍历每一个未被遍历过的数
            swap(arr, k, i);									//将第i号位上的值和k号位上的值交换

            sort3(arr, k + 1);									//从k+1号位开始调用递归，知道遍历完所有数

            swap(arr, i, k);									//回溯，将字符串复原
        }
        return res;

    }

    public void swap(char[] arr, int k, int i) {				//交换位置
        char temp = arr[k];
        arr[k] = arr[i];
        arr[i] = temp;
    }
}
