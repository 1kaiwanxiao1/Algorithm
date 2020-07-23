package sort;

import java.util.Arrays;

/**
 * @program: Algorithm
 * @description: 选择排序  时间复杂度： O(n^2)
 * 核心思想： 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
 * 然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 * 以此类推，直到所有元素均排序完毕。
 * @author: Daq
 * @create: 2020-07-23 11:29
 **/

@SuppressWarnings("all")
public class SelectionSort {
    public static int[] Sort(int[] arr) {
        int min_index;
        for (int i = 0; i < arr.length - 1; i++) {
            min_index = i;
            for (int j = i + 1; j < arr.length; j++) { //每次扫描选择最小项
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
                if (min_index != i) { //找到最小项交换，即将这一项移到列表中的正确位置
                    arr[min_index] ^= arr[i];
                    arr[i] ^= arr[min_index];
                    arr[min_index] ^= arr[i];
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,8,9,6,3,7,2};
        System.out.println(Arrays.toString(Sort(arr)));
    }
}
