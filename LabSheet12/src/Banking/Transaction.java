package Banking;

public interface Transaction {
    public void deposit(double amount);
    public void withdraw(double amount);
    public double checkBalance();
}
