package src.main.java.bank;

import src.main.java.bank.enums.*;
import src.main.java.bank.bankOperations.*;
import src.main.java.bank.utils.*;

import java.util.Scanner;

public class Bank {
    private int balance;

    public void login() {
        while (true) {
            Scanner chooseOption = new Scanner(System.in);
            System.out.println("Press 1 to deposit");
            System.out.println("Press 2 to withdraw amt");
            System.out.println("Press 3 to check balance");
            System.out.println("Press 4 to create account");

            int userInput = chooseOption.nextInt();
            BankOperation userChoice = ParseBankOperation.parseUserInput(userInput);

            switch (userChoice) {
                case DEPOSIT -> new Deposit().execute(this);
                case WITHDRAW -> new Withdraw().execute(this);
                case GETBALANCE -> new GetBalance().execute(this);
                case CREATEACCOUNT -> new CreateAccount().execute();
                default -> System.out.println("not matching the options");
            }
            System.out.println("Do you want to continue(c) or quit(q)");
            String toQuit = chooseOption.next();
            if (toQuit.equals("q")) {
                break;
            }
        }
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}