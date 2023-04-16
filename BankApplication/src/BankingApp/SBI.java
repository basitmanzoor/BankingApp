package BankingApp;

public class SBI implements Bank, Security{
//As it implements two parents, it achieves multiple inheritance
    private int balance;
    private String password;

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

    @Override
    public int generateOtp() {
        return 0;
    }

    @Override
    public boolean matchAccDetails() {
        return false;
    }
}
