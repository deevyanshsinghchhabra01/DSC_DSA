// ARRAY AND ARRAY LIST
/*1d array */
import java.util.Arrays;

class code9{
    public static void main(String[] args) {
        int[] arr/*this is just the declaration part */ = new int[5];/*here actuall obj is created in heap memory */
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=1;
          
            
        }
        System.out.println(arr); // when we print arr it prints adress of 5 blocks crated in heap arr is just pnting to blocks in heap
        System.out.println(arr[0]+","+arr[1]);

        int[] intArr = new int[5];// output{0,0,0,0,0}
        System.out.println(intArr[0]);
        String[] strArr = new String[5];// output{null,null,null,null,null}
        System.out.println(strArr[0]);
        
        String str = null; // null can be assigned to non prem only 
         /* int a = null */ // will give error
/*
 intArr (Integer Array):
When you create an array of integers (like int[] intArr = new int[5];), Java initializes all the elements to their default value.
For primitive data types like int, the default value is 0.
So, when you access intArr[0], it contains the default value of 0.

strArr (String Array):

When you create an array of reference types (like String[] strArr = new String[5];), Java initializes all the elements to null.
Reference types include objects (like String) and arrays.
Since String is an object type, its default value is null.
Therefore, when you access strArr[0], it contains null.
 */

    int [] aRr2 = new int[3];
    aRr2[0]=1;
    aRr2[1]=2;
    aRr2[2]=3;
    // printing this array using enhanced for loop

    for(int num : aRr2){
        System.out.print(num +" ");
    }
    System.out.println();
    // USING .toString
    
    System.out.println(Arrays.toString(aRr2));
    
    // int arr is array of premitives 

    /*lets take arr of obj*/
    
    String[] str1 = new String[2];
    str1[0]="a";
    str1[1]="b";
    System.out.println(Arrays.toString(str1));
 
    }
}