import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
//        greeting();
        Scanner in = new Scanner(System.in);
        System.out.println("enter your name : ");
        String name = in.next();
        String msg = greeting1(name);
        System.out.println(msg);
    }


    static String greeting1(String name){
       String message = "Hello " + name;
        return message;
    }
    static  void greeting(){
        System.out.println("hello jay");
    }
}
