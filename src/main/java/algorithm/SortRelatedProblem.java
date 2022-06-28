package algorithm;


import common.ArrayUtil;

/**
 * 排序相关的问题
 * <p>
 * 问题：选择排序 为啥定义一个变量 数组元素就是没有被交换呢
 * <p>
 */
public class SortRelatedProblem {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 1, 3,-1};
        int[] res = heapSort(arr);
        System.out.println(res);
    }

    /**
     * 1.插入排序
     */
    public static void insertSort(int[] arr) {
        //数组为空或者只有一个数字时返回
        if (arr == null || arr.length < 2)
            return;
        //定义temp来保存当前的数
        int temp = 0;
        int j;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            for (j = i - 1; j >= 0; j--) {

                if (temp < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    //遇到比temp小的数时跳出当前循环
                    break;
                }
            }
            //j位置的数即为比temp小的数，因此插到后一位
            arr[j + 1] = temp;
        }
    }


    /**
     * 2.选择排序
     * <p>
     * 思路：两层循环
     * <p>
     * 1.外层循环：控制遍历的次数 每次只排序好一个位置
     * 2.内层循环：从数组中选择比当前位置还小的元素进行替换
     */
    public static int[] selectedSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    ArrayUtil.swap(arr, i, j);
                }
            }
        }
        return arr;
    }

    /**
     * 3.归并排序
     */
    public static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    //两路归并算法，两个排好序的子序列合并为一个子序列
    private static void merge(int[] a, int left, int mid, int right) {
        int[] tmp = new int[a.length];//辅助数组
        int p1 = left, p2 = mid + 1, k = left;//p1、p2是检测指针，k是存放指针

        while (p1 <= mid && p2 <= right) {
            if (a[p1] <= a[p2])
                tmp[k++] = a[p1++];
            else
                tmp[k++] = a[p2++];
        }

        while (p1 <= mid) tmp[k++] = a[p1++];//如果第一个序列未检测完，直接将后面所有元素加到合并的序列中
        while (p2 <= right) tmp[k++] = a[p2++];//同上

        //复制回原素组
        for (int i = left; i <= right; i++)
            a[i] = tmp[i];
    }

    /**
     * 4.冒泡排序
     * <p>
     * 思路：两层循环
     * 1.外层循环控制遍历次数
     * 2.内存循环进行每次数据的比较和交换
     */
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    ArrayUtil.swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    /**
     * 5.堆排序
     */
    public static int[] heapSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }
        for (int i = arr.length - 1; i > 0; i--) {
            //从尾部进行交换和堆的调整，尾部位置和头节点进行交换；
            ArrayUtil.swap(arr, 0, i);
            //0-i 位置进行堆的调整，所以i可以定义为size;
            heapify(arr, 0, i);
        }
        return arr;
    }

    private static void heapInsert(int[] arr, int i) {
        int parent = 0;
        while (i != 0) {
            parent = (i - 1) / 2;
            if (arr[parent] < arr[i]) {
                ArrayUtil.swap(arr, parent, i);
                i = parent;
            } else {
                break;
            }
        }
    }

    private static void heapify(int[] arr, int i, int size) {
        //相当于树的左子树；
        int left = i * 2 + 1;
        //相当于数的右子树；
        int right = i * 2 + 2;
        //指向最大值的节点，当前指向0位置；
        int largest = i;
        while (left < size) {
            if (arr[left] > arr[i]) {
                largest = left;
            }
            if (right < size && arr[right] > arr[largest]) {
                largest = right;
            }
            if (largest != i) {
                ArrayUtil.swap(arr, largest, i);
            } else {
                break;
            }
            i = largest;
            left = i * 2 + 1;
            right = i * 2 + 2;
        }
    }


    /**
     * 6.快速排序
     */
    public static int[] quickSort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        quickSort(arr, left, right);
        return arr;
    }

    private static void quickSort(int[] arr, int left, int right) {
        int i, j, temp, t;
        if (left > right) {
            return;
        }
        i = left;
        j = right;
        //temp就是基准位
        temp = arr[left];
        while (i < j) {
            //先看右边 依次往左递减
            while (temp <= arr[j] && i < j) {
                j--;
            }
            //再看左边 依次往右递增
            while (temp >= arr[i] && i < j) {
                i++;
            }
            //如果满足条件则交换
            if (i < j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        //最后将基准与i和j相等位置的数字交换
        arr[left] = arr[i];
        arr[i] = temp;
        quickSort(arr, left, j - 1);
        quickSort(arr, j + 1, right);
    }


    /**
     * 7.基数排序
     */


    /**
     * 8.希尔排序
     */


}
