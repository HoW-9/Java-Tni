import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat frm = new DecimalFormat("#,###.#");

        System.out.print("Enter number 1: ");
        double number_1 = scan.nextDouble();

        System.out.print("Enter number 2: ");
        double number_2 = scan.nextDouble();

        System.out.println("\nSummation = "+ frm.format(number_1+number_2)+
                "\nSubtraction = " + frm.format(number_1 - number_2)+
                "\nMultiplication = " +frm.format(number_1 * number_2)+
                "\nDivision = " + frm.format(number_1 / number_2)+
                "\nModulus = " + frm.format(number_1 % number_2));
    }
}
