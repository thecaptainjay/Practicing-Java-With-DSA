public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;
//        swap(10, 20);

//        System.out.println(a + " " + b);

        String name = "jay gohil";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String name) {
        name = "jordan";
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;


    }
}
