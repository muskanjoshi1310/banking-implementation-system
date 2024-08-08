import java.util.Scanner;

 class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a SavingsAccount with initial balance of $1000 and 5% interest rate
        savingsAccount savingsAccount = new savingsAccount(1000.0, 0.05);
        savingsAccount.deposit(500.0);
        savingsAccount.addInterest();
        savingsAccount.withdraw(200.0);

        // Create a CheckingAccount with initial balance of $500
        CheckingAccount checkingAccount = new CheckingAccount(500.0);
        checkingAccount.deposit(200.0);
        checkingAccount.withdraw(50.0);
        checkingAccount.withdraw(100.0);

        // Display final balances
        System.out.println("\nFinal Balances:");
        System.out.printf("Savings Account Balance: $%.2f\n", savingsAccount.getBalance());
        System.out.printf("Checking Account Balance: $%.2f\n", checkingAccount.getBalance());

        // Example: Finding discounts and applying them
        System.out.print("\nEnter a discount percentage for a purchase: ");
        double discountPercentage = scanner.nextDouble();
        double purchaseAmount = 200.0; // Example purchase amount

        double discountAmount = purchaseAmount * (discountPercentage / 100);
        double discountedPrice = purchaseAmount - discountAmount;

        System.out.printf("Discounted Price after %.2f%% discount: $%.2f\n", discountPercentage, discountedPrice);

        // Example: Calculating interest on a loan
        System.out.print("\nEnter an annual interest rate for a loan: ");
        double annualInterestRate = scanner.nextDouble();
        double loanAmount = 1000.0; // Example loan amount

        double monthlyInterestRate = annualInterestRate / 12 / 100;
        double numberOfMonths = 12; // Example loan duration in months

        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfMonths));

        System.out.printf("Monthly payment for a $%.2f loan at %.2f%% annual interest rate: $%.2f\n",
                loanAmount, annualInterestRate, monthlyPayment);

        scanner.close();
    }
}

