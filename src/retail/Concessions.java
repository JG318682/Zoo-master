package retail;

import money.Wallet;

import java.util.Scanner;

public class Concessions {

    public static void displayConcessions(){
        int choice;
        int pop = -2;
        int smokedSausage = -4;
        int aWholeAsCake = -6;
        int ravioli = -4;
        int creamOfMushroom = -5;
        Scanner input = new Scanner(System.in);
        m("Welcome to the Zoo Concessions stand");
        m("What would you like to order?");
        m("1) Pop - $2");
        m("2) Smoked Sausage - $4");
        m("3) A Whole AS Cake - $6");
        m("4) Ravioli - $4");
        m("5) Cream of Mushrooms - $5");
        choice = input.nextInt();
        Wallet wallet1 = new Wallet();
        switch(choice){
            case 1:
                //Price of order
                wallet1.setWallet(pop);
                break;
            case 2:
                //price of order
                wallet1.setWallet(smokedSausage);
                break;
            case 3:
                //price of order
                wallet1.setWallet(aWholeAsCake);
                break;
            case 4:
                //price of order
                wallet1.setWallet(ravioli);
                break;
            case 5:
                //price of order
                wallet1.setWallet(creamOfMushroom);
                break;
             default:
                 m("Do we look like a freakin restraunt");
        }

    }
    public static void m(String m){
            System.out.println(m);
    }
}
