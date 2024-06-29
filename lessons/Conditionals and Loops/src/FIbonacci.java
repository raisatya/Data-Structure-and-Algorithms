import java.util.Scanner;

public class FIbonacci {
    public static void main(String[] args) {
        System.out.print("Please provide the index number: ");

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int a = 0;
        int b = 1;
        int sum = a + b;
        int count = 3;

        while (count < num) {
            int temp = sum;
            sum += b;
            b = temp;
            count++;
        }

        if(num== 1) System.out.println(a);
        else System.out.println(sum);
    }
}
