package Programs;

import java.util.HashSet;
import java.util.Set;
import java.util.SplittableRandom;

public class ArraySorted {
    public static void main(String[] args) {
        int arr[] = {1,1, 3,4,5,7,7,8};
        for (int i=1; i < arr.length;i++){
            if(arr[i] >=arr[i-1]){
                System.out.println("True");
            }
            else {
                System.out.println("False");
            }
        }

        Set<Integer> ser = new HashSet<>();
        for (int i=0;i< arr.length;i++){
            ser.add(arr[i]);
        }
        System.out.println(ser);
    }
}
