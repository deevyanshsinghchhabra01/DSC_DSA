// HELLO MODIFYING THIS CODE 1


import java.util.*;


public class code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Do u want to exectue");
        String execute = sc.next();
        if (execute.equals("yes")){ 
            // string can never be compared by == always use .equals

                while(true){
                    System.out.println("pls enter operator");
                    char op = sc.next().trim().charAt(0); //.next help to read a word
                    if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                        System.out.println(" pls enter ur two nos u want to perform selected operation on");
                        int a = sc.nextInt();
                        int b = sc.nextInt();
                        if(op == '+'){
                        System.out.println(" u r ans is: "+(a+b));
                        }

                        if(op == '-'){
                            System.out.println("Your answer is: " + (a - b));
                            }
                        
                        if(op == '*'){
                            System.out.println(" u r ans is: "+(a*b));
                            }
                            
                        if(op == '/'){
                            System.out.println(" u r ans is: "+(a/b));
                            }

                        if(op == '%'){
                            System.out.println(" u r ans is: "+(a%b));
                            }
                    }
                  

                    else{
                        System.out.println(" pls enter correct operator");
                    }

                    System.out.println(" Do u want to continue calcluating ");
                    String choice = sc.next();
                    if(choice.equals("yes")){
                        System.out.println("happy to hv u");
                    }
                    else{
                        System.exit(0);
                    }

                }
    }
    else{
        System.out.println(" thanks for visiting");
        System.exit(0);
        }
    }
}
