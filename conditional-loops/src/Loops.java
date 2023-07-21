import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//     Q:   print numbers from 1 to  5
        /*
        syntax of for loops:

        for (initialisation; condition; increment/decrement) {
        body
        }

         */

//        for (int num = 1; num <= 5; num += 1){
//            System.out.println(num);
//        }

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        for (int num = 1; num <= n; num += 1){
//            System.out.println("hello jay" + num);
//        }

        /*
        syntax of while loop:
        while (condition){
        body
        }
         */

//        for (int num = 1; num <= 5; num += 1){
//            System.out.println(num);
//        }

        int num = 1;
        while (num <= 7){
//            System.out.println(num);
            num+=1;
        }
/*
    syntax of do while loop:

        do {

        } while (condition);
        it will execute at least once...
 */
//        int n =1;
//        do {
//            System.out.println(n);
//            n++;
//        } while (n <= 5);

        int n = 1;
        do {
            System.out.println("hello world");

        } while (n != 1);
    }
}
