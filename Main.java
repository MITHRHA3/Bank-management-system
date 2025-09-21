import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank=new Bank();
        Scanner scanner=new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. List Accounts");
            System.out.println("6. View Account Details");
            System.out.println("7. Total Balance");
            System.out.println("8. Average Balance");
            System.out.println("9. Richest Account");
            System.out.println("10. Bank Statistics");
            System.out.println("11. Total Interest");
            System.out.println("12. Premium Accounts");
            System.out.println("13. Exit");
            System.out.print("Choose: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    if (bank.isFull()) {
                        System.out.println("Bank is full! Cannot create more accounts.");
                        break;
                    }
                    System.out.print("Account Number: ");
                    String accNum=scanner.nextLine();
                    if (bank.accountExists(accNum)) {
                        System.out.println("Account already exists!");
                        break;
                    }
                    System.out.print("Holder Name: ");
                    String name=scanner.nextLine();
                    System.out.print("Initial Deposit: ");
                    double deposit=scanner.nextDouble();
                    bank.createAccount(accNum, name, deposit);
                    System.out.println("Account created!");
                    break;
                case 2:
                    System.out.print("Account Number: ");
                    String accNum2=scanner.nextLine();
                    System.out.print("Amount: ");
                    double amount=scanner.nextDouble();
                    if (bank.deposit(accNum2, amount)) {
                        System.out.println("Deposit successful!");
                    } else {
                        System.out.println("Deposit failed! Check amount or account.");
                    }
                    break;
                case 3:
                    System.out.print("Account Number: ");
                    String accNum3=scanner.nextLine();
                    System.out.print("Amount: ");
                    double amount2=scanner.nextDouble();
                    if (bank.withdraw(accNum3, amount2)) {
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Withdrawal failed!");
                    }
                    break;
                case 4:
                    System.out.print("From Account: ");
                    String fromAcc=scanner.nextLine();
                    System.out.print("To Account: ");
                    String toAcc=scanner.nextLine();
                    System.out.print("Amount: ");
                    double amount3=scanner.nextDouble();
                    if (bank.transfer(fromAcc, toAcc, amount3)) {
                        System.out.println("Transfer successful!");
                    } else {
                        System.out.println("Transfer failed!");
                    }
                    break;
                case 5:
                    if (bank.isEmpty()) {
                        System.out.println("No accounts found!");
                    } else {
                        bank.listAccounts();
                    }
                    break;
                case 6:
                    System.out.print("Account Number: ");
                    String accNum4=scanner.nextLine();
                    Account acc=bank.findAccount(accNum4);
                    if (acc!=null) {
                        acc.displayDetails();
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;
                case 7:
                    System.out.println("Total Balance: $" + bank.getTotalBalance());
                    break;
                case 8:
                    System.out.println("Average Balance: $" + String.format("%.2f", bank.getAverageBalance()));
                    break;
                case 9:
                    Account richest = bank.getHighestBalanceAccount();
                    if (richest!=null) {
                        System.out.println("Richest Account: " + richest.getAccountSummary());
                    } else {
                        System.out.println("No accounts found!");
                    }
                    break;
                case 10:
                    bank.printStatistics();
                    break;
                case 11:
                    System.out.println("Total Interest: $" + String.format("%.2f", bank.getTotalInterest()));
                    break;
                case 12:
                    System.out.println("Premium Accounts: " + bank.getPremiumAccountsCount());
                    System.out.println("Loan Eligible Accounts: " + bank.getLoanEligibleAccountsCount());
                    break;
                case 13:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
