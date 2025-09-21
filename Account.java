public class Account {
    private String accountNumber;
    private String holderName;
    private double balance;
    
    public Account(String accountNumber, String holderName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialDeposit;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getHolderName() {
        return holderName;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public boolean deposit(double amount) {
        if (amount > 0 && amount <= 10000) {
            balance += amount;
            return true;
        }
        return false;
    }
    
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance && amount <= 5000) {
            balance -= amount;
            return true;
        }
        return false;
    }
    
    public boolean transfer(Account targetAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            if (this.withdraw(amount)) {
                targetAccount.deposit(amount);
                return true;
            }
        }
        return false;
    }
    
    public void displayDetails() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Holder: " + holderName);
        System.out.println("Balance: $" + balance);
    }
    
    public String getBalanceString() {
        return String.format("$%.2f", balance);
    }
    
    public boolean hasSufficientBalance(double amount) {
        return balance >= amount;
    }
}
