public class code6 {
    public static void main(String[] args) {
        String name = "Kunal";
        changeName(name);  // at this pt both naam and name is pting to kunal but as the funcn executes naam starts pting to rahul that is a new obj created in heap memory other than kunal
        System.out.println(name); // here name would be printing kunal

    }
    public static void changeName(String naam){
        naam="Rahul";
    } //a new change is made and i m commiting this
}
