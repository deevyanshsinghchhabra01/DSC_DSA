
// array list : dynamic array allocation

import java.util.ArrayList;
import java.util.Scanner;

public class code11 {
    public static void main(String[] args) {
        // synatax
        ArrayList<Integer> list = new ArrayList<>(3); // primittives can not be passed we use wrapper classes
        list.add(67);
        list.add(22);
        list.add(33); // array list dynamic because though we hv mentioned initial capacity as 3 but it can be extended to more
        list.add(44); // we are excedding initial capacity that we hv mentioned as 3 but we can add  more
        System.out.println(list);
        System.out.println(list.contains(33));// many operations like these can be applied on list
        list.set(0, 99);// this will change the value at 0th index to 99
        System.out.println(list);
        list.remove(3); // 44 will be removed
        System.out.println(list);

        // taking input in array list
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list2 = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list2.add(sc.nextInt());
        }
        System.out.println(list2);
       // System.out.println(list2.get(8)); // to print value at 8th index

        // multidimensional array list
        ArrayList<ArrayList<Integer>> list3 = new ArrayList<>(); // basically 2d array is nesting of array , so  we hv simply nested a array list inside another array list

        for(int i=0;i<3;i++){
            list3.add(new ArrayList<>());  // basically at every index we r creating a new array list same as we did in 2d array

        }
        // adding elements
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list3.get(i).add(sc.nextInt()); // we r adding elemnts to the array list but and inner loops helps us ki kitne elements dalne hai jaise hmare case mein we can add only 3 elements in each of the 3 array list so we get a 3*3 matrix.
            }
        }
        System.out.println(list3);
        
    }
}
