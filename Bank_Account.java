//this class will have withdraw, deposit and checkbalance  impl

import java.util.Scanner;

class Bank {
    String name;
    private int balance;

    public void deposit() {
        Scanner userObj = new Scanner(System.in);
        System.out.println("Enter amount to be deposited" );

        int amount = userObj.nextInt();
        System.out.println(amount);
    }

    public void withdraw() {
        Scanner amt = new Scanner(System.in);
        System.out.println("Enter amt to be withdrwan");

        int withdrawAmt = amt.nextInt();
        if ( balance > withdrawAmt )
        {
            balance = balance-withdrawAmt;
            System.out.println("amount withdrawn successfully"+ withdrawAmt);
        } else {
            System.out.println("cancelled transaction - insufficient balance");
        }
    }

     void getBalance() {
        System.out.println(balance);
    }
    
}
public class Bank_Account {
    public static void main(String[] args) {
        Bank bank = new Bank();
        while (true) {
            Scanner chooseOption = new Scanner(System.in);
            System.out.println("Press 1 to deposit");
            System.out.println("Press 2 to widraw amt");
            System.out.println("Press 3 to check balance");
    
            int userChoice = chooseOption.nextInt();
            if ( userChoice == 1 )
            {
                bank.deposit();
            } 
            else if (userChoice == 2) {
                  bank.withdraw();
            }
            else if (userChoice == 3 ){
                bank.getBalance();
            }
            else {
                System.out.println("not matching the options");
            }
            System.out.println("Do you want to continue or quit(q)");
            String toQuit = chooseOption.next();
            if ( toQuit.equals("q")) {
                break;
            }     
        }
    }
}
