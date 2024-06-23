import java.util.Arrays;

public class code14 {
    public static void main(String[] args) {
      int[] arr1 ={1,2,3,4};
      revArray(arr1);
      System.out.println(Arrays.toString(arr1));
    }
    static void revArray(int[] arr){
        int j = arr.length-1;
        int k = 0;
        while(k<=j){
       swap(arr, k, j); // k is automatically getiing incremented by 1 by loop
        j--;
        k++;
       }     
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
            