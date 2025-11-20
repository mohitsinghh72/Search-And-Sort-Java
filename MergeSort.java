package JAVA_BASICS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {34,2,46,33,22,1};
        int[] ans = sort(arr);
        System.out.println(Arrays.toString(ans));
        sort2(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static int[] sort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length /2;

        int[] left = sort(Arrays.copyOfRange(arr,0,mid));
        int[] right = sort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    static int[] merge(int[] first,int[] second){
        int[] mix = new int[first.length+second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }

    // Second approach

    static void sort2(int[] arr,int s, int e){
        if(e-s == 1){
            return;
        }
        int mid = (s+e) /2;

        sort2(arr,s,mid);
        sort2(arr,mid,e);

        merge2(arr,s,mid,e);
    }

    static void merge2(int[] arr,int s,int mid, int e){
        int[] mix = new int[e-s];

        int i = s;
        int j = mid;
        int k = 0;

        while(i<mid && j<e){
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l = 0; l<mix.length;l++){
            arr[s+l] = mix[l];
        }
    }
}