import java.util.UUID;

public class SBI implements Bank {

    private int balance;
    private String accNumber;
    private String password;
    public String name;
    public static double rateOfInterest;

    public SBI(int balance, String password, String name) {
        this.accNumber = UUID.randomUUID().toString(); //UUID is a unique random number generator(Universally unique indentifier)
        this.balance = balance;
        this.password = password;
        this.name = name;
    }

    @Override
    public int checkBalance(String password) {
        if(password == this.password){
            return balance;
        }
        return -1;
    }

    @Override
    public String addMoney(int money) {
        balance = balance + money;
        String message = money+ " has been added to the account "+ accNumber+ " the total balance is now " + balance;
        return message;
    }

    @Override
    public String withdrawMoney(int drawMoney, String password) {
        if(password == this.password){
            //check if the balance is enough
            if(balance < drawMoney){
                return " Insufficient Balance ";
            }
            else{
                balance = balance - drawMoney;
                return " Money withdrawn successfully. Remaining balance is "+balance;
            }
        }
        else {
            return " Wrong Password ";
        }
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        //if current password matches with old password
        if(this.password.equals(oldPassword)){
            this.password = newPassword;
            return " Password changed successfully ";
        }
        else{
            return " Wrong Password Entered ";
        }
    }

    @Override
    public double calculateTotalInterest(int years){
        double interest = balance*rateOfInterest*years/100;
        return interest;
    }
}
