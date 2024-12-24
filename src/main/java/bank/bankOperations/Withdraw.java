package src.main.java.bank.bankOperations;

import java.util.InputMismatchException;
import java.util.Scanner;

import src.main.java.bank.Bank;


public class Withdraw extends AbstractBankOperation {

    @Override
    public void execute(Bank bank) {
        Scanner amt = new Scanner(System.in);
        System.out.println("Enter amt to be withdrawn");
        try {
            int withdrawAmt = amt.nextInt();
            if (bank.getBalance() > withdrawAmt) {
                bank.setBalance(bank.getBalance() - withdrawAmt);
                System.out.println("Amount withdrawn successfully: " + withdrawAmt);
            } else {
                System.out.println("Cancelled transaction - insufficient balance");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, please enter a amount to be withdrawn in number - "+ e);
        }
    }
}
