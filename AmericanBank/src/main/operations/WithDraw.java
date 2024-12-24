package main.operations;

import java.util.InputMismatchException;
import java.util.Scanner;

import main.Bank;

public class WithDraw extends AbstractBankOperations{

    @Override
    public void execute(Bank bank) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amt to be withdrawn");

        try {
            int amountToBeWithdrawn = scanner.nextInt();

            if(bank.getBalance() > amountToBeWithdrawn) {

                bank.setBalance(bank.getBalance()-amountToBeWithdrawn);
                System.out.println("Amount withdrawn successfully: " + amountToBeWithdrawn);
            }
            else {
                System.out.println("Cancelled transaction - insufficient balance");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input, please enter a amount to be withdrawn in number - "+ e);
        }
    }
    
}
