
// swith cases enhanced syntax
import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" pls enter fruit of ur choise");
        String fruit = in.next();
        switch (fruit) {
            case "Mango" -> System.out.println("king of fruits"); // new syntax of switch and main advantage of this is break is automatically applys so over all to provide u with a hastle free coding experience
            case "apple" -> System.out.println(" a sweet red fruit");
            default -> System.out.println("pls enter a valid fruit");
                
        }
    }
}