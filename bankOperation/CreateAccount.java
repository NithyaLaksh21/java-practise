package src.main.java.bank.bankOperations;

import src.main.java.bank.utils.*;
import src.main.java.bank.enums.*;
import src.main.java.bank.models.*;

import java.util.Scanner;
import java.util.UUID;

public class CreateAccount {
    public void execute() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the Account type you wish to create");
        System.out.println("Press 1 for Savings account");
        System.out.println("Press 2 for Current account");

        int userChoice = userInput.nextInt();
        AccountType accountType = new GetUserAccountType().execute(userChoice);
        Member member = new GetUserDetails().execute();

        UUID accNumber = UUID.randomUUID();
        System.out.println(accountType + " Account created successfully for below details");
        System.out.println("Account number: " + accNumber + " for " + member.getFirstName() + " " + member.getLastName() + " living in " + "Address: " + member.getAddress() + " DOB: " + member.getDob());
    }
}
