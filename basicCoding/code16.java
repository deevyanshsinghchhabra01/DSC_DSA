// searching in 2d array

public class code16 {
    public static void main(String[] args) {
        int[][] arr={
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12}
        };
        int target = 100                                                                                            ;
        System.out.println(searh(arr, target));
    }

    public static int searh(int[][] arr,int target){
        
        if(arr.length == 0){
            return -1;
        }
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[i].length-1;j++){
                if(arr[i][j] == target){
                    return target;
                }
            }

        }
        return -1;
    }
}
