import java.util.Scanner;

public class CountDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = sc.nextInt();
        System.out.println("\nPlease enter the digit to search: ");
        int digit = sc.nextInt();
        int count=0;
        while (num>0) {
            int rem = num % 10;
            if(rem == digit) {
                count++;
            }
            num/=10;
        }

        System.out.println(count);
    }
}
