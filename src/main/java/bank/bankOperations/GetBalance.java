package src.main.java.bank.bankOperations;

import src.main.java.bank.*;

public class GetBalance {
    public void execute(Bank bank) {
        System.out.println("Current balance: " + bank.getBalance());
    }
}
