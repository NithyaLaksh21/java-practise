package main.operations;

import main.Bank;

public class GetBalance extends AbstractBankOperations{

    @Override
    public void execute(Bank bank) {
        System.out.println("Current balance: " + bank.getBalance());
    }
    
}
