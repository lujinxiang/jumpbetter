package common;

public class ArrayUtil {
    /**
     * 数组中两个元素进行交换
     *
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 获取测试的arr数组
     *
     * @return
     */
    public static int[] getArrayInstance() {
        int[] arr = new int[]{3, 1, 5, 68, 7, 8, 9, 2};
        return arr;
    }

    /**
     * 数组的遍历
     */
    public static void recursiveArray(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void recursiveArray2(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
