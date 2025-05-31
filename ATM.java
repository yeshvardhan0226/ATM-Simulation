import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String correctId = "user";
        String correctPin = "1234";
        double balance = 1000.0;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to ATM");

        System.out.print("Enter User ID: ");
        String userId = input.nextLine();

        System.out.print("Enter PIN: ");
        String pin = input.nextLine();

        if (userId.equals(correctId) && pin.equals(correctPin)) {
            int choice = 0;
            while (choice != 4) {
                System.out.println("\n1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = input.nextInt();

                if (choice == 1) {
                    System.out.println("Balance: $" + balance);
                } else if (choice == 2) {
                    System.out.print("Enter amount to deposit: ");
                    double deposit = input.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposited: $" + deposit);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                } else if (choice == 3) {
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = input.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrew: $" + withdraw);
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                } else if (choice == 4) {
                    System.out.println("Thank you for using ATM.");
                } else {
                    System.out.println("Invalid choice.");
                }
            }
        } else {
            System.out.println("Incorrect ID or PIN.");
        }

        input.close();
    }
}

