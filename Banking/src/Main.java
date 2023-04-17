import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SBI.rateOfInterest = 8;
        HDFC.rateOfInterest = 7;

        SBI account1 = new SBI(500000, "123", "Basit");
        SBI account2 = new SBI(700000, "456", "Manzoor");

        HDFC account3 = new HDFC(650000, "789", "Mehran");

        //Wrong password entered for Account1
        int balance = account1.checkBalance("124");
        System.out.println("The balance for the account1 is "+ balance);

        //Correct password entered for Account1 to check the balance
        int balanceCheck = account1.checkBalance("123");
        System.out.println("The balance for the account1 is "+ balanceCheck);

        //Add money to Account2
        String bankMessage = account2.addMoney(5000);
        System.out.println(bankMessage);

        //wrong password for withdrawing money
        String message = account3.withdrawMoney(12000, "123");
        System.out.println(message);

        //Correct password but more amount entered to be withdrawn
        String checkMessage = account3.withdrawMoney(800000, "789");
        System.out.println(checkMessage);

        //correct password and less amount entered as compared to current balance
        String checkMessage1 = account3.withdrawMoney(100000, "789");
        System.out.println(checkMessage1);

        //calculate interest for account1
        double interest = account1.calculateTotalInterest(10);
        System.out.println("The total interest you will get: "+ interest);

        //Making it dynamic
        System.out.println("Welcome to SBI, please enter the details to create an account: ");
        System.out.println("---------------------------------------------------------------");

        System.out.println("Enter your Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        System.out.println("Enter Balance ");
        int initialBalance = sc.nextInt();

        System.out.println("Enter Password ");
        String password = sc.next();

        SBI sbiAccount = new SBI(initialBalance, password, name);

        System.out.println("Enter Money to add to your Account: ");
        int add_money = sc.nextInt();
        String newBalance = sbiAccount.addMoney(add_money);

        System.out.println(newBalance);


    }
}
