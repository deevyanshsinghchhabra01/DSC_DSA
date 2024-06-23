// nested switch cases
import java.util.*;
public class code5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empid = in.nextInt();
        String depart = in.next();
        switch (empid) {
            case 1:
                System.out.println("hello Deevyansh Chhabra1");
                break;
            case 2:
            System.out.println("hello Deevyansh Chhabra2");
            break;
            case 3: // when ever a person add something like 3 in emp id we give him facility to know department so adding switch case for empid=3

            System.out.println("hello Deevyansh Chhabra3");
           
                switch (depart) {  // nesteds switch case
                    case "it":
                        System.out.println("hello Deevyansh Chhabra3 u r from it department");
                        break;
                    
                    case "managemet":
                        System.out.println("hello Deevyansh Chhabra3 u r from management department");
                        break;
                    default:
                        System.out.println("pls eneter valid department");
                        break;
                }
        
            break;

            default:
                System.out.println("enter valid empid");
                break;
        }
    }
}
