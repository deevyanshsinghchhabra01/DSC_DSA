import java.util.Arrays;

public class code7 {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4};
        arrChange(arr);
        System.out.println(Arrays.toString(arr));

    } // THIS IS ONLY CALLED CALL BY VAlue and java follows it never follow call by refresnce
    static void arrChange(int[] nums){
        nums[0]=99;  // basically nums and arr both point to same obj in heap memory and making change through any of the ref variable either nums or arr complete array would be modified as they both r pting to same obj and in code6 we basically created a new String ..
    }
}
