package Banking;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AccountTransaction extends BankAccount implements Transactionable {

    public AccountTransaction(String accId) {
        super(accId);
    }

    public boolean hasAccountId() {
        File file = new File(getFilename());
        if (!file.exists()) return false;

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.startsWith(this.getAccId() + ",")) {
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            return false;
        }
        return false;
    }

    @Override
    public void deposit(double amount) {
        setAccBalance(getAccBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (getAccBalance() >= amount) {
            setAccBalance(getAccBalance() - amount);
        }
    }

    @Override
    public double checkBalance() {
        return getAccBalance();
    }
}