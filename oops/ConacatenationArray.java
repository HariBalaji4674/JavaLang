package oops;

import java.util.Arrays;

public class ConacatenationArray {
  public static void main(String[] args) {

    int nums[] = {3,4,7,9,5,6};
    concat(nums);

  }

  static int[] concat(int[] nums){

     int N = nums.length;
     int nums2[] = new int[2*N];
     System.out.println(Arrays.toString(nums2));
     for(int i=0;i<N;i++){
      nums2[i] = nums[i];
      nums2[i+N] = nums[i];
     }
     System.out.println(Arrays.toString(nums2));

     for(int i=0;i<2*N;i++){
      System.out.print(nums2[i]+" ");
     }
     System.out.println();
    return nums;

  }

}
