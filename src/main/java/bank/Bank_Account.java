package src.main.java.bank;

import src.main.java.bank.enums.*;
import src.main.java.bank.utils.*;
import src.main.java.bank.bankOperations.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank_Account {
    public static void main(String[] args) {
        Bank bank = new Bank();
        while (true) {
            Scanner userInitialChoice = new Scanner(System.in);
            System.out.println("Press 1 for new account creation");
            System.out.println("Press 2 to login");

            try {
                int userChoice = userInitialChoice.nextInt();
                UserAccountType userInput = ParseUserInput.parseUserInput(userChoice);
                switch (userInput) {
                    case CREATEACCOUNT -> new CreateAccount().execute();
                    case LOGIN -> bank.login();
                    default -> { break; }
                }
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
            }
        }
    }
}
