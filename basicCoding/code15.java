// ls in java in a range

public class code15 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(arr, 0, 7, 2));
    }

    public static int binarySearch(int[] arr,int intval,int finalval,int target){
        while(intval<=finalval){ // base case condn helps us to traverse both the ends of our array..
        int mid = (intval+finalval)/2;
        if(mid>target){
            finalval=mid-1; // reducing arr size
        }
        else if(mid<target){
            intval=mid+1; // reducing arr size
        }
        else if(mid == target){
            return target;
        }
    }
    return -1; // if elemnt nt found;
}
}