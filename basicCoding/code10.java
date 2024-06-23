// ARRAY AND ARRAY LIST
/*2d array */
import java.lang.reflect.Array;
import java.util.*;
public class code10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // syntax int[][] arr = new int[][];  // specifying rows is mandatory and columnn isnt mandatory

        // creating arrays with variable sizes
        int[][] arr ={
            {1,2,3},
            {4,5},
            {7,8,9}

        };
        System.out.println(arr[1][1]); // will give 5 as output size of each row can be varied

        int[][] aR1 = new int[4][4];

        // taking input

        for(int row=0;row<=aR1.length-1;row++){ // outer loop for taking input for rows  ar1.lenth gives how many arrays or rows
            for(int j=0;j<=aR1[row].length-1;j++){ // we get length of that particular row
                aR1[row][j] = sc.nextInt();
            }
        } 
        System.out.println(aR1);
        // printing array normally
        for(int row=0;row<=aR1.length-1;row++){
            for(int j=0;j<=aR1[row].length-1;j++){ 
                System.out.print(aR1[row][j]+" ");
        }

        System.out.println();
    }
    // printing array with toString method
        for(int k=0;k<=aR1.length-1;k++){
        System.out.print(Arrays.toString(aR1[k]));
        System.out.println();
    }
// codeium copilolt

       
    }
}
