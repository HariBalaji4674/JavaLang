package Programs;

public class SecondLargest {
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5,6,7,8};
        int max = arr[0];
        int min = -1;
        for(int i = 1; i< arr.length;i++){
            if(arr[i] > max ){
                min = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > min) {
                min = arr[i];
            }
        }
        System.out.println(max + " " + min);
        System.out.println(sortedArray(arr));
    }

    static boolean sortedArray(int[] arr){
        for(int i =1;i<arr.length;i++){
            if(arr[i] >= arr[i-1]){
            }
            else {
                return false;
            }
        }
        return true;
    }
}
