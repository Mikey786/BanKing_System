import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();
        try (Scanner scanner = new Scanner(System.in)) {
            boolean exit = false;
            
            while (!exit) {
                System.out.println("\n==== Banking System Menu ====");
                System.out.println("1. Create Account");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Account Details");
                System.out.println("5. Show All Accounts");
                System.out.println("6. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                
                switch (choice) {
                    case 1 -> bank.createAccount();
                    case 2 -> bank.deposit();
                    case 3 -> bank.withdraw();
                    case 4 -> bank.displayAccountDetails();
                    case 5 -> bank.showAllAccounts();
                    case 6 -> {
                        exit = true;
                        System.out.println("Thank you for using the banking system.");
                    }
                    default -> System.out.println("Invalid option! Please try again.");
                }
            }
        }
    }
}
