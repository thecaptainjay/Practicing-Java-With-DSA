public class Overloading {
    public static void main(String[] args) {
//        fun("jay");
       int  ans =  sum(1, 2, 5);
        System.out.println(ans);

    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String x){
        System.out.println(x);
    }

    static int sum(int a, int b){
        return a + b;
    }

    static int sum(int a, int b, int c){
        return a + b + c;
    }
}
