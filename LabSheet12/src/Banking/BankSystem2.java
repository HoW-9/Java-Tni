package Banking;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class BankSystem2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your bank account: ");
        String accIdInput = sc.nextLine();

        AccountTransaction account = new AccountTransaction(accIdInput);

        if (account.hasAccountId()) {

            try (Scanner fileScanner = new Scanner(new File(account.getFilename()))) {
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    String[] data = line.split(",");

                    if (data[0].equals(account.getAccId())) {
                        account.setAccBalance(Double.parseDouble(data[1]));
                        break;
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("Error reading file.");
            }
            System.out.println("\nPress 1 to deposit");
            System.out.println("Press 2 to withdraw");
            System.out.println("Press 3 to check balance");
            System.out.println("Press 4 to exit");

            int menu = 0;

            while (menu != 4) {

                System.out.print("\nEnter a menu: ");
                if (sc.hasNextInt()) {
                    menu = sc.nextInt();

                    if (menu == 1) {

                        System.out.print("Enter amount to deposit: ");
                        double amount = sc.nextDouble();
                        account.deposit(amount);
                        System.out.println("Your balance = " + account.checkBalance());
                    }
                    else if (menu == 2) {

                        System.out.print("Enter amount to withdraw: ");
                        double amount = sc.nextDouble();
                        account.withdraw(amount);
                        System.out.println("Your balance = " + account.checkBalance());
                    }
                    else if (menu == 3) {

                        System.out.println("Your balance = " + account.checkBalance());
                    }
                    else if (menu == 4) {
                    }
                } else {
                    sc.next();
                }
            }
        } else {
            System.out.println("Bank account not found...");
        }
    }
}