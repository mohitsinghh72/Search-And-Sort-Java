package JAVA_BASICS;

// Bubble Sort Algorithm
// Bubble sort is a stable sort
// What is stable sort ? When two elements have the same value, they appear in the same order after sorting as they were before sorting.
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,43,23,5,1,6,10};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubbleSort(int[] arr){
        boolean swapped;
        for(int i = 0;i<arr.length;i++){    // if swap did not take place at the first loop that means it is sorted and other swap did not take place
            swapped = false;
            for(int j = 1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];                  //swapping of digits
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){       // break if swap does not take place at first.
                break;
            }
        }
    }
}