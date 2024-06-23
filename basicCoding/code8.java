public class code8 {
    public static void main(String[] args) {
        int c=100;
        {
            c=40;  
            /*So, the changes to c inside the block are reflected outside because the block is within the scope of the main method where c is defined. If you want to limit the scope of a variable to a block, you can declare a new variable within that block. */
            System.out.println(c);
            // block scope
            int a =10;
            // inside block u can print a
            System.out.println(a);
        }
        //System.out.println(a); // we can print a as is in the block
        System.out.println(c);

    }
}
