package BankingApp;

public class YesBank implements Bank{
    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public String addMoney(int money, String password, int accountNo) {
        return null;
    }

    @Override
    public String withdrawMoney(int money, String password) {
        return null;
    }
}
