import java.util.Scanner;

public class ATMApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a bank account for the user with an initial balance of $1000
        BankAccount userAccount = new BankAccount(1000);

        // Step 5: Connect the ATM class with the user's bank account class
        ATM atm = new ATM(userAccount);

        while (true) {
            // Step 2: Design the user interface
            System.out.println("Welcome to the ATM!");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    boolean withdrawalResult = atm.withdraw(withdrawAmount);
                    if (withdrawalResult) {
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Insufficient balance for withdrawal.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    System.out.println("Deposit successful.");
                    break;
                case 3:
                    double balance = atm.checkBalance();
                    System.out.println("Your account balance is: $" + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please select a valid option.");
                    break;
            }
        }
    }
}