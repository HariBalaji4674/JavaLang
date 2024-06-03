package oops;

import java.util.Arrays;

public class data {
    public static void main(String[] args) {
        int array[] ={1,2,4,7,9,4,5};
        System.out.println(Arrays.toString(array));
        int largest = array[0];
        int sLargest = -1 ;
        for(int i=0;i<array.length;i++){
            if(array[i] > largest){
                sLargest = largest;
                largest = array[i];
            } else if (array[i] < largest && array[i]>sLargest) {
                largest = array[i];
            }
        }
        System.out.println(largest+" "+sLargest);

    }
}