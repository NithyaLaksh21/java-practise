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
        System.out.println("Enter your EmailID: ");
        String emailId = userInput.next();
        Member member = new Member(firstName, lastName, address, dob);
        member.setPhoneNumber(phoneNumber);
        member.setEmailId(emailId);
        return member;
    }
}