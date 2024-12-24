package src.main.java.bank.utils;

import src.main.java.bank.enums.OperationType;

public class ParseBankOperation {
        public static OperationType parseUserInput(int userInput) {
            return switch (userInput) {
                case 1 -> OperationType.DEPOSIT;
                case 2 -> OperationType.WITHDRAW;
                case 3 -> OperationType.GETBALANCE;
                default -> null;
            };
        }
    }

// public class ParseBankOperation {
//         public static BankOperation parseUserInput(int userInput) {
//             BankOperation bankOperation[] = BankOperation.values();
//             return bankOperation[userInput - 1];
//         }
//     }
