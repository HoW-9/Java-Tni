package Banking;

public class AccountTransaction extends BankAccount {
    public AccountTransaction(String accId){
        super(accId,0.0);
    }
    public boolean hasAccountId(){
        return false;
    }
}
