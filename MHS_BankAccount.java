public class MHS_BankAccount extends MHS_Bank{
  public double accountBalance;
  public String accountNumber;

  public MHS_BankAccount (String iAccountNumber, double iAccountBalance){
    accountBalance = iAccountBalance;
    accountNumber  = iAccountNumber;
  }
  public void pay(double price){
    accountBalance = accountBalance - price;
  }
}
