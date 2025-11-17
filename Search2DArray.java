// Search for Maximum, Minimum element and target element in the 2D array.

import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {10,34,32,12,22,},
                {9,8},
                {5,6,7}
        };
        int target = 32;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));

        int max = searchMaximum(arr);
        System.out.println(max);

        int min = searchMinimum(arr);
        System.out.println(min);

    }

    //This function searches the target element in the 2D array

    static int[] search(int[][] arr,int target){               // here i = row
        for(int i = 0;i<arr.length;i++){                        // j = column
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    //This function search the Maximum element in the 2D array

    static int searchMaximum(int[][] arr){
        int max = arr[0][0];
        for(int i = 1;i<arr.length;i++){
            for(int j = 1;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    //This function search the Minimum element in the 2D array

    static int searchMinimum(int[][] arr){
        int min = arr[0][0];
        for(int i = 1;i<arr.length;i++){
            for(int j = 1;j<arr[i].length;j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
}