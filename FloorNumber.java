//Floor = the largest number that is ≤ target


public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 9, 14, 16, 18};
        int ans = floorNumber(arr, 15);
        System.out.println(ans);

    }
    public static int floorNumber(int[] arr,int target){
        if(target<arr[0]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;

            if(target == arr[mid]){
                return arr[mid];
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return arr[end];
    }
}