package src.main.java.bank.bankOperations;

import src.main.java.bank.Bank;
//abstract class
public abstract class AbstractBankOperation implements BankOperation {
    @Override
    public abstract void execute(Bank bank) ;
}
