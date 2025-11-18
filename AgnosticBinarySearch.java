
//Binary search for Agnostic (we don't know about the array. Array can be ascending or descending.
// I have write two different function which used for the same output but writing of function is different.

public class AgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {50, 40, 30, 20, 10};
        int target = 40;
        int ans = searchAgnostic2(arr,target);
        System.out.println(ans);

    }

    // Function 1 for the agnostic binary search

    static int searchAgnostic(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        if(arr[start]<arr[end]){
            while(start <= end){
                int mid = start+(end-start)/2;
                if(target > arr[mid]){
                    start = mid+1;
                }
                else if(target < arr[mid]){
                    end = mid-1;
                }else{
                    return mid;
                }
            }
        }else{
            while(start <= end){
                int mid = start + (end-start)/2;
                if(target > arr[mid]){
                    end = mid-1;
                }
                else if(target < arr[mid]){
                    start = mid+1;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }

    // Function 2 for the agnostic binary search

    static int searchAgnostic2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start]<arr[end];

        while(start<=end){
            int mid = start +(end-start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target < arr[mid]){
                    start = mid+1;
                } else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}