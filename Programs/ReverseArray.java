package Programs;

public class ReverseArray {
  public static void main(String[] args) {
    System.out.println(method2(20,30,400));
    int [] array = {2,3,4,5,6,9,5};
    reverseArray(array);
    reverseArr(array);

  }

  public static int method2(int num1,int num2, int num3){
    return num1+num2+num3;

  }

  static void reverseArray(int arr[]){
    int n = arr.length;
    int arry[] = new int[arr.length];
    for(int i=0; i<n;i++){
      arry[i] = arr[n-i-1];
    }
    for( int i : arry) {
      System.out.print(i+" ");
    }
    System.out.println(" ");
  }

  static void reverseArr(int[] arr){
    int n = arr.length;
    for(int i=n-1;i>-1;i--){
      System.out.print(arr[i]+" ");
    }
    System.out.println(" ");

  }

  static void tampe(int [] arr){

  }

}
