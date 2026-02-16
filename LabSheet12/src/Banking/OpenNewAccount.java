package Banking;

import java.io.*;
import java.util.Scanner;

public class OpenNewAccount  extends BankAccount{
    public OpenNewAccount(String accId, double accbalance){
        super(accId,accbalance);
    }
    public String recordAccount() {
        if (isExistingAccount(getAccId())){
            return "This account has been created!!";
        }
        try {
            FileWriter fileWriter = new FileWriter(getFilename(),true);
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return "Created account success!!";
    }
    public boolean isExistingAccount(String account_name){
        try {
            File filename = new File(getFilename());
            if (!filename.exists()) return false;
            Scanner scanner = new Scanner(new FileReader(filename));
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] data = line.split(",");
                if (data[0].equals(getAccId())){
                    scanner.close();
                    return true;
                }
            }
        }catch (Exception e){
            return false;
        }
        return false;
    }
}
