package com.codespace.task1;

import java.util.Scanner;

public class Runner {
    public void run(){
        for (DaysOfWeek daysOfWeek : DaysOfWeek.values()){
            System.out.println(daysOfWeek);
        }
        System.out.println("----------Java days--------------");
        for (DaysOfWeek daysOfWeek : DaysOfWeek.values()){
            switch (daysOfWeek) {
                case MONDAY:case WEDNESDAY:case FRIDAY:
                    System.out.println(daysOfWeek);
            }
        }
        System.out.println("----------Next Day--------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day of week");
        System.out.println("Next day is " + DaysOfWeek.valueOf(scanner.nextLine()).nextDay());
    }
}
