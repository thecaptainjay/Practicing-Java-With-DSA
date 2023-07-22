import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empId = in.nextInt();
        String department = in.next();
// better way to write :
        switch (empId) {
            case 1 -> System.out.println("Jay Gohil");
            case 2 -> System.out.println("Madhav Sharma");
            case 3 -> {
                System.out.println("Emp number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Invalid EmpId");
        }

//        switch (empId){
//            case 1:
//                System.out.println("Jay Gohil");
//                break;
//            case 2:
//                System.out.println("Madhav Sharma");
//                break;
//            case 3:
//                System.out.println("Emp number 3");
//                switch (department){
//                    case "IT":
//                        System.out.println("IT department");
//                        break;
//                    case "Management":
//                        System.out.println("Management Department");
//                        break;
//                    default:
//                        System.out.println("No department entered");
//
//                }
//                break;
//            default:
//                System.out.println("Invalid EmpId");
//        }
    }
}
