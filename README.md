## Bank Management System (Console)

Simple Java console app to manage bank accounts with basic transactions and a summary view.

### Features
- **Accounts**: create, view, and list accounts (number, holder, balance)
- **Transactions**: deposit, withdraw, and transfer between accounts
- **Summary**: show total balance across all accounts

### Requirements
- Java 24 or later (JDK)

### OOP concepts used
- **Classes and Objects**: `Account` and `BankManagementSystem` (main program)
- **Encapsulation**: private fields with public getters; controlled operations (deposit/withdraw/transfer)
- **Constructors**: initialize account state (number, holder, initial deposit)
- **Methods**: instance methods for account actions; static methods for menu handling
- **Arrays**: in-memory array to store accounts (no database/files)

### Get started
From the project root:

```bash
javac Account.java
javac BankManagementSystem.java
java BankManagementSystem
```

Or compile and run in one command:

```bash
javac *.java && java BankManagementSystem
```

### How it works
Data is stored in memory using arrays (no files or databases). Use the menu to create accounts, perform transactions, view an account by number, list all accounts, and see the bank’s total balance.

Main menu:
- 1: Create Account
- 2: Deposit
- 3: Withdraw
- 4: Transfer
- 5: View Account (by number)
- 6: List All Accounts
- 7: View Total Bank Balance
- 8: Exit

### Notes
- Data resets each time the program runs.
- Inputs expect numbers for menu choices, account numbers, and amounts; invalid input is handled with a warning.

### Example session
```text
=== BANK MANAGEMENT SYSTEM ===
--- MENU ---
1. Create Account
2. Deposit
3. Withdraw
4. Transfer
5. View Account
6. List All Accounts
7. View Total Bank Balance
8. Exit
Choice: 1

--- CREATE ACCOUNT ---
Account Number: 1001
Holder Name: Alice
Initial Deposit: 500.00
Account created successfully!
```

### Troubleshooting
- "command not found": Ensure `javac` and `java` are on your PATH (install JDK).
- Compilation errors: Delete old `.class` files and recompile.

### License
MIT
