//Able to  create account a. savings b. current
//account should have a. unique account number b. firstname c.lastname d.address
import java.util.Scanner;
import java.util.UUID;

public class Bank {
    String name;
    private int balance;

    public void deposit() {
        Scanner userObj = new Scanner(System.in);
        System.out.println("Enter amount to be deposited" );

        int amount = userObj.nextInt();
        balance += balance + amount; 
        System.out.println("Amount deposited: " + amount);
    }

    public void withdraw() {
        Scanner amt = new Scanner(System.in);
        System.out.println("Select the Type of account");
        System.out.println("Press 1 for savings");
        System.out.println("Press 2 for current");

        int accountType = amt.nextInt();
 
        System.out.println("Enter amt to be withdrwan");

        int withdrawAmt = amt.nextInt();
        if ( balance > withdrawAmt )
        {
            balance = balance-withdrawAmt;
            System.out.println("amount withdrawn successfully"+ withdrawAmt);
        } else {
            System.out.println("cancelled transaction - insufficient balance");
        }
    }

     void getBalance() {
        System.out.println("Current balance: " + balance);
    }

    public void createAccount() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the Account type you wish to create");
        System.out.println("Press 1 for Savings account");
        System.out.println("Press 2 for Salary account");


        int userChoice = userInput.nextInt();
        userInput.nextLine();

        if(userChoice == 1) {
            UUID accNumber = UUID.randomUUID();
            
            System.out.println("Enter the firstName: ");
            String firstName = userInput.next();
            System.out.println("Enter the lastName: ");
            String lastName = userInput.next();
            System.out.println("Enter the address: ");
            String address = userInput.next();
            System.out.println("Enter the dob: ");
            String dob = userInput.next();
            

            System.out.println("Account created successfully for below details");
            System.out.println("Account number: " + accNumber + " for " + firstName + " " + lastName + " living in " + "Address: " + address + " DOB: " +dob);
        }

    }
}
