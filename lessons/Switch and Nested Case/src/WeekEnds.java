import java.util.Scanner;

public class WeekEnds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        switch (num) {
            case 1, 2, 3, 4, 5 -> System.out.println("Week Days");
            case 6, 7 -> System.out.println("Week Ends");
            default -> System.out.println("Invalid");
        }
    }
}
