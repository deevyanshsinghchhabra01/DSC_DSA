// max value in an array
public class code13 {
    public static void main(String[] args) {
        int[] arr={1,6,88,6,100,102,55};
        System.out.println(findMax(arr));
    }
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max = arr[i]; // at every iteration our max will get updated and every next element of array will simply be compared with prev one at starting we could initialize it also max = arr[i] both would do almost same work our method would take jsut one iteration more as otherwise we could start searching from index 1.
            }

        }
        return max;
    }
}
