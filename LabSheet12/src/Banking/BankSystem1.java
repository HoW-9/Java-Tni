package Banking;

import java.util.Scanner;

public class BankSystem1 {

    public static String input_account_id() {
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.print("Enter account id: ");
            id = sc.nextLine();
            if (id.length() == 10) {
                return id;
            }
        }
    }

    public static double input_initial_balance() {
        Scanner sc = new Scanner(System.in);
        double balance;
        System.out.println();
        while (true) {
            System.out.print("Enter your initial deposit amount: ");
            try {
                String input = sc.nextLine();
                balance = Double.parseDouble(input);
                return balance;
            } catch (NumberFormatException e) {
                System.out.print("Try again!! ");
            }
        }
    }

    public static void main(String[] args) {

        String account_bank = input_account_id();

        double initial_balance = input_initial_balance();
        System.out.println("");

        OpenNewAccount account = new OpenNewAccount(account_bank, initial_balance);
        String result = account.recordAccount();

        System.out.println(result);
    }
}