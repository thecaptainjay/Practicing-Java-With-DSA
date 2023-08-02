public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
//            int a = 100; // you cant initialize it inside block.
            a = 100; // but you can change it.
            int c = 202;
            System.out.println(a);
        }
//        c = 21; // you cant change value of which is initialized inside block or loop.
        int c = 21; // but you can re-initialize it.

        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            // same goes for loops.
            int d =212;
            c = 543;


        }

    }
}
