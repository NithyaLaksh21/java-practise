package src.main.java.bank;

import src.main.java.bank.enums.*;
import src.main.java.bank.bankOperations.*;
import src.main.java.bank.utils.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
    //encapsulation
    private int balance;

    public void login() {
        while (true) {
            Scanner chooseOptionForBanking = new Scanner(System.in);
            System.out.println("Press 1 to deposit");
            System.out.println("Press 2 to withdraw amt");
            System.out.println("Press 3 to check balance");

            try {
                int userInputToChooseOperations = chooseOptionForBanking.nextInt();
                OperationType userChoice = ParseBankOperation.parseUserInput(userInputToChooseOperations);

                //polymorphism
                BankOperation operation;

                switch (userChoice) {
                    case DEPOSIT -> operation = new Deposit();
                    case WITHDRAW -> operation = new Withdraw();
                    case GETBALANCE -> operation = new GetBalance();
                    default -> { System.out.println("not matching the options");
                    continue;}
                }
                operation.execute(this);
            } catch (InputMismatchException e) {
                    System.out.println("Invalid input, please enter a number - "+ e);
            }
            
            Scanner userSessionExpiry = new Scanner(System.in);
            System.out.println("Do you want to continue(c) or quit(q)");
            String toContinueOrQuit = userSessionExpiry.next();
            if (toContinueOrQuit.equals("q")) {
                break;
            } else if (toContinueOrQuit.equals("c")){
                continue;
            } else {
                System.out.println("Invalid entry, press (c) to continue or (q) to quit");
                break;
            }
        }
    }
    //encapsulation
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
