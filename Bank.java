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
}
