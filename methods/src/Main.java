import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Q : take a input of two numbers and print the sum?
        Scanner in = new Scanner(System.in);

        int num1, num2, sum;

        System.out.print("enter num 1 : ");
        num1 = in.nextInt();
        System.out.print("enter num 2 : ");
        num2 = in.nextInt();
        sum = num2 + num1;
        System.out.print("sum : " + sum);
    }
}