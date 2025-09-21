# Bank Management System

A simple Java console application for managing bank accounts with basic transactions and account management features. This project demonstrates Object-Oriented Programming (OOP) concepts using Java.

## 🏦 Features

- **Account Management**: Create, view, and list bank accounts
- **Transaction Processing**: Deposit, withdraw, and transfer money between accounts
- **Account Information**: View account details by account number
- **Bank Summary**: Display total balance across all accounts
- **Interactive Menu**: User-friendly console interface

## 🚀 Getting Started

### Prerequisites

- Java 8 or later (JDK)
- Command line terminal or IDE

### Installation & Running

1. **Clone the repository:**
   ```bash
   git clone https://github.com/MITHRHA3/Bank-management-system.git
   cd Bank-management-system
   ```

2. **Compile the Java files:**
   ```bash
   javac *.java
   ```

3. **Run the application:**
   ```bash
   java BankManagementSystem
   ```

   **Or compile and run in one command:**
   ```bash
   javac *.java && java BankManagementSystem
   ```

## 📋 How to Use

### Main Menu Options

1. **Create Account** - Add a new bank account with account number, holder name, and initial deposit
2. **Deposit** - Add money to an existing account
3. **Withdraw** - Remove money from an existing account
4. **Transfer** - Move money between two accounts
5. **View Account** - Display details of a specific account by account number
6. **List All Accounts** - Show all accounts in the system
7. **View Total Bank Balance** - Display the sum of all account balances
8. **Exit** - Close the application

### Example Session

```
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
Holder Name: Alice Johnson
Initial Deposit: 500.00
Account created successfully!

Choice: 2

--- DEPOSIT ---
Account Number: 1001
Amount to deposit: 200.00
Deposit successful! New balance: $700.00
```

## 🏗️ Object-Oriented Programming Concepts Used

### Classes and Objects
- **`Account`** - Represents individual bank accounts with properties and behaviors
- **`BankManagementSystem`** - Main program class that manages the application flow

### Encapsulation
- Private fields with public getter methods
- Controlled access to account operations (deposit, withdraw, transfer)
- Data protection through proper access modifiers

### Constructors
- Initialize account state with account number, holder name, and initial deposit
- Proper object initialization for new accounts

### Methods
- **Instance Methods**: Account-specific operations (deposit, withdraw, getBalance)
- **Static Methods**: Menu handling and utility functions
- **Method Overloading**: Different ways to create and manage accounts

### Arrays
- In-memory storage for accounts (no database or file persistence)
- Dynamic account management using array data structure

## 🗂️ Project Structure

```
Bank-management-system/
├── Account.java              # Account class with properties and methods
├── BankManagementSystem.java # Main application class
└── README.md                 # Project documentation
```

## 💾 Data Storage

- **Memory-based**: All data is stored in memory using arrays
- **No Persistence**: Data resets each time the program runs
- **No Database**: Simple array-based storage for learning purposes

## 🔧 Troubleshooting

### Common Issues

1. **"command not found" error:**
   - Ensure `javac` and `java` are installed and on your PATH
   - Install JDK if not already installed

2. **Compilation errors:**
   - Delete old `.class` files: `rm *.class` (Linux/Mac) or `del *.class` (Windows)
   - Recompile: `javac *.java`

3. **Runtime errors:**
   - Ensure all Java files are compiled before running
   - Check for typos in class names and method calls

## 🚀 Future Improvements

### Potential Enhancements

1. **Data Persistence**
   - File-based storage using File I/O
   - Database integration (MySQL, PostgreSQL)
   - JSON/XML data format support

2. **Advanced Features**
   - Account types (Savings, Checking, Business)
   - Interest calculation
   - Transaction history
   - Account statements
   - User authentication

3. **User Interface**
   - GUI implementation using Swing/JavaFX
   - Web-based interface
   - Mobile application

4. **Security & Validation**
   - Input validation and error handling
   - Password protection
   - Transaction limits and restrictions
   - Audit logging

5. **Performance & Scalability**
   - Collections framework (ArrayList, HashMap)
   - Multithreading for concurrent operations
   - Memory optimization

## 📚 Learning Outcomes

This project demonstrates:
- **OOP Principles**: Encapsulation, abstraction, and basic inheritance
- **Java Fundamentals**: Classes, objects, methods, constructors, arrays
- **Console Programming**: User input/output, menu-driven applications
- **Data Management**: Array manipulation and basic data structures
- **Problem Solving**: Breaking down complex requirements into manageable components

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📞 Support

If you have any questions or need help with this project, please:
- Open an issue on GitHub
- Check the troubleshooting section above
- Review the code comments for implementation details

---

**Happy Banking! 🏦✨**
