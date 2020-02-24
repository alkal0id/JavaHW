package com.codespace.task2;

import com.codespace.task1.DaysOfWeek;

import java.util.Scanner;

public class TrainSchedule {
    private Train[] trains;
    private int countTrain;

    public TrainSchedule(int trainsCount) {
        this.trains = new Train[trainsCount];
        this.countTrain = 0;
    }

    public boolean addTrain(Train train){
        if (countTrain == trains.length){
            return false;
        }
        trains[countTrain++] = train;
        return true;
    }

    public void printTrains(){
        for (int i = 0; i < countTrain; i++){
            System.out.println(trains[i]);
        }
    }

}
