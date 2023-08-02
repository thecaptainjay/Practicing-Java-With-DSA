public class Shadowing {
    static int x = 90; // this will be shadowed at line 5
    public static void main(String[] args) {
        System.out.println(x);//90
        int x; // scope will began when value is declared.
//        System.out.println(x);
        x = 565;
        System.out.println(x);//565
        fun();
    }
    static void fun(){
        System.out.println(x);//90
    }
}
