package retail;

import money.Wallet;

import java.util.Scanner;

public class Concessions {

    public static void displayConcessions(){
        int choice;
        int pop = -3;
        int hotDog = -4;
        Scanner input = new Scanner(System.in);
        m("Welcome to the Zoo Concessions stand");
        m("What would you like to order?");
        m("1) Pop - $3");
        m("2) Hot Dog - $4");
        choice = input.nextInt();
        Wallet wallet1 = new Wallet();
        switch(choice){
            case 1:
                //Price of order
                wallet1.setWallet(pop);
                break;
            case 2:
                //price of order
                break;
             default:
                 m("That does not exist");
        }

    }
    public static void m(String m){
        System.out.println(m);
    }
}
