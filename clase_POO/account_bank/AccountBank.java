package clase_POO.account_bank;

public class AccountBank {
    private String numberAccount;
    private double balance;
    private String headline;


    public AccountBank(String numberAccount, String headline) {
        this.numberAccount = numberAccount;
        this.balance = 0;
        this.headline = headline;
    }

    public void deposit (double value){
        this.balance += value;
    }

    public void withdraw (double value){
        this.balance -= value;
    }

    public String getNumberAccount() {
        return this.numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getHeadline() {
        return this.headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

}
