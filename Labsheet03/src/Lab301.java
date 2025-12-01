import java.util.Scanner;

public class Lab301 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int num = scan.nextInt();
        if (num == 0){
            System.out.print("This is Zero umber: ");
        }
         if (num % 2 == 0){
            System.out.print("This number is Even and ");
        }else {
            System.out.print("This number is Odd and ");
        }if (num > 0){
            System.out.print("Positive number.");
        }else {
            System.out.print("Negative number.");
        }

    }
}
