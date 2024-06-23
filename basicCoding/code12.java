
// swapping of array
import java.util.Arrays;

public class code12 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        swap(arr1, 0, 4);
        System.out.println(Arrays.toString(arr1));
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
}
}