//this class will have withdraw, deposit and checkbalance  impl

import java.util.Scanner;

public class Bank_Account {
    public static void main(String[] args) {
        Bank bank = new Bank();
        while (true) {
            Scanner chooseOption = new Scanner(System.in);
            System.out.println("Press 1 to deposit");
            System.out.println("Press 2 to widraw amt");
            System.out.println("Press 3 to check balance");
            System.out.println("Press 4 to create account");
    
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
            else if (userChoice ==4) {
                bank.createAccount();
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
