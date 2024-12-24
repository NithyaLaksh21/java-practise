package src.main.java.bank;

import src.main.java.bank.enums.*;
import src.main.java.bank.utils.*;
import src.main.java.bank.bankOperations.*;

import java.util.Scanner;

public class Bank_Account {
    public static void main(String[] args) {
        Bank bank = new Bank();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Press 1 for new account creation");
            System.out.println("Press 2 to login");

            int userChoice = scanner.nextInt();
            UserAccountType userInput = ParseUserInput.parseUserInput(userChoice);
            switch (userInput) {
                case CREATEACCOUNT -> new CreateAccount().execute();
                case LOGIN -> bank.login();
                default -> { break; }
            }

            System.out.println("Do you want to continue(c) or quit(q)");
            String toQuit = scanner.next();
            if (toQuit.equals("q")) {
                break;
            }
        }
    }
}
