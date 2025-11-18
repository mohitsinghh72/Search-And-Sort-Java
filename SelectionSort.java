package JAVA_BASICS;

//Selection sort

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {34,32,55,1,23,77};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] arr){
        for(int i = 0; i<arr.length;i++){
            int last = arr.length-1-i;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static int getMaxIndex(int[] arr,int start,int last){
        int max = start;

        for(int i = start;i<=last;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}