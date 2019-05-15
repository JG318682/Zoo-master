package retail;

import money.Wallet;

import java.util.Scanner;

public class Gift_Shop {

    public static void displayGiftShop(){
        int choice;
        int ratPoisoning = -2;
        int strongRatPoison = -4;
        int goldFish = -6;
        int petFood = -4;
        int creamOfMushroom = -5;
        Scanner input = new Scanner(System.in);
        m("Welcome to the Zoo Concessions stand");
        m("What would you like to order?");
        m("1) Regular Rat Poisoning - $2");
        m("2) Strong Rat Poisoning - $4");
        m("3) Gold Fish - $6");
        m("4) Pet Food - $4");
        m("5) Cream of Mushrooms - $5");
        choice = input.nextInt();
        Wallet wallet1 = new Wallet();
        switch(choice){
            case 1:
                //Price of order
                wallet1.setWallet(ratPoisoning);
                break;
            case 2:
                //price of order
                wallet1.setWallet(strongRatPoison);
                break;
            case 3:
                //price of order
                wallet1.setWallet(goldFish);
                break;
            case 4:
                //price of order
                wallet1.setWallet(petFood);
                break;
            case 5:
                //price of order
                wallet1.setWallet(creamOfMushroom);
                break;
            default:
                m("We don't have that item");
        }

    }
    public static void m(String m){
        System.out.println(m);
    }
}
