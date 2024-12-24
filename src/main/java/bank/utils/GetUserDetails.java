package src.main.java.bank.utils;

import java.util.Scanner;

import src.main.java.bank.models.*;

public class GetUserDetails {
    public Member execute() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the firstName: ");
        String firstName = userInput.next();
        System.out.println("Enter the lastName: ");
        String lastName = userInput.next();
        System.out.println("Enter the address: ");
        String address = userInput.next();
        System.out.println("Enter the dob: ");
        String dob = userInput.next();
        System.out.println("Enter phone number: ");
        String phoneNumber = userInput.next();
        while (!phoneNumber.matches("^[7-9][0-9]{9}$")) {
            System.out.println("Invalid phone number, Please enter a 10 digit phone number");
            phoneNumber = userInput.next();
        }
        System.out.println("Enter your EmailID: ");
        String emailId = userInput.next();
        while(!emailId.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$")) {
            System.out.println("Invalid email address, please enter a valid emailId");
            emailId = userInput.next();
        }
        Member member = new Member(firstName, lastName, address, dob);
        member.setPhoneNumber(phoneNumber);
        member.setEmailId(emailId);
        return member;
    }
}
