package com.codespace.task3;

import com.codespace.task1.DaysOfWeek;
import com.codespace.task2.*;

import java.util.Scanner;

public class Runner {
    public void run(){
        System.out.println("==========TRAINS===========");
        TrainSchedule trainSchedule = new TrainSchedule(10);
        trainSchedule.addTrain(createTrain());
        trainSchedule.printTrains();

    }

    public Train createTrain(){
        Scanner scanner = new Scanner(System.in);
        int i = Train.getTrainNum();
        System.out.println(i);
        System.out.println(Train.getTrainNum());
        Train train = new Train(i);
        System.out.println("Enter train stationDispatch");
        train.setStationDispatch(scanner.nextLine());
        System.out.println("Enter train stationArrival");
        train.setStationArrival(scanner.nextLine());
        System.out.println("Enter train timeDispatch");
        train.setTimeDispatch(scanner.nextLine());
        System.out.println("Enter train timeArrival");
        train.setTimeArrival(scanner.nextLine());
        System.out.println("Enter train days");
        train.setDays(DaysOfWeek.valueOf(scanner.nextLine().toUpperCase()));
        return train;
    }


}
