package CodeSoft;
import java.util.Scanner;

class User {
    private int Acc_no;
    private int pin;
    private double balance;

    public User(int Acc_no, int pin, double balance) {
        this.Acc_no = Acc_no;
        this.pin = pin;
        this.balance = balance;
    }

    public boolean Verification(int enteredpin) {
        return this.pin == enteredpin;
    }

    public double get_balance() {
        return balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            return true;
        }
        return false;
    }
}

public class Atm_interface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User(13001, 124, 50000);
        System.out.println("Enter your account number:-");
        int acc_no = sc.nextInt();
        System.out.println("Enter PIN:-");
        int PIN = sc.nextInt();

        if (user.Verification(PIN)) {
            System.out.println("Login Sucessfully");
            boolean exit = false;

            while (!exit) {
                System.out.println("\n Welcome in ATM:-");
                System.out.println("1. Check balnce");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.println("Enter your choice:- ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Your balnce in your account :-" + user.get_balance());
                        break;
                    case 2:
                        System.out.println("Enter your Amount:- ");
                        int Deposit = sc.nextInt();
                        user.deposit(Deposit);
                        System.out.println("Amount deposited sucessfully!");
                        break;
                    case 3:
                        System.out.println("Enter your Amount:- ");
                        int Withdraw = sc.nextInt();
                        if (user.withdraw(Withdraw)) {
                            System.out.println("Withdraw Sucessfully!");
                        } else {
                            System.out.println("Please enter sufficent amount");
                        }
                        break;
                    case 4:
                        exit = true;
                        System.out.println("Thank you for using the ATM!");
                        break;
                    default:
                        System.out.println("Please enter valid option.");
                        break;
                }
            }
        } else {
            System.out.println("Invalid Pin!");
        }
    }
}
