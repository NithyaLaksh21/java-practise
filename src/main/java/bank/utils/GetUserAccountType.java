package src.main.java.bank.utils;

import src.main.java.bank.enums.AccountType;

public class GetUserAccountType {
    
    public AccountType execute(int userInput) {
        AccountType accountType[] = AccountType.values();
        return accountType[userInput - 1];
    }
}


