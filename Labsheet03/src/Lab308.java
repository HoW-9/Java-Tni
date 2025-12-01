import java.util.Scanner;

public class Lab308 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many number to input: ");
        int n = scan.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int even_count = 0;
        int odd_count = 0;
        for (int i = 1; i<=n; i++){
            System.out.print("Enter number " + i + ": ");
            int num = scan.nextInt();

            if (num > max) max= num;
            if (num < min) min= num;
            if (num % 2 == 0) even_count++;
            else odd_count++;
        }
        System.out.println("Maximm number = " + max);
        System.out.println("Minimum number = " + min);
        System.out.println("Total Even numbers = " + even_count);
        System.out.println("Total odd numbers = " + odd_count);
    }
}
