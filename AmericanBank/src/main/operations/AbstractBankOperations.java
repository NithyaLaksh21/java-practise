package main.operations;

import main.Bank;

public abstract class AbstractBankOperations implements BankOperation{
    public abstract void execute(Bank bank);
}
