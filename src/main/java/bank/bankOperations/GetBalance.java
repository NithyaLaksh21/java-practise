package src.main.java.bank.bankOperations;

import src.main.java.bank.Bank;

public class GetBalance extends AbstractBankOperation {
    @Override
    public void execute(Bank bank) {
        System.out.println("Current balance: " + bank.getBalance());
    }
}
