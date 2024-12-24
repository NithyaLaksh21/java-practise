package main.operations;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.UUID;
import main.models.*;

import main.enums.AccountType;
import main.utils.GetAccountType;
import main.utils.GetUserDetails;

public class CreateAccount {

    public void getAccount() {
       Scanner userAccountType = new Scanner(System.in);
       System.out.println("Enter the Account type you wish to create");
        System.out.println("Press 1 for Savings account");
        System.out.println("Press 2 for Current account");

        try {
            int userChoice = userAccountType.nextInt();
            AccountType accountType = new GetAccountType().getAccountType(userChoice);
            Member member = new GetUserDetails().getDetails();

            UUID accNumber = UUID.randomUUID();
            System.out.println(accountType + " Account created successfully for below details");
            System.out.println("Account number: " + accNumber + " for " + member.getFirstName() + " " + member.getLastName() + " living in " + "Address: " + member.getAddress() + " DOB: " + member.getDob());

        }
        catch (InputMismatchException e){
            System.out.println("Invalid input, please enter a number - "+ e);
        }
    }
}
