public class Bank {
    private Account[] accounts;
    private int count;
    
    public Bank() {
        accounts = new Account[100];
        count = 0;
    }
    
    public void createAccount(String accountNumber, String holderName, double initialDeposit) {
        if (count < accounts.length) {
            accounts[count] = new Account(accountNumber, holderName, initialDeposit);
            count++;
        }
    }
    
    public Account findAccount(String accountNumber) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        return null;
    }
    
    public boolean deposit(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            return account.deposit(amount);
        }
        return false;
    }
    
    public boolean withdraw(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            return account.withdraw(amount);
        }
        return false;
    }
    
    public boolean transfer(String fromAccount, String toAccount, double amount) {
        Account from = findAccount(fromAccount);
        Account to = findAccount(toAccount);
        if (from != null && to != null) {
            return from.transfer(to, amount);
        }
        return false;
    }
    
    public void listAccounts() {
        for (int i = 0; i < count; i++) {
            System.out.println(accounts[i].getAccountNumber() + " - " + 
                             accounts[i].getHolderName() + " - $" + 
                             accounts[i].getBalance());
        }
    }
    
    public double getTotalBalance() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += accounts[i].getBalance();
        }
        return total;
    }
    
    public boolean accountExists(String accountNumber) {
        return findAccount(accountNumber) != null;
    }
    
    public int getAccountCount() {
        return count;
    }
    
    public boolean isFull() {
        return count >= accounts.length;
    }
    
    public boolean isEmpty() {
        return count == 0;
    }
    
    public double getAverageBalance() {
        if (count == 0) return 0;
        return getTotalBalance() / count;
    }
    
    public String getAccountInfo(String accountNumber) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            return account.getAccountNumber() + " - " + 
                   account.getHolderName() + " - " + 
                   account.getBalanceString();
        }
        return "Account not found";
    }
    
    public Account findAccountByHolder(String holderName) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getHolderName().equalsIgnoreCase(holderName)) {
                return accounts[i];
            }
        }
        return null;
    }
    
    public Account getHighestBalanceAccount() {
        if (count == 0) return null;
        Account highest = accounts[0];
        for (int i = 1; i < count; i++) {
            if (accounts[i].getBalance() > highest.getBalance()) {
                highest = accounts[i];
            }
        }
        return highest;
    }
    
    public int getAccountsWithBalanceAbove(double amount) {
        int count = 0;
        for (int i = 0; i < this.count; i++) {
            if (accounts[i].getBalance() > amount) {
                count++;
            }
        }
        return count;
    }
    
    public void printStatistics() {
        System.out.println("Bank Statistics:");
        System.out.println("Total Accounts: " + count);
        System.out.println("Total Balance: $" + String.format("%.2f", getTotalBalance()));
        System.out.println("Average Balance: $" + String.format("%.2f", getAverageBalance()));
        System.out.println("Accounts with balance > $1000: " + getAccountsWithBalanceAbove(1000));
    }
    
    public int getEmptyAccountsCount() {
        int emptyCount = 0;
        for (int i = 0; i < count; i++) {
            if (accounts[i].isEmpty()) {
                emptyCount++;
            }
        }
        return emptyCount;
    }
}
