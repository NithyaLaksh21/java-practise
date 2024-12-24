package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import main.enums.UserType;
import main.operations.CreateAccount;
import main.utils.*;

public class Bank_Account {

    public static void main(String[] args) {
        Bank bank = new Bank();

        while(true) {

            Scanner userInitialChoice = new Scanner(System.in);
            System.out.println("Press 1 for new account creation");
            System.out.println("Press 2 to login");

            try {
                int userChoice = userInitialChoice.nextInt();
                UserType userType = GetUserType.getUserType(userChoice);
                switch (userType) {
                    case CREATEACCOUNT -> new CreateAccount().getAccount();
                    case LOGIN ->  new Bank().login(); 
                    default -> { break; }
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter a number - "+ e);
            }

            String toContinueOrQuit;
            while (true) {
                Scanner userSession = new Scanner(System.in);
                System.out.println("Do you want to continue(c) or quit(q)");
                toContinueOrQuit = userSession.next();

                if (toContinueOrQuit.equalsIgnoreCase("q") || toContinueOrQuit.equalsIgnoreCase("c")) {
                    break;
                } else {
                    System.out.println("Invalid entry, press (c) to continue or (q) to quit");
                }
            }

            if (toContinueOrQuit.equalsIgnoreCase("q")) {
                break;
            }

        }
    }
}
