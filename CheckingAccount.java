
public class CheckingAccount {
    private double balance;
    private String accountNumber;

    public CheckingAccount(String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if (this.balance < amount){
            throw new InsufficientFundsException(amount);
        }else{
            this.balance -= amount;
        }
    }

    public double getBalance(){
        return this.balance;
    }

    public String getNumber(){
        return this.accountNumber;
    }
    
}
