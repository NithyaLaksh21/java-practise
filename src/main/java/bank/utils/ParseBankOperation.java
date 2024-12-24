package src.main.java.bank.utils;

import src.main.java.bank.enums.BankOperation;

public class ParseBankOperation {
        public static BankOperation parseUserInput(int userInput) {
            BankOperation bankOperation[] = BankOperation.values();
            return bankOperation[userInput - 1];
        }
    }