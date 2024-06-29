import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int answer = 0;

        while (num > 0) {
            int rem = num % 10;
            answer = answer * 10 + rem;
            num/=10;
        }

        System.out.println(answer);
    }
}
