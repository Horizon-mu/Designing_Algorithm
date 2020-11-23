package com;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Horizon~muu
 * @Date: 2020/11/17/9:10
 * @Description:
 */
public class Sort {
    public static void main(String[] args) {
        int[] array = {2,3,5,1,4,8};
        insertionSort(array);
    }
    public static void bubbleSort(int[] array){
        int val ;
        if (array.length == 0)
            return ;
        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j + 1 < array.length; j++){
                if (array[j] > array[j+1]){
                    val = array[j];
                    array[j] = array[j+1];
                    array[j+1] = val;
                }
            }
        }
        for (int a : array){
            System.out.print(a);
        }
        System.out.println();
    }

    public static void selectionSort(int[] array){
        if (array.length == 0){
            System.out.println("数组为空");
            return;
        }
        for(int i = 0; i < array.length; i++){
            int minIndex = i;
            for (int j = i; j < array.length; j++){
                if (array[i] > array[j]){
                    minIndex = j;
                }
            }
            int val = array[i];
            array[i] = array[minIndex];
            array[minIndex] = val;
        }
        for (int a : array){
            System.out.print(a);
        }
        System.out.println();
    }

    public static void insertionSort(int[] array){
        if (array.length == 0){
            System.out.println("数组为空");
            return;
        }
        int j;
        for (int i = 1; i < array.length; i++){
            int temp = array[i];
            for ( j = i; j > 0 && array[j-1] > temp; j--){
                array[j] = array[j-1];
            }
            array[j] = temp;
        }
        for (int a : array){
            System.out.print(a);
        }
    }
}
