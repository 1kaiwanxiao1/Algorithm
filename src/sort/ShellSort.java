package sort;

import java.util.Arrays;

/**
 * @program: Algorithm
 * @description: 希尔排序  时间复杂度： O(n^2)
 * @author: Daq
 * @create: 2020-07-23 11:42
 **/

@SuppressWarnings("all")
public class ShellSort {
    public static void Sort(int[] arrays){
        if(arrays == null || arrays.length <= 1){
            return;
        }
        //增量
        int incrementNum = arrays.length/2;
        while(incrementNum >=1){
            for(int i=0;i<arrays.length;i++){
                //进行插入排序
                for(int j=i;j<arrays.length-incrementNum;j=j+incrementNum){
                    if(arrays[j]>arrays[j+incrementNum]){
                        int temple = arrays[j];
                        arrays[j] = arrays[j+incrementNum];
                        arrays[j+incrementNum] = temple;
                    }
                }
            }
            //设置新的增量
            incrementNum = incrementNum/2;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{50,61,60,54,67,34,23,54,23,42};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
