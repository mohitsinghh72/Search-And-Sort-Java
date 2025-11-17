// Search for Maximum and Minimum element in the array

public class FindMinMaxElement {
    public static void main(String[] args) {
        int[] arr = {32,55,23,10,324,33,23};
        int ansMin = FindMinimum(arr);              // stored the min element of the array as output
        System.out.println(ansMin);
        int ansMax = FindMaximum(arr);              // stored the max element of the array as output
        System.out.println(ansMax);

    }

    //function for finding minimum element in the array

    static int FindMinimum(int[] arr){
        int min = arr[1];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    //function for finding maximum element in the array

    static int FindMaximum(int[] arr){
        int max = arr[1];
        for(int i=1; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}