package com.ironhack.w1.d4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

//      ABSTRACT CLASSES & INTERFACES

        Player webPlayer = new WebPlayer(23, 3);
        Player applePlayer = new ApplePlayer(0.8, 3);
//        Player player = new Player(3,4); // We cannot create an instance of an abstract class

        System.out.println("Web player volume: " + webPlayer.getVolume());
        webPlayer.close();
        applePlayer.close();
        System.out.println(applePlayer.getVolume());

        boolean result = applePlayer instanceof ApplePlayer;

        if(applePlayer instanceof ApplePlayer){
            ApplePlayer myApplePlayer = (ApplePlayer)applePlayer;
            myApplePlayer.increaseVolume();
            System.out.println(applePlayer.getVolume());
        }

        System.out.println(result);
//        applePlayer.increaseVolume();
//        System.out.println(applePlayer.getVolume());

//        Player androidPlayer = new AndroidPlayer(0.7,3);
//        androidPlayer.play();
//        System.out.println(androidPlayer.share());

        Playable myPlayable = new ApplePlayer(0.6, 2);



//      BIG DECIMAL

        System.out.println(1.2 - 1.0);

        BigDecimal bd1 = new BigDecimal("1.213241234");
        BigDecimal bd2 = new BigDecimal("3.03453453");

        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.multiply(bd2));

        System.out.println(bd1.divide(bd2, RoundingMode.HALF_EVEN));
        System.out.println(bd1.setScale(2, RoundingMode.HALF_EVEN));
        System.out.println(bd2.compareTo(bd1));

        if(bd1.compareTo(bd2) > 0) System.out.println("bd1 is greater than bd2");
        else if(bd1.compareTo(bd2) == 0) System.out.println("bd1 is equal to bd2");
        else if(bd1.compareTo(bd2) < 0) System.out.println("bd1 is less than bd2");
    }
}
