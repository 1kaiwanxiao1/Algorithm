package sort;

import java.util.Arrays;

/**
 * @program: Algorithm
 * @description: 插入排序  时间复杂度：O(n^2)
 * @author: Daq
 * @create: 2020-07-23 11:05
 **/
@SuppressWarnings("all")
public class InsertionSort {

    public static int[] Sort(int[] arr) {
        for (int i = 1; i < arr.length; i++){ //循环从第二个数组元素开始，因为arr[0]作为最初已排序部分
            int temp = arr[i]; //temp标记为未排序第一个元素
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) /*将temp与已排序元素从小到大比较，寻找temp应插入的位置*/ {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,8,9,6,3,7,2};
        System.out.println(Arrays.toString(Sort(arr)));
    }

}
