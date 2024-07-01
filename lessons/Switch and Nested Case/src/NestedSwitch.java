import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> {
                switch (department) {
                    case "Physics" -> System.out.println("Welcome to Physics Department");
                    case "Chemistry" -> System.out.println("Welcome to Chemistry Department");
                    case "Mathematics" -> System.out.println("Welcome to Mathematics Department");
                    default -> System.out.println("No such department");
                }
            }
            case 2 -> {
                switch (department) {
                    case "Sociology" -> System.out.println("Welcome to Sociology");
                    case "History" -> System.out.println("Welcome to History");
                    default -> System.out.println("No such department");
                }
            }
            default -> System.out.println("No such empId");
        }
    }
}
