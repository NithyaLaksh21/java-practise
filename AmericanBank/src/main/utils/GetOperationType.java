package main.utils;

import main.enums.OperationType;

public class GetOperationType {
    
    public static OperationType getOperationType(int userChoice) {
        OperationType operationType[] = OperationType.values();
        return operationType[userChoice-1];
    }
}
