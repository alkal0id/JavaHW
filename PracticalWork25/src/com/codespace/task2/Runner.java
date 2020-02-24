package com.codespace.task2;

import com.codespace.task1.DaysOfWeek;

import java.util.Scanner;

public class Runner {
    public void run(){
        Card[] cards = new Card[Rank.values().length*Suit.values().length];
        for (DaysOfWeek daysOfWeek : DaysOfWeek.values()){
            System.out.println(daysOfWeek);
        }
        System.out.println("==========TRAINS===========");

    }

}
