package com;

import java.util.Scanner;

public class Blackjack {
    private float bet;
    private Scanner scan = new Scanner (System.in);

    public void takeBet(User currentUser){
        System.out.println("How much would you like to bet?");
        float userBet = scan.nextFloat();
//
        currentUser.setWallet((currentUser.getWallet() - userBet));
        System.out.println("You have bet: £" + userBet);

    }
}
