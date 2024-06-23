import java.util.*;
public class code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {99,44,33,12,1,0};
        String order = orderIdentifier(arr);
        
        if(order.equals("ascending")){
            System.out.println("Your array is in ascending order");
            System.out.println("Please enter target element:");
            int target = sc.nextInt();
            int result = ascBs(arr, 0, arr.length - 1, target);
            if(result != -1){
                System.out.println("Element found at index: " + result);
            } else {
                System.out.println("Element not found");
            }
        } else if(order.equals("descending")){
            System.out.println("Your array is in descending order");
            System.out.println("Please enter target element:");
            int target = sc.nextInt();
            int result = dscBs(arr, 0, arr.length - 1, target);
            if(result != -1){
                System.out.println("Element found at index: " + result);
            } else {
                System.out.println("Element not found");
            }
        } else if(order.equals("single")){
            System.out.println("Sorry, your array only has a single element, nothing to search for.");
        }

        sc.close();
    }

    public static String orderIdentifier(int[] arr){
        if(arr.length == 1){
            return "single";
        }
        if(arr[0] > arr[arr.length - 1]){
            return "descending";
        } else {
            return "ascending";
        }
    }

    public static int ascBs(int[] arr, int start, int end, int target){
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;  // element not found
    }
    
    public static int dscBs(int[] arr, int start, int end, int target){
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] < target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;  // element not found
    }
}
