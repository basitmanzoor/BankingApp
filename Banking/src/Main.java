public class Main {
    public static void main(String[] args) {
        SBI account1 = new SBI(500000, "123", "Basit");
        SBI account2 = new SBI(700000, "456", "Manzoor");

        HDFC account3 = new HDFC(650000, "789", "Mehran");

        int balance = account1.checkBalance("124");
        System.out.println("The balance for the account1 is "+ balance);

        int balanceCheck = account1.checkBalance("123");
        System.out.println("The balance for the account1 is "+ balanceCheck);

        String bankMessage = account2.addMoney(5000);
        System.out.println(bankMessage);


        String message = account3.withdrawMoney(12000, "123");
        System.out.println(message);

        String checkMessage = account3.withdrawMoney(12000, "789");
        System.out.println(checkMessage);
    }
}
