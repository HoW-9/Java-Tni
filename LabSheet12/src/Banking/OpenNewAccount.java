package Banking;
import java.io.*;
import java.util.Scanner;

public class OpenNewAccount extends BankAccount {

    public OpenNewAccount(String accId, double accBalance) {
        super(accId, accBalance);
    }

    public String recordAccount() {

        if (isExistingAccount(getAccId())) {
            return "This account has been created!!";
        }

        try (PrintWriter out = new PrintWriter(new FileWriter(getFilename(), true))) {
            out.println(this.toString());
            return "Created account success!!";
        } catch (IOException e) {
            return "Error: " + e.getMessage();
        }
    }

    private boolean isExistingAccount(String account_id) {

        File file = new File(getFilename());
        if (!file.exists()) return false;

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.isEmpty()) continue;
                String[] data = line.split(",");
                if (data[0].equals(account_id)) {
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            return false;
        }
        return false;
    }
}