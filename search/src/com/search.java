package com;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Horizon~muu
 * @Date: 2020/11/20/20:34
 * @Description:
 */
public class search {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        /*System.out.println(sequenceSearch(array,4));
        System.out.println(binarySearch(array,4));*/
        //System.out.println(binarySearch2(array,4,0,7));
        System.out.println(InsertionSearch(array,8,0,7));
    }

    public static int sequenceSearch(int[] array, int val){
        for (int i = 0; i < array.length; i++){
            if (array[i] == val)
                return i;
        }
        return -1;
    }


    public static int binarySearch(int[] array, int k){
        int low = 0;
        int high = array.length-1;
        int mid = array.length / 2;
        while(low <= high){
            if (array[mid] == k)
                return mid;
            if (array[mid] > k){
                high = mid - 1;
                mid = (low + high) / 2;
            }else if (array[mid] < k){
                low = mid + 1;
                mid = (low + high) / 2;
            }
        }
        return -1;
    }

    public static int  binarySearch2(int[] array, int k,int low, int high)
    {
        //实现算法2：递归算法
        int mid = (low + high) / 2;
        if (low > high)
            return -1;
        if (array[mid] == k)
            return mid;
        if (array[mid] < k)
            return binarySearch2(array,  k, mid + 1,high);
        if (array[mid] > k)
            return binarySearch2(array,  k, low, mid -1);
        return -1;
    }
    public static int  InsertionSearch(int[] array, int k,int low, int high)
    {
        //插值查找
        int mid = low + (k - array[low]) / (array[high] - array[low])*(high - low);
        if (low > high)
            return -1;
        if (array[mid] == k)
            return mid;
        if (array[mid] < k)
            return binarySearch2(array,  k, mid + 1,high);
        if (array[mid] > k)
            return binarySearch2(array,  k, low, mid -1);
        return -1;
    }
}
