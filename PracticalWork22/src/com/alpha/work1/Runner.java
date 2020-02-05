package com.alpha.work1;

import java.util.Scanner;

public class Runner {
    public void run(){
        MyCalculate mc = new MyCalculate();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        System.out.println(mc.calcPi(scanner.nextInt()));
        
    }
}
