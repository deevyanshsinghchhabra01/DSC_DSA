// replacing code 3 with enhanced witch
import java.util.*;
public class code4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dayno = in.nextInt();  // code is becoming much cleaner by using enhanced witch
          switch(dayno){
         case 1,2,3,4,5 -> System.out.println("weekday");
          case 6,7 -> System.out.println("WEEK END");}
    }
}
