import java.util.Scanner;

public class ATM {

    private static Scanner scanner = new Scanner(System.in);
    private static int user_id = 1234;  
    private static int user_pin = 4321; 
    private static double balance = 5000.0; 
    public static void main(String[] args) {

        // Prompt user for ID and PIN
        System.out.print("Enter user ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter user PIN: ");
        int pin = scanner.nextInt();

        // Validate user ID and PIN
        if (id == user_id && pin == user_pin) {
            System.out.println("Welcome to the ATM!");

            // Display menu options
            while (true) {
                System.out.println("\nPlease select an option:");
                System.out.println("1. Transactions History");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Transfer");
                System.out.println("5. Quit");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Displaying transaction history...");
                        // Code to display transaction history
                        break;
                    case 2:
                        System.out.println("Enter amount to withdraw:");
                        double withdrawAmount = scanner.nextDouble();
                        if (withdrawAmount > balance) {
                            System.out.println("Insufficient funds!");
                        } else {
                            balance -= withdrawAmount;
                            System.out.println("Withdrawal successful. Current balance: " + balance);
                        }
                        break;
                    case 3:
                        System.out.println("Enter amount to deposit:");
                        double depositAmount = scanner.nextDouble();
                        balance += depositAmount;
                        System.out.println("Deposit successful. Current balance: " + balance);
                        break;
                    case 4:
                        System.out.println("Enter transfer amount:");
                        double transferAmount = scanner.nextDouble();
                        if (transferAmount > balance) {
                            System.out.println("Insufficient funds!");
                        } else {
                            balance -= transferAmount;
                            System.out.println("Transfer successful. Current balance: " + balance);
                        }
                        break;
                    case 5:
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        } else {
            System.out.println("Invalid user ID or PIN. Please try again.");
        }
    }
}