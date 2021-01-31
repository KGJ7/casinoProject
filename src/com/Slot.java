package com;

import java.util.*;
public class Slot {
    private float bet;
    private Scanner scan = new Scanner (System.in);

    public void takeBet(User currentUser){
        System.out.println("How much would you like to bet?");
        float userBet = scan.nextFloat();
//
        currentUser.setWallet((currentUser.getWallet() - userBet));
        System.out.println("You have bet: £" + userBet);
    }
    public int getNumber(){
        Random rand = new Random();
        return rand.nextInt(9);
    }
    public void printNumbers(){
        int firstNum = getNumber();
        int secondNum = getNumber();
        int thirdNum = getNumber();

        for (int i = 0; i <= 150; i++) {

            if (i < 150){
                System.out.print("\r " + getNumber() + " " + getNumber() + " " + getNumber());
        } else {
                System.out.println("\r " + firstNum + " " + secondNum + " " + thirdNum);
            }

            try {
                long sleepyTime = (long)(5* (Math.pow(3,i/34)));
                Thread.sleep(sleepyTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }


}
