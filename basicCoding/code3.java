// displaying week day and week end using switch cases
import java.util.*;
public class code3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
     int dayno = in.nextInt();
    switch (dayno) {  // IN THIS CODE IF U TYPE ANYTHING FROM 1-5 U WILL GET WEEKDAY AS BREAK IS APPLEIED AFTER 5 // so older switch syntax is better for these type of cases
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            System.out.println("WEEKDAY");
            break;
        case 6:
        case 7:
            System.out.println("WEEK END");
            break;
    }
  }  
}
