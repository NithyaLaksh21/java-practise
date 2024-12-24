package src.main.java.bank.utils;

import src.main.java.bank.enums.UserAccountType;

public class ParseUserInput {
    public static UserAccountType parseUserInput(int userInput) {
        UserAccountType userAccountType[] = UserAccountType.values();
        return userAccountType[userInput - 1];
    }
}