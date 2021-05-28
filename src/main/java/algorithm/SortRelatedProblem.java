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
        int[] arrayInstance = ArrayUtil.getArrayInstance();
        ArrayUtil.recursiveArray(arrayInstance);
        heapSort(arrayInstance);
        ArrayUtil.recursiveArray(arrayInstance);
    }

    /**
     * 1.插入排序
     */
    public static int[] insertSort(int[] arr) {

        return null;
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
            ArrayUtil.swap(arr, 0, i);
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
        int left = i * 2 + 1;
        int right = i * 2 + 2;
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
        int tempLeft = left;
        int tempRight = right;
        while (left < right) {
            while (left < right) {
                if (arr[right] < arr[left]) {
                    int temp = arr[left];
                    arr[right] = arr[left];
                    arr[left] = temp;
                    right--;
                }
                break;
            }
            while (left < right) {
                if (arr[left] > arr[left]) {
                    ArrayUtil.swap(arr, left, right);
                    left++;
                }
                break;
            }
        }
        int tempMid = (tempLeft + tempRight) / 2;
        quickSort(arr, tempLeft, left);
        quickSort(arr, tempMid + 1, tempRight);
    }


    /**
     * 7.基数排序
     */

}
