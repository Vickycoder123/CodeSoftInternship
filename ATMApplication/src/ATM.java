
// Step 1: Create a class to represent the ATM machine
class ATM {
    private BankAccount userAccount;

    public ATM(BankAccount account) {
        this.userAccount = account;
    }

    // Step 3: Implement methods for each option
    public boolean withdraw(double amount) {
        return userAccount.withdraw(amount);
    }

    public void deposit(double amount) {
        userAccount.deposit(amount);
    }

    public double checkBalance() {
        return userAccount.getBalance();
    }
}
