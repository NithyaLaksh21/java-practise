package src.main.java.bank.bankOperations;

import java.util.Scanner;
import src.main.java.bank.*;

public class Deposit {
    public void execute(Bank bank) {
        Scanner userObj = new Scanner(System.in);
        System.out.println("Enter amount to be deposited");
        int amount = userObj.nextInt();
        bank.setBalance(bank.getBalance() + amount);
        System.out.println("Amount deposited: " + amount);
    }
}