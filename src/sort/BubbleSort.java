package sort;

import java.util.Arrays;

/**
 * @program: Algorithm
 * @description: 冒泡排序  时间复杂度： O(n^2)
 * @author: Daq
 * @create: 2020-07-23 10:19
 **/

public class BubbleSort {

    private static int[] sort(int[] array) {

        // 最后一次交换的下标
        int lastSwapIndex = 0;
        // 如果后面的部分元素是有序的，但是还会继续比较，定义一个无序数组的边界，每次比较到此为止
        int arrBoundary = array.length - 1;

        for (int i = 0; i < array.length - 1; i++) {
            // 增加判断位，有序标记，每一轮的初始是true
            boolean flag = true;
            for (int j = 0; j < arrBoundary; j++) {
                // 找最小数，如果前一位比后一位大，则交换位置
                if (array[j] > array[j + 1]) {
                    //可以用异或的操作交换两个元素，不需要创建第三个变量，减少内存开销。
                    array[j + 1] ^= array[j];
                    array[j] ^= array[j + 1];
                    array[j + 1] ^= array[j];
                    // 有元素交换，所以不是有序，标记变为false
                    flag = false;
                    // 最后一次交换元素的位置
                    lastSwapIndex = j;
                }
            }
            // 把最后一次交换元素的位置赋值给无序数组的边界
            arrBoundary = lastSwapIndex;
            // 说明上面内层for循环中，没有交换任何元素，直接跳出外层循环
            if (flag) {
                break;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,8,9,6,3,7,2};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
