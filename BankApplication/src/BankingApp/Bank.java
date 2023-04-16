package BankingApp;

public interface Bank { //Bank became the common template to be used by other banks
    //thats why we use interface
    public int getBalance();
    public String addMoney(int money, String password, int accountNo);
    public String withdrawMoney(int money, String password);


}
