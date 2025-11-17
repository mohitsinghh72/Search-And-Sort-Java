public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int ans = search(arr,25);
        System.out.println(ans);
    }

    // function for search in the linear array

    static int search(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                System.out.println("found");
                return i;                           // returns the index of target element if found.
            }
        }                                           // I use -1 because index cannot be -1
        return -1;                                  // return -1 is target element is not found
    }
}

