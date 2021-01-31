package com;

import java.util.*;

public class Main {

    public static Scanner scan = new Scanner (System.in);
    public static Random rand = new Random();

    public static void casinoMenu() {
        System.out.println("Which game would you like to play? \n (1) Blackjack.\n (2) Roulette. \n (3) Slot Machine.");
        int userGameChoice = scan.nextInt();
        switch(userGameChoice){
            case 1:
                playBlackjack();
                break;
            case 2:
                playRoulette(currentUser);
                break;
            case 3:
                playSlot();
                break;
        }

    }

    public static void main(String[] args){
        Slot x = new Slot();
        x.printNumbers();
    }
}



