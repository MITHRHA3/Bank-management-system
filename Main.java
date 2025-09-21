import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. List Accounts");
            System.out.println("6. Total Balance");
            System.out.println("7. Exit");
            System.out.print("Choose: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Account Number: ");
                    String accNum = scanner.nextLine();
                    System.out.print("Holder Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Initial Deposit: ");
                    double deposit = scanner.nextDouble();
                    bank.createAccount(accNum, name, deposit);
                    System.out.println("Account created!");
                    break;
                case 2:
                    System.out.print("Account Number: ");
                    String accNum2 = scanner.nextLine();
                    System.out.print("Amount: ");
                    double amount = scanner.nextDouble();
                    if (bank.deposit(accNum2, amount)) {
                        System.out.println("Deposit successful!");
                    } else {
                        System.out.println("Deposit failed!");
                    }
                    break;
                case 3:
                    System.out.print("Account Number: ");
                    String accNum3 = scanner.nextLine();
                    System.out.print("Amount: ");
                    double amount2 = scanner.nextDouble();
                    if (bank.withdraw(accNum3, amount2)) {
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Withdrawal failed!");
                    }
                    break;
                case 4:
                    System.out.print("From Account: ");
                    String fromAcc = scanner.nextLine();
                    System.out.print("To Account: ");
                    String toAcc = scanner.nextLine();
                    System.out.print("Amount: ");
                    double amount3 = scanner.nextDouble();
                    if (bank.transfer(fromAcc, toAcc, amount3)) {
                        System.out.println("Transfer successful!");
                    } else {
                        System.out.println("Transfer failed!");
                    }
                    break;
                case 5:
                    bank.listAccounts();
                    break;
                case 6:
                    System.out.println("Total Balance: $" + bank.getTotalBalance());
                    break;
                case 7:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
