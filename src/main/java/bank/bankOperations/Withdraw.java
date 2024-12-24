package src.main.java.bank.bankOperations;

import java.util.Scanner;

import src.main.java.bank.*;

public class Withdraw {
    public void execute(Bank bank) {
        Scanner amt = new Scanner(System.in);
        System.out.println("Enter amt to be withdrawn");
        int withdrawAmt = amt.nextInt();
        if (bank.getBalance() > withdrawAmt) {
            bank.setBalance(bank.getBalance() - withdrawAmt);
            System.out.println("Amount withdrawn successfully: " + withdrawAmt);
        } else {
            System.out.println("Cancelled transaction - insufficient balance");
        }
    }
}
