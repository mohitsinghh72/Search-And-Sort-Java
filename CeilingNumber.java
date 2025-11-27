
// Ceiling Number = first number that is equal to or greater than the target.

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,5,9,14,16,18};
        int ans = ceiling2(arr,18);
        System.out.println(ans);

    }

//    Liner search

    public static int ceiling(int[] arr,int target){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                return arr[i];
            }
            if(arr[i]>target)
                return arr[i];
        }
        return -1;
    }

    // Binary Search

    public static int ceiling2(int[] arr,int target){
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int last = arr.length-1;

        while(start<=last){
            int mid = start + (last-start)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid]>target){
                last = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return arr[start];
    }
}
