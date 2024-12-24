package src.main.java.bank.bankOperations;

import src.main.java.bank.enums.*;
import src.main.java.bank.models.*;
import src.main.java.bank.utils.GetUserAccountType;
import src.main.java.bank.utils.GetUserDetails;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.UUID;

public class CreateAccount {
    public void execute() {
        Scanner userInputToChooseAccountType = new Scanner(System.in);
        System.out.println("Enter the Account type you wish to create");
        System.out.println("Press 1 for Savings account");
        System.out.println("Press 2 for Current account");


        try {
            int userChoice = userInputToChooseAccountType.nextInt();
            AccountType accountType = new GetUserAccountType().execute(userChoice);
            Member member = new GetUserDetails().execute();

            UUID accNumber = UUID.randomUUID();
            System.out.println(accountType + " Account created successfully for below details");
            System.out.println("Account number: " + accNumber + " for " + member.getFirstName() + " " + member.getLastName() + " living in " + "Address: " + member.getAddress() + " DOB: " + member.getDob());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, please enter a number - "+ e);
        }
    }
}
