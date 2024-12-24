package main.operations;

import java.util.Scanner;

import main.Bank;

public class Deposit extends AbstractBankOperations {

    @Override
    public void execute(Bank bank) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter amount to be deposited");
        int amount = userInput.nextInt();
        bank.setBalance(bank.getBalance() + amount);
        System.out.println("Amount deposited: " + amount);
    }
}
