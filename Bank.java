import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Bank {
    private final List<Account> accounts;
    private final Scanner scanner;

    public Bank() {
        accounts = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void createAccount() {
        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = scanner.nextLine();
        
        System.out.print("Enter Account Type (Savings/Checking): ");
        String accountType = scanner.nextLine();

        String accountNumber = "ACC" + (accounts.size() + 1);
        Account account = new Account(accountNumber, accountHolderName, accountType);
        accounts.add(account);
        System.out.println("Account created successfully with Account Number: " + accountNumber);
    }

    public Account getAccountByNumber(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    public void deposit() {
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        Account acc = getAccountByNumber(accountNumber);

        if (acc != null) {
            System.out.print("Enter deposit amount: ");
            double amount = scanner.nextDouble();
            acc.deposit(amount);
        } else {
            System.out.println("Account not found!");
        }
    }

    public void withdraw() {
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        Account acc = getAccountByNumber(accountNumber);

        if (acc != null) {
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();
            acc.withdraw(amount);
        } else {
            System.out.println("Account not found!");
        }
    }

    public void displayAccountDetails() {
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        Account acc = getAccountByNumber(accountNumber);

        if (acc != null) {
            acc.displayAccountDetails();
        } else {
            System.out.println("Account not found!");
        }
    }

    public void showAllAccounts() {
        for (Account acc : accounts) {
            acc.displayAccountDetails();
            System.out.println("---------------------------");
        }
    }
}
