package Recursions;

public class ReverseArray {

  public static void main(String[] args) {
    names(1,5);
    int array[] = {3,7,9,23,87,20};
    System.out.println(maxNumber(array));
  }
  static void names(int i,int n){
    if (i>n){
      return;
    }
    System.out.println("Peddiredddy  "+i+" "+n);
    names(i,n-1);
  }

  static int maxNumber(int array[]){

    int MaxNumber = array[0];
    for(int i = 1;i<array.length;i++){
      if(MaxNumber < array[i]){
        MaxNumber = array[i];
      }
    }
    return MaxNumber;

  }
}



/*
- 1: print name 5 times
- 2: Print Linearly from 1 to N
- 3: Print from N to 1
- 4: Print Linearly from 1 to N by BackTrack
- 5: Print From N to 1 By Back tarck

 */
