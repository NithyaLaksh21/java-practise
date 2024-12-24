package main.utils;

import main.enums.UserType;

public class GetUserType {
     public static UserType getUserType(int userChoice) {
        UserType userType[] = UserType.values();
        return userType[userChoice-1];
    }
}
