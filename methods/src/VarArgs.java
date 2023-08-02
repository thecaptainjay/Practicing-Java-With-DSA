import java.util.Arrays;
// so these are called as Variable Length Arguments.
public class VarArgs {
    public static void main(String[] args) {
        fun( 1, 43, 4, 3, 2, 65, 76, 8);
        multiple(1, 3, "kundan", "jay", "rahul");
    }
    static void fun(int ...v) // you can give multiple inputs.
    {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...c){
        System.out.println(Arrays.toString(c));
    }
}
