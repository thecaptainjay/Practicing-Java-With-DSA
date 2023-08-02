import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        sum();
//        int ans = sum2();
//        System.out.println(ans);
        int ans = sum3(20, 30);
        System.out.println(ans);
    }
// using parameters :
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }

    // return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);

        int num1, num2, sum;

        System.out.print("enter num 1 : ");
        num1 = in.nextInt();
        System.out.print("enter num 2 : ");
        num2 = in.nextInt();
        sum = num2 + num1;
        return sum;
    }
   static void sum(){
        Scanner in = new Scanner(System.in);

        int num1, num2, sum;

        System.out.print("enter num 1 : ");
        num1 = in.nextInt();
        System.out.print("enter num 2 : ");
        num2 = in.nextInt();
        sum = num2 + num1;
        System.out.print("sum : " + sum);
    }
    /*
         return_type name (){
            //body
            return statement;
        }

     */
}
