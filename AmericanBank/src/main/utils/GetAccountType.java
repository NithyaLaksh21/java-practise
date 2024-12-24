package main.utils;

import main.enums.AccountType;

public class GetAccountType {
    
     public AccountType getAccountType(int userChoice) {
        AccountType accountType[] = AccountType.values();
        return accountType[userChoice-1];
    }
}
