package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import main.enums.OperationType;
import main.operations.Deposit;
import main.operations.GetBalance;
import main.operations.WithDraw;
import main.utils.GetOperationType;

public class Bank {
    private int balance;

    public void login() {

        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Press 1 to deposit");
            System.out.println("Press 2 to withdraw amt");
            System.out.println("Press 3 to check balance");
            
            try {
                int userChoice = scanner.nextInt();
                OperationType userInput = GetOperationType.getOperationType(userChoice);

                switch (userInput) {
                    case DEPOSIT ->  new Deposit().execute(this);
                    case WITHDRAW -> new WithDraw().execute(this);
                    case GETBALANCE -> new GetBalance().execute(this);
                    default -> { System.out.println("not matching the options");
                continue;}
                }
            }
            catch(InputMismatchException e){
                System.out.println("Invalid input, please enter a number - "+ e);
            }
           
            Scanner userSession = new Scanner(System.in);
            System.out.println("Do you want to continue(c) or quit(q)");
            String toContinueOrQuit = userSession.next();

            if(toContinueOrQuit.equalsIgnoreCase("q")) {
                break;
            }
            else if(toContinueOrQuit.equalsIgnoreCase("c")){
                continue;
            }
            else {
                System.out.println("Invalid entry, press (c) to continue or (q) to quit");
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
