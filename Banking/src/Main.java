import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SBI.rateOfInterest = 8;
        HDFC.rateOfInterest = 7;

        choose_bank();

        System.out.println(".......Thank you for visiting our Bank.......");
    }
    public static void choose_bank(){
        System.out.println("Welcome to Banking Application, please select your Bank:");
        System.out.println("--------------------------------------------------------");
        System.out.println("Press 1 to select SBI: ");
        System.out.println("Press 2 to select HDFC: ");
        System.out.println("---------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();
        switch(ans){
            case 1:
                System.out.println("Welcome to SBI: ");
                create_accountSBI();
                break;
            case 2:
                System.out.println("Welcome to HDFC Bank: ");
                create_accountHDFC();
                break;
            default:
                System.out.println("Invalid choice entered: ");
                System.out.println("Choose again: ");
                choose_bank();
        }
    }
    public static void create_accountHDFC() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.next();

        System.out.println("Enter Balance ");
        int initialBalance = sc.nextInt();

        System.out.println("Enter Password ");
        String password = sc.next();

        HDFC hdfcAccount = new HDFC(initialBalance, password, name);

        System.out.println("Press 1 to check balance: ");
        System.out.println("Press 2 to add money to your account: ");
        System.out.println("Press 3 to withdraw money from your account: ");
        System.out.println("Press 4 to check rate of interest: ");
        System.out.println("Press 5 to change your password: ");
        System.out.println("Press 6 to exit: ");

        int enter = sc.nextInt();

        switch(enter){
            case 1:
                System.out.println("Enter password to check your HDFC account balance:  ");
                String enter_pass = sc.next();
                int balance = hdfcAccount.checkBalance(enter_pass);
                System.out.println("The balance for the account1 is "+ balance);
                break;
            case 2:
                System.out.println("Enter the amount to add to your account: ");
                int amount = sc.nextInt();
                String bankMessage = hdfcAccount.addMoney(amount);
                System.out.println(bankMessage);
                break;
            case 3:
                System.out.println("Enter the amount to withdraw from your account: ");
                int with_amount = sc.nextInt();
                System.out.println("Enter password to confirm:  ");
                String enter_pass1 = sc.next();

                String new_balance = hdfcAccount.withdrawMoney(with_amount, enter_pass1);
                System.out.println(new_balance);
                break;
            case 4:
                System.out.println("Enter number of years for which you want to calculate interest: ");
                int year = sc.nextInt();
                double interest = hdfcAccount.calculateTotalInterest(year);
                System.out.println("The total interest you will get: "+ interest);
                break;
            case 5:
                System.out.println("Enter your old password to change your password: ");
                String oldpass = sc.next();
                System.out.println("Enter new password: ");
                String newpass = sc.next();

                String new_pass = hdfcAccount.changePassword(oldpass, newpass);
                System.out.println(new_pass);
                break;
            case 6:
                create_accountHDFC();
                break;
            default:
                System.out.println("\n"+ "Invalid choice entered. " + "\n");
                break;
        }
    }


    public static void create_accountSBI() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.next();

        System.out.println("Enter Balance ");
        int initialBalance = sc.nextInt();

        System.out.println("Enter Password ");
        String password = sc.next();

        SBI sbiAccount = new SBI(initialBalance, password, name);

        System.out.println("Press 1 to check balance: ");
        System.out.println("Press 2 to add money to your account: ");
        System.out.println("Press 3 to withdraw money from your account: ");
        System.out.println("Press 4 to check rate of interest: ");
        System.out.println("Press 5 to change your password: ");
        System.out.println("Press 6 to exit: ");

        int enter = sc.nextInt();

        switch(enter){
            case 1:
                System.out.println("Enter password to check your SBI account balance:  ");
                String enter_pass = sc.next();
                int balance = sbiAccount.checkBalance(enter_pass);
                System.out.println("The balance for the account1 is "+ balance);
                break;
            case 2:
                System.out.println("Enter the amount to add to your account: ");
                int amount = sc.nextInt();
                String bankMessage = sbiAccount.addMoney(amount);
                System.out.println(bankMessage);
                break;
            case 3:
                System.out.println("Enter the amount to withdraw from your account: ");
                int with_amount = sc.nextInt();
                System.out.println("Enter password to confirm:  ");
                String enter_pass1 = sc.next();

                String new_balance = sbiAccount.withdrawMoney(with_amount, enter_pass1);
                System.out.println(new_balance);
                break;
            case 4:
                System.out.println("Enter number of years for which you want to calculate interest: ");
                int year = sc.nextInt();
                double interest = sbiAccount.calculateTotalInterest(year);
                System.out.println("The total interest you will get: "+ interest);
                break;
            case 5:
                System.out.println("Enter your old password to change your password: ");
                String oldpass1 = sc.next();
                System.out.println("Enter new password: ");
                String newpass1 = sc.next();

                String new_pass1 = sbiAccount.changePassword(oldpass1, newpass1);
                System.out.println(new_pass1);
                break;
            case 6:
                create_accountSBI();
                break;
            default:
                System.out.println("\n"+ "Invalid choice entered. " + "\n");
                break;
        }
    }
}
